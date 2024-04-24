package chapter03;

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단
		for(int i = 2; i < 10; i++) {										// 바깥쪽 반복문, 제어 변수 i가 2 ~ 10보다 작을 때까지 1씩 증가하면서 반복, 총 8번 반복
			for(int j = 1; j < 10; j++) {									// 안쪽 반복문, 제어 변수 j가 1 ~ 10보다 작을 때까지 1씩 증가하면서 반복, 총 9번 반복
				System.out.println(i + "*" + j + "=" + (i * j));			// 구구단 출력, 총 72번 반복, 총 반복 횟수 = 바깥쪽 반복문 횟수 * 안쪽 반복문 횟수
			}
			System.out.println("\n");										// 한 줄 바꿈, 8번 실행, 바깥쪽 반복문 횟수만큼 반복 
		}
	}

}
