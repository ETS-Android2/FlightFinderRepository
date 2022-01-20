import java.util.Scanner;

public class ShortCircuitEvaluationAndArrayIndexingV1 {

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
		
		/*
		 * Exercise: In Line 23, swap the order in which the relational expressions are arranged.
		 * Will the branching condition still always work?
		 */
		if(0 <= i && i < ns.length && ns[i] % 2 == 0) /* V1: array indexing guarded by SCE of conjunction */ {
			System.out.println("Element at index " + i + " is even."); 
		}
		else { 
			/* Error: invalid index or odd ns[i] */ 
		}
		input.close();
		
	}

}
