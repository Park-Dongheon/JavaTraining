package com.ruby.java.ch07.abstraction;

public interface Messenger {							// Messenger 인터페이스 파일

	// field
	int MIN_SIZE = 1;
	int MAX_SIZE = 104857600;
	
	// method
	public abstract String getMessage();					// 추상 메소드

	public abstract void setMessage(String msg);

	public default void setLogin(boolean login) {			// default 메소드
		log();
		if (login) {
			System.out.println("");
		} else {
			System.out.println("�α׾ƿ� ó���մϴ�");
		}
	}

	public static void getConnection() {
		System.out.println("network�� �����մϴ�.");
	}

	private void log() {
		System.out.println("start job!");
	}
}