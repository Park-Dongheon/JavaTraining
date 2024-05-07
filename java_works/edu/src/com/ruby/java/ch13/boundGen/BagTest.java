package com.ruby.java.ch13.boundGen;

import java.util.Arrays;

class Bag<T extends Solid> {
  private T thing;
  private String owner;

  public Bag(T thing) {
    this.thing = thing;
  }

  public T getThing() {
    return thing;
  }

  public void setThing(T thing) {
    this.thing = thing;
  }

  void showType() {
    System.out.println("T의 타입은 " + thing.getClass().getName());
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

//boolean isSameOwner(Bag<T> obj) {}								// 오류 발생, 1. Book 타입의 클래스로 생성 2. bag.isSameowner(bag2) Parameter Type이 매개변수 bag2의 PencilCase 타입이라 오류 
  boolean isSameOwner(Bag<?> obj) {									// ?: 와일드카드, Bag으로 생성된 모든 클래스는 다 받음
    if(this.owner.equals(obj.getOwner()))
      return true;
    return false;
  }
}

class Solid { }
class Liquid{ }

class Book extends Solid{ }
class PencilCase extends Solid{ }
class Notebook extends Solid { }

class Water extends Liquid{ }
class Coffee extends Liquid{ }


public class BagTest {

  public static void main(String[] args) {
	Arrays.sort(null, null);
    Bag<Book> bag = new Bag<>(new Book());
    Bag<PencilCase> bag2 = new Bag<>(new PencilCase());

    bag.setOwner("김푸름");
    bag2.setOwner("김푸름");

    boolean result = bag.isSameOwner(bag2);
    bag.isSameOwner(bag2);											// boolean isSameOwner(Bag<T> obj) {} 일경우 오류 발생,
    if(result) System.out.println("소유자가 동일합니다.");
    else System.out.println("소유자가 다릅니다.");
  }
}