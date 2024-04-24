package chapter03;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;										// int타입 변수 score 선언하면서 정수 90으로 초기화
		String result = "";									// String타입 변수 result 선언하면서 ""빈문자열로 초기화
		
		if(score >= 60) {									// if문의 조건식 score 변숫값이 60보다 큰지 비교, 조건식(score 변숫값이 60보다 크다)이 참이라면 if 문의 실행문 실행
			result = "합격";									// result 변수에 "합격" 문자열을 대입
		} else {											// 조건식이 거짓이면: score 변숫값이 60미만이면, else 문의 명령문(실행문) 실행
			result = "불합격";								// result 변수에 "불합격" 문자열을 대입
		}
		
		System.out.println(result);							// "합격" 출력
		System.out.println(score >= 60? "합격" : "불합격");	// 삼항연산자로 표현, 다만 연산자 우선순위가 낮으므로 다른 연산자와 함께 사용시 괄호()를 사용해 우선순위 높임
	}

}
