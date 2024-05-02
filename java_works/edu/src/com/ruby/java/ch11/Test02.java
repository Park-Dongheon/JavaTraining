package com.ruby.java.ch11;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("1");
			String s = null;
			s.length();							// 오류 발생
			System.out.println("2");
			System.out.println("3");
		} catch (Exception e) {					// 오류 처리
			System.out.println("오류 발생");	
		} finally {								// 반드시 처리
			System.out.println("OK");
		}
		System.out.println("4");
	}
}
