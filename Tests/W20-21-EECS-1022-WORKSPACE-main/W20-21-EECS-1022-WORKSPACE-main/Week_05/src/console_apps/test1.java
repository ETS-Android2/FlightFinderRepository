package console_apps;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ia = {4, 9, 7, 11};
		if (ia.length % 2 == 0) {  // even
			int temp = 0;
			for (int i = 0; i < (ia.length/2); i++) {                 // {1, 2, 3, 4}
				temp = ia[ia.length - (i+1)];
				ia[ia.length - (i+1)] = ia[i];
				ia[i] = temp;
			}
			System.out.println(ia);
			
		}
		input.close();
	}

}

//int secondLargest = 0;

