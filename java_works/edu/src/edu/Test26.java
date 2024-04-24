package edu;

import java.util.Scanner;

public class Test26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요:");
		int k = sc.nextInt();

		int i = 0; 
		
		// while 문
		while(i < k) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("OK");
		
	}
}
