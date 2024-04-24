package edu;

// java 패키지 모듈 사용 
import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		
		// 입력 Scanner 객체 생성 선언 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요:");
		// 점수 초깃값을 입력한다.
		int score = sc.nextInt();
		// 성적 문자값을 초기화한다.
		char grade;
		
		// 점수가 90점 이상인지 비교한다
		if(score >= 90) {
			// 90점 이상이라면 'A'문자값를 성적 변수에 저장한다.
			grade = 'A';
		} else if(score >= 80) {
			// 80점 이상이라면 'B'문자값를 성적 변수에 저장한다.
			grade = 'B';
		} else if(score >= 70) {
			// 70점 이상이라면 'C'문자값를 성적 변수에 저장한다.
			grade = 'C';
		} else if(score >= 60) {
			// 60점 이상이라면 'D'문자값를 성적 변수에 저장한다.
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		// 결과 문자값을 화면에 출력한다.
		System.out.println("당신의 등급은 " + grade + " 입니다.");
	}
}
