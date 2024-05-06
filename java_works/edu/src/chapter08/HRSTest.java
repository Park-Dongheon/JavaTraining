package chapter08;

abstract class Employee {
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee {
	
	int annual_sales;				// 연간 판매 실적

	@Override
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판맫수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
	
}

class Consultant extends Employee {
	
	int num_project;				// 컨설팅 참여 수
	
	@Override
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
	
}

//abstract class Manager extends Employee {
//	public void calcSalary() {
//		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
//	}
//}

class Manager extends Employee {
	
	int num_team;				// 관리 팀 수
	
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급 * 12 * 6");
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}


public class HRSTest {
	// 하나의 메서드 선언으로 다양한 타입의 인자를 받아 처리, 여러 자손 객체를 처리
	public static void calcTax(Employee e) {				// 매개변수 타입 Employee선언, Employee는 참조 타입-메서드 호출 시 인스턴스의 참조값을 전달,
		// 인자로 전달된 인스턴스의 소득세 계산
		System.out.println("소득세를 계산합니다.");
	}
	
	public static void main(String[] args) {
/*		
		// 각각 인스턴스를 생성한 후 참조변수에 주솟값을 저장
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		// 참조변수를 통해 사용할 수 있는 인스턴스의 내용들
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
		
		// 결국 모두 calcTax(Employee e)가 호출
		calcTax(s);
		calcTax(c);
		calcTax(d);
*/
		
/*		
   		// toString()문을 실행 리턴값("클래스이름@인스턴스ID")을 출력하는 명령문, Object 클래스에서 선언한 메서드 사용
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		// equals() 메서드 역시 Object 클래스에서 상속받은 메서드, equals() 메서드 호출 시 어떤 타입의 인자값도 받아서 저장, 
		// 현재 객체와 인자로 전달된 객체가 같은지 판단(즉, 참조변수s와 참조변수c가 서로 같은 인스턴스를 참조하는지 판단)
		if (s.equals(c)) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("서로 다른 객체입니다.");
		}
		
		// 새로운 참조변수 s2선언, 참조변수 s의 값을 s2에 저장, s변수에 저장된 값이 s2변수에 복사, 같은 인스턴스를 참조
		Salesman s2 = s;
		System.out.println("s2.toString()");
		
		if (s.equals(s2)) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("서로 다른 객체입니다.");
		}
*/
			
 		// 다형성 중 하나 - 힙 영역에 생성된 Salesman의 인스턴스를 참조하는 변수의 타입을 Salesman, Employee, Object로 선언
		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
	
		// new Manager() 명령문은 Object -> Employee -> Manager 순으로 인스턴스 생성, Director는 자손의 타입으로 선언된 참조변수에 부모의 주소를 저장할 수 없음, Director 생성x
		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
//		Director m4 = new Manager();				// 오류 발생

		// 하나의 타입으로 선언된 배열 arr 참조변수 생성 초기화
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
}
