import java.util.Scanner;

public class CompoundIfStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer score:");
		int score = input.nextInt();

		String letterGrade = "F";
		if (score >= 80.0) {
			letterGrade = "A"; 
		}
		else if (score >= 70.0) {
			letterGrade = "B"; 
		}
		else if (score >= 60.0) {
			letterGrade = "C"; 
		}

		System.out.println("Grade: " + letterGrade);

		input.close();
	}
}