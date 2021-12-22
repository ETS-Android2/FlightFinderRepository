package model;

public class Circle {
	/*
	 * Utility methods: not requiring creating of objects in order to use them. 
	 */
	public static double getArea(double radius) {
		double area = 0.00;
		//correct implementation
		area = 3.14 * radius * radius;
		// wrong implementation
//		area = 2 * 3.14 * radius;
		return area;
	}

}
