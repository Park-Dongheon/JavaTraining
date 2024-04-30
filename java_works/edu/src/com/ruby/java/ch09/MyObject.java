package com.ruby.java.ch09;

public class MyObject {

	
	int num;										// num 필드 추가
	
	public MyObject(int num) {
		// TODO Auto-generated constructor stub
		
		this.num = num;
	}
	
	public String toString() {
		return "MyObject_JavaDAY12";
	}
	
	public boolean equals(Object obj) {				// 넘어온 객체의 타입캐스팅해줌
		boolean result = false;
		MyObject arg = (MyObject) obj;
		
		if(this.num == arg.num) {
			result = true;
		}
		
		return result;
	}
}
