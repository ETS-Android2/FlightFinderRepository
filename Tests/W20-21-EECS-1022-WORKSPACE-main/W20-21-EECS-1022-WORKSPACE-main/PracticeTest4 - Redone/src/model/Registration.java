package model;

public class Registration {
// Attributes
	private String courseName;
	private int mark;
	private int numCredit;
	private int numGrade;
	private String letterGrade;
	
	
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
	public String getCourseName( ) {
		return this.courseName;
	}
	
	public int getNumberOfCredits() {
		return this.numCredit;
	}
	
	public int getMarks() {
		return this.mark;
	}
	
	public String getLetterGrade() {
		this.helperGradePointAndLetterGrade(this.mark);
		return this.letterGrade;
	}
	
	public int getWeightedGradePoint() {
		this.helperGradePointAndLetterGrade(this.mark);
		int result = this.numGrade * this.numCredit;
		return result;
	}
	
	// Mutator
	public void setMarks(int newMark) {
		this.mark = newMark;
	}
	
	// Helper Method
	public void helperGradePointAndLetterGrade(int mark) {
			if (this.mark >= 90 ) {
				this.letterGrade = "A+";
				this.numGrade = 9;
			}
			else if (this.mark >= 80) {
				this.letterGrade = "A";
				this.numGrade = 8;
			}
			else if (this.mark >= 70 ) {
				this.letterGrade = "B";
				this.numGrade = 7;
			}
			else if (this.mark >= 60 ) {
				this.letterGrade = "C";
				this.numGrade = 6;
			}
			else if (this.mark >= 50 ) {
				this.letterGrade = "D";
				this.numGrade = 5;
			}
			else {
				this.letterGrade = "F";
				this.numGrade = 0;
			}
		}
}




























