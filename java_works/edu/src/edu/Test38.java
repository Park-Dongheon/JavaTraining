package edu;

public class Test38 {
	public static void main(String[] args) {
//		int arr[][] = {{1,2}, {3,4}};
		int arr[][] = new int[5][5];
//		2차원 배열 행-열 순서
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = i * 5 + j + 1;
			}
	    }
			
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();
		}
	}
//	for (int[] n : arr) 
//	for (int k : n)
//	System.out.println(k);

//for (int i=0; i < arr.length; i++)
//	for (int j=0; j < arr.length; j++)
//		System.out.println(arr[i][j]);
//
//		
		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr = {10, 20, 30}; // 안됨	
}

