package chapter03;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 2;
		char op = '+';
		
		// if ~ else if 문을 사용한 분기 조건문의 예
		if(op == '+') {
			System.out.println(a + b);				// 14 출력
		} else if(op == '-') {
			System.out.println(a - b);
		} else if(op == '*') {
			System.out.println(a * b);
		} else if(op == '/') {
			System.out.println(a / b);
		}
	}

}
