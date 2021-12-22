package model;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {     /* VERSION 1*/
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int count = 0;
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] % 3 == 0) {
				count ++;
			}
		}
		
		int[] array = new int[count];
		
		int m = 0;
		int backup = count;
		
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] % 3 == 0) {
				count = backup;
				for (; m < count; m ++) {
					array[m] = numbers[i];
					count = 0;
				}
			}
		}
		result = array;
		
		/* Your implementation ends here. */
		
		return result;
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int count = 0;
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] != n) {
				count ++;
			}
		}
		
		int[] array = new int[count];
		
		int m = 0;
		int backup = count;
		
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] != n) {
				count = backup;
				for (; m < count; m ++) {
					array[m] = numbers[i];
					count = 0;
				}
			}
		}
		result = array;
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		String[] array = new String[numbers.length];
		String seq = "[";
		String backup = "";
		
		for (int i = 0; i < array.length; i ++) {
			if (i > 0) {
			array[i] = backup + ", " + numbers[i];
			backup = array[i];
			}
			else if (i == 0) {
				array[i] = seq + numbers[i];
				backup = array[i];
			}
			
			array[i] += "]";
		}
		result = array;
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		int[] array = new int[numbers.length];
		boolean stay = true;
		int m = 0;
		
		for (int i = 0; i < numbers.length; i ++ ) {
			if (numbers[i] % 3 == 0) {
				stay = true;
				for (;stay && m < array.length; m ++) {
					array[m] = numbers[i];
					stay = false;
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i ++ ) {
			if (numbers[i] % 3 == 1) {
				stay = true;
				for (;stay && m < array.length; m ++) {
					array[m] = numbers[i];
					stay = false;	
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i ++ ) {
			if (numbers[i] % 3 == 2) {
				stay = true;
				for (;stay && m < array.length; m ++) {
					array[m] = numbers[i];
					stay = false;	
				}
			}
		}
		result = array;

		/* Your implementation ends here. */
		
		return result;
	}


					/* VERSION 2*/
//		public static int[] getMultiplesOf3(int[] numbers) {
//			int[] result = null;
//			
//			/* Your implementation of this method starts here. 
//			 * Recall from Week 1's tutorial videos:
//			 * 1. No System.out.println statements should appear here.
//			 * 	  Instead, an explicit, final `return` statement is placed for you.
//			 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//			 *    Instead, refer to the input parameters of this method.   
//			 */
//
//			int count = 0;                                       
//			for (int i = 0; i < numbers.length; i ++) {     // this for loop helps us find the length of the new array
//				if (numbers[i] % 3 == 0) {
//					count ++;
//				}
//			}
//			
//			int backup = count;  // used to keep the count number while assigning it to (count = 0), otherwise the count's real value will be lost and changed to 0.
//			int[] finalArray = new int[count];
//			int m = 0;
//			
//			for (int i = 0; i < numbers.length; i ++) {
//				if (numbers[i] % 3 == 0) {
//					count = backup;     // used to restore the count's original value
//					for (;m < count;) {
//						finalArray[m] = numbers[i];
//						count = 0;
//						m++;
//					}
//				}
//			}
//			result = finalArray;
//			/* Your implementation ends here. */
//			
//			return result;
//		}	
//		
//		/*
//		 * Input parameters:
//		 * 	- `numbers` : an array of integers
//		 * 	- `n`		: an integer (which may or may not exist in `numbers`)
//		 *  
//		 * Refer to you lab instructions for what the method should return. 
//		 */
//		public static int[] getFilteredSeq(int[] numbers, int n) {
//			int[] result = null;
//			
//			/* Your implementation of this method starts here. 
//			 * Recall from Week 1's tutorial videos:
//			 * 1. No System.out.println statements should appear here.
//			 * 	  Instead, an explicit, final `return` statement is placed for you.
//			 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//			 *    Instead, refer to the input parameters of this method.   
//			 */
//			int repeat = 0; 
//			
//			for (int i = 0; i < numbers.length; i ++) {
//				if (numbers[i] != n) {							 // this for loop helps us find the length of the new array
//					repeat ++;
//				}
//			}
//			
//			int backup = repeat;
//			int m = 0;
//			int[] finalArray = new int[repeat];
//			for (int i = 0; i < numbers.length; i ++) {
//				repeat = backup;			// used to make repeat true again
//				if (numbers[i] != n) {
//					for (; m < repeat;) {
//						finalArray[m] = numbers[i];
//						repeat = 0;      // We're making it false so we don't keep generating it, we will only generate it when *if (numbers[i] != n)* is true for the subsequent time.
//						m ++;
//					}
//				}
//			}
//			result = finalArray;
//			/* Your implementation ends here. */
//			
//			return result;
//		}
//		
//		/*
//		 * Input parameters:
//		 * 	- `numbers` : an array of integers
//		 * 
//		 * Assumptions:
//		 * 	- numbers.length >= 1
//		 *  
//		 * Refer to you lab instructions for what the method should return. 
//		 */
//		public static String[] getAllPrefixes(int[] numbers) {
//			String[] result = null;
//			
//			/* Your implementation of this method starts here. 
//			 * Recall from Week 1's tutorial videos:
//			 * 1. No System.out.println statements should appear here.
//			 * 	  Instead, an explicit, final `return` statement is placed for you.
//			 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//			 *    Instead, refer to the input parameters of this method.   
//			 */
//			String m = "[";
//			String[] outputArray = new String[numbers.length];
//			for (int i = 0; i < numbers.length; i ++) {
//				
//				if (0 < i && i < numbers.length) {
//					m += ", " + numbers[i];
//					outputArray[i] = m;
//				}
//				else if (i == 0) {
//					m += numbers[i];
//				outputArray[i] = m; 
//				}
//				outputArray[i] += "]";   // we're adding a *]* here not at *m* because we don't want each m to have ] at each iteration.
//			}
//			result = outputArray;
//			/* Your implementation ends here. */
//			
//			return result;
//		}
//		
//		/*
//		 * Input parameters:
//		 * 	- `numbers` : an array of integers
//		 *  
//		 * Refer to you lab instructions for what the method should return. 
//		 */
//		public static int[] getGroupedNumbers(int[] numbers) {
//			int[] result = null;
//			
//			/* Your implementation of this method starts here. 
//			 * Recall from Week 1's tutorial videos:
//			 * 1. No System.out.println statements should appear here.
//			 * 	  Instead, an explicit, final `return` statement is placed for you.
//			 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//			 *    Instead, refer to the input parameters of this method.   
//			 */
//			int[] finalArray = new int[numbers.length];
//			int m = 0;                                      // ***Initializing *m* at here is really important*** because its scope can cover all three loops and if we were to put m inside the the second loop we would have to start m from 0 again and we don't know where to start m again! should it be 0 or some other value.
//			for (int i = 0; i < numbers.length; i ++) {
//				if (numbers[i] % 3 == 0) {
//					boolean change = m < finalArray.length;
//					change = true;
//					for (; change;) { 
//						finalArray[m] = numbers[i];
//						change = false;
//						m ++;
//					}
//				}
//			}
//			for (int i = 0; i < numbers.length; i ++) {
//				if (numbers[i] % 3 == 1) {
//					boolean change = m < finalArray.length;
//					change = true;
//					for (; change;) {
//						finalArray[m] = numbers[i];  // because if the first loop value of *m* is already changed and at here m will continue from what it was left from the previous loop.
//						change = false;
//						m ++;
//					}
//				}
//			}
//			for (int i = 0; i < numbers.length; i ++) {
//				if (numbers[i] % 3 == 2) {
//					boolean change = m < finalArray.length;
//					change = true;
//					for (; change;) {
//						finalArray[m] = numbers[i];
//						change = false;
//						m ++;
//					}
//				}
//				
//			}
//			result = finalArray;
//			/* Your implementation ends here. */
//			
//			return result;
//		}
//	}
	
//	public static String[] getAllPrefixes(int[] numbers) {
//	String[] result = null;
	
	/* Your implementation of this method starts here. 
	 * Recall from Week 1's tutorial videos:
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, an explicit, final `return` statement is placed for you.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
	
	//		String[] array = new String[numbers.length];
	//		String seq = "[";
	//		String backup = "";
	//		int m = 0;
	//		for (int i = 0; i < array.length; i ++) {
	//			for ( ;m < array.length; m ++) {
	//				if (m < array.length -1) {
	//					seq += numbers[m] + ", ";
	//				}
	//				else if (m == array.length -1) {
	//					seq += numbers[m] + "]";
	//				}
	//			}
	//			int x = 1;
	//			m = x + i;
	//			
	//				array[i] = seq;
	//				seq = "[";
	//		}
	//		result = array;
	//		
	//		/* Your implementation ends here. */
	//		
	//		return result;
//}

}