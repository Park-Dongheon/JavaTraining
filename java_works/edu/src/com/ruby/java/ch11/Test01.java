package com.ruby.java.ch11;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int i = 3 % 0;									// 오류 발생, ArithmeticException() 오류, Exception()에서 예외 처리
			String s = new String("Java");
			int len = s.length();
			s = null;
			s.length();										// 오류 발생, new NullPointerException()으로 이동
			int arr[] = new int[3];
			arr[3] = 30;									// 오류 발생, new ArrayIndexOutOfBoundsException()으로 이동
			System.out.println("OK");
			
		} catch(ArrayIndexOutOfBoundsException e1) {		// 오류 처리, ArrayIndexOutOfBoundsException
			System.out.println("잘목된 배열의 인덱스 사용!");
			System.out.println(e1.getMessage());			// toString 형태로 받아옴
		} catch(NullPointerException e2) {					// 오류 처리, NullPointerException
			System.out.println("잘못된 참조");
			e2.printStackTrace();							// Cannot invoke "String.length()" because "s" is null ---출력
		} catch(Exception e) {								// 오류 처리, 위 예외 외 모든 예외
			System.out.println("오류 발생 : " + e);			// 오류 발생 : java.lang.ArithmeticException: / by zero ---출력
		}
		System.out.println("GOOD");
	}

}
