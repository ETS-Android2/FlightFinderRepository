package console_apps;

import java.util.Scanner;

/*
 * Calculate the weighted sum of 5 assignments, each may come with different weight
 * e.g. Assignment 1 (20%) has 50 marks and Assignment 2 (40%) has 70 marks
 * Weighted sum: 50 * 0.2 + 70 * 0.4 = 10 + 28 = 38
 */

public class GradeCalculatorApp1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/* Stage 1: Prompt User for Inputs*/
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		double weightedSum = 0.0;
		String report = "";
		// scope of loop counter i is within the for loop
		// i ++ is executed at the end of each iteration
		for(int i = 0; i <= 5; i ++) {
			System.out.println(name + ", what's the weight of your Assignment " + i + "?");
			int weight = input.nextInt();
			System.out.println(name + ", what's the marks of your Assignment " + i + "(out of 100)?");
			int marks = input.nextInt();
			
			report += "Assignment " + i + " [" + marks + ", " + weight + "%]";
			if (i <= 4) {
				report += "\n";
			}
			weightedSum = marks * ((double)weight / 100);
		}
		System.out.println(report);
		System.out.println("Weighted Sum: " + weightedSum);
		
	}

}
