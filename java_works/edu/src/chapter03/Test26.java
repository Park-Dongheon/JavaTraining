package chapter03;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;						// 제어 변수 선언 및 초기화
		
		/*
		 while 문의 조건식 결과가 false가 나올 때까지 '조건식 -> 실행문 -> 증감식' 반복 실행
		 */
		while(i < 10) {					// 조건식
			System.out.println(i);		// 실행문, 0 1 2 3 4 5 6 7 8 9 출력
			i++;						// 증감식
		}
		System.out.println("OK");		// "OK" 출력
	}

}
