package chapter04;

public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];			// 메모리에 int 타입의 값으 5개 저장할 수 있는 배열 생성, 배열의 시작 주소를 arr 변수에 저장
										/*
										 * 만약 new 연산자로 배열을 생성할 때 기본 타입(byte, short, int, long, double, boolean)으로 생성시,
										 * 모든 요소가 0으로 자동 초기화, boolean 타입은 false로 초기화,
										 * 기본 타입(8가지) 외에 메모리 주소를 저장하는 참조 타입, 참조 타입으로 생성한 배열은 모두 null로 초기화
										 * null: 자바의 키워드 중 하나로서 아무 값도 저장되지 않았음을 의미 
										 */
		
		arr[0] = 10;					// arr의 0번지에 10저장
		arr[1] = 20;					// arr의 1번지에 20저장
		arr[2] = 30;					// arr의 2번지에 30저장
		arr[3] = 40;					// arr의 3번지에 40저장
		arr[4] = 50;					// arr의 4번지에 50저장
		
		System.out.println(arr[0]);		// 10, arr의 0번지 값 출력
		System.out.println(arr[1]);		// 20, arr의 1번지 값 출력
		System.out.println(arr[2]);		// 30, arr의 2번지 값 출력
		System.out.println(arr[3]);		// 40, arr의 3번지 값 출력
		System.out.println(arr[4]);		// 50, arr의 4번지 값 출력
		
	}

}
