package com.ruby.java.ch07.inheritance;

public class Student extends Person {
	private String major;						// 전공

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return "[" + getName() + ", " + getAge() + ", " + major + "]";
	}
	
}