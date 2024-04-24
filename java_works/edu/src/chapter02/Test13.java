package chapter02;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0b00010001;								// 17, 2진수 표현은 0b로 시작함
		byte b = 0b00100010;								// 34
		
		int c = a & b;										// 비트AND연산, 비트값이 모두 1이여만 결괏값 1
		System.out.println(Integer.toBinaryString(c));		// Integer.toBinaryString() <-- 괄호안의 값을 10진 정수형 타입을 -> 2진수 String타입으로 번경
		
		int d = a | b;										// 비트OR연산, 비트값이 하나라도 1이면 결괏값 1
		System.out.println(Integer.toBinaryString(d));
		
		int e = a ^ b;										// 비트XOR연산, 비트값이 서로 다를 때만 결괏값 1
		System.out.println(Integer.toBinaryString(e));
		
		int f = 12;
		int g = (~f) + 1;									// -12, ~, 비트부정연산, 비트값이 1이면 0, 0이면 1로 반환, 부호비트까지 변환
		System.out.println(g);
		
															// 시프트 연산자
		int h = f << 1;										// 24, 왼쪽으로 비트 이동, 이동된 곳 0으로 채움
		int i = f >> 1;										// 6, 오른쪽으로 비트 이동, 이동된 곳 부호비트로 채움, >>> (이동된 곳 무조건 0으로 채움)
		System.out.println(h);
		System.out.println(i);
	}

}
