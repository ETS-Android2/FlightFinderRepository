package console_apps;

import java.util.Scanner;

import model.Utilities;

public class RPSGameApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of player 1:");
		String p1 = input.nextLine();
		
		System.out.println("Enter the name of player 2:");
		String p2 = input.nextLine();
		
		/* Read inputs for round 1*/
		System.out.println("What does " + p1 + " play at round 1 (R, P, S)?");
		char p1r1 = input.nextLine().charAt(0); // reads a single character from user
		System.out.println("What does " + p2 + " play at round 1 (R, P, S)?");
		char p2r1 = input.nextLine().charAt(0); // reads a single character from user
		
		/* Read inputs for round 2 */
		System.out.println("What does " + p1 + " play at round 2 (R, P, S)?");
		char p1r2 = input.nextLine().charAt(0); // reads a single character from user
		System.out.println("What does " + p2 + " play at round 2 (R, P, S)?");
		char p2r2 = input.nextLine().charAt(0); // reads a single character from user
		
		/* Get report from the utility method. */
		String report = Utilities.getRPSGameReport(p1, p2, p1r1, p2r1, p1r2, p2r2);
		
		System.out.println(report);
		
		input.close();
	}

}
