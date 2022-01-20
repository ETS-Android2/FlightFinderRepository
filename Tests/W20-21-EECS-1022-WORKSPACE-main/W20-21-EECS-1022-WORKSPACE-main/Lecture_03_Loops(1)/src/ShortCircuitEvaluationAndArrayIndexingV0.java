import java.util.Scanner;

public class ShortCircuitEvaluationAndArrayIndexingV0 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many integers?");
		int howMany = input.nextInt();

		int[] ns = new int[howMany]; 
		for(int i = 0; i < howMany; i ++) {
			System.out.println("Enter an integer");
			ns[i] = input.nextInt(); } 

		System.out.println("Enter an index:");
		int i = input.nextInt(); 

		if(ns[i] % 2 == 0) /* V0: unguarded array indexing */ {
			System.out.println("Element at index " + i + " is even."); 
		}
		else { 
			/* Error because ns[i] is odd */ 
		}
		input.close();
		
	}

}
