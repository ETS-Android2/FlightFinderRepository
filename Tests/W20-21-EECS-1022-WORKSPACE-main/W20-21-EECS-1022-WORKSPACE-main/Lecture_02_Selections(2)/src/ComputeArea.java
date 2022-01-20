import java.util.Scanner;

public class ComputeArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a radius value:");
		double radius = input.nextDouble();
		
		final double PI = 3.14159;
		if (radius < 0) { /* condition of invalid inputs */
			System.out.println("Error: Negative radius value!");
		} 
		else { /* implicit: !(radius < 0), or radius >= 0 */
			double area = radius * radius * PI;
			System.out.println("Area is " + area);
		}
		
		input.close();
	}
}