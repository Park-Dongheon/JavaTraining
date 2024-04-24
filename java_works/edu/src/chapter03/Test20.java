package chapter03;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;					// int타입 변수 score 선언 후 90으로 초기화
		char grade;						// char타입 변수 grade 선언
		
		if(score >= 90) {				// score 변숫값이 90이상이면
			grade = 'A';				// grade 변수에 문자 'A'가 저장, if 문에 포함된 다른 구문을 무시한 채 if 문 종료
		} else if(score >= 80) {		// 10번째 줄의 조건식(score >= 90)이 거짓이면 실행
			grade = 'B';				// 조건식(score >= 80)이 참이면 grade에 'B'가 저장되고 if 문 종료
		} else if(score >= 70) {		// 10, 12번째 줄의 조건식이 거짓이면 실행
			grade = 'C';				// 조건식(score >= 70)이 참이면 grade에 'C'가 저장되고 if 문 종료
		} else if(score >= 60) {		// 10, 12, 14번째 줄의 조건식이 거짓이면 실행
			grade = 'D';				// 조건식(score >= 60)이 참이면 grade에 'D'가 저장되고 if 문 종료
		} else {						// 위의 모든 조건식의 결과가 거짓이면 명령문(실행문) 실행, else 문이 없으면 아무것도 실행하지 않고 if 문 종료
			grade = 'F';				// grade에 'F'가 저장되고 if 문 종료
		}
		System.out.println(grade);		// "A" 출력
	}

}
