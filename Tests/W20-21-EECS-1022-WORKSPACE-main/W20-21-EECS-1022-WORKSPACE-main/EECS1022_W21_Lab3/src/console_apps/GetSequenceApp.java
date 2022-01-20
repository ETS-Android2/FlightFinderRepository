package console_apps;

import java.util.Scanner;

import model.Utilities;

public class GetSequenceApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Prompt the user for input bounds. */
		System.out.println("Enter an integer lower bound:");
		int lower = input.nextInt();
		
		System.out.println("Enter an integer upper bound:");
		int upper = input.nextInt();
		
		/* Invoke the utility method for calculation. */
		String result = Utilities.getNumbers(lower, upper);
		
		/* Output the result. */
		System.out.println(result);
				
		input.close();
	}
}