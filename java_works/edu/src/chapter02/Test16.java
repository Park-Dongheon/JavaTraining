package chapter02;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
											// 작은 타입 데이터 -> 큰 타입 데이터
		byte a = 23;
		int b = a;							// byte타입의 데이터 a를 int타입 변수 b에 저장
		System.out.println(b);				// 23
		
		byte c = 23;
		short d = 47;
		int e = 65;
		int f = c + d + e;					// byte + short + int 세가지 타입의 값을 계산, c·d는 자동으로 가장 큰 int타입으로 변경
		System.out.println(f);				// 135
		
		
											// 큰 타입 데이터 -> 작은 타입 데이터 (타입 캐스팅)
		int g = 23;
		byte h = (byte) g;					// 정수형타입 변수 g값을 바이트타입으로 변환 후 바이트타입 변수 h에 저장  
		System.out.println(h); 				// 23
		
		byte i = 10;
		byte j = 20;
		byte k = (byte) (i + j);			// 바이트타입의 변수 i와 j의 정수값이 더하기연산자(+)에 의해 int타입으로 변환되어 연산됨, 연산이 끝난 후 타입캐스팅한 값이 k에 저장
		System.out.println(k);				// 30
	}

}
