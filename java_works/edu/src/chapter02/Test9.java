package chapter02;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 2;
		
											// 복합 대입 연산자
		a += b;								// a = a + b
		System.out.println(a);				// 12
		
		a -= b;								// a = a - b
		System.out.println(a);				// 10,
		
		a *= b;								// a = a * b
		System.out.println(a);				// 20,
		
		a /= b;								// a = a / b
		System.out.println(a);				// 10,
		
		a %= b;								// a = a % b
		System.out.println(a);				// 0,
	}

}
