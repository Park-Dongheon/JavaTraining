package chapter02;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;						// 변수 a를 선언하고 10으로 초기화
		a++;							// 변수 a의 값을 1만큼 증가
		System.out.println(a);    		// 11
		++a;							// 변수 a의 값을 1만큼 증가
		System.out.println(a);   		// 12
		
		int b = 10;						// 변수 b를 선언하고 10으로 초기화
		b--;							// 변수 b의 값을 1만큼 증가
		System.out.println(b);    		// 9
		--b;							// 변수 a의 값을 1만큼 증가
		System.out.println(b);  		// 8
		
		int c = 10;						// 변수 c를 선언하고 10으로 초기화
		int d = 10;						// 변수 d를 선언하고 10으로 초기화
		System.out.println(++c);   		// 11, 변수 c의 값을 1만큼 증가 후 출력
		System.out.println(d++);   	 	// 10, 변수 d의 값을 출력 후 1만큼 증가
	}	

}
