package console_apps;

import java.util.Scanner;

import model.Utilities;

public class maximum {

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
		
		System.out.println("Enter x: ");
		int x = input.nextInt();
		System.out.println("Enter y: ");
		int y = input.nextInt();
		System.out.println("Enter z: ");
		int z = input.nextInt();
		
		int resultMax = Utilities.maximumOf(x, y, z);
		System.out.println("The max number is " + resultMax);
		
		
		
		input.close();
	}

}
