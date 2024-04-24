package com.ruby.java.test1;

public class Test02 {
	void test(String name, int... v) {
		System.out.print(name + " : ");
		for(int x : v) {    // 배열v의 value를 하나씩 x에 저장
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
}
