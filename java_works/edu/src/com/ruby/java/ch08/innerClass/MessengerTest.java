package com.ruby.java.ch08.innerClass;

public class MessengerTest {
	public static void main(String[] args) {
		
		Messenger test = new Messenger() {

			@Override
			public void setMessage(String msg) {
				// TODO Auto-generated method stub
				System.out.println("test에서 메시지를 설정합니다 : " + msg);
			}
			
			
			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return "test";
			}
			
		};
		
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
		
	}
}
