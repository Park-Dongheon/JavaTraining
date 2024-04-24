package com.ruby.java.ch06;

public class StaticMethodTest {
	int num = 123;									// 인스턴스 필드 > 인스턴스 객체 생성후 사용가능
	static int count = 0;							// 정적 필드 > 객체가 없어도 사용가능
	public static void main(String[] args) {
		StaticMethodTest.print1();							// 클래스 메서드(메서드 영역) 호출
		
		StaticMethodTest smt = new StaticMethodTest();		// 객체 생성, smt(stack) -> 객체(heap) print2()(heap영역)
//		StaticMethodTest.print2();							// 오류!, 인스턴스 메서드 호출 x
		smt.print2();										// (smt)객체 생성 후 호출
	}
	
	public static void print1() {							// 클래스 메서드
		int num2 = count;
		System.out.println("hello");
	}
	
	public void print2() {									// 인스턴스 메서드
		int num3 = num;										// 인스턴스 메서드는 반드시 객체 생성 후 사용되기 때문
		System.out.println("java");
	}
	
}
