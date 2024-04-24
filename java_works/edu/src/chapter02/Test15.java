package chapter02;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'F';
															// 삼항 연산자
		String gender = (c == 'F') ? "여자" : "남자";			// 조건: 문자변수 c의 값이 'F'일 경우, 명령: "여자", 그렇지 않다면 "남자", 명령값을 문자열타입 변수 gender에 저장
		System.out.println(gender);
	}

}
