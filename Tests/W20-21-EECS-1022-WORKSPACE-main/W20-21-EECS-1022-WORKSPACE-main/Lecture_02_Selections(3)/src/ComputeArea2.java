import java.util.Scanner;

public class ComputeArea2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a radius value:");
		double radius = input.nextDouble();

		final double PI = 3.14159;
		if (radius >= 0) { /* condition of valid inputs */
			double area = radius * radius * PI;
			System.out.println("Area is " + area);
		}
		else { /* implicit: !(radius >= 0), or radius < 0 */
			System.out.println("Error: Negative radius value!");
		}

		input.close();
	}
}