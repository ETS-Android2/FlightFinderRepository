package model;

/*
 * This class contains three separate sets of test questions.
 * You can check tutorials on solutions to these methods here:
 * https://www.youtube.com/playlist?list=PL5dxAmCmjv_4UZNiLzeFPAgDDv2vLCGb4
 * (The IDE used there is not Eclipse, but the lines of code will work.)
 */

public class Utilities
{          // VERSION 1
	
	/*
	 * Example Test 2a
	 */
	
	/* Only write lines of code within the methods given to you.
	 * Do not add any new helper methods. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Requirement: 
	 * 	- It is forbidden for you to use any Java library class or method.
	 * 	(that is, there must not be an import statement in the beginning of this class.)
	 * 	- Each task violating this requirement will result in an immediate zero for it. 
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests 
	 * 	  (therefore it is important that you test your own methods
	 *     by either the console application class App or your own JUnit tests) 
	 */

	/*
	 * Given an array of integers, calculate the average of its elements.
	 * You can assume that the array is not empty and contains at least 1 one element.
	 */
//	public static double averageOf(int[] ia) {
//		double result = -1;
//
//		/* Your task is to implement this method,
//		 * so that running TestUtilities.java will pass all JUnit tests.
//		 *  
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.
//		 * 3. Do not re-assign any of the parameter/input variables. 
//		 */
//
//		// Your implementation of this method starts here. 
//		double sum = 0;
//		int i = 0;
//		
//		for (; i < ia.length;) {
//			sum += ia[i];
//			i++;
//		}
//		double avg = (double)sum/i;
//		result = avg;
//		// Do not modify this return statement. 
//		return result;
//	}
//
//	/*
//	 * Given an integer array ia, determine whether or not
//	 * all elements are multiples of 5.
//	 */
//	public static boolean allMultiplesOf5(int[] ia) {
//		boolean result = true;
//
//		/* Your task is to implement this method,
//		 * so that running TestUtilities.java will pass all JUnit tests.
//		 *  
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.
//		 * 3. Do not re-assign any of the parameter/input variables. 
//		 */
//
//		// Your implementation of this method starts here. 
//		for(int i = 0; i < ia.length; i++) {
//			if (ia[i] % 5 == 0) {              // {5, 11, 15, 20, 25}
//				result = true;
//			}
//			else {
//				result = false;
//				i = ia.length;
//			}
//		}
//		// another solution
//	//		boolean result = true;
//	//		boolean answer = true;
//	//		int[] nums = {1, 2, 4, 4};
//	//		//            0  1  2  3
//	//		
//	//		for (int i = 0; i < nums.length - 1; i ++) {
//	//			if (nums[i] > 0  && nums[i + 1] > 0) {
//	//				result = true;
//	//				answer = result;
//	//			}
//	//			else {
//	//				result = false;
//	//				answer = result;
//	//			}
//	//		}
//	//		System.out.println(answer);
//		
//		// Do not modify this return statement. 
//		return result;
//	}
//
//	/* Given an integer array ia, determine whether or not
//	 * at lease one element is multiple of 5.
//	 */
//	public static boolean atLeastOneMultipleOf5(int[] ia) {
//		boolean result = false;
//
//		/* Your task is to implement this method,
//		 * so that running TestUtilities.java will pass all JUnit tests.
//		 *  
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.
//		 * 3. Do not re-assign any of the parameter/input variables. 
//		 */
//
//		// Your implementation of this method starts here.
//		for (int i = 0; i < ia.length; i++) {             // {11, 5, 12, 25, 24}
//			if (ia[i] % 5 == 0) {
//				result = true;
//				i = ia.length;
//			}
//			else {
//				result = false;
//			}
//		}
//	
//
//		// Do not modify this return statement. 
//		return result;
//	}
//
//	/* Given an array of integers, find out the second maximum element.
//	 * The input array may contain duplicates.
//	 * You can assume that integer array ia contains at least two elements.
//	 * Your are forbidden to use any library class, e.g., Arrays.sort.
//	 */
//	public static int secondMaximumOf(int[] ia) {
//		int result = -1;
//
//		/* Your task is to implement this method,
//		 * so that running TestUtilities.java will pass all JUnit tests.
//		 *  
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.
//		 * 3. Do not re-assign any of the parameter/input variables. 
//		 */
//
//		// Your implementation of this method starts here.    
//															//{4, 9, 1, 5, 8, 3, 10, 7, 2, 6}
//		int[] a2 = new int[ia.length];
//		
//		int secondLargest = 0;
//		if (ia.length > 2) {
//				int temp = 0;                                               //{4, 9, 1, 5, 8, 3, 10, 7, 2, 6}
//				for (int i = 0; i < ia.length; i++) {
//				            for (int j = i + 1; j < ia.length; j++) {
//				                if (ia[i] > ia[j]) {
//				                    temp = ia[i];
//				                    ia[i] = ia[j];
//				                    ia[j] = temp;
//				                }
//				            }
//				        }																				/* Another way of finding the largest numbers */
//				       secondLargest = ia[ia.length-2];													/* having a second variable secondLargest can be used to find the second largest number*/
//			}																					//		int[] nums = {11, 4, 8, 9, 5, 7, 6, 10};
//																								//		int largest = 0;
//																								//		
//																								//		if (nums[0] > nums[1]) {
//																								//			largest = nums[0];
//																								//		}
//																								//		else if (nums[0] < nums[1]) {
//																								//			largest = nums[1];
//																								//		}
//																								//		
//																								//		for (int i = 2; i < nums.length; i ++) {
//																								//			if (nums[i] > largest) {
//																								//				largest = nums[i];
//																								//			}
//																								//			else if (nums[i] < largest) {
//																								//				largest = largest;
//																								//			}
//																								//		}
//		else if (ia.length == 2) {
//			for (int i = 0; i < ia.length - 1; i++) {
//				if (ia[i] > ia[i+1]) {
//					secondLargest = ia[i+1];
//				}
//				else if (ia[i] == ia[i+1]) {
//					secondLargest = ia[i+1];
//				}
//				else if (ia[i] < ia[i+1]) {
//					secondLargest = ia[i];
//				}
//			}
//		}
//		result = secondLargest;
//
//		
//
//		// Do not modify this return statement. 
//		return result;
//	}
//	
//	/*
//	 * Example Test 2b
//	 */
//
//	/* Given an array of integers, return its reverse.
//	 * Your are forbidden to use any library class, e.g., Arrays.sort.
//	 */
//	public static int[] reverseOf(int[] ia) {
//		int[] result = null;
//
//		/* Your task is to implement this method,
//		 * so that running TestUtilities.java will pass all JUnit tests.
//		 *  
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.
//		 * 3. Do not re-assign any of the parameter/input variables. 
//		 */
//
//		// Your implementation of this method starts here. 
//		if (ia.length % 2 == 0) {  // even
//			int temp = 0;
//			for (int i = 0; i < (ia.length/2); i++) {                 // {1, 2, 3, 4}
//				temp = ia[ia.length - (i+1)];
//				ia[ia.length - (i+1)] = ia[i];
//				ia[i] = temp;
//			}
//			result = ia;
//		}
//		else if (ia.length % 2 == 1) {
//			int temp = 0;
//			for (int i = 0; i < (ia.length/2); i++) {                 // {1, 2, 3, 4}
//				temp = ia[ia.length - (i+1)];
//				ia[ia.length - (i+1)] = ia[i];
//				ia[i] = temp;
//			}
//			result = ia;
//		}
//
//		// Do not modify this return statement. 
//		return result;
//	}
//
//	/* Given two arrays of integers, determine whether or not
//	 * one is exactly the reverse of the other.
//	 * Your are forbidden to use any library class, e.g., Arrays.sort.
//	 */
//	public static boolean isReverseOfEachOther(int[] ia1, int[] ia2) {
//		boolean result = false;
//
//		/* Your task is to implement this method,
//		 * so that running TestUtilities.java will pass all JUnit tests.
//		 *  
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.
//		 * 3. Do not re-assign any of the parameter/input variables. 
//		 */
//
//		// Your implementation of this method starts here. 
//		boolean backup = true;
//		if (ia1.length % 2 == 0) {  // even
//			int temp = 0;
//			for (int i = 0; i < (ia1.length/2); i++) {                 // {1, 2, 3, 4}
//				temp = ia1[ia1.length - (i+1)];
//				ia1[ia1.length - (i+1)] = ia1[i];
//				ia1[i] = temp;
//			}
//			
//			for (int i = 0; i < ia1.length; i++) {
//				if (ia1[i] == ia2[i]) {
//					result = true;
//				}
//				else {
//					result = false;
//					i = ia1.length;
//				}
//			}
//		}
//		else if (ia1.length % 2 == 1) {
//			int temp = 0;
//			for (int i = 0; i < (ia1.length/2); i++) {                 // {1, 2, 3, 4, 5}  // {5, 4, 3, 2, 1} // {1, 2, 3, 4, 5}
//				temp = ia1[ia1.length - (i+1)];
//				ia1[ia1.length - (i+1)] = ia1[i];
//				ia1[i] = temp;
//			}
//			
//			for (int i = 0; i < ia1.length; i++) {
//				if (ia1[i] == ia2[i]) {
//					result = true;
//				}
//				else {
//					result = false;
//					i = ia1.length;
//				}
//			}
//		}
//		
//
//		// Do not modify this return statement. 
//		return result;
//	}
//
//	/* Return the first n elements in an arithmetic sequence whose
//	 * start term is start and common difference is diff.
//	 */
//	public static int[] getArithSeq(int start, int diff, int n) {
//		int[] result = null;
//
//		/* Your task is to implement this method,
//		 * so that running TestUtilities.java will pass all JUnit tests.
//		 *  
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.
//		 * 3. Do not re-assign any of the parameter/input variables. 
//		 */
//
//		// Your implementation of this method starts here. 
//		int[] seqArray = new int[n];
//		for (int i = 0; i < n; i++) {
//			seqArray[i] = start + (i * diff);
//		}
//		result = seqArray;
//		
//
//		// Do not modify this return statement. 
//		return result;
//	}
//	
//	/* Given an integer array, determine if it's an arithmetic sequence,
//	 * i.e., there's a common different between every two consecutive elements.
//	 */
//	public static boolean isArithSeq(int[] ia) {
//		boolean result = false;
//
//		/* Your task is to implement this method,
//		 * so that running TestUtilities.java will pass all JUnit tests.
//		 *  
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.
//		 * 3. Do not re-assign any of the parameter/input variables. 
//		 */
//
//		// Your implementation of this method starts here. 
//		
//		for (int i = 0; i < (ia.length-2); i++) {
//			if ((ia[i+1] - ia[i]) == (ia[i+2] - ia[i+1])) {
//				result = true;
//			}
//			else {
//				result = false;
//				i = ia.length-2;
//			}
//		}
//
//		// Do not modify this return statement. 
//		return result;
//	}
//	
//	/*
//	 * Example Test 2c
//	 */
//
//	/* Return the first i items in a Fibonacci sequence. 
//	 * A Fibonacci sequence is:
//	 * 1, 1, 2, 3, 5, 8, 13, 21, ...
//	 * where the 1st and 2nd elements are always 1, and
//	 * starting from the third element, the value of an element
//	 * is the sum of its previous two neighbouring elements.
//	 * For example, 2 == 1 + 1, 3 == 2 + 1, 5 == 3 + 2, 8 == 5 + 3, and etc.
//	 * You can assume that the input i >= 0.
//	 */
//	public static int[] getFibSeq(int i) {
//		int[] result = null;
//
//		/* Your task is to implement this method,
//		 * so that running TestUtilities.java will pass all JUnit tests.
//		 *  
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.
//		 * 3. Do not re-assign any of the parameter/input variables. 
//		 */
//
//		// Your implementation of this method starts here. 
//		
//		int[] array = new int[i];
//		int ft = 1;
//		int st = 1;
//		
//		if (i == 1) {
//			array[0] = 1;
//		}
//		else if (i == 2) {
//			array[0] = 1;
//			array[1] = 1;
//		}
//		else if (i > 2) {
//			array[0] = 1;
//			array[1] = 1;
//			for (int m = 0; m < (i - 2); m ++) {
//				array[m + 2] = array[m] + array[m + 1];
//			}
//		}
//		result = array;
//		
//		
//
//		// Do not modify this return statement. 
//		return result;
//	}
//
//	/* Determine whether or not an integer array ia contains
//	 * the first ia.length elements in a Fibonacci sequence.
//	 * Remember that ia.length >= 0
//	 */
//	public static boolean isFibSeq(int[] ia) {
//		boolean result = false;
//		/* Your task is to implement this method,
//		 * so that running UtilitiesTester.java will output the expected value to console.
//		 * 
//		 * Do not write any System.out.print(...) or System.out.println(...).
//		 * Do not declare any Scanner. 
//		 * Do not re-assign any of the parameter/input variables. 
//		 */
//
//		/* Your code starts after this line: */ 
//		int i = 0;
//		if (ia.length == 1) {
//			if (ia[0] == 1) {
//				result = true;
//			}
//			else {
//				result = false;
//			}
//		}
//		else if (ia.length == 2) {
//			if ((ia[0] == 1) && (ia[1] == 1)) {
//				result = true;
//			}
//			else {
//				result = false;
//			}
//		}
//		else if (ia.length > 2) {
//			ia[0] = 1;
//			ia[1] = 1;
//			for (int m = 0; m < (ia.length - 2); m ++) {
//				if ((ia[m + 2]) == ia[m] + ia[m + 1]) {
//					result = true;
//				}
//				else {
//					result = false;
//					m = ia.length - 2;
//				}
//			}
//		}
//
//		// Do not modify this return statement.
//		return result;
//	}
//
//	/*
//	 * Count the number of occurrences of string s in string array sa.
//	 */
//	public static int numberOfOccurrences(String[] sa, String s) {
//		int result = -1;
//		/* Your task is to implement this method,
//		 * so that running UtilitiesTester.java will output the expected value to console.
//		 * 
//		 * Do not write any System.out.print(...) or System.out.println(...).
//		 * Do not declare any Scanner. 
//		 * Do not re-assign any of the parameter/input variables. 
//		 */
//
//		/* Your code starts after this line: */ 
//		int m = 0;
//		for (int i = 0; i < sa.length; i ++) {
//			if (sa[i].equals(s)) {
//				m ++;
//			}
//		}
//		result = m;
//
//		// Do not modify this return statement.
//		return result;
//	}
//
//	/* Return an array storing the indices of string s in string array sa.
//	 * If s does not occur in sa, then the returned array should be EMPTY.
//	 * Length of the returned array should correspond to the number of times
//	 * string s occurs in string array sa.
//	 */
//	public static int[] getIndices(String[] sa, String s) {
//		int[] result = null;
//		/* Your task is to implement this method,
//		 * so that running UtilitiesTester.java will output the expected value to console.
//		 * 
//		 * Do not write any System.out.print(...) or System.out.println(...).
//		 * Do not declare any Scanner. 
//		 * Do not re-assign any of the parameter/input variables. 
//		 */
//
//		/* Your code starts after this line: */ 
//		int repeat = 0;
//		
//		for (int i = 0; i < sa.length; i ++) {
//			if (sa[i].equals(s)) {
//				repeat ++;
////				for (int m = 0; m < repeat; m++) {
////					R[m] = i;
////				}
//			}
//		}
//		
//		int[] R = new int[repeat];
//		int backup = repeat;
//		int m = 0;
//		
//		for (int i = 0; i < sa.length; i ++) {
//			if (sa[i].equals(s)) {
//				repeat = backup;
//				for (; m < repeat; ) {
//					R[m] = i;
//					repeat = 0;
//					m ++;
//				}
//			}
//			
//		}
//		
//		result = R;
//		
//		
//
//		// Do not modify this return statement.
//		return result;
//	}
	
