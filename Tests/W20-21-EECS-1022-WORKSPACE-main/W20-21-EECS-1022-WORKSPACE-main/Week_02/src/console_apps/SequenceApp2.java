package console_apps;

import java.util.Scanner;

import model.Sequence;

public class SequenceApp2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Stage 1: Prompt the user and read inputs
		System.out.println("Enter the first tirm of an arithmetic sequence of size 5: ");
		int ft = input.nextInt();
		System.out.println("Enter the common difference (d): ");
		int d = input.nextInt();
		
		// Stage 2: Compute the result
		String seq = Sequence.getSequence2(ft, d);
		int sum = Sequence.getSum2(ft, d);
		
		// Stage3: Output the result to console
		System.out.println("Sequence " + seq + " has sum " + sum); // Note: + operator is overloaded, 1. Addition 2. Concatenation
		
		input.close();
	}

}
