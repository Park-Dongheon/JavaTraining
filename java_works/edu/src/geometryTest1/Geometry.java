package geometryTest1;

abstract class Geometry {
	int[] xArr;
	int[] yArr;
	
	public Geometry(int[] arr) {
		int len = arr.length / 2;
		
		xArr = new int[len];
		yArr = new int[len];
		
		for(int i = 0; i < len; i++) {
			xArr[i] = arr[2 * i];
			yArr[i] = arr[2 * i + 1];
		}
	}
	
	abstract double getArea();
	abstract double getLength();
}