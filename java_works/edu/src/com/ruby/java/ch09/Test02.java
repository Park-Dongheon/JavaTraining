package com.ruby.java.ch09;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		String s1 = new String("java");
		String s2 = "java";
		
		String s3 = new String("java");
		String s4 = "java";
		
		
//		"==" 비교연산자의 문자열 비교			
		if(s1 == s3) {								// heep메모리 영역에 새로운 객체 s1과 s3가 생성, 객체들은 다른 주소값을 같는다.
			System.out.println("동일 객체이다.");
		}
		else {
			System.out.println("다른 객체이다.");
		}
		
		if(s2 == s4) {								// heep메모리 영역의 String Pool이라는 고유한 영역을 찾아가 생성된 객체를 참조변수 s2와 s4가 같이 가리킴
			System.out.println("동일 객체이다.");
		}
		else {
			System.out.println("다른 객체이다.");
		}
		
		
//		equals() 문자열 비교		
		if(s1.equals(s3)) {
			System.out.println("동일 문자열을 가집니다.");
		}
		else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
		if(s2.equals(s4)) {
			System.out.println("동일 문자열을 가집니다.");
		}
		else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
		
//		equals() 문자열 대소문자 비교
		String s5 = "JAVA";
		
		if(s1.equals(s5)) {
			System.out.println("동일 문자열을 가집니다.");
		}
		else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
		if(s1.equalsIgnoreCase(s5)) {
			System.out.println("동일 문자열을 가집니다.");
		}
		else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
	}

}