		public static double averageOf(int[] ia) {
			double result = -1;

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
			double sum = 0;
			for (int i = 0; i < ia.length; i ++) {
				sum += ia[i];
			}
			double average = sum/ia.length;
			result = average;
			
			
			// Do not modify this return statement. 
			return result;
		}

		/*
		 * Given an integer array ia, determine whether or not
		 * all elements are multiples of 5.
		 */
		public static boolean allMultiplesOf5(int[] ia) {
			boolean result = true;

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
			for (int i = 0; i < ia.length; i ++) {
				if (ia[i] % 5 != 0) {
					result = false;
					i = ia.length;
				}
				else if (ia[i] % 5 == 0) {
					result = true;
				}
			
			}
			
			
			// Do not modify this return statement. 
			return result;
		}

		/* Given an integer array ia, determine whether or not
		 * at lease one element is multiple of 5.
		 */
		public static boolean atLeastOneMultipleOf5(int[] ia) {
			boolean result = false;

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
			for (int i = 0; i < ia.length; i ++) {
				if (ia[i] % 5 == 0) {
					result = true;
					i = ia.length;
				}
				else if (ia[i] % 5 != 0) {
					result = false;
				}
			
			}

			// Do not modify this return statement. 
			return result;
		}

		/* Given an array of integers, find out the second maximum element.
		 * The input array may contain duplicates.
		 * You can assume that integer array ia contains at least two elements.
		 * Your are forbidden to use any library class, e.g., Arrays.sort.
		 */
		public static int secondMaximumOf(int[] ia) {
			int result = -1;

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
			
			for (int i = 0; i < ia.length - 2; i ++) {
				for (int m = 0; m < ia.length - 1; m ++) {
					
					int temp = ia[m];
					if (ia[m] < ia[m + 1]) {
						ia[m] = ia[m];
						ia[m + 1] = ia[m + 1];
					}
					else if (ia[m] >= ia[m + 1]) {
						ia[m] = ia[ m + 1];
						ia[m + 1] = temp;
					}
				}
			}
			
			int secondMax = ia[ia.length - 2];
			result = secondMax;
			
			// Do not modify this return statement. 
			return result;
		}
		
