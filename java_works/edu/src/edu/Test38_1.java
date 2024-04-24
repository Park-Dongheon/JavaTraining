package edu;

public class Test38_1 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];	
//		1단계: 2차원 배열 열-행 순서
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = i * 5 + j + 1;
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

