package com.ruby.java.ch06;

public class Member2 {								// 생성자 overloading 예
	private String name;
	private int age2;	
	
	public Member2() {				//		nmae = name;
		this("guest");				// 이 함수는 Member(name)을 호출
//		name = "guest";
//		age = 0;
		System.out.println("Member() 생성자 실행");
	}	
	public Member2(String name) {
		this(name, 0);				// 이 함수는 Member(name, age)을 호출한다.
//		this.name = name;
//		age = 0;
		System.out.print("Member(String) 생성자 실행 : ");
		System.out.println(name);
	}

	public Member2(String name, int age) {
		this.name = name;
		this.age2 = age;
		System.out.print("Member(String, int) 생성자 실행 : ");
		System.out.println(name + " : " + age);
	}
	
	
//	public String toString() {
//		return name + ":" + age2;
//	}

	public void setName(String name) {
	}

	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		Member2 m1 = new Member2();						// new Member2() 하면 1) Member2 클래스의 필드: name, age를 저장 메모리에 할당 Heap영역에 할당 2)할당된 주소를 반환
		Member2 m2 = new Member2("Amy");
		m2.toString();
		Member2 m3 = new Member2("Amy", 23);
		System.out.println(m2.toString());
	}
}