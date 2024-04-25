package com.ruby.java.ch07.abstraction;

public class IPhoneMessenger implements Messenger{
	public String getMessage() {
		return "iPhone";
	}
	
	public void setMessage(String msg) {
		System.out.println("iPhone에서 메시지를 설정합니다 : " + msg);
	}
	
	public void clearMessage() {
		
	}
}


class IPhone15 extends IPhoneMessenger {			// extends가 상속
	
}