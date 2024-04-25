package quiz;
/*	정수의 자릿수를 입력 받아서 해당 자릿수에 속하는 소수를 찾아서 출력하는 프로그램을 작성해 보세요.
	int num = 3;
	int s = (int)Math.pow(10.0, (double)(num-1));
	int e = (int)Math.pow(10.0, (double)(num))-1;
 *실행 예
 	입력 자릿수가 3이라면 3자릿수 정수 (100 ~ 999) 중에서 소수에 해당하는 숫자를 찾아서출력한다.
 */
import java.util.Scanner;

public class PrimeNumber2 {
	Scanner sc = new Scanner(System.in);
	
	
	public void getPrimeNumber2() {
		while(true) {
			System.out.println("Number[0:exit]:");
			int num = sc.nextInt();
			if(num == 0) break;
			
			int s = (int)Math.pow(10.0, (double)(num-1));
			int e = (int)Math.pow(10.0, (double)(num)) - 1;
			
			// 코드 작성 
			int count = 999;
			for(int i = 0; i < count;  )
			if((count / s) == 0  );
			System.out.println("Number of Prime :" + count);
		}
		System.out.println("Done!");
	}


	public void work(boolean flag) {
		// TODO Auto-generated method stub
		if(flag) getPrimeNumber2();
	}

}
