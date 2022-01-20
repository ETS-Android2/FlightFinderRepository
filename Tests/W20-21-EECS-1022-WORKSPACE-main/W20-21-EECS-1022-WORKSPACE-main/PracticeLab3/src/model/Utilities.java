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
		/* Your implementation ends here. */
		
		int updatedLower = lower;
		int i = 0;
		String seq = "<";
		String finalSeq = "";
		
		if (updatedLower < 0 || upper < 0) {
			finalSeq = "Error: both bounds must be non-negative";
			result = finalSeq;
		}
		else if (updatedLower > upper) {
			finalSeq = "Error: lower bound " + lower + " is not less than or equal to upper bound " + upper;
			result = finalSeq;
		}
		else if (updatedLower < (upper + 1)) {
			while (updatedLower < (upper + 1)) {
				if((updatedLower  % 3) == 0) {
					String singleNum = "(" + updatedLower + ")";
					if (updatedLower < upper) {
						seq += singleNum + ", ";
					}
					else if (updatedLower == upper) {
						seq += singleNum;
					}
				}
				else if((updatedLower % 3) == 1) {
					String singleNum = "[" + updatedLower + "]";
					if (updatedLower < upper) {
						seq += singleNum + ", ";
					}
					else if (updatedLower == upper) {
						seq += singleNum;
					}
				}
				else if((updatedLower % 3) == 2) {
					String singleNum = "{" + updatedLower + "}";
					if (updatedLower < upper) {
						seq += singleNum + ", ";
					}
					else if (updatedLower == upper) {
						seq += singleNum;
					}
				}
				updatedLower ++;
				i++;
			}
			if (i > 1) {
				finalSeq = (i) + " numbers between " + lower + " and " + upper + ": " + seq;
				result = finalSeq + ">";
			}
			else {
				finalSeq = (i) + " number between " + lower + " and " + upper + ": " + seq;
				result = finalSeq + ">";
			}
		}
		else if (updatedLower == upper) {
			if((updatedLower  % 3) == 0) {
				String singleNum = "(" + updatedLower + ")";
				seq += singleNum;
			}
			else if((updatedLower % 3) == 1) {
				String singleNum = "[" + updatedLower + "]";
				seq += singleNum;
			}
			else if((updatedLower % 3) == 2) {
				String singleNum = "{" + updatedLower + "}";
				seq += singleNum;
			}
			finalSeq = (i + 1) + " number between " + lower + " and " + upper + ": " + seq;
			result = finalSeq + ">";
		}
		
		
	
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
		String seq = "<";
		String stats = "{";
		String eachStat = "";
		int sum = 0;
		double avg = 0;
		int i = 1;
	
									// stats += "[sum of " + seq + ": " + sum + " ; avg of " + seq + ": " + (avg / i) + "]";
		
		while (i <= n) {
			sum += updatedft;
			seq += updatedft;
			avg = (double)sum/i;
			String avgS = String.format("%.2f", avg);
			
			eachStat = "[sum of " + seq + ">: " + sum + " ; avg of " + seq + ">: " + (avgS) + "]";
			if (i < n) {
				seq += ", ";
			}
			if (i < n) {
				stats += eachStat + ", ";
			}
			else {
				stats += eachStat;
			}
			updatedft += d;
			i++;
		}
		stats += "}";
		result = stats;
		
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
		
		String seq = "<";
		int newft1 = ft1;
		int newft2 = ft2;
		
		boolean continue1 = true;
		boolean continue2 = true;
		boolean make = true;
		
		
		int i = 1;
		if (n1 == n2) {
			if (n1 > 0 && n2 > 0) {
			while(make) {
				while(continue1) {
					seq +=  "(" + newft1 + "), ";
					newft1 += d1;
					continue1 = false;
					continue2 = true;
				}
				while(continue2) {
					if (i < n2) { 
						seq += "[" + newft2 + "], ";
					}
					else if (i == n2) { 
						seq += "[" + newft2 + "]";
					}
					newft2 += d2;
					continue2 = false;
					continue1 = true;
					}
				i++;
				if (i > n1 &&  i > n2) {
					make = false;
				}
				}
			}
			seq += ">";
				}
		
			
		else if (n1 > n2) {
			while(make) {
				while(continue1) {
					if (i < n1) { 
						seq +=  "(" + newft1 + "), ";
					}
					else if (i == n1) { 
						seq += "(" + newft1 + ")";
					}
					newft1 += d1;
					continue1 = false;
					if (i <= n2) {
					continue2 = true;
					}
					else {
						continue2 = false;
					}
				}
				while(continue2) { 
					seq += "[" + newft2 + "], ";
					newft2 += d2;
					continue2 = false;
					if (i <= n1) {
					continue1 = true;
					}
					else {
						continue1 = false;
				}
		}
				i++;
				if (i > n1 &&  i > n2) {
					make = false;
				}
	}
		}
		seq += ">";
		result = seq;
		return result;
	}
}
	

