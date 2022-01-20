package console_apps;

import java.util.Scanner;

import model.Sequence;

public class SequenceApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Stage 1: Prompt the user and read inputs
		System.out.println("Enter the first tirm of an arithmetic sequence of size 5: ");
		int ft = input.nextInt();
		System.out.println("Enter the common difference (d): ");
		int d = input.nextInt();
		
		// Stage 2: Compute the result
//		int term1 = ft;
//		int term2 = ft + d; //Or// term1 + d
//		int term3 = ft + 2 * d; // term2 + d
//		int term4 = ft + 3 * d; // term3 +  d
//		int term5 = ft + 4 * d; // term4 + d
		
		String seq = Sequence.getSequence1(ft, d);
		int sum = Sequence.getSum1(ft, d);
		
		// Stage3: Output the result to console
		System.out.println("Sequence " + seq + " has sum " + sum); // Note: + operator is overloaded, 1. Addition 2. Concatenation
		input.close();
	}

}
