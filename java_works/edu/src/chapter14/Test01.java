package chapter14;
/* 명령형 스타일로 인터페이스를 구현하는 세 가지 방식
 * 방법1: implements 키워드로 클래스 선언
 * 방법2: 익명 클래스 사용 ----- [ 익명 클래스로 인터페이스 구현 ] 
   							인터페이스명 변수명  = new 인터페이스명() {
   							    메서드 오버라이딩
   							};
 * 방법3: 선언, 생성, 호출을 한번에 처리 ----- [ 익명 클래스 선언, 생성, 메서드 호출 ]
  										(new 인터페이스명() {
  										    메서드 오버라이딩
  										}).메서드명();	*/

/* 람다식에서는 메서드 선언이 필요 없음, 메서드의 매개변수들이 선언되는 괄호()는 그대로 표현,
 * 인터페이스에 선언된 추상 메서드의 본문을 구현할 떼는 화살표(->) 기호 다음에 작성
 * 본문 작성시 중괄호{} 안에 작성, 명령문이 한 줄이면 중괄호{} 생략가능
 * 람다식으로 구현하려는 인터페이스는 반드시 하나의 메서드만 선언, "함수형 인터페이스" : 하나의 메서드만 선언된 인터페이스
 * [ 람다식 ]
 * () -> 명령문;			<----- 함수형 인터페이스의 추상 메서드 구현 시 명령문이 한 개일 때
 * () -> {				<----- 함수형 인터페이스의 추상 메서드 구현 시 명령문이 여러 개일 때
     명령문1;
     명령문2;
     명령문n;
   };
 * @FunctionalInterface 어노테이션 지정 시, 하나 이상의 추상메서드가 선언될 때 컴파일 오류가 발생, 개발자가 함수형 인터페이스를 선언하려는 의도에 벗어나지 않도록 도움
 */

@FunctionalInterface
interface MyInterface {
	
	public void print();
	
}

class MyClass1 implements MyInterface {

	@Override
	public void print() {
		System.out.println("MyClass1");
	}
	
}

class MyClass2 implements MyInterface {

	@Override
	public void print() {
		System.out.println("MyClass2");
	}
	
	
}

public class Test01 {
	
	public static void test(MyInterface mi) {	// MyInterface 타입으로 매개변수가 선언
		mi.print();
	}
	
	// MyInterface 타입을 반환함
	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {

			@Override
			public void print() {
				System.out.println("test2() 메서드에서 반환된 MyIterface");
			}
			
		};
		
		return mi;
	}
	
	// MyInterface를 구현한 익명 클래스를 생성해 반환
	public static MyInterface test3() {
		return new MyInterface() {

			@Override
			public void print() {
				System.out.println("hello");
			}
			
		};
	}
	
	public static void main(String[] args) {
		
		// test() 메서드 호출 시 인터페이스를 구현한 클래스의 참조변수(mc1,mc2) 또는 익명 클래스의 참조변수(mi)를 인자로 전달 가능
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print();							// MyClass1
		mc2.print();							// MyClass2
		
		MyInterface mi = new MyInterface() {

			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");
			}
			
		};
		test(mc1);								// MyClass1
		test(mi);								// 익명 클래스로 구현
		
		mi.print();								// 익명 클래스로 구현
		
		(new MyInterface() {

			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
			
		}).print();								// 선언, 생성, 호출을 한번에 처리
		
		MyInterface mi2 = test2();
		mi2.print();							// test2() 메서드에서 반환된 MyInterface
		
		// 명령형 스타일 구현
		// test3() 메서드에서 반환한 익명 클래스를 사용하려면, test3() 메서드를 호출하고 반환되는 값 저장
		MyInterface mi3 = test3();
		// 반환된 익명클래스가 구현한 MyIterface 타입으로 참조변수(mi3)를 선언한 후 참조변수를 이용해 print() 메서드를 호출
		mi3.print();
		
		// 람다식 구현 == test3(), 함수형 스타일 구현
		MyInterface m = () -> System.out.println("Hello");
		m.print();
		
	}

}
