import java.util.Scanner;

public class SingleIfStmtVsMultipleIfStmtsOverlappingConditions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer value:");
		int i = input.nextInt();

		/* Single if-statement with overlapping conditions */
		System.out.println("Output from single if-statement with overlapping conditions:");
		if(i >= 3) {
			System.out.println("i is >= 3");
		}
		else if(i <= 8) {
			System.out.println("i is <= 8");
		} 

		/* Multiple if-statements with overlapping conditions */
		System.out.println("Output from multiple if-statements with overlapping conditions:");
		if(i >= 3) {
			System.out.println("i is >= 3");
		}
		if(i <= 8) {
			System.out.println("i is <= 8");
		} 

		input.close();

	}

}
