package console_apps;

import java.util.Scanner;

import model.Utilities;

public class GetFilteredSeqApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Prompt the user for an array of numbers. */
		System.out.println("How many numbers do you want to input?");
		int howMany = input.nextInt();
		int[] numbers = new int[howMany];
		int i = 0;
		while(i < howMany) {
			System.out.println("Enter input " + (i + 1) + ":");
			int number = input.nextInt(); 
			numbers[i] = number;
			i ++;
		}
		
		System.out.println("Which number do you wish to filter from the input numbers?");
		int n = input.nextInt();
		
		/* Invoke the utility method to perform computation. */
		int[] result = Utilities.getFilteredSeq(numbers, n);
		
		/* Output each element in the returned array to console. */
		System.out.print("<");
		for(i = 0; i < result.length; i ++) {
			System.out.print(result[i]);
			if(i < result.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(">");
		
		input.close();
	}

}
