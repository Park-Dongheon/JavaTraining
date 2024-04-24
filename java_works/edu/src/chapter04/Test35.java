package chapter04;

public class Test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};		// 정수형 타입 배열 arr 변수 생성·초기화

		// 확장 for 문
		for(int num : arr) {					// for 문의 :(콜론) 기준 앞 - 변수 선언, 뒤 - 배열 변수, 조건식·증감식 x, 배열 길이만큼 반복
												// 반복이 진행 되면서 배열에 있는 각 요소를 하나씩 꺼내 반복 블록에서 활용
			System.out.println(num);			// 10 20 30 40 50 출력, arr 배열 요소값
		}
	}

}
