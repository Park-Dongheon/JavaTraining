package chapter04;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'A';								// char 타입의 변수 letter 선언 초깃값 문자 'A' 저장, 
														// char 타입은 문자의 유니코드 값을 저장하는 데이터 타입
														// 문자 'A'의 유니코드 값: 65, letter에 65 저장
		char[] alphabet = new char[26];					// char 타입 데이터 26개 저장할 수 있는 배열 생성, 시작 주소 alphabet 변수에 저장
		
		for(int i = 0; i < alphabet.length; i++) {		// for 반복문, alphabet 변수 시작 주소 i가 0 ~ 25, 배열의 길이 26보다 작을 때까지 i를 1씩 증가 시켜 실행문 반복 
			alphabet[i] = (char) (letter + i);			// letter + i 계산식 == char + int 타입의 연산, 결괏값이 int 타입,
														// char(2byte 크기) 타입 배열을 int(4byte 크기) 타입의 값을 저장 x,
														// 연산 결과(letter + i)를 강제로 char 타입으로 타입 캐스팅, alphabet 배열의 요소값으로 저장
		}
		
		// 확장 for 문
		for(char c : alphabet) {						// 문자 타입 c 변수(배열의 시작 주소) 선언, alphabet 배열 요소 하나씩 꺼내 실행문 반복, 조건식·증감식 x
			System.out.println(c);						// A ~ Z 출력
		}
	}

}
