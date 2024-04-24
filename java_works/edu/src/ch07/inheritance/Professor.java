package ch07.inheritance;

public class Professor extends Person {				// 
	private String subject;							// 연구 주제

	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return "[" + getName() + ", " + getAge() + ", " + subject + "]";
	}
	
}