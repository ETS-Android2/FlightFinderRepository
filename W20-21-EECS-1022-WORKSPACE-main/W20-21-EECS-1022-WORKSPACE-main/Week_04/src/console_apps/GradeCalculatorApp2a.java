package console_apps;

import java.util.Scanner;

/*
 * Calculate the weighted sum of 5 assignments, each may come with different weight
 * e.g. Assignment 1 (20%) has 50 marks and Assignment 2 (40%) has 70 marks
 * Weighted sum: 50 * 0.2 + 70 * 0.4 = 10 + 28 = 38
 */

public class GradeCalculatorApp2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/* This program will let the user decide how many grades does he want to calculate and quit the application when the user wants. */
		
		/* Stage 1: Prompt User for Inputs*/
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		// scope of loop counter i is within the main method
		// i ++ is executed at the end of each iteration
		
		double weightedSum = 0.0;
		String report = "";
		int i = 1;
		boolean quitOrContinue = true;
		
		while(quitOrContinue) {
			System.out.println(name + ", what's the weight of your Assignment " + i + "?");
			int weight = input.nextInt();
			System.out.println(name + ", what's the marks of your Assignment " + i + "(out of 100)?");
			int marks = input.nextInt();
			System.out.println("Do you want to enter more grade? (Y/N)");
			char answer = input.next().charAt(0);
			
			report += "Assignment " + i + " [" + marks + ", " + weight + "%]\n";
			if (i > 1) {
				report += "\n";
			}
			if (answer == 'y') {
				quitOrContinue = true;
				i ++;
				
			}
			else {
				quitOrContinue = false;
				weightedSum = marks * ((double)weight / 100);
				System.out.println(report);
				System.out.println("Weighted Sum: " + weightedSum);
			}
			
		}
		
		
	}

}
