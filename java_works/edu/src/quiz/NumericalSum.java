package quiz;

import java.util.Scanner;

public class NumericalSum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 무한반복
		while(true) {
			System.out.println("숫자[0:exit]: ");
			System.out.println("정수값을 입력하시오: ");
			int n = sc.nextInt();
			
			// n이 0값이 올경우 while문
			if(n == 0)
				break;
			
			// 변수 선언 생성 초기화
			int sum1 = 0;
			int sum2 = 0;
			
			// 짝수 홀수 합
			for(int i=1; i <= n; i++) {
				if((i%2) == 0) {
					sum2 += i;
				}
				else {
					//sum1 += i;
				}
			}
			
			System.out.println("정수의 전체 합: " + (sum1 + sum2));
			System.out.println("정수의 홀수 합: " + sum1);
			System.out.println("정수의 짝수 합: " + sum2);
		}
		
		System.out.println("종료");
		sc.close();
	}
}
