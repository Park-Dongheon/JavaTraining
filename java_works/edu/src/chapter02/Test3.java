package chapter02;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age;
		short point;
		int price;
		long totalSales;
												//								저장 숫자 범위
		age = 23;                               // byte타입 1바이트 메모리 크기 사용, -128~127
		point =32000;                           // short타입 2바이트 메모리 크기 사용, -32,768~32,767
		price = 3500000;                        // int타입 4바이트 메모리 크기 사용, -2,147,483,648~2,147,483,647
		totalSales = 2147483648L;				// long타입 8바이트 메모리 크기 사용, -2의 63승~(2의 63승 - 1), value를 저장하기 전 임시로 메모리에 저장(int타입) -> value + l/L를 지정 long타입으로 변경
		
		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSales);
	}

}
