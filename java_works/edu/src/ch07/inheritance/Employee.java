package ch07.inheritance;

public class Employee extends Person {				// extends가 상속을 표현,
//	private String name;
//	private int age;
	private String dept;
	
	public Employee() {							// default 생성자를 자동 생성
		System.out.println("Employee 생성자 호출");
	}	
	public Employee(String name, int age, String dept) {
//		this.name = name;
//		this.age = age;
		super(name, age);						// 부모클래스의 생성자 호출
		this.dept = dept;
	}
	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
//		return "[" + getName() + ", " + getAge() + ", " + dept + "]";
		return super.toString() + ", " + dept;
	}
}