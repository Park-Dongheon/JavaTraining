package com.ruby.java.ch07.abstraction;

//7장 실습 구현 
abstract class Person {				// Person 추상클래스를 
	int pid;
	String name;
	int age;

	public Person(int pid, String name, int age) {
		// TODO Auto-generated constructor stub
		this.pid = pid;
		this.name = name;
		this.age = age;
	}

	public abstract String toString();

}

class Student extends Person {
	int sid;
	String dept;
	int year;
	//sid, dept, year
	//super 사용
	
	
	public Student(int pid, String name, int age, int sid, String dept, int year) {
		super(pid, name, age);
		this.sid = sid;
		this.dept = dept;
		this.year = year;
	}
	@Override
	public String toString() {
		return pid + ", " + name + ", " + age + sid + ", " + dept + ", " + year;

	}
}
class Employee extends Person {
	int eno;
	String dept;
	int salary;
	
	public Employee(int pid, String name, int age, int eno, String dept, int salary) {
		// TODO Auto-generated constructor stub
		super(pid, name, age);
		this.eno = eno;
		this.dept = dept;
		this.salary = salary;
	}

	
	//eno, dept, salary
	//super 사용
	
	@Override
	public String toString() {
		return pid + ", " + name + ", " + age + eno + ", " + dept + ", " + salary;

	}
}
public class 제출과제_7장_클래스작성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person[5];
      arr[0] = new Student(1, "Kim", 20, 1001, "Computer Science", 3);
      arr[1] = new Student(2, "Lee", 21, 1002, "Mathematics", 2);
      arr[2] = new Employee(3, "Park", 30, 2001, "HR", 3000);
      arr[3] = new Employee(4, "Choi", 35, 2002, "Engineering", 4000);
      arr[4] = new Student(5, "Kang", 22, 1003, "Physics", 4);
		for(Person p : arr) {
			System.out.println(p.toString());
		}

	}

}