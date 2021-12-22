package model;

public class Grade {
	public static String getLetterGrade1(int marks) {
		String lg = "";
		
		// This has only one if statement and *else if* and *else* are part of the if statement
		
		if(marks >= 90) {
			lg = "A+";
		}
		
		else if(marks >= 80) {
			lg = "A";
		}
		
		else if(marks >= 75) {
			lg = "B+";
		}
		
		else if(marks >= 70) {
			lg = "B";
		}
		
		else if(marks >= 65) {
			lg = "C+";
		}
		
		else if(marks >= 60) {
			lg = "C";
		}
		
		else if(marks >= 55) {
			lg = "D+";
		}
		
		else if(marks >= 50) {
			lg = "D";
		}
		
		else {
			lg = "F";
		}
				
		return lg;
	}

	
	public static String getLetterGrade2(int marks) {
		String lg = "";
		  
		//We have 9 if statements here
		
		if(marks >= 90 && marks <= 100) {
			lg = "A+";
		}
		
		if(marks >= 80 && marks < 90) {
			lg = "A";
		}
		
		if(marks >= 75 && marks < 80) {
			lg = "B+";
		}
		
		if(marks >= 70 && marks < 75) {
			lg = "B";
		}
		
		if(marks >= 65 && marks < 70) {
			lg = "C+";
		}
		
		if(marks >= 60 && marks < 65) {
			lg = "C";
		}
		
		if(marks >= 55 && marks < 60) {
			lg = "D+";
		}
		
		if(marks >= 50 && marks < 55) {
			lg = "D";
		}
		
		if(marks >= 0 && marks < 50) {
			lg = "D";
		}
		
	//	else {
	//		lg = "F";
	//	}
			
	return lg;
}
}