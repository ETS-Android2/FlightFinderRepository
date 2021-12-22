import java.util.Scanner;

public class CompoundLoop1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a radius value:");
		double radius = input.nextDouble(); 
		while (radius >= 0) {
			double area = radius * radius * 3.14;
			System.out.println("Area is " + area);  
			System.out.println("Enter a radius value:");
			radius = input.nextDouble(); 
		}
		System.out.println("Error: negative radius value.");
		
		input.close();
	}

}
