package com.ruby.java.ch06;

//class Student {
//	String name;					// default 선언 > 현 자바 file에서 접근 가능, 외부에서는 private
//	private int age;
//	
//	private String getName() {
//		return name;
//	}
//	
//	public Student() {				//  java compiler가 자동 추가
//		
//	}				
//	public Student(String name) {	// 	
//		this.name = name;
//	}			
//}

public class ThisTest2 {
	private String name;

	private void setName(String name) {
		this.name = name;			// this.name은 클래스에 있는 name 필드를 가리킴
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		ThisTest2 exam = new ThisTest2();
		exam.setName("Amy");
		
//		Student s = new Student("hong");
//		s.getName();
//		s.age = 11;

		System.out.println(exam.getName());
	}
}