package com.ruby.java.ch06;

public class ThisTest1_1 {
	int i = 1;

	public void first() {
		int i = 2;
		int j = 3;
		this.i = i + j;

		second(4);
	}

	public void second(int i) {
		int j = 5;
		this.i = i + j;
	}

	public static void main(String[] args) {
		ThisTest1_1 exam = new ThisTest1_1();
		exam.first();				// receiver object: exam, ThisTest1_1 클래스로 이동, first() - 메소드의 적용 객체: exam <-- this 키워드가 exam 객체를 가리킴
	}
}