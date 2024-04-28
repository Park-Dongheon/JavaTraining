package quiz;
/*	정수의 자릿수를 입력 받아서 아래와 같은 형태의 소수를 찾아서 출력하는 프로그램을 작성해 보세요
 *	실행 예
 		입력 자릿수 : 4 (1000 ~ 9999)
 		7331 => 7, 73, 733, 7331 모두 소수
 */

import java.util.Scanner;

public class PrimeNumber3 {
	
	public void getPrimeNumber3() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {											// 무한 루프, 입력 값이 0이 아니라면 반복하라
			System.out.print("Number[0:exit] 자릿수 입력: ");
			int num = sc.nextInt();
			if(num == 0) break;
			
			
			int s = (int)Math.pow(10.0, (double)(num-1));		// 입력자리 - 1의 제곱으로 입력값과 같은 자릿수 표현, 입력 자릿수의 시작 값 
			int e = (int)Math.pow(10.0, (double)(num)) - 1;		// 입력자리의 제곱 - 1로 입력값과 같은 자릿수 표현, 입력 자릿수의 끝 값
			
			// 주어진 범위 내의 수를 확인하여 소수인지 판별하고 출력
			for(int i = s; i < e; i++) {						// 입력 자릿수의 시작 값 ~ 끝 값까지 1씩 증가하며 조건문 검사 반복
                if (isPrime(i) && isPrimeEach(i)) {
                   printPrime(i);
                }
			}
		}
		sc.close();
		System.out.println("Done!");							// 무한 루프(while 문)가 0의 입력값으로 빠져나온 후 완료 출력
	}

	//	num이 소수면 true, 그렇지 않으면 false를 리턴
	public static boolean isPrime(int num) {
        if (num <= 1) return false;								// 1 미만의 수는 소수가 아님
        
        for (int i = 2; i <= Math.sqrt(num); i++) {				// 2부터 num제곱근 까지의 수 중 num을 나누어 떨어지는 수가 있는지 확인
            if (num % i == 0) return false;						// 나누어 떨어지는 수가 있으면 소수가 아님
        }
        
		return true;
	}
	
	// 각 자리 수가 모두 소수인지 확인하는 메서드							// ex)
	public static boolean isPrimeEach(int num) {				// num = 773
	    int temp = num;											// temp = 773
        while (temp > 0) {										// 반복 773 > 0 {
            int remain = temp % 10;								//     remain = 773 % 10 = 3;
            if (!isPrime(remain)) return false;					//     !isPrime(3) == false (isPrime()메소드 호출, 전달하는 인자값이 소수일 경우 true반환, !ture == false이면 한 자리라도 소수가 아님)
            temp /= 10;											// }
        }														// 77 > 0 {
        return true;											//     remain = 77 % 10 = 7;
	}															//     !isPrime(7) == false;
																//     temp = 77 / 10 = 7;
																// }
																// 7 > 0 {
																//     remain = 7 % 10 = 7;
																//     !isPrime(7) == false;
																//     temp = 7 / 10 = 0;
																// } 반복문 종료
																// 각 자리 수가 모두 소수로(true) 조건을 만족 하면, 호출한 메소드에 true 값 반환
			
			
	
	// 주어진 수와 해당 수의 각 자리수를 출력하는 메서드					// ex)
	private void printPrime(int num) {							
		// TODO Auto-generated method stub						// num = 773;
        System.out.print(num + " => ");							// temp = 773;
        int temp = num;											// 반복 773 > 0 {
        while (temp > 0) {										//     "773";
            System.out.print(temp + ", ");						//     temp = 773 / 10 = 77;
            temp /= 10;											// }
        }														// 77 > 0 {
        System.out.println("모두 소수");							//     "77";
	}															//     77/10 = 7;
																// }
																// 7 > 0 {
																//     "7";
																//     7/10 = 0;
																// } 반복문 종료
																// "모두 소수"
	
	
	public void work(boolean flag) {							// work()메소드가 호출 될 경우, boolean 타입의 인자값이 true일 경우 getPrimeNumber3()메소드 호출
		// TODO Auto-generated method stub
		if(flag) getPrimeNumber3();
	}

}
