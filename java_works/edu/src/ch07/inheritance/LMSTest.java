package ch07.inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();							// Employee 객체를 만들려면, Person의 (name, age 필드 값을 호출 하기 위해) 생성자도 호출 
//		Employee e1 = new Employee("hong", 10, "java");
		Professor p = new Professor();
		Student s = new Student();

		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");

		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");

		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");

		System.out.println("Professor 객체:: " + p.toString());
		System.out.println("Employee 객체:: " + e.toString());
		System.out.println("Student 객체:: " + s.toString());
	}
}