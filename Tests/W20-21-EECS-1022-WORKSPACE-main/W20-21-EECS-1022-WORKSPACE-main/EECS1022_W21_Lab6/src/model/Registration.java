package model;

public class Registration {
	// Attributes
	private String course;
	private int marks;
	private Instructor instructor;
	private String[] gradeReport;
	private int gradePoint;
	
	
	// Constructor
	
	public Registration(String course) { // registering a course
		this.course = course;
		this.gradeReport = new String[2];
		
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
		return this.marks;
	}
	
	public Instructor getInstructor() {
		return this.instructor;
	}
	
	// Helper Method: Used to avoid duplicates in the getGradReport Accessor Method below.
	public String[] helperGetGradeReport(String index0, String index1) {
		this.gradeReport[0] = index0;
		this.gradeReport[1] = index1;
		return this.gradeReport;
	}
	
	public String[] getGradeReport() {
		if (this.marks >= 90) {
			this.helperGetGradeReport("A+", "Exceptional");
			this.gradePoint = 9;  // Used to to get information about the GPA report, in the GPA report in the Participant object.
		}
		else if (this.marks >= 80) {
			this.helperGetGradeReport("A", "Excellent");
			this.gradePoint = 8;
		}
		else if (this.marks >= 70) {
			this.helperGetGradeReport("B", "Good");
			this.gradePoint = 7;
		}
		else if (this.marks >= 60) {
			this.helperGetGradeReport("C", "Competent");
			this.gradePoint = 6;
		}
		else if (this.marks >= 50) {
			this.helperGetGradeReport("D", "Passing");
			this.gradePoint = 5;
		}
		else {
			this.helperGetGradeReport("F", "Failing");
			this.gradePoint = 0;
		}
		return this.gradeReport;
	}
	
	public String getInformation() {
		String result = "";
		if (this.instructor != null) {
			result = this.course + ", taught by " + this.instructor.getName() + ", is completed with raw marks " + this.marks + " (" +  this.gradeReport[0] + " ; " + this.gradeReport[1] + ")";
		}
		else {
			result = this.course + " has not yet been assigned an instructor";
		}
		return result;
	}
	
	public int getGradePoint() {
		return this.gradePoint;
	}
	
	// Mutator
	
	public void setInstructor(Instructor instructor) { // updating the instructor for a course
		this.instructor = instructor;
	}
	
	public void setMarks(int newMark) { // updating mark of a student
		this.marks = newMark;
	}
	
	public void setGradePoint(int newGradePoint) { // used to update the gradePoint for a student
		this.gradePoint = newGradePoint;
	}

	
	
	
}
