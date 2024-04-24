package com.ruby.java.ch06;

/*
public class Student {		// public 타입 자바 파일 형태로 만들어 져야함, 하나의 파일에는 public 타입을 하나만 선언
	private String sname;
	private int sage;
}
*/

public class Armor {
//	필드
	private String name;
	private int height;
	
//	메서드
	public String getName( ) {		// 게터, 반환값 타입을 지정하여 함수 선언, 클래스 밖에서 호출 가능
		return name;
	}
	
	public void setName(String value) {		// 세터, setName() 함수는 리턴값이 없음, 클래스 밖에서 호출 가능
		name = value;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public static void main(String[] args) {	// static: 정적 멤버 선언
		// TODO Auto-generated method stub
		Armor b[] = new Armor[10];	// 배열 생성자, local변수 b(참조변수)는  stack에 저장, Armor 객체는 heap영역에 저장
		for(int i = 0; i < b.length; i++) {
			b[i] = new Armor();		// Armor이
		}
		
		Armor suit1 = new Armor();	// 생성자
//		suit1.name = "kim";		// 접근, 클래스 내부에서 접근 가능
//		a.age = 10;
		suit1.setName("mark");
		System.out.println(suit1.getName());	// 참조 변수값이 이상항데 가리키고 있다
		
		
//		Student s = new Student();
//		s.sname = "hong";		// 접근불가, 클래스 외부에 정의된 다른 클래스 접근불가
		
		
	}

}
