package geometryTest1;

abstract class Geometry {
	int[] xArr;
	int[] yArr;
	public Geometry(int [] arr) {
		
		int len = arr.length/2;
		
		xArr = new int[len];
		yArr = new int[len];
		
		for (int i = 0 ;i < len  ; i++) {
			xArr[i] = arr[2*i];
			yArr[i] = arr[2*i+1];
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
	public String toString() {
		return xArr[0] + "," + yArr[0];
	}
	
	@Override
	double getArea() {
		return 0.0;
	}

	@Override
	double getLength() {
		return 0.0;
	}

}

class Line extends Geometry {

	public Line(int...arr) {
		super(arr);
	}

	@Override
	public String toString() {
		return xArr[0] + "," + yArr[0];
	}
	
	@Override
	double getArea() {
		return 0.0;
	}

	@Override
	double getLength() {
		return 1.0;
	}

}
public class GeometryMain2 {

	public static void main(String[] args) {

		Geometry geoms[] = new Geometry[2];
		
		geoms[0] = new Point(1, 2);
		geoms[1] = new Line(2, 3, 4, 5);
		
		for (Geometry g : geoms) {
			System.out.println("Coord:" + g);
			System.out.println("Length:" + g.getLength());
			System.out.println("Area: " + g.getArea());
			System.out.println("-".repeat(40));
		}		
	}

}
