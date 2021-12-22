package model;
public class Utilities
{
	/* Only write lines of code within the methods given to you.
	 * Do not add any new helper methods. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests 
	 * 	  (therefore it is important that you test your own methods
	 *     by either the console application class App or your own JUnit tests) 
	 */

	/*	Task 1:
	 *  Given an input double number that denotes the radius of a circle,
	 *  return its area.
	 */
	public static double areaOfCircle(double radius) {
		double result = 0;
		final double PI = 3.14;
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		double area = 3.14 * radius * radius;
		result = area;
		
		
		// Do not modify this return statement. 
		return result;
	}

	/*  Task 2:
	 *  Given four input integers a, b, c, and d,
	 *  return their average with precision.
	 */
	public static double averageOf(int a, int b, int c, int d) {
		double result = 0;
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		
		double sum = a + b + c + d;
		double average = sum / ((double) 4);
		result = average;
		
		
		
		// Do not modify this return statement. 
		return result;
	}

	/*  Task 3:
	 *  Given three input integers (which may or may not be equal),
	 *  return the maximum.
	 */
	public static int maximumOf(int x, int y, int z) {
		int result = 0;
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		
		if ((x > y) && (x > z)) {
			result = x;
		}
		else if ((y > x ) && (y > z)) {
			result = y;
		}
		else if ((z > x ) && (z > y)) {
			result = z;
		}
			
		
		// Do not modify this return statement. 
		return result;
	}

	/*  Task 4:
	 *  Given four input integers,
	 *  return whether or not they represent an arithmetic sequence.
	 *  An arithmetic sequence is has a common difference between every consecutive numbers.
	 *  e.g., 1, 3, 5, 7 is an arithmetic sequence with 2 being the common difference.
	 *  e.g., 10, 8, 6, 4 is an arithmetic sequence with -2 being the common difference.
	 */
	public static String isArithmeticSeq(int n1, int n2, int n3, int n4) {
		String result = "";
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		
		int difference1 = n2 - n1;
		int difference2 = n3 - n2;
		int difference3 = n4 - n3;
		
		boolean isArethmetic = true;
		if ((difference1 == difference2) && (difference2 == difference3) && (difference1 == difference3)) {
			isArethmetic = true;
		}
		else {
			isArethmetic = false;
		}
		
		if (isArethmetic) {
			result = "It is an arithmetic sequence with common difference " + difference1;
		}
		else {
			result = "It is not an arithmetic sequence";
		}
		
		
		
		// Do not modify this return statement. 
		return result;
	}

}

