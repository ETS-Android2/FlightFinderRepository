package model;

public class Participant {
	
	// Attributes
	private String studentName;
	private Registration[] registrations; // Store the list of Participants - every index of the array is non-null unlike allArray, which was used to store all participants and then was later used to loop though to add non-null indices just in this array.
	private int count; // it is used to count the number of courses that has been added so far
	private final int MAX_NUM_OF_REGISTERATION = 5;
	private Registration[] allArray; // this array can also involve 'null' indices
	
	// Constructor
	
	public Participant(String studentName) {
		allArray = new Registration[MAX_NUM_OF_REGISTERATION];
		this.studentName = studentName;
		
	}
	
	// Accessor 
	
	public Registration[] getRegistrations() { 
		this.registrations = new Registration[this.count];
		for(int i = 0; i < this.count; i ++) { // used to take get only non-Null indices to the this.registration array 
			this.registrations[i] = allArray[i];
		}
		return this.registrations;
	}
	
	public String getGPAReport() {
		String result = "";
		String seq = "{"; // very important - because we don't know how many courses it will be added, therefore we need to loop through the courses and add them in this sequence according to string formated in junit_testing.
		double gpaSum = 0;
		if (this.registrations.length == 0) { // If no course has been registered - trace using paper or using debugger in case of any confusion.
			result = "No GPA available yet for " + this.studentName;
		}
		else {
			for (int i = 0; i < this.count; i ++) {
				gpaSum += this.allArray[i].getGradePoint(); // takes the total gradePoint for a student's all courses
				if (i < this.count - 1) { // Used to add comma | this is based on the format on the junit_testings
					seq += this.allArray[i].getGradePoint() + " " + "(" + this.allArray[i].getGradeReport()[0] + "), ";
				}
				else if (i == this.count - 1){ // Last mark with its description should be added without any comma
					seq += this.allArray[i].getGradePoint() + " " + "(" + this.allArray[i].getGradeReport()[0] + ")";
				}
			}
			seq += "}";
			result = this.studentName + "'s GPA of " + seq + ": " + String.format("%.1f",gpaSum/this.count);
		}
		return result;
	}
	
	public int marksOf(String courseName) { // used to get marks of a particular course
		int result = 0;
		boolean stay = true;; // for early exit if founded
		boolean found = false; // if we haven't found any course based on the argument couseName, then it will remain false. check line 66! 
		for (int i = 0; stay && i < this.count; i ++) {
			if (this.allArray[i].getTitle().equals(courseName)) {
				if (this.allArray[i] != null) {
					result = this.allArray[i].getMarks();
					stay = false;
					found = true;
				}
			}
		}
		if (found == false) { // if it wasn't found then we should return -1 because the course is not there
			result = -1;
		}
		return result;
	}
	
	// Mutator
	
	public void addRegistration(Registration registration) { // used to add an course with an instructor to as student
		if (this.count < MAX_NUM_OF_REGISTERATION) { // a student can't add more that 5 courses
			allArray[this.count] = registration;
			this.count ++;
		}
		// check the maximum number of count that should be 5 at most
	}
	
	public void addRegistration(String newCourse) { // Used to add a course for a student based on only the course title
		if (this.count < MAX_NUM_OF_REGISTERATION) {
			Registration newRegister = new Registration(newCourse);
			allArray[this.count] = newRegister;
			this.count ++;
		}
		}
	
	public Registration[] getArrayNoNull() { // Very useful for getParticipants accessor in the onlineSchool object.
		return this.allArray;
	}
	
	public void updateMarks(String course, int mark) {
		boolean stay = true; // used for early exit
		for (int i = 0; stay && i < this.count; i ++) {
			if (this.allArray[i].getTitle().equals(course)) {
				this.allArray[i].setMarks(mark);
				
				if (mark >= 90) {
					this.allArray[i].setGradePoint(9); // for updating gradePoint - *Usage: in the getGPAReport accessor*
				}
				else if (mark >= 80) {
					this.allArray[i].setGradePoint(8);
				}
				else if (mark >= 70) {
					this.allArray[i].setGradePoint(7);
				}
				else if (mark >= 60) {
					this.allArray[i].setGradePoint(6);
				}
				else if (mark >= 50) {
					this.allArray[i].setGradePoint(5);
				}
				else {
					this.allArray[i].setGradePoint(0);
				}
				
				stay = false;
			}
		}
	}
	
	public void clearRegistrations() { // used to clear all students from their registered courses.
		for (int i = 0; i < this.count; i ++) {
			this.allArray[i] = null;
		}
		this.count = 0;
	}
	
	
}