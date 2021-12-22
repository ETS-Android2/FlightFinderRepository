package model;

public class Utilities {
	/* 
	 * 	Requirements:
	 * 	- It is strictly forbidden for you to use: 
	 * 		+ Any Java library class (e.g., ArrayList, Arrays)
	 * 		  (That is, there must not be an import statement in the beginning of this class.)
	 * 	- You will receive an immediate zero for this task if the requirement is violated. 
	 * 	- You can define helper methods if you wish.
	 * 
	 * Only write lines of code within the methods given to you. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests  
	 */
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: an array of integers
	 *	- `indices`: an array of integers (each of which may or may not be a valid index for `seq`) 
	 *
	 * Assumptions:
	 * 	- `seq` may be empty.
	 * 	- `indices` may be empty. 
	 * 	- `indices` may contain duplicates.
	 *  
	 * What to return?
	 *  - For each integer value in `indices`, if it is a valid index for input array `seq`, 
	 *  	then use it to index into `seq` and include the result in the output array.
	 *  
	 *  For example: Say `seq` is {23, 46, 69} and `indices` is {2, -1, 0, 3, 0, 2}
	 *  	(where indices -1 and 3 are invalid, so only indices 2, 0, 0, 2 are used)
	 *   	Then the method should return {69, 23, 23, 69} 
	 *   
	 *  Note: Order of elements in the output array corresponds to the order in which
	 *  		valid indices in the `indices` array are arranged. 
	 *  
	 *  That is, the output array may be empty if the input array `seq` is empty,
	 *  	or if the input array `indices` does not contain any valid indices.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task1(int[] seq, int[] indices) {
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
		
		int count = 0;
		for (int i = 0; i < indices.length; i ++) {
			if (0 <= indices[i] && indices[i] < seq.length) {
				count++;
			}
		}
		
		int[] array = new int[count];
		int m = 0;
		boolean stay = true;
		for (int i = 0; i < indices.length; i ++) {
			if (0 <= indices[i] && indices[i] < seq.length) {
				stay = true;
				for(; stay && m < array.length; m ++ ) {
					array[m] = seq[indices[i]];
					stay = false;
				}
			}
		}
		result = array;
		
		

		// Do not modify this return statement. 
		return result;
    }

	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  - Return an array that represents an encoding of `seq`, by adopting the following principle:
	 *  	Element at each odd index (e.g., at index 1, at index 3, and so on) of the return array specifies 
	 *  		how many times the element at the previous even index (e.g., at index 0, at index 2, and so on) repeats 
	 *  		in the input array `seq`.
	 *  	
	 *  	For example, {2, 4, 1, 3} encodes that value 2 (at even index 0) should repeat 4 times (as specified at odd index 1), 
	 *  		and similarly, value 1 should repeat 3 times. 
	 *  		
	 *  		Say `seq` is {2, 2, 2, 2, 1, 1, 1}.
	 *  		Then the method should return an encoded array {2, 4, 1, 3}.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task2(int[] seq) {
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
        int count = 0;
        int k = 0;
        
		for (int i = 0; i < seq.length - 1; i ++) {
			if (seq[i] != seq[i+1]) {
				count ++;
			}
		}
		
		
		int[] array = new int[2* (count+1)];
		
		int backup = 0;
		int repeat = 0;
		for (int i = 0; i < seq.length; i ++ ) {
			boolean stay = true;
			boolean stayM = true;
			boolean stayI = true;
			int currentNum = seq[i];
			
			
			if (i > 0 && backup != currentNum) {
				for (int m = 0; stayM && m < seq.length; m ++) {
					if (currentNum == seq[m]) {
						repeat ++;
					}
					else if (currentNum != seq[m]) {
						backup = seq[m];
					}
				}
			}
			else if (i == 0) {
				for (int m = 0; stayI && m < seq.length; m ++) {
					if (currentNum == seq[m]) {
						repeat ++;
						backup = currentNum;
					}
					
				}
			}
			else {
				stay = false;
			}
			
			for (; stay && k < array.length / 2; k ++) {
				array[2 * k] = currentNum;
				array[2 * k + 1] = repeat;
				stay = false;
			}
			repeat = 0;
		}
		result = array;
			
        

		// Do not modify this return statement. 
        return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  -  Return another array of strings, each of which denoting a non-empty suffix of the input array.
	 *     
	 *     A suffix of array `seq` contains its last n elements (where 1 <= n <= seq.length). 
	 *     
	 *  	For example, if the input array is:
	 *   
	 *  		<3, 1, 4>
	 *  
	 *  	Then the output or returned array of string values is:
	 *  		
	 *  		<"[3, 1, 4]", "[1, 4]", "[4]">
	 *  	
	 *  	where each suffix is structured as a comma-separated list surrounded by square brackets.	
	 *  
	 *  	Note that the length of the output array is equal to the length of the input array. 
	 *  	
	 *  	Also, elements in the output array are ``sorted'' by the lengths of the suffixes. 
	 *  		(e.g,. the last element is the suffix of length 1, the second last element is the suffix of length 2).
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static String[] task3(int[] seq) {
		String[] result = null;
		
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
		
		String startSequence = "[";
		
		
		int k = 0;
		String[] finalArray = new String[seq.length];
		
		for (int i = 0; i < finalArray.length; i ++) {
			if (i > 0) {
			startSequence = "[";
			}
			k = i;
			for (; k < seq.length; k ++) {
				if (k < seq.length - 1) {
				startSequence += seq[k] + ", ";
				}
				else {
					startSequence += seq[k];
				}
			}
			finalArray[i] = startSequence;
			finalArray[i] += "]";
				
		}
		result = finalArray;

		// Do not modify this return statement. 
        return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `sa`: an array of strings
	 *
	 * Assumptions:
	 * 	- Input array `sa` is non-empty and contains at least one elements.
	 * 	– The string value that appears the most frequently is unique.
	 *  
	 * What to return?
	 *  - Return the string value that appears the most frequently, 
	 *  	i.e., appear for the highest number of times.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static String task4(String[] sa) {
    	String result = null;
		
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
		
		String letter = "";
		String most = "";
		int count = 0;
		int max = 0;
		boolean stay = true;
		
		
		if (sa.length == 1) {
			most = sa[0];
			result = most;
		}
		else if (sa.length == 2) {
			if (sa[0] == sa[1]) {
				most = sa[0];
				result = most;
			}
			else if (sa[0] != sa[1]) {
				most = "";
				result = most;
			}
		}
		
		else if (sa.length > 2) {
			for (int i = 0; i < sa.length; i ++ ) {
				letter = sa[i];
				for (int m = 0; stay && m < sa.length; m ++) {
					if (letter.equals(sa[m])) {
						count ++;
						if (count > max) {
							max = count;
							most = sa[i];
							
						}
					}
				}
				count = 0;
			}
			result = most;
		}
    	

		// Do not modify this return statement. 
        return result;
    }	 
}

