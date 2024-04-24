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

	private int[] n;

	private void getPrimeNum() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		while(true) {
			System.out.print("Number[0:exit]: ");
			int num = sc.nextInt();
			if(num == 0) break;
			n = new int[num];

		}
		sc.close();
		System.out.println("Done!");
	}

//	num이 소수면 true, 그렇지 않으면 false를 리턴	
	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	public void work(boolean flag) {

		if(flag) getPrimeNum();


//		if(isPrime(num) == true) {
//			System.out.println(num + " is a Prime.");
//		} 
//		else {
//			System.out.println(num + " is not a Prime.");
//		}
		
	}
}