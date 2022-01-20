package model;

public class Participant {
	// Attributes
	private String name;
	
	private Registration[] registrations;
	private int nor;
	private Registration[] backupR;
	
	
	// Constructor
	public Participant(String name) {
		this.name = name;
		this.registrations = new Registration[5];
	}
	// Accessor 
	public Registration[] getRegistrations() {
		this.backupR = new Registration[this.nor];
		for (int i = 0; i < this.nor; i ++) {
			this.backupR[i] = this.registrations[i];
		}
		return this.backupR;
	}
	
	public String getGPAReport() {
		String result = "";
		String seq = "{";
		double sumNum = 0;
		int count = 0;
		
		for (int i = 0; i < this.nor; i ++) {
			if (i == this.nor - 1) {
				seq += this.registrations[i].getNumGrade() + " (" + this.registrations[i].getGradeReport()[0] + ")"; 
			}
			else {
				seq += this.registrations[i].getNumGrade() + " (" + this.registrations[i].getGradeReport()[0] + "), "; 
			}
			sumNum += this.registrations[i].getNumGrade();
		}
		seq += "}";
		
		if (this.nor == 0) {
			result = "No GPA available yet for " + this.name;
		}
		else {
			result += this.name + "'s GPA of " + seq + ": " + String.format("%.1f", sumNum/this.nor);
		}
		return result;
	}
	
	public int marksOf(String course) {
		int result = -1;
		for (int i = 0; i < this.nor; i ++) {
			if (this.registrations[i].getTitle().equals(course)) {
				result = this.registrations[i].getMarks();
			}
		}
		return result;
	}
	
	// Mutator
	public void addRegistration(Registration r) {
		if (this.nor < 5) {
			this.registrations[this.nor] = r;
			this.nor ++;
		}
		
	}
	
	public void addRegistration(String course) {
		Registration r = new Registration(course);
		if (this.nor < 5) {
			this.registrations[this.nor] = r;
			this.nor ++;
		}
		
	}
	
	public void updateMarks(String course, int newMark) {
		for (int i = 0; i < this.nor; i ++) {
			if (this.registrations[i].getTitle().equals(course)) {
				this.registrations[i].setMarks(newMark);
				String[] s = this.registrations[i].getGradeReport();
				break;
			}
		}
	}
	
	public void clearRegistrations() {
		this.nor = 0;
		
	}	
}
