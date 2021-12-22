package console_apps;

import java.util.Scanner;

import model.Utilities;

public class TaxComputationApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user for their name
		System.out.println("Enter your name:");
		String name = input.nextLine();

		// prompt the user for their filing status
		System.out.print(name + ", enter your filing status");
		System.out.println(" (1 -- Single Filing; 2 -- Married Filing):");
		int status = input.nextInt(); 
		System.out.println(name + ", enter your taxable income (an integer value):");
		int income = input.nextInt();
		
		/* Get report from the utility method. */
		String report = Utilities.getTaxReport(status, income);
		
		System.out.println(report);

		input.close();
	}

}