		/*
		 * Example Test 2b
		 */

		/* Given an array of integers, return its reverse.
		 * Your are forbidden to use any library class, e.g., Arrays.sort.
		 */
		public static int[] reverseOf(int[] ia) {
			int[] result = null;

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
			
			if (ia.length > 2) {
				if (ia.length % 2 == 0) {
					for (int i = 0; i < ia.length / 2; i ++) {
						int temp = ia[i];
						ia[i] = ia[ia.length - i -1];
						ia[ia.length - i - 1] = temp;
					}
				}
				else if (ia.length % 2 == 1) {
					for (int i = 0; i < ia.length / 2; i ++) {
						int temp = ia[i];
						ia[i] = ia[ia.length - i - 1];
						ia[ia.length - i - 1] = temp;
					}
				}
			}
			else if (ia.length == 2) {
				int temp = ia[0];
				ia[0] = ia[1];
				ia[1] = temp; 
			}
			result = ia;
			// Do not modify this return statement. 
			return result;
		}

		/* Given two arrays of integers, determine whether or not
		 * one is exactly the reverse of the other.
		 * Your are forbidden to use any library class, e.g., Arrays.sort.
		 */
		public static boolean isReverseOfEachOther(int[] ia1, int[] ia2) {
			boolean result = false;

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
			if (ia1.length > 2) {
				if (ia1.length % 2 == 0) {
					for (int i = 0; i < ia1.length / 2; i ++) {			//{4, 9, 1, 5, 8, 3, 10, 7, 2, 6}
						int temp = ia1[i];								//
						ia1[i] = ia1[ia1.length - i -1];
						ia1[ia1.length - i - 1] = temp;
					}
				}
				else if (ia1.length % 2 == 1) {
					for (int i = 0; i < ia1.length / 2; i ++) {
						int temp = ia1[i];
						ia1[i] = ia1[ia1.length - i - 1];
						ia1[ia1.length - i - 1] = temp;
					}
				}
			}
			else if (ia1.length == 2) {
				int temp = ia1[0];
				ia1[0] = ia1[1];
				ia1[1] = temp; 
			}
			
			for (int i = 0; i < ia1.length; i ++ ) {
				if (ia1[i] != ia2[i]) {
					result = false; 
					i = ia1.length;
				}
				else {
					result = true;
				}
			}
			// Do not modify this return statement. 
			return result;
		}

