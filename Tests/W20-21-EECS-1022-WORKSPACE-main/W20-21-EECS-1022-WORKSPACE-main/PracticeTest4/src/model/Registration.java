package model;

public class Registration {
	
	// Attributes 
	private String courseName;
	private int numCredit;
	private int mark;
	
	// Constructor
	public Registration(String courseName, int numCredit) {
		this.courseName = courseName;
		this.numCredit = numCredit;
		
	}
	public Registration(String courseName, int numCredit, int mark) {
		this(courseName, numCredit);
		this.mark = mark;
	}
	
	// Accessor
	public String getCourseName() {
		return this.courseName;
	}

	public int getNumberOfCredits() {
		return this.numCredit;
	}

	public int getMarks() {
		return this.mark;
	}
	
	public String getLetterGrade() {
		String result = "";
		if (this.mark >= 90) {
			result = "A+";
		}
		else if (this.mark >= 80) {
			result = "A";
		}
		else if (this.mark >= 70) {
			result = "B";
		}
		else if (this.mark >= 60) {
			result = "C";
		}
		else if (this.mark >= 50) {
			result = "D";
		}
		else {
			result = "F";
		}
		return result;
	}
	
	public int getWeightedGradePoint() {
		int result = 0;
		if (this.getLetterGrade().equals("A+")) {
			result = 9 * this.numCredit;
		}
		else if (this.getLetterGrade().equals("A")) {
			result = 8* this.numCredit;
		}
		else if (this.getLetterGrade().equals("B")) {
			result = 7* this.numCredit;
		}
		else if (this.getLetterGrade().equals("C")) {
			result = 6* this.numCredit;
		}
		else if (this.getLetterGrade().equals("D")) {
			result = 5* this.numCredit;
		}
		else if (this.getLetterGrade().equals("F")) {
			result = 0* this.numCredit;
		}
		return result;
	}

	
	
	// Mutator
	public void setMarks(int newMark) {
		this.mark = newMark;
	}
}








