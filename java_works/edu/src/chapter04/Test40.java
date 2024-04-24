package chapter04;

public class Test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 왼쪽 삼각형 순회 */
		int[][] arr = { { 1, 2, 3, 4, 5 },
						{ 6, 7, 8, 9, 10 },
						{ 11, 12, 13, 14, 15},
						{ 16, 17, 18, 19, 20},
						{ 21, 22, 23, 24, 25} };
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <= i; j++) {			// 열의 인덱스 j가 0부터 행의 인덱스 i와 같을 때까지 1씩 증가하면서 실행문 반복
				sum = sum + arr[i][j];
			}
		}
		
		System.out.println("합계 : " + sum);			// "합계 : 235" 출력
		
	}

}
