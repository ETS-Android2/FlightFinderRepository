package console_apps;

import java.util.Scanner;

import model.Utilities;

public class GetIntermediateStatsApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Prompt the user for input bounds. */
		System.out.println("Enter the first integer term of an arithmetic sequence:");
		int ft = input.nextInt();
		
		System.out.println("Enter the common difference of the sequence:");
		int d = input.nextInt();
		
		System.out.println("Enter the size of the sequence:");
		int n = input.nextInt();
		
		/* Invoke the utility method for calculation. */
		String result = Utilities.getIntermediateStats(ft, d, n);
		
		/* Output the result. */
		System.out.println(result);
				
		input.close();
	}
}
