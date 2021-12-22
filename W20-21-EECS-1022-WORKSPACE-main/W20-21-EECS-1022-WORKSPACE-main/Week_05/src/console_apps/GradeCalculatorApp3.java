package console_apps;

import java.util.Scanner;

/*
 * Calculate the weighted sum of 5 assignments, each may come with different weight
 * e.g. Assignment 1 (20%) has 50 marks and Assignment 2 (40%) has 70 marks
 * Weighted sum: 50 * 0.2 + 70 * 0.4 = 10 + 28 = 38
 */

public class GradeCalculatorApp3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Stage 1: Prompt User for Inputs*/
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		double weightedSum = 0.0;
		String report = "";
		int i = 1;
		int m = 1;
		boolean userWantsToContinue = true;
		while(userWantsToContinue) {
			/*
			 * Known issue of Scanner:
			 * When a string (input.nextline()) is expected to be read after an integer (input.nextInt()),
			 * we must consume the lines for every integer reading.
			 */
			System.out.println(name + ", what's the weight of your Assignment " + i + "?");
			int weight = input.nextInt();
			input.nextLine();  // consume the new line character
			System.out.println(name + ", what's the marks of your Assignment " + i + "(out of 100)?");
			int marks = input.nextInt();
			input.nextLine();
			
			report += "Assignment " + i + " [" + marks + ", " + weight + "%]";
			if ((i - 1) <= m) {
				report += "\n";
			}
			weightedSum += marks * ((double)weight / 100);
			i ++;
			m ++;
			
			System.out.println("Would you like to continue? (Y for yes, otherwise no)");
			String answer = input.nextLine();
			userWantsToContinue = answer.equals("Y");  // If this condition wasn't here, we would have an infinite loop since there's no way we can make the stay-condition false.
		}
		System.out.println(report);
		System.out.println("Weighted Sum: " + weightedSum);
		input.close();
		
	}

}
