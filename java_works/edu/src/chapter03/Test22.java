package chapter03;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 2;
		char op = '+';
		
		// switch ~ case 문을 사용한 분기 조건문의 예
		switch(op) {								/*
													   switch 문의 분기 조건을 op 변수로 명시, op 변숫값과 일치하면 case 문으로 이동 해당 명령어 실행, 
													   case 문에 일치하는 값이 없으면 아무것도 실행하지 않고 switch ~ case 문 밖(})으로 이동
													*/
		case '+':									/*
													   case 값 '+'가 op 변숫값과 일치 시 명령문 실행, 
													   해당 case 문 조건식을 만족하여 다른 case 문의 조건식에 상관없이 모두 실행
													*/
			System.out.println(a + b);				// 14 출력
		case '-':									// case 값에 상관없이 명령어 실행
			System.out.println(a - b);				// 10 출력
		case '*':									// case 값에 상관없이 명령어 실행
			System.out.println(a * b);				// 24 출력
		case '/':									// case 값에 상관없이 명령어 실행
			System.out.println(a / b);				// 6 출력
		}
		
		System.out.println();
		
		// switch ~ case 문 - break 문을 사용한 분기 조건문 예
		switch(op) {								/*
													   switch 문의 분기 조건을 op 변수로 명시, op 변숫값과 일치하면 case 문으로 이동 해당 명령어 실행, 
		   											   case 문에 일치하는 값이 없으면 아무것도 실행하지 않고 switch ~ case 문 밖(})으로 이동
		   											*/
		case '+':									// case 값 '+'가 op 변숫값과 일치 시 명령문 실행
			System.out.println(a + b); break;		// 14 출력, break 문 만나 switch ~ case 문 밖(})으로 이동
		case '-':									// case 값 '-'가 op 변숫값과 일치 시 명령문 실행
			System.out.println(a - b); break;		// case 문 실행 x
		case '*':									// case 값 '*'가 op 변숫값과 일치 시 명령문 실행
			System.out.println(a * b); break;		// case 문 실행 x
		case '/':									// case 값 '/'가 op 변숫값과 일치 시 명령문 실행
			System.out.println(a / b); break;		// case 문 실행 x
		}
		
	}

}
