package com.ruby.java.ch13;

class Bag<T> {														// 제네릭 클래스 Bag는 매개변수 Book을 <T>로 전달 받음, Bag에 선언된 모든 <T>는 인스턴스 생성 시 전달되는 타입으로 변경 => instantiate
	private T thing;

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {											// T: 클래스 타입, C++에서는 Template(형틀) 이라고함								
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Book {
}

class PencilCase {
}

class Notebook {
}

public class BagTest {

	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());						// bag는 참조변수, Bag<Book> 타입은 Bag 제네릭 클래스에 인자값 Book 전달, new Bag<> 생성자 호출, (new Book()) Book 객체가 T로 전달 
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());			// Book, PencilCase가 클래스로 생성, 서로 다른 클래스
		Bag<Notebook> bag3 = new Bag<>(new Notebook());

		bag.showType();												// 클래스이름 Book을 출력
		bag2.showType();
		bag3.showType();
//		bag = bag2;													// 오류 발생(Bag<PencilCase> => Bag<Book> 객체로 치환할 수 없음), Book과 PencilCase는 다른 클래스
//		bag = bag2;
	}
}