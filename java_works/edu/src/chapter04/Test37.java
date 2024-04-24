package chapter04;

public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {90, 85, 78, 100, 98};		// 정수 타입 배열 선언, 초깃값 목록으로 초기화
		int sum = 0;								// 정수 타입 총점 초기화
		double avg = 0.0;							// 실수 타입 평균 초기화
		int max = 0;								// 정수 타입 최댓값 초기화
		int min = 999;								// 정수 타입 최솟값 초기화, 
													// score 배열의 첫 번째 요소 값을 무조건 저장하기 위해 score 배열에 저장된 값들보다 큰 수(999)로 초기화
		
		for(int i = 0; i < score.length; i++) {		// score 배열의 요솟값이 0 ~ 배열의 길이(5)보다 작을 때까지 1씩 증가하면서 실행문 반복
			sum += score[i];						// sum = sum + score[i], score 배열의 요솟값을 모두 더한 총점(sum 변수)
			if(max < score[i])						// 조건식, 최댓값(0)보다 크다면 true, 실행문으로 이동 
				max = score[i];						// 최댓값 변수(max)에 score 배열 요솟값을 저장
			if(min > score[i])						// 조건식, 최솟값(999)보다 작다면 true, 실행문으로 이동
				min = score[i];						// 최솟값 변수(min)에 score 배열 요솟값을 저장
		}
		
		avg = sum / score.length;					// 평균값, 총 점(sum) 변수에서 score 배열 갯수 만큼 나눈 몫값을 avg 변수에 저장
		System.out.println("총 점 : " + sum);			// 451 출력
		System.out.println("평 균 : " + avg);			// 90.0 출력
		System.out.println("최댓값 : " + max);		// 100 출력
		System.out.println("최솟값 : " + min);		// 78 출력
	}

}
