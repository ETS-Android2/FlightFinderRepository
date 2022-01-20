import java.util.Scanner;

public class MultiWayIfStatementWithoutElsePart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer value:");
		int x = input.nextInt();

		int y = 0;
		if (x >= 0) {
			System.out.println("x is positive");
			if (x > 10) { y = x * 2; } 
			else if (x < 10) { y = x % 2; }
			else { y = x * x; }
		}
		else { /* x < 0 */ 
			System.out.println("x is negative");
			if(x < -5) { y = -x; }
		}

		System.out.println("x: " + x);
		System.out.println("y: " + y);

		input.close();
	}
}