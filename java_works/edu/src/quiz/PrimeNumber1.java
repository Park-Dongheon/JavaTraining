package quiz;
/*
 * 임의의 수 N 을 입력 받아서 해당 수가 소수인지 확인하는 프로그램을 작성해 보세요.
 * 방법 
  	1. 2 ~ N-1 까지 확인
	2. 2 ~ N/2 까지 확인
	3. 2 ~ Math.sqrt (N) 까지 확인
 • 실행 예
 	입력 : 7 -> 7 is a Prime.
 	입력 : 9 -> 9 is not a Prime.
 */

import java.util.Scanner;

public class PrimeNumber1 {
	
	private void getPrimeNum() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {														// 무한 루프, 입력 값이 0이 아니라면 반복하라
			System.out.print("Number[0:exit]: ");
			int num = sc.nextInt();											// 입력값이 정수형 타입 num 변수에 저장 
			if(num == 0) break;												// 입력값이 0 이라면 while 무한 루프를 나감.  
			if(isPrime(num) == true)										// isPrime(num) 메소드 호출 매개변수 인자 값으로 입력값을 넘겨주고 논리 데이터 타입(boolean) 형태로 반환받는다
				System.out.println(num + " is a Prime.");					// 반환받은 논리 타입이 true일 경우 입력값은 소수 출력
			else
				System.out.println(num + " is not a Prime.");				// 반환받은 논리 타입이 false일 경우 입력값은 소수가 아님 출력
		}
		sc.close();															// Sanner 객체 sc를 닫음, 입력스트림을 종료, 입력스트림을 닫지 않으면 메모리 누수가 발생
		System.out.println("Done!");										// 무한 루프(while 문)가 0의 입력값으로 빠져나온 후 완료 출력
	}

//	num이 소수면 true, 그렇지 않으면 false를 리턴	
	private static boolean isPrime(int num) {								/*
	 																			private 접근 권한의 정적 메소드 isPrime(int num) 어디서든 호출 가능 
																				parameter 값을 받아 정수형 변수 num(isPrime메소드의 안에서만 사용 가능)에 저장
																				메소드 호출 한 곳으로 논리 데이터 타입(boolean) 참(true), 거짓(false)형태의 값을 반환 
																			 */
		// TODO Auto-generated method stub
		if(num <= 1) return false;											// 1 미만의 수는 소수가 아님


//		1. 2 ~ N-1 까지 확인
		for(int i = 2; i <= num-1; i++ ) {									// 2부터 num-1까지의 수 중에서 나누어 떨어지는 수가 있는지 확인
			if(num % i == 0) return false;									// 나누어 떨어지는 수가 있으면 소수가 아님
		}

//		2. 2 ~ N/2 까지 확인
//		for(int i = 2; i <= num/2; i++ ) {									// 2부터 num/2의 몫까지의 수 중에서 나누어 떨어지는 수가 있는지 확인
//			if(num % i == 0) return false;									// 나누어 떨어지는 수가 있으면 소수가 아님
//		}
		
//		3. 2 ~ Math.sqrt(N) (<-- 제곱근 구하는 Mate 클래스 sqrt메소드) 까지 확인
//		for(int i = 2; i <= Math.sqrt(num); i++ ) {							// 2부터 num제곱근 까지의 수 중에서 나누어 떨어지는 수가 있는지 확인
//			if(num % i == 0) return false;									// 나누어 떨어지는 수가 있으면 소수가 아님
//		}
		
		return true;														// 나누어 떨어지는 수가 없으면 소수임
	}

	public void work(boolean flag) {
		if(flag) getPrimeNum();												// boolean 타입인 flag의 값이 true일 때, 해당 클래스의 내부에서만 동작 할 수 있는 == 접근 제어자가 private
		
	}
}