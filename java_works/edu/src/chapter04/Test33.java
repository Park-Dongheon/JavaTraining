package chapter04;

public class Test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] score;
		score = {90, 85, 78, 100, 98};	<--	에러, 메모리에 배열이 생성되지 않음
		score = new int[] {90, 85, 78, 100, 98};	<-- new 연사자를 이용, 형식을 써주고 초깃값 목록으로 초기화
		 */
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.println(arr[0]);			// 10 출력
		System.out.println(arr[1]);			// 20 출력
		System.out.println(arr[2]);			// 30 출력
		System.out.println(arr[3]);			// 40 출력
		System.out.println(arr[4]);			// 50 출력
		
	}

}
