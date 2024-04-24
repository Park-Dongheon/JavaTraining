package quiz;

public class Program {


	public static void main(String[] args) {				// main 메소드, EntryPoint 프로그램이 실행될 때 시작되는 지점
		// TODO Auto-generated method stub
		MatrixCalc mc = new MatrixCalc();					/*
																MatrixCalc 클래스의 새 인스턴스를 만들고 그것을 mc라는 변수에 할당
																mc는 인스턴스 변수의 이름, 이 변수는 MatrixCalc 클래스의 새로운 인스턴스를 참조할 수 있어 "참조 변수"라고 함, 
																따라서 mc를 통해 해당 클래스의 메소드를 호출하고 멤버 변수에 접근 가능
																MatrixCalc 클래스의 기본 생성자가 호출되어 새로운 객체가 생성 -> 이 객체의 참조가 mc 변수에 할당 -> mc를 사용하여 MatrixCalc 클래스의 메소드를 호출하거나 해당 인스턴스의 속성에 접근 가능
															 */
		mc.work(true);										// MatrixCalc 클래스의 인스턴스인 mc에 속한 work 메소드를 호출, work 메소드 내에서는 true라는 boolean 값을 인수로 받음
//		PrimeNumber pn = new PrimeNumber();
//		pn.work();
	}

}