		/* Return the first n elements in an arithmetic sequence whose
		 * start term is start and common difference is diff.
		 */
		public static int[] getArithSeq(int start, int diff, int n) {
			int[] result = null;

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
			int[] array = new int[n];
			int a1 = start;
			int d = diff;
			
			for (int i = 0; i < n; i ++ ) {
				array[i] = a1 + (i * d); 
			}
			result = array;
			
			// Do not modify this return statement. 
			return result;
		}
		
		/* Given an integer array, determine if it's an arithmetic sequence,
		 * i.e., there's a common different between every two consecutive elements.
		 */
		public static boolean isArithSeq(int[] ia) {
			boolean result = false;

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
			for (int i = 0; i < ia.length - 2; i ++) {
				if ((ia[i + 1] - ia[i]) != (ia[i + 2] - ia[i + 1])) {
					result = false;
					i = ia.length - 2;
				}
				else {
					result = true;
				}
			}
			
			// Do not modify this return statement. 
			return result;
		}
		
		/*
		 * Example Test 2c
		 */

		/* Return the first i items in a Fibonacci sequence. 
		 * A Fibonacci sequence is:
		 * 1, 1, 2, 3, 5, 8, 13, 21, ...
		 * where the 1st and 2nd elements are always 1, and
		 * starting from the third element, the value of an element
		 * is the sum of its previous two neighbouring elements.
		 * For example, 2 == 1 + 1, 3 == 2 + 1, 5 == 3 + 2, 8 == 5 + 3, and etc.
		 * You can assume that the input i >= 0.
		 */
		public static int[] getFibSeq(int i) {
			int[] result = null;

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
			int[] array = new int[i];
			if (i == 1) {
				array[0] = 1;
			}
			else if (i == 2) {
				array[0] = 1;
				array[1] = 1;
			}
			else if (i > 2) {
				for (int m = 0; m < array.length - 2; m ++) {
					array[0] = 1;
					array[1] = 1;
					array[m + 2] = array[m] + array[m + 1];
				}
			}
			result = array;
			
			// Do not modify this return statement. 
			return result;
		}

