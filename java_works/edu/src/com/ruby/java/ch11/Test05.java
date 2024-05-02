package com.ruby.java.ch11;

import java.io.FileInputStream;

public class Test05 {

	int battery = 0;
	
	public void charge(int time) throws Exception {
		
		
		
		if(time < 0) {									// time이 음수인 경우 try-catch 예외문 실행
			FileInputStream fi = new FileInputStream("a.txt");
			time = 0;
				throw new NagativeNumberException();	// 예외 발생, 사용자 정의 예외처리문을 생성하고 throw
		}
		
//		if(time < 0) {									// time이 음수인 경우 try-catch 예외문 실행
//			time = 0;
//			try {
//				throw new NagativeNumberException();	// 예외 발생, 사용자 정의 예외처리문을 생성하고 throw
//			} catch(NagativeNumberException e) {		// 예외 처리
//				e.printStackTrace();
//			}
//		}
		battery += time;
		System.out.println("현재 배터리 : " + battery);
	}
	
	public static void main(String[] args) {
		
		Test05 test = new Test05();
		try {
			test.charge(30);
			test.charge(20);
			test.charge(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
