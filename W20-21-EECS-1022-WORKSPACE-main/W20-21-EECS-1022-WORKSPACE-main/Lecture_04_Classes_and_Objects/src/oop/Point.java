package oop;

public class Point { 
	private double x; 
	private double y;
	
	public Point(double x, double y) {
	    this.x = x;
	    this.y = y;
	  }
	
	public void moveUp(double units) { 
		this.y += units; 
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getDistanceFromOrigin() {
		double dist = 
			Math.sqrt(this.x * this.x 
					+ this.y * this.y);
		return dist;
	}
}



