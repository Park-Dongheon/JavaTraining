package com.ruby.java.ch13;

import java.awt.print.Book;

//generic 대신에 Object Class를 사용한 방법으로 생략
class Bag2 {
	private Object thing;								// 제네릭클래스 타입이아닌 Object 타입 클래스로 사용
	public Bag2(Object thing) {
		this.thing = thing;
	}
	public Object getThing() {							// 리턴 타입: Object 
		return thing;
	}
	public void setThing(Object thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}
class Book2 {
}
class PencilCase2 {
}
class Notebook2 {
}

public class BagTestObject {
	public static void main(String[] args) {
		Bag2 bag = new Bag2(new Book2());
		Bag2 bag2 = new Bag2(new PencilCase2());
		Bag2 bag3 = new Bag2(new Notebook2());

		bag.showType();
		bag2.showType();
		bag3.showType();

		bag = bag2;//error를 발생시키지 않지만 잘 못된 코드이다(논리적 오류), bag-bag2 모두 Bag 클래스 타입, 각각의 객체는 서로 다름
		/*
		Book book = bag.getThing();
		PencilCase pc = Bag.getThing();
		Notebook nb = bag3.getThing();
		*/
		Book2 book = (Book2)bag.getThing();//down casting, getThing() 메서드에서 반환하는 타입 Object이면 원래 타입으로 변경(Type Casting), Object 객체 타입은 모든 객체 타입의 부모이기 때문 => (Book) 자식 객체 타입오르 Down Casting 해줌 			
		PencilCase2 pc = (PencilCase2)bag2.getThing();
		Notebook2 nb = (Notebook2)bag3.getThing();
	}
}