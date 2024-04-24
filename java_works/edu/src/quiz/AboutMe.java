package quiz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AboutMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "박동헌";
		String birthStr = "1992년도 05월 28일"; 
		double height = 170.0;
		int weight = 80;
		String job = "학생";
		
		/* 문자열 타입을 날짜 타입으로 변환
		 * SimpleDateFormat 클래스를 이용하여, 문자열 -> Date 객체로 바꾸는 방법
		 */
		SimpleDateFormat df = new SimpleDateFormat("yyyy년도 MM월 dd일");
		Date birthDate = null;		// Date 타입 birthDate 변수 선언, null로 초기화
		try {
			birthDate = df.parse(birthStr);		// SimpleDateFormet birthStr 변숫값 parse birthDate 변수에에 저장
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + df.format(birthDate));		// SimpleDateFormet birthStr 변숫값 format 출력
		System.out.println("키 : " + height + "cm");
		System.out.println("체중 : " + weight);
		System.out.println("직업 : " + job);
		
	}

}
