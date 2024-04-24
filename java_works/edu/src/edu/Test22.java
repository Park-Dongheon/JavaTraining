package edu;

import java.util.Scanner;

import javax.management.remote.rmi.RMIIIOPServerImpl;

public class Test22 {
	public static void main(String[] args) {
//		int a = 12;
//		int b = 2;
//		char op = '+';
		
		// 표준입력장치로부터 입력을 받기 위한 입력 객체를 생성한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 점수:");    // 정수형 값을 입력받기 위한 메시지를 화면에 출력한다.
		int a = sc.nextInt();    // 정수형 값을 입력받아서 변수 a에 저장한다.
		
		System.out.println("두번째 점수:");    // 정수형 값을 입력받기 위한 메시지를 화면에 출력한다.
		int b = sc.nextInt();    // 정수형 값을 입력받아서 변수 b에 저장한다.
		
		System.out.println("op:");    // 문자열 값을 입력받기 위한 메시지를 화면에 출력한다.
		String ops = sc.next();    // 문자열을 입력받아서 문자열 변수 ops에 저장
		char op = ops.charAt(0);    // ops에 저장된 첫번째 문자를 문자변수에 op에 저장
		
		// 입력된 문자변수 op에 저장된 값으로 코드를 실행한다.
		switch(op) {    		case '+':
			System.out.println(a + b); break;
		case '-':
			System.out.println(a - b); break;
		case '*':
			System.out.println(a * b); break;
		case '/':
			System.out.println(a / b); break;
		}
	}
}