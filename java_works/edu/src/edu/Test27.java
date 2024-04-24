package edu;

import java.util.Scanner;

public class Test27 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하세요:");
		int n = sc.nextInt();
		
		// for 문
		for(int i = 10; i < n; i++) {
			System.out.println(i);
			System.out.println("for OK");
		}
		
		int j = 10;
		// while 문
		while(j < n) {
			System.out.println(j);
			System.out.println("while OK");
			j++;
		}
		
		int k = 10;
		// do~while 문
		do {
			System.out.println(k);
			System.out.println("do~while OK");
			k++;
		} while(k < n);
	}

}
