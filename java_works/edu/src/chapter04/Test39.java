package chapter04;

public class Test39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 오른쪽 대각선 순회 - 대각선들의 합 */
		int[][] arr = {{ 1, 2, 3, 4, 5 },
					   { 6, 7, 8, 9, 10 },
					   { 11, 12, 13, 14, 15 },
					   { 16, 17, 18, 19, 20 },
					   { 21, 22, 23, 24, 25 } };
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {				// 바깥쪽 반복문, 변수 i가 0 ~ arr.length(arr 배열 행의 수)까지 i를 1씩 증가하면서 반복 실행
			for(int j = 0; j < arr[i].length; j++) {		// 안쪽 반복문, 변수 j가 0 ~ arr[i].length(arr[i] 번지의 열의 수) = 각 행에서 열의 수만큼 반복 실행
				if(i == j) {								// i·j는 행과 열의 index, 조건식 i·j의 index가 일치하면 if 문 블록 실행 
					sum = sum + arr[i][j];					// sum 변수에 해당 arr 배열의 i·j 인덱스 요솟값을 저장, 반복 실행하면서 sum 값 누적
				}
			}
		}
		
		System.out.println("합계 : " + sum);					// "합계 : 65" 출력, 누적 sum 값 출력
		
	}

}
