package geometryTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Geometry {	
	List<Integer> xArr = new ArrayList<>();
	List<Integer> yArr = new ArrayList<>();
	abstract double getArea();
	abstract double getLength();
}

class Point extends Geometry{

	public Point(int x, int y) {
		xArr.add(x);
		yArr.add(y);
	}

	@Override
	double getArea() {
		return 0.0;
	}

	@Override
	double getLength() {
		return 0.0;
	}
	
	public String toString() {
		return "[" +  xArr.get(0) + ", " + yArr.get(0) + "]" ;
	}
	
}

class Line extends Geometry {

	public Line(int x1, int y1, int x2, int y2) {
		xArr.add(x1);
		yArr.add(y1);
		xArr.add(x2);
		yArr.add(y2);
	}

	@Override
	double getArea() {
		return 0.0;
	}

	@Override
	double getLength() {
		return Line.length(xArr.get(0), yArr.get(0), xArr.get(1), yArr.get(1));
	}
	
	static double length(int x1, int y1, int x2, int y2) {
		double line = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return line;
	}
	
}

class PolyLine extends Geometry {

	public PolyLine(int... arr) {
		for(int i = 0; i < arr.length/2; i++) {
			xArr.add(arr[2 * i]);
			yArr.add(arr[2 * i + 1]);
		}
	}

	@Override
	double getArea() {
		return 0.0;
	}

	@Override
	double getLength() {
		double ret = 0.0;
		for(int i = 0; i < xArr.size() - 1; i++) {
			ret += Line.length(xArr.get(i), yArr.get(i), xArr.get(i+1), yArr.get(i+1));
		}
		return ret;
	}
	
}

class TriAngle extends Geometry {

	public TriAngle(int... arr) {
		for(int i = 0; i < arr.length/2; i++) {
			xArr.add(arr[2 * i]);
			yArr.add(arr[2 * i + 1]);
		}
	}

	@Override
	double getArea() {
		double area = 0.0;
		for(int i = 0; i < xArr.size(); i++) {
			area += TriAngle.area(xArr.get(i), yArr.get(i), xArr.get(i+1), yArr.get(i+1));
		}		
		return area;
	}

	@Override
	double getLength() {
		double ret = 0.0;
		for(int i = 0; i < xArr.size() - 1; i++) {
			ret += Line.length(xArr.get(i), yArr.get(i), xArr.get(i+1), yArr.get(i+1));
		}
		return ret;
	}
	
	static double area(int...arr) {
		
//		double[] line;
//		for(int i = 0; i < arr.length/2; i++) {
//			line[i] = Math.sqrt(Math.pow(arr[i] - arr[i+1], 2) + Math.pow(arr[i] - y2, 2));
//		}
//		if ( Math.abs((x1 - x2) * (y2 - y3) - (x2 - x3) * (y1 - y2)) <= 0 ) {	
//			return 0.0;
//		}
//		
//		double lineHalf = (line1 + line2 + line3) / 2;					
//		double areaTri = Math.sqrt(lineHalf * (lineHalf - line1) * (lineHalf - line2) * (lineHalf - line3));
//		
		return 0.0;
	}
}


//class Rectangle extends Geometry {
//
//	public Rectangle(int... arr) {
//	}
//
//	@Override
//	double getArea() {
//		return 0;
//	}
//
//	@Override
//	double getLength() {
//		return 0;
//	}
//
//	
//}

public class GeometryMain {
	public static void printGeometry(Geometry[] g) {
		for(Geometry v : g) {
			System.out.println("Coord: " + v);
			System.out.println("Area: " + v.getArea());
			System.out.println("Length: " + v.getLength());
			System.out.println("-".repeat(50));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Geometry[] geo = new Geometry[5];
		
		geo[0] = new Point(1,4);
		geo[1] = new Line(4,2,1,6);
		geo[2] = new PolyLine(5,3,7,8,1,3);
//		geo[3] = new TriAngle();
//		geo[4] = new Rectangle();
		
//		for(int i = 0; i < geo.length; i++) {
//			geo[i] = sc.nextInt();
//		}
		
		printGeometry(geo);
	}

}

