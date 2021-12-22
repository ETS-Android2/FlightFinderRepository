package model;

public class PointCollector {
	
	/* Attributes */
	Point[] points;
	private int nop;
	
	/* Constructor */// --> Constructor does not have any return value nor does it have any "void".
	public PointCollector() {
		this.points = new Point[100];
	}
	
	/* Mutator */
	public void addPoints(double x, double y) { 
		this.points[this.nop] = new Point(x, y);
		this.nop ++;
	}
	
	
	// Version 1 by instructor
	public Point[] getPointsinQudarantI_01() {
		int countI = 0;
		
		Point[] arrayPoints = new Point[this.nop];
		
		for (int i = 0; i < nop; i ++) {
			Point p = this.points[i];
			
			if(p.getX() > 0 && p.getY() > 0) {
				arrayPoints[i] = p;
				countI ++;
			}
		}
		
		Point[] firstQ = new Point[countI];
		for (int i = 0; i < countI; i ++) {
			firstQ[i] = arrayPoints[i];
		}
		
		return firstQ;
	}
	
	
	// Version 2 by instructor
	public Point[] getPointsinQudarantI_02() {
		int count = 0;
		for (int i = 0; i < this.nop; i ++) {
			if (this.points[i].getX() > 0 && this.points[i].getY() > 0) {
				count ++;
			}
		}
		
		Point[] arrayPositive = new Point[count];
		for (int i = 0; i < count; i ++) {
			if (this.points[i].getX() > 0 && this.points[i].getY() > 0) {
				arrayPositive[i] = new Point(this.points[i].getX(), this.points[i].getY());
			}
		}
		return arrayPositive;
	}
	
	
	public int getNumberOfPoints() {
		return this.nop;
	}
	

	

}
 