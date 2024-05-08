package chapter14;

// int, int 타입으로 매개변수가 선언된 check() 추상 메서드를 포함하는 함수형 인터페이스 Verify2를 선언
@FunctionalInterface
interface Verify2 {
	boolean check(int n, int d);
}

public class Test04 {

	public static void main(String[] args) {
		
		// Verify2 인터페이스의 check() 메서드를 구현한 람다식, (n,d) == check(int n, int d), 매개변수로 전달받은 n을 d로 나눈 나머지가 0이면 true
		Verify2 vf = (n, d) -> (n % d) == 0;
		System.out.println(vf.check(24, 3));

	}

}
