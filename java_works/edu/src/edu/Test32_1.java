package edu;

import java.util.Scanner;

public class Test32_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextByte();
		
		int a[] = new int[n];
		
		a[0] = 0;
//		System.out.println(a[0]);
		for(int i = 1; i < n; i++) {
			a[i] = a[i-1] + 5;
//			System.out.println(a[i]);
		}
	
		for(int j = 0; j < n; j++) {
			System.out.println(a[j]);
		}
	
	}
}
