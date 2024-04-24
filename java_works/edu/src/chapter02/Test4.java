package chapter02;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float exchangeRate = 1136.50F;					// float타입 4바이트 메모리 크기 사용, 실수는 기본적으로 double타입으로 메모리에 임시 저장, value + f/F를 지정
		double USDAmount = 600.50;						// double타입 8바이트 메모리 크기 사용
		double KRWAmount = 682468.25;
		
		System.out.println(exchangeRate);
		System.out.println(USDAmount);
		System.out.println(KRWAmount);
	}

}
