package console_apps;

import java.util.Scanner;

/*
 * Calculate the weighted sum of 5 assignments, each may come with different weight
 * e.g. Assignment 1 (20%) has 50 marks and Assignment 2 (40%) has 70 marks
 * Weighted sum: 50 * 0.2 + 70 * 0.4 = 10 + 28 = 38
 */

public class GradeCalculatorApp1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/* Stage 1: Prompt User for Inputs*/
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		/* Prompt for assignment 1*/
		System.out.println(name + ", what's the weight of your Assignment 1?");
		int weight1 = input.nextInt();
		System.out.println(name + ", what's the marks of your Assignment 1 (out of 100)?");
		int marks1 = input.nextInt();
		
		/* Prompt for assignment 2*/
		System.out.println(name + ", what's the weight of your Assignment 2?");
		int weight2 = input.nextInt();
		System.out.println(name + ", what's the marks of your Assignment 2 (out of 100)?");
		int marks2 = input.nextInt();
		
		/* Prompt for assignment 3*/
		System.out.println(name + ", what's the weight of your Assignment 3?");
		int weight3 = input.nextInt();
		System.out.println(name + ", what's the marks of your Assignment 3 (out of 100)?");
		int marks3 = input.nextInt();
		
		/* Prompt for assignment 4*/
		System.out.println(name + ", what's the weight of your Assignment 4?");
		int weight4 = input.nextInt();
		System.out.println(name + ", what's the marks of your Assignment 4 (out of 100)?");
		int marks4 = input.nextInt();
		
		/* Prompt for assignment 5*/
		System.out.println(name + ", what's the weight of your Assignment 5?");
		int weight5 = input.nextInt();
		System.out.println(name + ", what's the marks of your Assignment 5 (out of 100)?");
		int marks5 = input.nextInt();
		
		/* Stage 2: Do calculations */
		double weightedSum = 
				marks1 * ((double) weight1/100) +
				marks2 * ((double) weight2/100) +
				marks3 * ((double) weight3/100) +
				marks4 * ((double) weight4/100) +
				marks5 * ((double) weight5/100);
		
		/* Stage 3: Output result */
		System.out.println("Assignment 1 [" + marks1 + ", " + weight1 + "%]");
		System.out.println("Assignment 2 [" + marks2 + ", " + weight2 + "%]");
		System.out.println("Assignment 3 [" + marks3 + ", " + weight3 + "%]");
		System.out.println("Assignment 4 [" + marks4 + ", " + weight4 + "%]");
		System.out.println("Assignment 5 [" + marks5 + ", " + weight5 + "%]");
		System.out.println("Weighted Sum: " + weightedSum);
		input.close();
	}

}
