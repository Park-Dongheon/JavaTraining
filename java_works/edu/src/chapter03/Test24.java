package chapter03;

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nation = "KOR";					// 문자열 저장하는 nation 변수 선언, "KOR"로 초기화
		
		switch(nation) {						// switch~case 문 선언, nation 변숫값에 따라 분기
		// nation 변숫값이 "KOR" or "JPN" or "CHN" 중 속하면 명령어 실행(break 문 만날 때까지 실행)
		case "KOR":								
		case "JPN":
		case "CHN":
			System.out.println("아시아");			// "아시아" 출력
			break;								// switch~case 문 종료
		/* 
		if 문으로 변경: 
		if(nation == "KOR" || nation == "JPN" || nation == "CHN" ) {
			System.out.println("아시아");
		}
		*/
		// nation 변숫값이 "GBR" or "FRA" or "EUA" 중 속하면 명령어 실행(break 문 만날 때까지 실행)
		case "GBR":
		case "FRA":
		case "EUA":
			System.out.println("유럽");
			break;
		// nation 변숫값이 "USA" or "CAN" or "MEX" 중 속하면 명령어 실행(break 문 만날 때까지 실행)	
		case "USA":
		case "CAN":
		case "MEX":
			System.out.println("아메리카");
			break;	
		}
	}

}
