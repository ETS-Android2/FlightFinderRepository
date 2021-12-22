package console_apps;

import java.util.Scanner;

import model.Grade;

public class GradeApp2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  // This will help us use the input function to get an output from the user by prompting them in the console.
		
		System.out.println("Enter a raw mark score (from 0 to 100):" );
		int marks = input.nextInt();  // storing user's input as integer in variable marks
		
		String lg = Grade.getLetterGrade2(marks);    // in the model package we have a Grade class which has a method called getLetterGrade that takes the input of the user and change it into the letter.
		
		System.out.println("It is letter grade " + lg);
		
		input.close();

	}

}
;  