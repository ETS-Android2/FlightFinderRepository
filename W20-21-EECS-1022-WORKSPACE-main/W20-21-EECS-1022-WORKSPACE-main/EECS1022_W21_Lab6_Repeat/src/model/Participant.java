package model;

public class Participant {
	
	// Attributes
	private String studentName;
	private int count;
	private Registration[] registration;
	private Registration[]  backup;
	
		// Constructor
	
	public Participant(String studentName) {
		this.studentName = studentName;
		this.registration = new Registration[100];
	}
		
		// Accessor
	
	public Registration[] getRegistrations() {
		if (this.count <= 100) {
			this.backup = new Registration[this.count];
			for (int i = 0; i < this.count; i ++) {
				this.backup[i] = this.registration[i];
			}
		}
		return this.backup;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public Registration[] getArray() {
		return this.registration;
	}
	
	public String getGPAReport() {
		String seq = "";
		String result = "{";
		int sum = 0;
		int c = 0;
		if (this.count == 0) {
			seq = "No GPA available yet for " + this.studentName;
		}
		else {
			for(int i = 0; i < this.count; i ++) {
				if (this.count - 1 > i) {
					result += this.registration[i].getGpa() + " " + "(" + this.registration[i].getGradeReport()[0] + "), ";
					sum += this.registration[i].getGpa();
					c++;
				}
				else if (this.count - 1 == i) {
					result += this.registration[i].getGpa() + " " + "(" + this.registration[i].getGradeReport()[0] + ")";
					sum += this.registration[i].getGpa();
					c++;
				}
			}
			result += "}";
			seq = this.studentName + "'s GPA of " + result + ": " + String.format("%.1f", (double)sum/c);
		}
		return seq;
	}
	
	public int marksOf(String course) {
		int mark = 0;
		boolean stay = true;
		boolean found = false;
		for (int i = 0; stay && i < this.count; i ++) {
			if (this.registration[i].getTitle().equals(course)) {
				mark = this.registration[i].getMarks();
				stay = false;
				found = true;
			}
		}
		if (found == false) {
			mark = -1;
		}
		return mark;
	}
		// Mutator
	
	
	public void addRegistration(Registration assign) {
		if (this.count < 5) {
		this.registration[this.count] = assign;
		this.count ++;
		}
		
	}
	
	public void addRegistration(String course) {
		if (this.count < 5) {
		Registration r = new Registration(course);
		this.registration[this.count] = r;
		this.count ++;
		}
	}
	
	public void updateMarks(String course, int newNumber) {
		for(int i = 0; i < this.count; i ++) {
			if (this.registration[i].getTitle().equals(course)) {
				this.registration[i].setMarks(newNumber);
				this.registration[i].getGradeReport();
			}
		}
		
		
	}
	
	public void clearRegistrations() {
		this.count = 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
