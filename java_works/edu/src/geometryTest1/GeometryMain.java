package geometryTest1;

public class GeometryMain {

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
