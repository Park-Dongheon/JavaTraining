package chapter03;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 6;
		
		// 중첩 if 문
		if((i % 2) == 0) {										// i 변숫값을 2로 나눈 나머지 값이 0인지 검사, 결괏값=true이면 짝수 or 2의 배수
			System.out.println(i + "은 2의 배수입니다.");			// "6은 2의 배수입니다." 출력, 첫 번째 if 문 true일 경우 실행
			if((i % 3) == 0) {									// i 변숫값이 2의 배수일 때, 두 번째 조건식 i 변숫값을 3으로 나눈 나머지 값이 0인지 검사, 결괏값=true이면 3의 배수
				System.out.println(i + "은 3의 배수입니다.");		// "6은 3의 배수입니다." 출력, 첫 번째·두 번째 if 문 모두 true일 때만 실행
			}
		}
	}

}
