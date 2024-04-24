package chapter03;

public class Test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for 문
		for(int i = 10; i < 10; i++) {
			System.out.println("for OK");
		}
		
		// while 문
		int j = 10;
		while(j < 10) {
			System.out.println("while OK");
			j++;
		}
		
		// do~while 문, 반복 블록을 먼저 실행 후 조건식 검사, 조건에 상관없이 무조건 한 번은 실행
		int k = 10;
		do {
			System.out.println("do-while OK");			// 실행문, "do-while OK" 출력
			k++;										// 증감식
		} while(k < 10);								// 조건식, 반드시 조건식 뒤 ;(세미콜론)입력 
	}

}
