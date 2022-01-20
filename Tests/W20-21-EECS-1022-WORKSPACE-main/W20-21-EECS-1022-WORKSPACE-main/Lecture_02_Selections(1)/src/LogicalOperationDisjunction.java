import java.util.Scanner;

public class LogicalOperationDisjunction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an age value:");
		int age = input.nextInt();

		boolean isSenior = age >= 65;
		boolean isChild = age < 18;
		if (isSenior || isChild) { 
			/* discount */ 
			System.out.println("Discount");
		}
		else { 
			/* no discount */ 
			System.out.println("No discount");
		}

		input.close();
	}
}