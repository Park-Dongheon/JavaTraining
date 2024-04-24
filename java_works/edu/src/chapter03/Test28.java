package chapter03;

public class Test28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		while(true) {
			System.out.println("OK");		// "OK OK OK OK OK" 출력
			cnt = cnt + 2;					// cnt 변숫값이 반복문을 실행할 때마다 2씩 중가
			if(cnt == 10) {					// cnt 변숫값이 10인지 검사, true일 경우 break문 실행
				break;						// 반복문(while 문) 빠져나옴
			}
		}
	}

}
