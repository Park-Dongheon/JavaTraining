package geometryTest1;

public class TriAngle extends Geometry {
	
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
