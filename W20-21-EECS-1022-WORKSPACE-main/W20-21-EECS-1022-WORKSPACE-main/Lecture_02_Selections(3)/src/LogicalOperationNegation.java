import java.util.Scanner;

public class LogicalOperationNegation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a radius value:");
		double radius = input.nextDouble();
		
		final double PI = 3.14;
		boolean isPositive = radius > 0;
		if (!isPositive) {
			/* not the case that isPositive is true */
			System.out.println("Error: radius value must be positive.");
		}
		else {
			System.out.println("Area is " + radius * radius * PI);
		}

		input.close();
	}
}