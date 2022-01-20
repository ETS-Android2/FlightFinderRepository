package console_apps;

import java.util.Scanner;

public class RunTimeLogicalError {
	public static void main(String[] args) {
		/* Runtime logical error: code compiles, does not crash at runtime,
		 * but does not behave as expected. 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the integer radius of a circle:");
		int radius = input.nextInt();
		
		System.out.println("Area of circle is: " + (2 * 3.14 * radius));
		input.close();
	}
}



