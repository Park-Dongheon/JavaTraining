package geometryTest1;

public class Polyline extends Geometry {

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
