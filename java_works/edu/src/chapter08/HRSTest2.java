package chapter08;

public class HRSTest2 {
	
	// 매개변수 타입 Employee로 선언, Employee포함 자손 타입의 모든 인스턴스를 받아서 처리, 전달된 인자는 참조변수 e에 저장
	public static void calcTax(Employee e) {
/*		
		// instanceof 연산자를 이용 매개변수 e에 저장된 인스턴스 타입을 확인, 참조변수가 참조하는 인스턴스의 타입을 검사할 때 instanceof 연산자 사용
		// 다형성으로 인해 여러 타입이 전달될 수 있으므로 각각의 인스턴스 타입에 따라 서로 다른 작업을 하기 위해서 사용
		if(e instanceof Salesman) {
			System.out.println("Salesman 입니다.");
		} else if(e instanceof Manager) {
			System.out.println("Manager 입니다.");
		} else if(e instanceof Consultant) {
			System.out.println("Consultant 입니다.");
		} else {
			System.out.println("Employee 입니다.");
		}
*/		
		
		// 다형성으로 인해 조상 타입으로 선언된 참조변수(e)를 통해 접근할 수 있는 범위는 선언된 조상 타입(Employee)의 인스턴스가 포함하는 멤버로만 제한
		// 힙 영역에 만들어진 인스턴스의 모든 내용을 사용 => 원래 인스턴스의 타입으로 변경(type casting)
		if(e instanceof Salesman) {
			Salesman s = (Salesman)e;
			s.annual_sales = 6500000;
			System.out.println("Salesman 입니다." + s.annual_sales);
			
			//  타입 변경 후 실행, 타입 변경과 동시에 다른 실행문을 실행할 때
			((Salesman)e).annual_sales = 6500000;
			System.out.println("Salesman 입니다." + ((Salesman)e).annual_sales);
			
		} else if(e instanceof Manager) {
			Manager m = (Manager)e;
			m.num_team = 5;
			System.out.println("Manager 입니다." + m.num_team);
		} else if(e instanceof Consultant) {
			Consultant c = (Consultant)e;
			c.num_project = 35;
			System.out.println("Consultant 입니다." + c.num_project);
		} else {
			System.out.println("Employee 입니다.");
		}
	}
	
	public static void main(String[] args) {
		// Salesman, Manager, Consultant 클래스의 인스턴스를 생성한 후 참조변수 s, m, c에 각각의 주솟값을 저장
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
		
		// calcTax() 메서드를 호출, 각각 Salesman, Manager, Consultant 인스턴스의 주솟값을 전달 
		calcTax(s);
		calcTax(m);
		calcTax(c);
	}
	
}
