import java.util.Scanner;

public class CircleAppNoSelections {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter the radius of a circle:");
	    double radiusFromUser = input.nextDouble();
	    
	    final double PI = 3.14;
	    double area = radiusFromUser * radiusFromUser * PI; 
	    
	    System.out.print("Circle with radius " + radiusFromUser);
	    System.out.println(" has an area of " + area);
	    
	    input.close();
	}

}
