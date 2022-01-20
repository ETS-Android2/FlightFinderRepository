package console_apps;

import java.util.Scanner;

import model.Utilities;

public class isArithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Your submission will only be graded against JUnit tests.
		 * 
		 * If you wish to test your utility methods quickly,
		 * you may use this console application class by calling them.
		 * 
		 * However, you must make sure that you do not introduce 
		 * any compilation errors here. 
		 * 
		 * Reminders:
		 *  - Write `System.out.println` to prompt user inputs and output result to the console. 
		 * 	- Write `input.nextInt()` to read an integer from user.
		 *  - Write `input.nextDouble()` to read a double from user.   
		 */
		System.out.println("Enter the first number 1: ");
		int num1 = input.nextInt();
		System.out.println("Enter the first number 2: ");
		int num2 = input.nextInt();
		System.out.println("Enter the first number 3: ");
		int num3 = input.nextInt();
		System.out.println("Enter the first number 3: ");
		int num4 = input.nextInt();
		
		String result = Utilities.isArithmeticSeq(num1, num2, num3, num4);
		System.out.println(result);
		
		
		input.close();
	}

}
