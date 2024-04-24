package edu;

public class Test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println('\n');
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}

}
