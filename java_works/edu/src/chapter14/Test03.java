package chapter14;

// 리턴 타입 boolean, 매개변수 타입 int인 check() 메서드를 포함하는 함수형 인터페이스 Verify를 선언  
@FunctionalInterface
interface Verify {
	boolean check(int n);
}

public class Test03 {

	public static void main(String[] args) {
		
		// Verify 인터페이스의 check() 메서드를 구현한 후 isEven 변수가 해당 메서드를 참조, n이 짝수이면 true
		Verify isEven = (n) -> (n % 2) == 0;
		// isEven이 참조하는 check() 메서드를 호출, 인자값 10 -> 매개변수 n에 전달
		System.out.println(isEven.check(10));
		
		// Verify 인터페이스의 check() 메서드를 구현한 후 isPositive 변수가 해당 메서드를 참조, n이 양수이면 true
		Verify isPositive = (n) -> n >= 0;
		// isEven이 참조하는 check() 메서드를 호출
		System.out.println(isPositive.check(-5));
	}

}
