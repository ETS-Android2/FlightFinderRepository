package console_apps;

import java.util.Arrays;
import java.util.Scanner;

import model.Utilities;

public class CheckIndexEvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many integers do you want to enter: ");
		int arrayL = input.nextInt();   // 3
		
		int[] array = new int[arrayL];

		for(int i = 0; i < arrayL; i ++) {
			System.out.println("Number " + (i + 1) + ":");
			array[i] = input.nextInt();
		}
		
		System.out.println("Enter an index: ");
		int index = input.nextInt();
		
		String result = Utilities.CheckingIndexEvenOdd(array, index);
		System.out.println(result);
		
		input.close();
	}

}
