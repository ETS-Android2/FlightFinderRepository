package console_apps;
import java.util.Scanner;

/*
 * This is version one of a console application.
 * we will prompt the user of radius values of two circles. 
 * The application will output the areas of the two input circles.
 */
public class CircleApp1 {
	// main method: entry point of execution
	public static void main(String[] args) {
		// Starting the execution of the application.
		// System.in denotes the standard input (i.e., keyboard).
		Scanner input = new Scanner(System.in);
		
		// Start the actual application code here.
		
		/*
		 * Calculate the area of the first circle.
		 */
		
		// Step 1: Prompt the user for the radius of the 1st circle.
		System.out.println("Enter the radius of the 1st circle: ");
		// Declare a variable to store the user input.
		// Step 2: get a floating-point input number from the user.
		double radius1 = input.nextDouble(); 
		// Step 3: Compute the area of the input circle accordingly.
		double area1 = 3.14 * radius1 * radius1;   // double is type for the float.
		// Step 5: Only take 2 decimal places for the result.
		String area1S = String.format("%.2f", area1);
		//Step 4: Output the result back to the user.
		System.out.println("The area of the circle is: " + area1S);
		
		
		/*
		 * Calculate the area of the second circle.
		 */
		
		// Step 1: Prompt the user for the radius of the 1st circle.
		System.out.println("Enter the radius of the 2nd circle: ");
		// Declare a variable to store the user input.
		// Step 2: get a floating-point input number from the user.
		double radius2 = input.nextDouble(); 
		// Step 3: Compute the area of the input circle accordingly.
		double area2 = 3.14 * radius2 * radius2;   // double is type for the float.
		// Step 5: Only take 2 decimal places for the result.
		String area2S = String.format("%.2f", area2);
		//Step 4: Output the result back to the user.
		System.out.println("The area of the circle is: " + area2S);
		
		
		
		
		// end of the application code.
		
		input.close();
	}
 
}
