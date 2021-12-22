package model;

public class Grade {
	public static String getGradeReport(int marks) {
		String report = "";
		
		// Stage 1: get the letter grade for 'marks'
		// calling getLtterGrade1 as a helper method
		String lg = getLetterGrade1(marks);
				
		// Stage 2: determine if the letter grade corresponds  to a good performance ( C or above)
		// boolean didWell = lg.equals("A+") || lg.equals("A") || lg.equals("B+") || lg.equals("B") || lg.equals("C+") || lg.equals("C");
		/*Or */ boolean didWell = !(lg.equals("D+") || lg.equals("D") || lg.equals("F"));
		report = "Grade " + lg + ": ";
		
		if (didWell) {
			report +="Well Done!";
		}
		else {
			report +="You Can Do Better Next Time!";
		}
		
		return report;

}
		
	
	public static String getLetterGrade1(int marks) {
		String lg = "";
		
		// This has only one if statement and *else if* and *else* are part of the if statement
		// Version-1 
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
// Incorrect version: multiple independent if-statements. However with overlapping conditions.
	//Version-2
//	if(marks >= 90) {
//		lg = "A+";
//	}
//	
//	if(marks >= 80) {
//		lg = "A";
//	}
//	
//	if(marks >= 75) {
//		lg = "B+";
//	}
//	
//	if(marks >= 70) {
//		lg = "B";
//	}
//	
//	if(marks >= 65) {
//		lg = "C+";
//	}
//	
//	if(marks >= 60) {
//		lg = "C";
//	}
//	
//	if(marks >= 55) {
//		lg = "D+";
//	}
//	
//	if(marks >= 50) {
//		lg = "D";
//	}
//	
//	if (marks < 50) {
//		lg = "F";
//	}
//			
//	return lg;


	  
	//We have 9 if statements here
	// Correct versions: multiple, if-statements with disjoint or && logical operator that makes it non-overlapping.
	//Version-3
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
		lg = "F";
	}
			
	return lg;
} 
	//Version-4 (INCORRECT): Where && is replaced by ||
//	if(marks >= 90 || marks <= 100) {
//		lg = "A+";
//	}
//	
//	if(marks >= 80 || marks < 90) {
//		lg = "A";
//	}
//	
//	if(marks >= 75 || marks < 80) {
//		lg = "B+";
//	}
//	
//	if(marks >= 70 || marks < 75) {
//		lg = "B";
//	}
//	
//	if(marks >= 65 || marks < 70) {
//		lg = "C+";
//	}
//	
//	if(marks >= 60 || marks < 65) {
//		lg = "C";
//	}
//	
//	if(marks >= 55 || marks < 60) {
//		lg = "D+";
//	}
//	
//	if(marks >= 50 || marks < 55) {
//		lg = "D";
//	}
//	
//	if(marks >= 0 || marks < 50) {
//		lg = "F";
//	}
//			
//	return lg;
//}

	public static String getLetterGrade3(int marks) {
		String lg = "";
		
		//Version 5
		
		if(marks >= 80) {
			if(marks >= 90) {
				lg = "A+";
			}
			else {
				lg = "A";
				}
		}
		else if(marks >= 75) {
			lg = "B+";
		}
	
		else if(marks >= 55) {
			if(marks >= 70) {
				lg = "B";
			}
			
			else if(marks >= 65) {
				lg = "C+";
			}
			
			else if(marks >= 60) {
				lg = "C";
			}
			else {
				lg = "D+";
			}
		}
		
		else if(marks >= 50) {
			lg = "D";
		}
		
		else {
			lg = "F";
		}
				
		return lg;
}
}

		