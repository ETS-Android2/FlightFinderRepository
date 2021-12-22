package model;

import static org.junit.Assert.assertEquals;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `lower` is the lower bound
	 *  - `upper` is the upper bound
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.   
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getNumbers(int lower, int upper) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		int updatedTerm = lower;
		String sequence = "<";
		
		int i = 0;
		while(updatedTerm <= upper) {
			
			if ((updatedTerm % 3) == 0) {
				String termRoundP = "(" + updatedTerm + ")";
				sequence += termRoundP;
				if (updatedTerm < upper) {
					sequence += ", ";
				}
			}
			else if ((updatedTerm % 3) == 1) {
				String termSquareP = "[" + updatedTerm + "]";
				sequence += termSquareP;
				if (updatedTerm < upper) {
					sequence += ", ";
				}
			}
			else if ((updatedTerm % 3) == 2) {
				String termCurlyP = "{" + updatedTerm + "}";
				sequence += termCurlyP;
				if (updatedTerm < upper) {
					sequence += ", ";
				}
			}
			updatedTerm++;
			i ++;
		}
		
		sequence += ">";
		if (i > 1) {
		String newSequence = i + " numbers between " + lower + " and " + upper + ": " + sequence;
		result = newSequence;
		}
		else { // i <= 1, this is when we want numbers between a single number. e.g. <3>  -->  0 number between 1 and 1.
			String newSequence = i + " number between " + lower + " and " + upper + ": " + sequence;
			result = newSequence;
		}
		
		if ((lower < 0) || (upper < 0)) {
			String seq = "Error: both bounds must be non-negative";
			result = seq;
		}
		else if (lower > upper) {
			String seqC = "Error: lower bound " + lower + " is not less than or equal to upper bound " + upper;
			result = seqC;
		}
		/* Your implementation ends here. */
		
		return result;
	}
	
	
	/*
	 * Input parameters:
	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only. 
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
													
		int updatedft = ft;
		String seqAll = "{";
		int sumS = ft;
		double avg = 0;
		String seq = "";
		
		for(int i = 1; i <= n ;i++) {
			avg = sumS / (double)i;
			
			if ((i > 1) && (i <= n)) {
				seq += ", ";
				seq += updatedft;
			}
			else if (i == 1) {
				seq += "";
				seq += updatedft;
			}
			
			updatedft += d;
			
			String test = "[sum of <" + seq + ">: " + sumS + " ; avg of <" + seq + ">: " + String.format("%.2f", avg) + "]";
			
			sumS += updatedft;
			seqAll += test;
			
			if ((i >= 1) && (i < n)) {
				seqAll += ", ";
			}		
		}
		seqAll += "}";
		result = seqAll;
		
//		/* Your implementation ends here. */
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.  
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.    
		 */
		
		if (n1 == n2) {
			int newft1 = ft1;
			int newft2 = ft2;
			String seqAll = "<";
			
			for(int i = 1; i <= n1;) {
				boolean test1 = true;
				boolean test2 = true;
				
				while(test1) {			
					seqAll += "(" + newft1 + ")" + ", ";
					newft1 += d1;
					test1 = false;
				}
				while(test2) {		
					if (i == n1) {
						seqAll += "[" + newft2 + "]"; 
					}
					else {
						seqAll += "[" + newft2 + "]" + ", ";
					}
					newft2 += d2;
					test2 = false;
				}
				i++;
			}
			seqAll += ">";
			result = seqAll;
		}								
		else if (n1 > n2) {
			int newft1 = ft1;														
			int newft2 = ft2;
			String seqAll = "<";
			
			for(int i = 1; i <= n1;) {
				boolean test1 = true;
				boolean test2 = true;
				
				while(test1) {	
					if (i == n1) {
						seqAll += "(" + newft1 + ")";
					}
					else {
						seqAll += "(" + newft1 + ")" + ", ";
					}
					newft1 += d1;
					test1 = false;
				}														
												
				while(test2) {		
					if (i == n2) {
						seqAll += "[" + newft2 + "], "; 
					}
					else if (i > n2) {
						seqAll += "";
					}
					else {
						seqAll += "[" + newft2 + "]" + ", ";
					}
					newft2 += d2;
					test2 = false;
				}
				i++;
			}
			seqAll += ">";
			result = seqAll;
		}					
			
		
		else if (n1 < n2) {
			int newft1 = ft1;														
			int newft2 = ft2;
			String seqAll = "<";
			
			for(int i = 1; i <= n2;) {
				boolean test1 = true;
				boolean test2 = true;
				
				while(test1) {	
					if (i == n1) {
						seqAll += "(" + newft1 + "), ";
					}
					else if (i > n1) {
						seqAll += "";
					}
					else {
						seqAll += "(" + newft1 + ")" + ", ";
					}
					newft1 += d1;
					test1 = false;
				}															
				while(test2) {		
					if (i == n2) {
						seqAll += "[" + newft2 + "]"; 
					}
					else if (i > n2) {
						seqAll += "";
					}
					else {
						seqAll += "[" + newft2 + "]" + ", ";
					}
					newft2 += d2;
					test2 = false;
				}
				i++;
			}
			seqAll += ">";
			result = seqAll;
		}
		
		
		return result;
	}
	
}
