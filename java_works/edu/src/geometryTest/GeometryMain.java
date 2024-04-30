package geometryTest;

public class GeometryMain {

	public static void printGeometry(Geometry[] g) {
		for(Geometry v : g) {
			System.out.println(v.getArea());
			System.out.println(v.getLength());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] xArr = {1, 2};
		int[] yArr = {5, 3};
		
		
		Geometry[] geo = new Geometry[5];
		geo[0] = new Point(xArr, yArr);
		geo[1] = new Line();
		geo[2] = new Polyline();
		geo[3] = new TriAngle();
		geo[4] = new Rectangle();
		
		printGeometry(geo);
	}
	
}
