package com.ruby.java.ch07.abstraction;
/*
 * 7장 실습 코드로 구현한다 
 */

interface Shape {																// Shape 인터페이스 정의, 도형의 둘레·면적 계산 메서드를 포함
	public abstract double perimeter();													// Shape 인터페이스에 선언된 메소드, 도형의 '둘레'를 계산하는 추상메서드, 컴파일 시 public abstract 제어자가 자동 추가
	public abstract float area();														// Shape 인터페이스에 선언된 메소드, 도형의 '면적'를 계산하는 추상메서드, 컴파일 시 public abstract 제어자가 자동 추가
}

class Triangle implements Shape {												// 삼각형 Triangle 클래스 정의, Shape 인터페이스를 구현 => Shape 인터페이스의 모든 메서드 구현
	private int x1,y1,x2,y2,x3,y3;												// Triangle 클래스 멤버 변수, 삼각형의 세 점의 좌표
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {			// 삼각형 Triangle 클래스의 생성자 메서드, 세 점의 좌표를 입력받아 초기화
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	@Override
	public double perimeter() {													// 삼각형의 둘레 계산, '피타고라스 원리'로 세 변의 길이를 구함, 계산된 값을 반환함
																				// 한 변의 길이 계산, 제곱함수(Math.pow) · 제곱근함수(Math.sqrt) 이용
		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		return side1 + side2 + side3;
	
	}
	
	@Override
	public float area() {														// 삼각형의 면적 계산, 삼각형의 세 번의 길이를 이용해 삼각형의 넓이를 구하는 '헤론의 공식' 사용, 계산된 값을 반환함
		
		
		float side1 = (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		float side2 = (float) Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		float side3 = (float) Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		
		if ( Math.abs((x1 - x2) * (y2 - y3) - (x2 - x3) * (y1 - y2)) <= 0 ) {	// 세 점의 좌표가 일직선상에 있을 경우 리턴값 0
			return 0.0f;
		}
		
		float sideHalf = (side1 + side2 + side3) / 2;							// 헤론의 공식에 사용되는 둘레 절반값
		
		return (float) Math.sqrt(sideHalf * (sideHalf - side1) * (sideHalf - side2) * (sideHalf - side3));
	}
	
}

class Rectangle implements Shape {												// 직사각형 Rectangle 클래스 정의, Shape 인터페이스를 구현
	
	int x1,y1,x2,y2,x3,y3,x4,y4;
	
	public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {							// Rectangle 클래스 생성자 메서드, 직사각형의 대각선 두 점의 좌표를 입력받아 초기화 
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	
	@Override
	public double perimeter() {													// 직사각형의 둘레 계산, 절댓값 함수(Math.abs)이용							
		// TODO Auto-generated method stub
		double side1 = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2)); 
		double side2 = Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3), 2));
		double side3 = Math.sqrt(Math.pow((x3 - x4),2) + Math.pow((y3 - y4), 2));
		double side4 = Math.sqrt(Math.pow((x4 - x1),2) + Math.pow((y4 - y1), 2));
		
		return side1 + side2 + side3 + side4;
	}

	@Override
	public float area() {														// 직사각형의 면적 계산
		// TODO Auto-generated method stub
		
		float cross1 = (float) Math.sqrt(Math.pow((x1 - x3),2) + Math.pow((y1 - y3), 2)); 
		float cross2 = (float) Math.sqrt(Math.pow((x2 - x4),2) + Math.pow((y2 - y4), 2));

		return cross1 * cross2;
	}
	
}

class Square extends Rectangle {												// 정사각형 Square 클래스 정의, Rectangle 클래스를 상속(Rectangle 클래스의 모든 멤버를 상속 받음)
		int side;																// 한 변의 길이가 side의 값과 같은지 비교
		
		public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int side) {								// Square 클래스 생성자 메서드, 사각형의 한 꼭지점의 좌표와 변의 길이를 입력받아 초기화 ex) (x1, y1) = (1, 2) / (x1 + side, y1 + side) = (4, 5)
			super(x1, y1, x2, y2, x3, y3, x4, y4);
			this.side = side;
		}
		
		@Override
		public double perimeter() {												// 정사각형의 둘레 계산												
			// TODO Auto-generated method stub
			double result = 0;
			
			double side1 = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2)); 
			double side2 = Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3), 2));
			double side3 = Math.sqrt(Math.pow((x3 - x4),2) + Math.pow((y3 - y4), 2));
			double side4 = Math.sqrt(Math.pow((x4 - x1),2) + Math.pow((y4 - y1), 2));
			
			if( side1 == side && side2 == side && side3 == side && side4 == side) {
				result = side1 + side2 + side3 + side4;
				return result;
			} else {
				System.out.println("정사각형이 아닙니다.");
			}
			return result;
		}

		@Override
		public float area() {													// 정사각형의 면적 계산
			// TODO Auto-generated method stub
			
			float cross1 = (float) Math.sqrt(Math.pow((x1 - x3),2) + Math.pow((y1 - y3), 2)); 
			float cross2 = (float) Math.sqrt(Math.pow((x2 - x4),2) + Math.pow((y2 - y4), 2)); 

			return cross1 * cross2;
		}
		
}

public class 제출과제_7장_인터페이스 {
	public static void main(String[] args) {
		Shape t = new Triangle(1,2,3,4,5,6);									// Shape 인터페이스를 구현한 Triangle 클래스의 객체를 생성
		Shape r = new Rectangle(1,2,3,2,1,5,3,5);								// Shape 인터페이스를 구현한 Rectangle 클래스의 객체를 생성
		Shape s = new Square(1,2,3,2,1,5,3,5,3);								// Shape 인터페이스를 구현한 Square 클래스의 객체를 생성
		System.out.println("삼각형 둘레 길이 = " + t.perimeter());					// 참조변수를 통한 메서드 호쿨, 반환값을 출력
		System.out.println("삼각형 면적 = " + t.area());
		System.out.println("직사각형 둘레 길이 = " + r.perimeter());
		System.out.println("직사각형 면적 = " + r.area());
		System.out.println("정사각형 둘레 길이 = " + s.perimeter());
		System.out.println("정사각형 면적 = " + s.area());
	}
}