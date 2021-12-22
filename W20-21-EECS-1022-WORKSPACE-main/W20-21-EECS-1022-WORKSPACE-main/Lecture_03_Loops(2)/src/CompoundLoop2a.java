import java.util.Scanner;

public class CompoundLoop2a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a radius value:");
		double radius = input.nextDouble();
		boolean isPositive = radius >= 0;
		while (isPositive) {
			double area = radius * radius * 3.14;
			System.out.println("Area is " + area);  
			System.out.println("Enter a radius value:");
			radius = input.nextDouble();
//			isPositive = radius >= 0;
		}
		System.out.println("Error: negative radius value.");
		
		input.close();
	}

}
