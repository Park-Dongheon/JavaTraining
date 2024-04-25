package com.ruby.java.ch07.abstraction;

public class MessengerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galax = new GalaxyMessenger();
		
		
		iphone.getMessage();			// 같은 인터페이스 사용
		galax.getMessage();				// 같은 인터페이스 사용
		
	}

}