		/* Determine whether or not an integer array ia contains
		 * the first ia.length elements in a Fibonacci sequence.
		 * Remember that ia.length >= 0
		 */
		public static boolean isFibSeq(int[] ia) {
			boolean result = false;
			/* Your task is to implement this method,
			 * so that running UtilitiesTester.java will output the expected value to console.
			 * 
			 * Do not write any System.out.print(...) or System.out.println(...).
			 * Do not declare any Scanner. 
			 * Do not re-assign any of the parameter/input variables. 
			 */

			/* Your code starts after this line: */ 
			
			if (ia.length == 1) {
				if(ia[0] == 1) {
					result = true;
				}
				else {
					result = false;
				}
			}
			else if (ia.length == 2) {
				if(ia[0] == 1 && ia[1] == 1) {
					result = true;
				}
				else {
					result = false;
				}
			}
			else if (ia.length > 2) {
				for (int m = 0; m < ia.length - 2; m ++) {
					ia[0] = 1;
					ia[1] = 1;
					if (ia[m + 2] != (ia[m] + ia[m + 1])) {
						result = false;
						m = ia.length - 2;
					}
					else {
						result = true;
					}
				}
			}
			// Do not modify this return statement.
			return result;
		}

		/*
		 * Count the number of occurrences of string s in string array sa.
		 */
		public static int numberOfOccurrences(String[] sa, String s) {
			int result = -1;
			/* Your task is to implement this method,
			 * so that running UtilitiesTester.java will output the expected value to console.
			 * 
			 * Do not write any System.out.print(...) or System.out.println(...).
			 * Do not declare any Scanner. 
			 * Do not re-assign any of the parameter/input variables. 
			 */

			/* Your code starts after this line: */ 
			int count = 0;
			for (int i = 0; i < sa.length; i ++) {
				if (sa[i].equals(s)) {
					count ++;
				}
			}
			result = count;
			// Do not modify this return statement.
			return result;
		}

