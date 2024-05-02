package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.print("Number[0:exit] 자릿수 입력: ");
				int num = sc.nextInt();
				if(num == 0) break;
				
				
				// num : 2
				int s = (int)Math.pow(10.0, (double)(num-1));
				int e = (int)Math.pow(10.0, (double)(num)) - 1;	
				int count = 0;
				
				// 소숫값
				for(int i = s; i < e; i++) {
					if(PrimeNumber1.isPrime(i)) {
						System.out.println(i + "는 소수 입니다.");
						count++;
					}
				}
				System.out.println("Number of PrimeNumber: " + count);
			}
		} 
		System.out.println("Done!");
	}
	

    
}
