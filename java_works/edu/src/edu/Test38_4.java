package edu;

import java.util.Random;

public class Test38_4 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int arr[][] = new int[5][5];
//		2차원 배열 행-열 순서
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = rnd.nextInt(100);
			}
	    }
			
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();
		}
	}	
}

