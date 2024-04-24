package com.ruby.java.test1;

public class Test {
	public static void main(String[] args) {
		
		Armor armor = new Armor();
		
		System.out.println(armor.name);
		System.out.println(armor.height);
		System.out.println(armor.weight);
		System.out.println(armor.color);
		System.out.println(armor.isFly);
		
		System.out.println();
		
		armor.setName("CIA");
		armor.setHeight(170);
		armor.setWeight(75);
		armor.setColor("BLUE");
		armor.setBoolean(false);
		
		System.out.println(armor.name);
		System.out.println(armor.height);
		System.out.println(armor.weight);
		System.out.println(armor.color);
		System.out.println(armor.isFly);
		
		System.out.println();
		
		armor.setData("FBI", 180, 90, "GREEN");
		
		System.out.println(armor.name);
		System.out.println(armor.height);
		System.out.println(armor.weight);
		System.out.println(armor.color);
		
		
		
//		boolean ret = armor.takeOff();    // boolean 변수 ret에 isFly리턴값(boolean타입) 저장
		
//		if (ret) {
//			System.out.println("날 수 있습니다.");
//		} else {
//			System.out.println("날 수 없습니다.");
//		}

//		armor.isFly = true;
//		System.out.println("날 수 있습니다.");
//		armor.takeOff();

//		armor.land();
//		armor.shootLaser();
//		armor.launchMissile();
		
//		System.out.println("Name: " + armor.name);
//		System.out.println("Height: " + armor.height);
//		System.out.println("Weight: " + armor.weight);
//		System.out.println("Color: " + armor.color);
//		System.out.println("IsFly: " + armor.isFly);
	}
}
