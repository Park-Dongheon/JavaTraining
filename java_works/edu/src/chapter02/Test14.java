package chapter02;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';				// char타입 변수에는 int타입의 값처럼 문자에 해당하는 코드값(ASCII 코드)이 정수로 저장, 'A'- 65
		c ^= (1 << 5);				// c = c^(1<<5), 1을 왼쪽으로 5자리만큼 이동, c의 값과 XOR연산 후 c변수에 대입
		System.out.println(c);
	}

}
