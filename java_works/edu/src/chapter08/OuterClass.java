package chapter08;

/*
	외부 클래스 Outer의 멤버로서 내부 클래스 InstanceClass를 선언, InstanceClass는 필드 a와 method2()로 구성
 */
class Outer {
	
	class InstanceClass {
		int a;
		
		void method2() {
			System.out.println("Instance Class : " + a);
		}
	}
	
}

/*
 	인스턴스 멤버 클래스: 자신이 속한 외부 클래스의 인스턴스를 통해서만 접근 가능
 */

public class OuterClass {
	public static void main(String[] args) {
		Outer out = new Outer();								// 인스턴스 멤버 클래스를 사용하려면 먼저 외부 클래스의 인스턴스를 생성
		Outer.InstanceClass inner01 = out.new InstanceClass();	// 외부 클래스 참조변수.new 내부 클래스 명()으로 생성, 인스턴스 멤버 클래스의 참조변수 타입: 외부 클래스명.내부클래스명 형태로 지정
		inner01.a = 123;
		inner01.method2();
	}

}
