package com.ruby.java.ch06;

public class Member {				// 필드에 name, age 할당, 
	private String name;
	private int age;
	
//	생성자 함수의 overloading	
	public Member() {			// default 생성자
		
	}
	
	public Member(String name, int age) {				// 초기화값 (String 타입 name)name(매개변수),(int 타입 age)a(매개변수)
		this.name = name;								// this는 멤버 객체를 가리킴, 현재 실행 중인 인스턴스의 주솟값 가리킴
		this.age = age;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void maint(String[] args) {
		System.out.println("main() 메서드 실행");
		Member m2;
		Member m = new Member("hong", 11);			// 1)메모리 할당 2)할당된 메모리 주소를 반환, stack역역의 m(참조 변수), 초기화("hong"(메서드 영역에 literal 저장구역에 저장), 11) -> parameter parssing되어 위치 값이 Member()클래스 매개변수에 전달
	}
}
