package chapter04;

public class Test38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];						// 5*5 크기 배열 생성, new 연산자 이용 - 배열의 각 요소 0으로 자동 초기화
		int num = 1;										// 배열의 각 요소가 1 ~ 25까지 1씩 증가된 값을 저장하고자 num 변수 선언
		
		// 중첩 for 문
		for(int i = 0 ; i < arr.length; i++) {				// 변수 i는 0 ~ 5(arr 배열 행의 수)보다 작을 때까지 1씩 증가하면서 반복
			for(int j = 0; j < arr[i].length; j++) {		// 변수 j는 0 ~ 5(arr 배열 i행에 해당하는 열의 수)보다 작을 때까지 1씩 증가하면서 반복
				arr[i][j] = num++;							// arr[i행][j열]에 해당하는 곳에 num 변숫값 저장 -> num 값을 1만큼 증가  
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);				// arr[i행][j열]에 해당하는 값 출력
				System.out.print("\t");						// 열 간격
			}
			System.out.println("\n");						// 행 바꿈
		}
		
	}

}
