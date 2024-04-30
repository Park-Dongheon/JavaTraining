package geometryTest;

public class TriAngle extends Poliyline {
	int[] xArr;
	int[] yArr;
	
	public TriAngle() {
		super(xArr, yArr);
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		float side1 = (float) Math.sqrt(Math.pow(, 2) + Math.pow(, 2));
		float side2 = (float) Math.sqrt(Math.pow(, 2) + Math.pow(, 2));
		float side3 = (float) Math.sqrt(Math.pow(, 2) + Math.pow(, 2));
		
		if ( Math.abs(() * () - () * ()) <= 0 ) {	
			return 0.0f;
		}
		
		float sideHalf = (side1 + side2 + side3) / 2;	
		return ;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

}
