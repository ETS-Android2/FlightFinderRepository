package model;

public class Transcript {
	// Attributes
	private String name;
	private static int id = 0;
	
	private Registration[] registrations;
	private Registration[] backup;
	private int nor;
	
	// Constructor
	public Transcript(String name) {
		this.registrations = new Registration[60];
		this.name = name;
		Transcript.id += 3;
		this.name += Transcript.id;
	}
	
	// Accessor
	public String getStudentID() {
		return this.name;
	}
	
	public Registration[] getReport() {
		this.backup = new Registration[this.nor];
	
		for (int i = 0; i < this.nor; i ++) {
			this.backup[i] = this.registrations[i];
		}
		return this.backup;
	}
	
	public int getMarks(String courseName) {
		int result = -1;
		int index = this.helperGetIndexTrue(courseName);
		
		if (index >= 0) {
			result = this.registrations[index].getMarks();
		}
		return result;
	}
	
	public double getWeightedGPA() {
		int sum = 0;
		for (int i = 0; i < this.nor; i ++) {
			sum += this.registrations[i].getWeightedGradePoint();
		}
		
		double average = (double) sum/this.nor;
		return average;
	}
		
	// Mutator
	public void addRegistration(Registration r) {
		this.registrations[this.nor] = r;
		this.nor ++;
	}
	
	public void addRegistrations(Registration[] registrations) {
		for (int i = 0; i < registrations.length; i ++) {
			this.registrations[this.nor] = registrations[i];
			this.nor ++;
		}
	}
	
	public void addRegistration(String courseName, int numCredit) {
		Registration r = new Registration(courseName, numCredit);
		this.registrations[this.nor] = r;
		this.nor ++;
	}
	
	public void setMarks(String courseName, int mark) {
		int index = this.helperGetIndexTrue(courseName);
		if (index >= 0) {
			this.registrations[index].setMarks(mark);
		}
	}
	
	// Helper Method
	public int helperGetIndexTrue(String courseName) {
		int index = -1;
		for (int i = 0; i < this.nor; i ++) {
			if (this.registrations[i].getCourseName().equals(courseName)) {
				index = i;
			}
		}
		return index;
	}
	
}
