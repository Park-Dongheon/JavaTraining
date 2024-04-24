package com.ruby.java.test1;

public class Armor {
	String name = "John";
	int height = 185;
	int weight = 100;
	String color = "RED";
	public boolean isFly = true;
	
	void setData(String n, int h, int w, String c) {
		name = n;
		height = h;
		weight = w;
		color = c;
	}
	
	void setData(String n) {
		name = n;
	}
	
	void setName(String str) {
		name = str;
	}
	
	void setHeight(int h) {
		height = h;
	}
	
	void setWeight(int w) {
		weight = w;
	}
	
	void setColor(String c) {
		color = c;
	}
	
	void setBoolean(boolean b) {
		isFly = b;
	}
	
//	boolean takeOff() {    // boolean 리턴 타입
//		System.out.println("takeOff 메서드가 호출되었습니다.");
//		
//		if (isFly) {
//			System.out.println("날 수 있습니다.");
//		} else {
//			System.out.println("날 수 없습니다.");
//		}
//		
//		return isFly;
//		
//	}
	
//	void land() {
//		System.out.println("land 메서드가 호출되었습니다.");
//	}
//	
//	void shootLaser() {
//		System.out.println("shootLaser 메서드가 호출되었습니다.");
//	}
//	
//	void launchMissile() {
//		System.out.println("launchMissile 메서드가 호출되었습니다.");
//	}
	
}
