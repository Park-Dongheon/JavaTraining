package com.ruby.java.ch08.polymorphism;

interface Shape {
	public double perimeter();
	public float area();
	String toString();
	public double line();
}

class Triangle implements Shape {
	private int[] coord;
	
	public Triangle(int...arr) {
		// TODO Auto-generated constructor stub
		for(int i = 0; i < arr.length/2; i++) {
			coord[i] = arr[2 * i];
			coord[i] = arr[2 * i + 1];
		}
	}
	@Override
	public double perimeter() { 				//구글링으로 계산식 찾아서 구현
		double sum = 0;
		
		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		sum = side1 + side2 + side3;
		
		return sum;
	}
	
	@Override
	public float area() {
		float side1 = (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		float side2 = (float) Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		float side3 = (float) Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		
		if ( Math.abs((x1 - x2) * (y2 - y3) - (x2 - x3) * (y1 - y2)) <= 0 ) {	
			return 0.0f;
		}
		
		float sideHalf = (side1 + side2 + side3) / 2;							
		
		return (float) Math.sqrt(sideHalf * (sideHalf - side1) * (sideHalf - side2) * (sideHalf - side3));
	}
	
	public String toString() {
		return "삼각형의 좌표: " + "(" + coord[0] + "," + y1 + ") " + "(" + x2 + "," + y2 + ") " + "(" + x3 + "," + y3 + ") ";
	}
	
	@Override
	public double line() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


class Rectangle implements Shape {
	
	int x1,y1,x2,y2,x3,y3,x4,y4;
	
	public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
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
	public double perimeter() {
		// TODO Auto-generated method stub
		double side1 = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2)); 
		double side2 = Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3), 2));
		double side3 = Math.sqrt(Math.pow((x3 - x4),2) + Math.pow((y3 - y4), 2));
		double side4 = Math.sqrt(Math.pow((x4 - x1),2) + Math.pow((y4 - y1), 2));
		
		return side1 + side2 + side3 + side4;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		float cross1 = (float) Math.sqrt(Math.pow((x1 - x3),2) + Math.pow((y1 - y3), 2)); 
		float cross2 = (float) Math.sqrt(Math.pow((x2 - x4),2) + Math.pow((y2 - y4), 2));

		return cross1 * cross2;
	}
	
	public String toString() {
		return "직사각형의 좌표: " + "(" + x1 + "," + y1 + ") " + "(" + x2 + "," + y2 + ") " + "(" + x3 + "," + y3 + ") " + "(" + x4 + "," + y4 + ") ";
	}

	@Override
	public double line() {
		// TODO Auto-generated method stub
		return 0;
	}
}


class Square extends Rectangle {
	int side;
	
	public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int side) {
		// TODO Auto-generated constructor stub
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		this.side = side;
	}
	
	public double perimeter() {
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
	
	public float area() {
		float cross1 = (float) Math.sqrt(Math.pow((x1 - x3),2) + Math.pow((y1 - y3), 2)); 
		float cross2 = (float) Math.sqrt(Math.pow((x2 - x4),2) + Math.pow((y2 - y4), 2));

		return cross1 * cross2;
	}
	
	public String toString() {
		return "정사각형의 좌표: " + "(" + x1 + "," + y1 + ") " + "(" + x2 + "," + y2 + ") " + "(" + x3 + "," + y3 + ") " + "(" + x4 + "," + y4 + ") ";
	}
}


class Pentagon implements Shape {
	private int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;

	public Pentagon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5) {
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		this.x5 = x5;
		this.y5 = y5;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		
		double side1 = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2)); 
		double side2 = Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3), 2));
		double side3 = Math.sqrt(Math.pow((x3 - x4),2) + Math.pow((y3 - y4), 2));
		double side4 = Math.sqrt(Math.pow((x4 - x5),2) + Math.pow((y4 - y5), 2));
		double side5 = Math.sqrt(Math.pow((x5 - x1),2) + Math.pow((y5 - y1), 2));
		return side1 + side2 + side3 + side4 + side5;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		
		float side1 = (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		float side2 = (float) Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		float side3 = (float) Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));
		float side4 = (float) Math.sqrt(Math.pow((x4 - x5),2) + Math.pow((y4 - y5), 2));
		float side5 = (float) Math.sqrt(Math.pow((x5 - x1),2) + Math.pow((y5 - y1), 2));
		
		float sideHalf = (side1 + side2 + side3 + side4 + side5) / 2;							// 헤론의 공식에 사용되는 둘레 절반값
		
		return (float) Math.sqrt(sideHalf * (sideHalf - side1) * (sideHalf - side2) * (sideHalf - side3) * (sideHalf - side4) * (sideHalf - side5));
	}
	
	public String toString() {
		return "오각형의 좌표: " + "(" + x1 + "," + y1 + ") " + "(" + x2 + "," + y2 + ") " + "(" + x3 + "," + y3 + ") " + "(" + x4 + "," + y4 + ") " + "(" + x5 + "," + y5 + ") ";
	}

	@Override
	public double line() {
		// TODO Auto-generated method stub
		return 0;
	}
}


public class 제출과제_8장_인터페이스_상속관계구현 {
	public static void printPoly(Shape[] s) {
		for(Shape v : s) {
			System.out.println("좌표 = " + v.toString());
			System.out.println("둘레 길이 = " + v.perimeter());
			System.out.println("면적 = " + v.area());
			System.out.println("-".repeat(50));
		}
	}
	
	
	public static void main(String[] args) {
		Shape[]arr = new Shape[4];
		arr[0] = new Triangle(1, 2, 3, 4, 5, 6);
		arr[1] = new Rectangle(1, 2, 3, 2, 1, 5, 3, 5);
		arr[2] = new Square(1, 2, 3, 2, 1, 4, 3, 4, 2);
		arr[3] = new Pentagon(5, 1, 8, 1, 3, 5, 10, 5, 6, 12);
		
		printPoly(arr);
		
	}
	
}