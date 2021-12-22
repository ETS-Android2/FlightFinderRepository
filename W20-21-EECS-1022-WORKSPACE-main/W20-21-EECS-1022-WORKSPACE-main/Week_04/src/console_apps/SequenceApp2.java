package console_apps;

import java.util.Scanner;

import model.Utilities;

public class SequenceApp2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first term of the arithmetic sequence: ");
		int ft = input.nextInt();
		
		System.out.println("Enter the common difference of the sequence: ");
		int d = input.nextInt();
		
		// assumption: common difference is positive(max value of sequence is the last term)
		
		System.out.println("Enter the maximum value of the arithmetic sequence: ");
		int max = input.nextInt();
		
		String seq = Utilities.getSequence2a(ft, d, max);
		
		System.out.println(seq);

	}

}
