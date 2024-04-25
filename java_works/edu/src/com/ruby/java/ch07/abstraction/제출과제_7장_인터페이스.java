package com.ruby.java.ch07.abstraction;
/*
 * 7장 실습 코드로 구현한다 
 */

interface Shape {
	public double perimeter();
	public float area();
	public String toString();
}

class Triangle implements Shape {
	private int x1,y1,x2,y2,x3,y3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y2 = y3;
	}
	
	@Override
	public double perimeter() { //구글링으로 계산식 찾아서 구현
		double sum = 0;
	
		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		return sum = side1 + side2 + side3;
	
	}
	
	@Override
	public float area() {
		float sum = 0;
		
		float side1 = (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		float side2 = (float) Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		float side3 = (float) Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		float sideHalf = (side1 + side2 + side3)/2;
		
		return sum = (float) Math.sqrt(sideHalf * (sideHalf - side1) * (sideHalf - side2) * (sideHalf - side1));
	}
	
	public String toString() {
		return null ;
	}
	
}

class Rectangle implements Shape {			// 직사각형
	
	int x1,y1,x2,y2;
	
	public Rectangle(int x1, int y1, int x2, int y2) {			// 대각선의 두 점 좌표
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		
		double side1 = Math.abs(x1 - x2);
		double side2 = Math.abs(y1 - y2);
		
		return 2 * (side1 + side2);
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		
		float side1 = Math.abs(x1 - x2);
		float side2 = Math.abs(y1 - y2);
		return side1 * side2;
	}
	
}

class Square extends Rectangle {

		int x1, y1;
		int side;
		
		public Square(int x1, int y1, int x2) {
			super(x1, y1, x2, x2);
			this.x1 = x1;
			this.y1 = y1;
			this.side = Math.abs(x1 - x2);
		}
		
		@Override
		public double perimeter() {
			// TODO Auto-generated method stub
			
			double side1 = Math.abs(x1 - x2);
			double side2 = Math.abs(y1 - y2);
			
			return 2 * (side1 + side2);
		}

		@Override
		public float area() {
			// TODO Auto-generated method stub
			
			float side1 = Math.abs(x1 - x2);
			float side2 = Math.abs(y1 - y2);
			return side1 * side2;
		}
		
}

public class 제출과제_7장_인터페이스 {
	public static void main(String[] args) {
		Shape t = new Triangle(1,2,3,4,5,6);
		Shape r = new Rectangle(1,2,3,4);
		Shape s = new Square(1,2,3);
		System.out.println("삼각형 둘레 길이 = " + t.perimeter());
		System.out.println("삼각형 면적 = " + t.area());
		System.out.println("직사각형 둘레 길이 = " + r.perimeter());
		System.out.println("직사각형 면적 = " + r.area());
		System.out.println("정사각형 둘레 길이 = " + s.perimeter());
		System.out.println("정사각형 면적 = " + s.area());
	}
}