		/* Return an array storing the indices of string s in string array sa.
		 * If s does not occur in sa, then the returned array should be EMPTY.
		 * Length of the returned array should correspond to the number of times
		 * string s occurs in string array sa.
		 */
		public static int[] getIndices(String[] sa, String s) {
			int[] result = null;
			/* Your task is to implement this method,
			 * so that running UtilitiesTester.java will output the expected value to console.
			 * 
			 * Do not write any System.out.print(...) or System.out.println(...).
			 * Do not declare any Scanner. 
			 * Do not re-assign any of the parameter/input variables. 
			 */

			/* Your code starts after this line: */ 
			
			int count = 0;
			for (int i = 0; i < sa.length; i ++) {
				if (sa[i].equals(s)) {
					count ++;
				}
			}
			
			int[] array = new int[count];

			int m = 0;
			int backupCount = count;
			for (int i = 0; i < sa.length; i ++) {
				int backup = m;
				if (sa[i].equals(s)) {
					m = backup;
					count = backupCount;
					for (; m < count; m ++) {
						array[m] = i;
						count = 0;
					}
				}
			}
			result = array;
			
			// Do not modify this return statement.
			return result;
		}
		
		// Study Groups Questions
		
		/*
		    * Check if an integer inputted is a palindrome
		    * if n is a palindrome, n is the same read forwards as backwards
		    * e.g., 123 is not a palindrome because 123 != 321
		    * however 123321 is a palindrome because 123321 == 123321
		    * if n is palindrome, return true, else return false
		    * it can be assumed that n > 0
		    */
		public static boolean isPalindrome(int n) {
		    boolean result = false;
		    
		    int reverse = 0;
		    int update = n;
		    
		    for(int i = 0; update >= 10; i ++) {
		    	if (i == 0) {
		    		int temp = 0;
		    		temp = temp % 10;
		    		reverse += 10 ^ (i + 2);
		    	}
		    	else {
		    		int temp = 0;
		    		update = update / 10;
		    		temp = update % 10; 
		    	}
		    }
		    
		    return result;
		}

