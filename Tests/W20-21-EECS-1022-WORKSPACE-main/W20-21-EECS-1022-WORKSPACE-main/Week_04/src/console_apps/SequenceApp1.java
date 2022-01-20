package console_apps;

import java.util.Scanner;

import model.Utilities;

public class SequenceApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first term of the arithmetic sequence: ");
		int ft = input.nextInt();
		
		System.out.println("Enter the common difference of the sequence: ");
		int d = input.nextInt();
		
		System.out.println("Enter the size of the sequence: ");
		int n = input.nextInt();
		
		String seq = Utilities.getSequence1a(ft, d, n);
		
		System.out.println(seq);
	}

}
