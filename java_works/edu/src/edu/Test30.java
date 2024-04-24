package edu;

public class Test30 {
	
	public static void main(String[] args) {
		
//		배수
//		int i = 6;
//		if((i%2) == 0) {
//			System.out.println(i + "은 2의 배수입니다.");
//			if((i%3) == 0) {
//				System.out.println(i + "은 3의 배수입니다.");
//			}
//		}

//      최소공배수		
//		int i = 6;
//		if((i%2) == 0) {
//			if((i%3) == 0) {
//				System.out.println(i + "은 2와 3의 최소공배수입니다.");
//			}
//		}
		
//      약수
//		int i = 6;
//		for(int j = 1; j < i; j++) {
//			if((i%j) == 0) {
//				System.out.println(i + "의 약수" + j + "입니다.");
//			}
//		}

		int i = 2;
		int j = 3;
		int c = 30;
		if((c%i) == 0 && (c%j) == 0) {
			System.out.println(c + "는 " + i + "와 " + j + "의 최대공약수입니다.");
		}
		
//      공배수
//		int i = 2;
//		int j = 3;
//		for(int n = 1; n <= 100; n++) {
//			if((n%i) == 0 && (n%j) == 0) {
//				System.out.println(n + "은 " + i + "와 " + j +"의 공배수 입니다.");
//			}
//		}
		
		for(int k = 2; k < 10; k++) {
			for(int n = 1; n < 10; n++) {
				System.out.println(k + "*" + n + "=" + (k*n));
			}
			
			System.out.println();    // 한 줄 바꿈
			
		}
		
		
	}
}