		/*
		    *Sort a given integer array from least to greatest
		    *return the sorted array
		    *it can be assumed that arr.length > 0
		    */
		public static int[] getSorted(int[] arr) {
		    int[] result = null;
		    
		    if (arr.length == 2) {
		    	int keep = 0;
		    	keep = arr[0];
		    	arr[0] = arr[1];
		    	arr[0] = keep;
		    }
		    else {
		    int backup = 0;
		    for (int i = 0; i < arr.length - 1; i ++) {
		    	for (int m = 0; m < arr.length - 1; m ++ ) {
		    		if (arr[m] <= arr[m + 1]) {
		    			
		    		}
		    		else {
		    			backup = arr[m];
		    			arr[m] = arr[m + 1];
		    			arr[m + 1] = backup;
		    		}
		    	}
		    }
		    }
		    result = arr;
		    
		    return result;
		}
		/*
			    * Sort a given integer array from least to greatest AND remove any duplicates
			    * return the sorted array WHICH DOES NOT HAVE DUPLICATES
			    * it can be assumed that arr.length > 0
			    */
		public static int[] removeDuplicates(int[] arr) {
		     int[] result = null;
		     return result;
		}

		/*
		    * Given an integer array, find the integers from 1 to a given integer n
		    * (inclusively) which are not included in the integer array.
		    * return an integer array that contains the missing integers.
		    */
		public static int[] findMissing(int[] arr, int n) {
		    int[] result = null;
		    return result;
		}
		
		
		// tests related to getIndices
		
		public static int[] getIndices(int[] seq, int[] indices) {
			int[] result = null;
			
			int count = 0;
			for (int i = 0; i < indices.length; i ++) {
				if (0 <= indices[i] && indices[i] < seq.length) {
					count++;
				}
			}
			
			int[] array = new int[count];
			int backup = count;
			for (int i = 0; i < indices.length; i ++) {
				int m = 0;
				if (0 <= indices[i] && indices[i] < seq.length) {
					m = count;
					for(; m < array.length; m ++ ) {
						array[m] = seq[indices[i]];
						m = array.length;
					}
				}
			}
			result = array;
			
			return result;
		}
		
}


