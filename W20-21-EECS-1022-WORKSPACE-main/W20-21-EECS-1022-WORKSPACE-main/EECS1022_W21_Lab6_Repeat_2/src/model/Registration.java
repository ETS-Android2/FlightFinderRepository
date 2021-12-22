package model;

public class Registration {
	// Attributes
	private String course;
	private String[] gradeReport;
	
	private Instructor instructor;
	private int mark;
	
	private int numGrade;
	
	
	// Constructor
	public Registration(String course) {
		this.course = course;
		this.gradeReport = new String[2];
		this.mark = 0;
	}
	
	public Registration(String course, Instructor instructor) {
		this(course);
		this.instructor = instructor;
	}
	
	// Accessor 
	public String getTitle() {
		return this.course;
	}
	
	public int getMarks() {
		return this.mark;
	}
	
	public Instructor getInstructor() {
		return this.instructor;
	}
	
	public String[] getGradeReport() {
		if (this.mark >= 90) {
			this.gradeReport[0] = "A+";
			this.gradeReport[1] = "Exceptional";
			this.numGrade = 9;
		}
		else if (this.mark >= 80) {
			this.gradeReport[0] = "A";
			this.gradeReport[1] = "Excellent";
			this.numGrade = 8;
		}
		else if (this.mark >= 70) {
			this.gradeReport[0] = "B";
			this.gradeReport[1] = "Good";
			this.numGrade = 7;
		}
		else if (this.mark >= 60) {
			this.gradeReport[0] = "C";
			this.gradeReport[1] = "Competent";
			this.numGrade = 6;
		}
		else if (this.mark >= 50) {
			this.gradeReport[0] = "D";
			this.gradeReport[1] = "Passing";
			this.numGrade = 5;
		}
		else {
			this.gradeReport[0] = "F";
			this.gradeReport[1] = "Failing";
			this.numGrade = 0;
		}
		return this.gradeReport;
	}
	
	// Helper 
	public int getNumGrade() {
		return this.numGrade;
	}
	
	public String getInformation() {
		String result = "";
		if (this.instructor == null) {
			result = this.course + " has not yet been assigned an instructor";
		}
		else {
			result = this.course + ", taught by " + this.instructor.getName() + ", is completed with raw marks " + this.mark +" (" + this.gradeReport[0] + " ; " + this.gradeReport[1] + ")";
		}
		return result;
	}
		
	// Mutator
	public void setInstructor(Instructor newI) {
		this.instructor = newI;
	}
	
	public void setMarks(int newMark) {
		this.mark = newMark;
	}
		
}
