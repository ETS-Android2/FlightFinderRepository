import java.util.Scanner;

public class LogicalOperationConjunction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an age value:");
		int age = input.nextInt();

		boolean isOldEnough = age >= 45;
		boolean isNotTooOld = age < 65;
		if (!isOldEnough) { 
			/* young */ 
			System.out.println("Young");
		}
		else if (isOldEnough && isNotTooOld) { 
			/* middle-aged */ 
			System.out.println("Middle-aged");
		} 
		else { 
			/* senior */ 
			System.out.println("Senior");
		}

		input.close();
	}
}