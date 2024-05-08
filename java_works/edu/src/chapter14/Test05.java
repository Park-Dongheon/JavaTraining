package chapter14;
/* 람다식 문법에서 () -> 기호 다음 부분은 람다식의 본문
 * 람다식 본문의 명령문이 한 줄이면 return 문 생략해도 명령문에서 처리된 값이 자동으로 반환
 * 람다식 본문에 명령문이 여러 줄이면 중괄호{} 블록으로 감싸야함
 * 반환값이 있을 때는 반드시 return 문을 지정
 * 블록 {}을 사용하면 return 문은 생략할 수 없음
 */

@FunctionalInterface
interface NumberFunc {
	int func(int n);
}

public class Test05 {

	public static void main(String[] args) {
		
		NumberFunc sum = (n) -> {
			int result = 0;
			for(int i = 0; i <= n; i++) {
				result += i;
			}
			return result;
		};
		
		System.out.println("1부터 10까지의 합 : " + sum.func(10));
		System.out.println("1부터 100까지의 합 : " + sum.func(100));
	}

}
