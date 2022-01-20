import java.util.Scanner;

public class CompoundLoop2b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a radius value:");
		double radius = input.nextDouble();
		boolean isNegative = radius < 0;
		while (!isNegative) {
			double area = radius * radius * 3.14;
			System.out.println("Area is " + area);  
			System.out.println("Enter a radius value:");
			radius = input.nextDouble();
			isNegative = radius < 0;
		}
		System.out.println("Error: negative radius value.");
		
		input.close();
	}

}
