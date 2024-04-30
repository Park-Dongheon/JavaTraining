package geometryTest1;

public class Point extends Geometry {

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
