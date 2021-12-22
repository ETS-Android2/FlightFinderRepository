package console_apps;

import java.util.Scanner;

import model.ArrayUtilities;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// System.out.println("Enter the array you want to get a sub-array for: ");
		int[] array = {2, 3, 4};
		int[] result = ArrayUtilities.getIntermediateSums(array);
		
		System.out.println("Array is " + result);
			
	}

}
