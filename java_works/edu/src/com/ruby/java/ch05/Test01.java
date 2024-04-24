package com.ruby.java.ch05;

public class Test01 {
	
	/* 가변 길이 인자 선언 및 사용 */
	static void test(int... v) {
		System.out.print(v.length + " : ");
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(1);
		test(1, 2);
		test(1, 2, 3);
	}

}
