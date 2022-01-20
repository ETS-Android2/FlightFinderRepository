import java.util.Scanner;

public class IfStatementCase1ToCase4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer value:");
		int i = input.nextInt();

		if(i < 0) {
			System.out.println("i is negative");
		}
		else if(i < 10) {
			System.out.println("i is less than 10");
		}
		else if(i == 10) {
			System.out.println("i is equal to 10");
		}
		else {
			System.out.println("i is greater than 10");
		}

		input.close();
	}

}
