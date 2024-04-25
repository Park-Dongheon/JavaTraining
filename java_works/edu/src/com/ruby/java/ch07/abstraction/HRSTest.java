package com.ruby.java.ch07.abstraction;

abstract class Employee1 {					// 추상메서드를 포함한 클래스 == 추상클래스
	String name;
	int salary;

	public abstract void calcSalary();		// 추상메서드

	public abstract void calcBonus();
}

class Salesman extends Employee1 {

	public void calcSalary() {										// 추상클래스를 구현함, overriding
		System.out.println("Salesman 급여 = 기본금 + 판매수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee1 {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당�");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee1 {					// 추상 메소드를 모두 정의 하지 않았으므로 추상 클래스
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 *6");
	}
}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
//		Manager m = new Manager();				// 추상클래스는 객체(인스턴스) 생성 불가, 추상 메소드(함수 body없음)만 포함
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
	}
}
