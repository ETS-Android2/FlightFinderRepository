package oop;

public class PointTester {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);
		Point p2 = new Point(-4, -3);
		
		System.out.println("p1 " + "(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("p2 " + "(" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println(p1.getDistanceFromOrigin());
		System.out.println(p2.getDistanceFromOrigin());
		
		p1.moveUp(1);
		p2.moveUp(1); 
		
		System.out.println("p1 " + "(" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("p2 " + "(" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println(p1.getDistanceFromOrigin());
		System.out.println(p2.getDistanceFromOrigin());
	}
}

