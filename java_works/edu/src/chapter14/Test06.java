package chapter14;
/* 제네릭 함수형 인터페이스로 선언 시 한 번의 인터페이스 선언으로 모든 타입을 인자로 받아 처리
 * 제네릭 함수형 인터페이스에서 타입 매개변수 T에 전달할 타입 인자는 람다식을 참조하는 참조변수에 지정
 * 람다식에서는 제네릭을 사용할 수 없음
 * [ 제네릭 인터페이스에 타입 인자 전달 ]
   인터페이스명<타입 인자> 변수명 = () -> 명령문
 */

// 제네릭 함수형 인터페이스를 선언, 타입 매개변수 T에는 람다식을 참조하는 참조변수에서 지정하는 타입 인자로 대체
@FunctionalInterface
interface MyFunc<T> {
	T modify(T t);
}

public class Test06 {

	public static void main(String[] args) {
		
		// 람다식 선언, 인자로 전달받은 문자열 srt을 대문자로 변경하고 글자 수를 알려주는 문자열로 반환하는 명령문
		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();
		// 선언한 람다식을 실행, 인자로 전달한 "Java", "Java Programming" 문자열은 람다식의 매개변수 str에 저장
		System.out.println(mf1.modify("Java"));
		System.out.println(mf1.modify("Java Programming"));
		
		// 람다식 선언, 인터페이스의 타입 매개변수 T에 Integer를 지정, (n)은 modify() 메서드 호출 시 전달되는 인자를 받는 매개변수, -> n * 2는 매개변수로 전달받은 n 값에 2를 곱해서 반환하는 명령문
		MyFunc<Integer> mf2 = (n) -> n * 2;
		// 선언한 람다식을 실행, 인자로 전달한 23, 42는 매개변수 n에 저장되고 반환값은 n * 2
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
		
	}

}
