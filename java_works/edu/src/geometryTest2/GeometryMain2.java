package geometryTest2;

abstract class Geometry {
	int[] xArr;
	int[] yArr;
	public Geometry(int [] arr) {
		
		int len = arr.length/2;
		
		xArr = new int[len];				// ex) x좌표 배열 크기 2개
		yArr = new int[len];				// ex) y좌표 배열 크기 2개
		
		for (int i = 0 ;i < len  ; i++) {
			xArr[i] = arr[2*i];				// ex) x좌표값=arr배열의 짝수, xArr[0] = arr[0]=2, xArr[1] = arr[2] = 4
			yArr[i] = arr[2*i+1];			// ex) y좌표값=arr배열의 홀수, yArr[0] = arr[1]=3, yArr[1] = arr[3] = 5
		}
		
	}
	abstract double getArea();
	abstract double getLength();
}

class Point extends Geometry {

	public Point(int...arr) {
		super(arr);
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	double getLength() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + xArr[0] + ", " + yArr[0] + ")";
	}

}

class Line extends Geometry {

	public Line(int...arr) {
		super(arr);
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	double getLength() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(xArr[1]-xArr[0], 2) + Math.pow(yArr[1]-yArr[0], 2));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + xArr[0] + ", " + yArr[0] + ")" + "(" + xArr[1] + ", " + yArr[1] + ")";
	}

}

class Polyline extends Geometry {

	public Polyline(int...arr) {
		super(arr);
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	double getLength() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(xArr[1]-xArr[0], 2) + Math.pow(yArr[1]-yArr[0], 2));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + xArr[0] + ", " + yArr[0] + ")" + "(" + xArr[1] + ", " + yArr[1] + ")" + "(" + xArr[2] + ", " + yArr[2] + ")";
	}

}

class TriAngle extends Geometry {

	public TriAngle(int...arr) {
		super(arr);
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		
		double side1 = Math.sqrt(Math.pow(xArr[0] - xArr[1], 2) + Math.pow(yArr[0] - yArr[1], 2));
		double side2 = Math.sqrt(Math.pow(xArr[1] - xArr[2], 2) + Math.pow(yArr[1] - yArr[2], 2));
		double side3 = Math.sqrt(Math.pow(xArr[2] - xArr[0], 2) + Math.pow(yArr[2] - yArr[0], 2));
		
		if ( Math.abs((xArr[0] - xArr[1]) * (yArr[1] - yArr[2]) - (xArr[1] - xArr[2]) * (yArr[0] - yArr[1])) <= 0 ) {	
			return 0.0;
		}
		
		double sideHalf = (side1 + side2 + side3) / 2;					
		
		return Math.sqrt(sideHalf * (sideHalf - side1) * (sideHalf - side2) * (sideHalf - side3));
	}

	@Override
	double getLength() {
		// TODO Auto-generated method stub
		
		double side1 = Math.sqrt(Math.pow(xArr[0] - xArr[1], 2) + Math.pow(yArr[0] - yArr[1], 2));
		double side2 = Math.sqrt(Math.pow(xArr[1] - xArr[2], 2) + Math.pow(yArr[1] - yArr[2], 2));
		double side3 = Math.sqrt(Math.pow(xArr[2] - xArr[0], 2) + Math.pow(yArr[2] - yArr[0], 2));
		
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + xArr[0] + ", " + yArr[0] + ")" + "(" + xArr[1] + ", " + yArr[1] + ")" + "(" + xArr[2] + ", " + yArr[2] + ")";
	}

}

class Rectangle extends Geometry {

	public Rectangle(int...arr) {
		super(arr);
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		double cross1 = Math.sqrt(Math.pow((xArr[0] - xArr[2]),2) + Math.pow((yArr[0] - yArr[2]), 2)); 
		double cross2 = Math.sqrt(Math.pow((xArr[1] - xArr[3]),2) + Math.pow((yArr[1] - yArr[3]), 2));

		return cross1 * cross2;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		double side1 = Math.sqrt(Math.pow(xArr[0] - xArr[1], 2) + Math.pow(yArr[0] - yArr[1], 2));
		double side2 = Math.sqrt(Math.pow(xArr[1] - xArr[2], 2) + Math.pow(yArr[1] - yArr[2], 2));
		double side3 = Math.sqrt(Math.pow(xArr[2] - xArr[3], 2) + Math.pow(yArr[2] - yArr[3], 2));
		double side4 = Math.sqrt(Math.pow(xArr[3] - xArr[0], 2) + Math.pow(yArr[3] - yArr[0], 2));
		
		return side1 + side2 + side3 + side4;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + xArr[0] + ", " + yArr[0] + ")" + "(" + xArr[1] + ", " + yArr[1] + ")" + "(" + xArr[2] + ", " + yArr[2] + ")" + "(" + xArr[3] + ", " + yArr[3] + ")";
	}

}


public class GeometryMain2 {
	public static void printGeometry(Geometry[] g) {
		for(Geometry v : g) {
			System.out.println("Coord: " + v);
			System.out.println("Area: " + v.getArea());
			System.out.println("Length: " + v.getLength());
			System.out.println("-".repeat(40));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry[] geo = new Geometry[5];
		
		geo[0] = new Point(1,2);
		geo[1] = new Line(2,3,4,5);
		geo[2] = new Polyline(4,5,6,7,4,2);
		geo[3] = new TriAngle(9,4,7,6,1,3);
		geo[4] = new Rectangle(6,5,7,4,3,4,2,3);
		
		printGeometry(geo);
	}
}
