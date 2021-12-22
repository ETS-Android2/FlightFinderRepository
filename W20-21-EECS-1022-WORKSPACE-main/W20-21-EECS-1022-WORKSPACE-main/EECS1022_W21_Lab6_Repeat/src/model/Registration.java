package model;

public class Registration {
	
	// Attributes
	private String course;
	private int mark;
	private String[] reportList;
	private Instructor instructor;
	private int gpa;
	
	// Constructor
	
	public Registration(String course) {
		this.course = course;
		this.reportList = new String[2];
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
	
	public int  getGpa() {
		return this.gpa;
	}
	
	public String[] getGradeReport( ) {
		if (this.mark >= 90) {
			this.reportList[0] = "A+";
			this.reportList[1] = "Exceptional";
			this.gpa = 9;
		}
		else if (this.mark >= 80) {
			this.reportList[0] = "A";
			this.reportList[1] = "Excellent";
			this.gpa = 8;
		}
		else if (this.mark >= 70) {
			this.reportList[0] = "B";
			this.reportList[1] = "Good";
			this.gpa = 7;
		}
		else if (this.mark >= 60) {
			this.reportList[0] = "C";
			this.reportList[1] = "Competent";
			this.gpa = 6;
		}
		else if (this.mark >= 50) {
			this.reportList[0] = "D";
			this.reportList[1] = "Passing";
			this.gpa = 5;
		}
		else  {
			this.reportList[0] = "F";
			this.reportList[1] = "Failing";
			this.gpa = 0;
		}
		return this.reportList;
	}
	
	public String getInformation() {
		String result = "";
		if (this.instructor == null) {
			result = this.course + " has not yet been assigned an instructor";
		}
		else {
			result = this.course + ", taught by " + this.instructor.getName() + ", is completed with raw marks " + this.mark + " (" + this.reportList[0] + " ; " + this.reportList[1] + ")";
		}
		return result;
	}
	
	
	// Mutator
	
	public void setInstructor(Instructor newInstructor) {
		this.instructor = newInstructor;
		
	}
	
	public void setMarks(int newMarks) {
		this.mark = newMarks;
	}
	
	public void setGPA(int gpa) {
		this.gpa = gpa;
	}
}





















