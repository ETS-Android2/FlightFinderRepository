package model;

public class Transcript {
		// Attributes
	private Registration[] registrations;
	private Registration[] backupR;
	private int numR;
	
	private String name;
	private static int globalId = 0;
	
		// Constructor
	public Transcript(String name) {
		Transcript.globalId = Transcript.globalId + 3;
		this.name = name + Transcript.globalId;
		this.registrations = new Registration[60];
		
	}
		// Accessor

	public String getStudentID() {
		//Transcript.globalId = Transcript.globalId + 3;
		return this.name;
	}

	public Registration[] getReport() {
		this.backupR = new Registration[this.numR];
		for (int i = 0; i < this.numR; i ++) {
			this.backupR[i] = this.registrations[i];
		}
		return this.backupR;
	}
	
	public int getMarks(String courseName) {
		int result = 0;
		boolean stay = true;
		boolean found = false;
		for (int i = 0; stay && i < this.numR; i ++) {
			if (this.registrations[i].getCourseName().equals(courseName)) {
				result = this.registrations[i].getMarks();
				stay = false;
				found = true;
			}
		}
		
		if (!found) {
			result = -1;
		}
		return result;
	}
	
	public double getWeightedGPA() {
		double sum = 0;
		double result = 0;
		for (int i = 0; i < this.numR; i ++) {
			sum += this.registrations[i].getWeightedGradePoint();
		}
		result = sum/this.numR;
		
		return result;
	}
		
		// Mutator
	public void addRegistration(Registration r1) {
		this.registrations[this.numR] = r1;
		this.numR ++;
		
	}
	
	public void addRegistrations(Registration[] registrations) {
		for (int i = 0; i < registrations.length; i ++) {
			this.registrations[i] = registrations[i];
			this.numR ++;
		}
		
	}
	
	public void addRegistration(String courseName, int credit) {
		this.registrations[this.numR] = new Registration(courseName, credit);
		this.numR ++;
	}
	
	public void setMarks(String courseName, int newMarks) {
		boolean stay = true;
		for (int i = 0; stay && i < this.numR; i ++) {
			if (this.registrations[i].getCourseName().equals(courseName)) {
				this.registrations[i].setMarks(newMarks);
				stay = false;
			}
		}
	}
	
}	
