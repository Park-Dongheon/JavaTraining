package geometryTest1;

public class Rectangle extends Geometry {

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
