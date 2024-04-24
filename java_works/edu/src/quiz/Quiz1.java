package quiz;

import java.util.Scanner;

public class Quiz1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수값을 입력하시요:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("곱: " + i * j);
		System.out.println("몫: " + i / j);
		System.out.println("나머지: " + i % j);
		
	}
	
}
