package com.ruby.java.ch06;

class Count {
	public static int totalCount;
//	public int num;
	private int num;		// default 모드, 해당 파일과 클래스에서는 접근 가능

	
	//*
	public void print() {					// 인스턴스 메서드
		System.out.println("num = " + num);
	}
	
	public static void print2() {				// 정적 클래스 메서드
		System.out.println("totalCount = " + totalCount);
		
	}
	
	public Count() {		//
		num = 1;
		totalCount++;
	}
	
	int getter() {
		return num;
	}
	
	void setter(int n) {
		num += n;
	}
	
//	public Count() {}		// 자바 컴파일러가 자동 생성
}


public class CountTest {

	public static void main(String[] args) {		// 객체가 없어도 정적 클래스가 실행 가능함
		// TODO Auto-generated method stub
		System.out.println(Count.totalCount);		// Count클래스의 인스턴스 필드 totalCount는 메소드 영역(소스 코드), 코드 영역에 할당
//		System.out.println(Count.num);		// Count클래스의 인스턴스 필드 num는 heap영역에 생성
		
		Count.print2();
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		c1.print();
		c1.print2();		// 객체, 클래스를 가지고 호출해도됨
		Count.print2();		// 클래스 메서드, 클래스 가지고 호출, 객체 생성 없이 사용 가능
//		Count.print();		// 클래스를 가지고 호출x, 객체가 있어야만 사용 가능
		c1.getter();
		c1.setter(1);
		
		System.out.println(c3.totalCount);
		System.out.println(c1.totalCount);
		System.out.println(Count.totalCount);
		
	}

}
