package helper_methods;


/*
 * Poor version of code which "smells" (with lots of duplicates) 
 */
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

	public double getDistancesTo(Point p1, Point p2) {
		return 
				Math.sqrt(Math.pow(this.x - p1.x, 2) + Math.pow(this.y - p1.y, 2))
				+
				Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2)); 
	}

	public double getTriDistances(Point p1, Point p2) {
		return 
				Math.sqrt(Math.pow(this.x - p1.x, 2) + Math.pow(this.y - p1.y, 2))
				+
				Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2))
				+
				Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	} 
}
