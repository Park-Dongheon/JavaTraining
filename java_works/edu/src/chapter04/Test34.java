package chapter04;

public class Test34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};			// arr 배열 초깃값 목록 5개(10, 20, 30, 40, 50)
		
	 // arr = new int[] {10, 20, 30};				// 길이가 3인 새 배열 생성, 시작 주소를 arr 변수에 저장, 배열의 길이: 3				
		for(int i = 0; i < arr.length; i++) {		// arr.length의 값: 5, for 문의 배열의 길이 값을 상수 사용 지양 - 변경 발생 시 코드의 유연성이 떨어짐
			System.out.println(arr[i]);				// arr의 0 ~ arr의 길이(5) 번지 값 출력, arr[]의 index 번호를 변수·식도 넣을 수 있음
		}
	}

}
