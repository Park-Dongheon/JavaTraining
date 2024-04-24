package edu;

public class Test38_2 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
//		2차원 배열 행-열 순서
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = i * 5 + j + 1;
			}
	    }
		
//		2단계: 2차원 배열 대각선 순서 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i * 5 + j + 1;
			}
	    }
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j) {
					System.out.print(arr[i][j] + " ");	
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

