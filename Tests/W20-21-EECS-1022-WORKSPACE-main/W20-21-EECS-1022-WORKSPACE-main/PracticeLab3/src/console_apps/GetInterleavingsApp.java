package console_apps;

import java.util.Scanner;

import model.Utilities;

public class GetInterleavingsApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Prompt the user for input bounds. */
		System.out.println("Enter the first integer term of arithmetic sequence 1:");
		int ft1 = input.nextInt();
		
		System.out.println("Enter the common difference of the sequence:");
		int d1 = input.nextInt();
		
		System.out.println("Enter the size of the sequence:");
		int n1 = input.nextInt();
		
		System.out.println("Enter the first integer term of arithmetic sequence 2:");
		int ft2 = input.nextInt();
		
		System.out.println("Enter the common difference of the sequence:");
		int d2 = input.nextInt();
		
		System.out.println("Enter the size of the sequence:");
		int n2 = input.nextInt();
		
		/* Invoke the utility method for calculation. */

		String result = Utilities.getInterlevaings(ft1, d1, n1, ft2, d2, n2);
		
		/* Output the result. */
		System.out.println(result);
				
		input.close();
	}
}
