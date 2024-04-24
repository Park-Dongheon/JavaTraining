package chapter03;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {			// for 반복문: i가 0부터 10보다 작을 때까지 i를 1씩 증가하면서 실행
			if((i % 2) == 0) {					// (i % 2): i의 값을 2로 나눈 나머지값, 조건문 i가 짝수이면 continue 문 이동  
				continue ;						// for{} 반복문 블록에서 이후 명령문 실행 x, 다음 반복문 실행 절차 수행 '조건식 -> continue -> 증감식 -> 조건식'
			}
			System.out.println(i);				// 명령문, 1 3 5 7 9 출력
		}
	}

}
