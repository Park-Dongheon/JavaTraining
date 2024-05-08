package chapter14;

// 함수형 인터페이스
@FunctionalInterface
interface Multiply {
	
	// 매개변수x, double 타입의 값을 반환
	double getValue();
}

public class Test02 {

	public static void main(String[] args) {
		
		// 인터페이스 Multiply 타입을 참조하는 변수 m을 선언
		Multiply m;
		// () -> 3.14 * 2 ----- Multiply 인터페이스를 구현하는 람다식, getValue() 메서드를 오버라이딩하는 콬드
		m = () -> 3.14 * 2;
		System.out.println(m.getValue());
		
		m = () -> 10 * 3;
		System.out.println(m.getValue());
	}

}
