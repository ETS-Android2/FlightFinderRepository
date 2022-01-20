//package model;
//
//import static org.junit.Assert.assertEquals;
//
//public class Utilities {
//	/*
//	 * Input parameters:
//	 * 	- `lower` is the lower bound
//	 *  - `upper` is the upper bound
//	 *  
//	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
//	 * Violation of this will result in a 50% penalty on your marks.
//	 * Try to solve this problem using loops only.   
//	 *  
//	 * Refer to you lab instructions for what the method should return. 
//	 */
//	public static String getNumbers(int lower, int upper) {
//		String result = "";
//		
//		/* Your implementation of this method starts here. 
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.   
//		 */
//		
//		
//		/* Your implementation ends here. */
//		int updatedLower = lower;
//		int i = 0;
//		String seq = "<";
//		String finalSeq = "";
//		
//		while (updatedLower <= upper) {
//			if (updatedLower % 3 == 0) {
//				String singleNum = "(" + updatedLower + ")";
//				if (updatedLower < upper) {
//					seq += singleNum + ", ";
//				}
//			}
//			else if (updatedLower % 3 == 1) {
//				String singleNum = "[" + updatedLower + "]";
//				if (updatedLower < upper) {
//					seq += singleNum + ", ";
//				}
//			}
//			else if (updatedLower % 3 == 2) {
//				String singleNum = "{" + updatedLower + "}";
//				if (updatedLower < upper) {
//					seq += singleNum + ", ";
//				}
//			}
//			i++;
//		}
//		
//		if (lower < 0 && upper < 0) {
//			finalSeq = "Error: both bounds must be non-negative";
//		}
//		if (lower > upper) {
//			finalSeq = "Error: lower bound " + lower + " is not less than or equal to upper bound " + upper;
//		}
//		
//		if ((lower < 0 && upper < 0) && (lower > upper)) {
//			finalSeq = "Error: both bounds must be non-negative";
//		}
//		
//		if (i > 1) {
//			finalSeq = i + " numbers between " + lower + " and " + upper + ": " + seq;
//		}
//		else {
//			finalSeq = i + " number between " + lower + " and " + upper + ": " + seq;
//		}
//		
//		
//		result = finalSeq;
//		
//			
//			
//		return result;
//	}
//	
//	
//	/*
//	 * Input parameters:
//	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
//	 * 
//	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
//	 * Violation of this will result in a 50% penalty on your marks.
//	 * Try to solve this problem using loops only. 
//	 *  
//	 * Refer to you lab instructions for what the method should return. 
//	 */
//	
//	public static String getIntermediateStats(int ft, int d, int n) {
//		String result = "";
//		
//		/* Your implementation of this method starts here. 
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.   
//		 */
//		
//													
//		
//		return result;
//	}
//	
//	/*
//	 * Input parameters:
//	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
//	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
//	 *  
//	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
//	 * Violation of this will result in a 50% penalty on your marks.
//	 * Try to solve this problem using loops only.  
//	 *  
//	 * Refer to you lab instructions for what the method should return. 
//	 */
//	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
//		String result = "";
//		
//		/* Your implementation of this method starts here. 
//		 * Recall from Week 1's tutorial videos:
//		 * 1. No System.out.println statements should appear here.
//		 * 	  Instead, an explicit, final `return` statement is placed for you.
//		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
//		 *    Instead, refer to the input parameters of this method.    
//		 */
//		
//		
//		
//		
//		return result;
//	}
//	
//}
