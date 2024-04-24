package com.ruby.java.ch06;

class Student {
	private int i;
}

public class ThisTest {
	private int i = 1;
	
	public void first() {
		int i = 2;
		int j = 3;
		this.i = i + j;			// this가 t객체(receiver object)를 가리킴
		
		second(4);				// second 스택 프레임 생성
	}
	
	public void second(int i) {
		int j = 5;
		this.i = i + j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest t = new ThisTest();
		t.first();			// 메시지 호출, ThisTest에 속하는 내부 클래스 
							// main의 local영역에 t스택 프레임 생성, 호출할 때마다 스택에 새로운 스택 프레임이 생성됨
		System.out.println(t.i);
		
		Student s = new Student();
//		s.i;			// ThisTest에 속하지 않은 외부 클래스
	}

}
