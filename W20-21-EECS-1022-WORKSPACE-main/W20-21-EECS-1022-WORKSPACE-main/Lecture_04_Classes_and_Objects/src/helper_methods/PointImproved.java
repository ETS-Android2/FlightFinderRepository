package helper_methods;


/*
 * Poor version of code which "smells" (with lots of duplicates) 
 */

public class PointImproved { 
	private double x; 
	private double y;

	public PointImproved(double x, double y) {
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
	
	/*
	 * Helper method to return the distance between this and other.
	 */
	
	private double HelperGetDistance(double otherX, double otherY) {
		return
			Math.sqrt(Math.pow(this.x - otherX, 2)) + Math.sqrt(Math.pow(this.y, otherY));
	}

	public double getDistanceFromOrigin() {
		double dist = 
				this.HelperGetDistance(0, 0);
		return dist;
	}

	public double getDistancesTo(Point p1, Point p2) {
		return 
				this.HelperGetDistance(p1.getX(), p1.getY())
				+ 
				this.HelperGetDistance(p2.getX(), p2.getY()); 
	}

	public double getTriDistances(PointImproved p1, Point p2) {
		return
				p1.HelperGetDistance(p1.getX(), p2.getY())
				+
				this.HelperGetDistance(p1.getX(), p1.getY())
				+
				this.HelperGetDistance(p2.getX(), p2.getY());
	}
}