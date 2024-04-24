package chapter03;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {			/* 
												   1. int 타입의 i 변수 선언 및 초깃값 정수 0으로 지정
												   2. 조건식 검사: i 변숫값이 10보다 작으면 조건만족(true) for 문 {}블록 실행문 실행, 조건 만족하지 않으면(false) for 문 블록 빠져나옴
												   3. 증감식(i++)을 실행 i 변숫값을 1만큼 증가
												   4. '조건식 -> 실행문 -> 증감식' 반복 실행  
												*/ 
			System.out.println(i);				// 0 1 2 3 4 5 6 7 8 9 출력
		}
		System.out.println("OK");				// "OK" 출력
	}

}
