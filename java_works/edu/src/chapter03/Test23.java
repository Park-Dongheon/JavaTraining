package chapter03;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'F';
		
		// switch ~ case 문: 조건에 맞는 값이 없을 때 실행 - default 문
		switch(grade) {											// grade 변숫값이 switch 문의 분기 조건에 해당하지 않으면 default 문으로 이동
			case 'A':
				System.out.println("90점 이상"); break;
			case 'B':
				System.out.println("80점 이상"); break;
			case 'C':
				System.out.println("70점 이상"); break;
			case 'D':
				System.out.println("60점 이상"); break;
			default:											// switch ~ case 문의 조건 분기식에 해당하지 않으면 default 문 실행 
				System.out.println("60점 미만"); break;			// "60점 미만" 출력
		}
	}

}
