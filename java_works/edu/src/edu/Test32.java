package edu;

import java.util.Scanner;

public class Test32 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		int a[] = new int[10];
		
		a[0] = 0;
//		System.out.println(a[0]);
		for(int i = 1; i < 10; i++) {
			a[i] = a[i-1] + 5;
//			System.out.println(a[i]);
		}
	
		for(int j = 0; j < 10; j++) {
			System.out.println(a[j]);
		}
	
	}
}
