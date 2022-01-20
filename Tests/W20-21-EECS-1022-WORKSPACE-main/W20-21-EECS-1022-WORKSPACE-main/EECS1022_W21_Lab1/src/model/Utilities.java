package model;

public class Utilities {
	
	/*
	 * Assumption: the return geometric sequence is of a fixed size 5. 
	 * Therefore, it is not necessary to solve this problem using a loop,
	 * or to use methods from a library class (e.g., Math).\
	 * 
	 * Input parameters:
	 * 	- `ft` is the first term in the sequence
	 *  - `ratio` is the common rations among terms in the sequence
	 *  
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getGeometricSequence(int ft, int ratio) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int term1 = ft;
		int term2 = ft * ratio;
		int term3 = term2 * ratio;
		int term4 = term3 * ratio;
		int term5 = term4 * ratio;
		
		String seq = "[" + term1 + "]" + "[" + term2 + "]" + "[" + term3 + "]" + "[" + term4 + "]" + "[" + term5 + "]";
		double average = (term1 + term2 + term3 + term4 + term5)/ (double)5;
		String finalOutcome = seq + " has average " + average;
		result = finalOutcome;
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 *   - `weight` is the user's weight in pounds
	 *   - `height` is the user's height in inches
	 *   
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static double getBMI(double weight, double height) {
		double result = 0.0;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double weightInch = weight * 0.4536;
		double heightInch = height * 0.0254;
		
		double bmi = weightInch / (heightInch * heightInch);
		result = bmi;
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Assumption: input value `seconds` is non-negative (i.e., >= 0).
	 * 
	 * Input parameters:
	 *   - `seconds` is the number of seconds to be converted
	 *   
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getTimeConversion(int seconds) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int days = seconds / (24 * 60 * 60);
		int hours = (seconds / (60 * 60)) - (days * 24);
		int minutes = ((seconds / 60) - (days * 24 * 60)) % 60;
		int secondsR = ((seconds) - (minutes * 60)) % (60 * 60);
		result = days + " days " + hours + " hours " + minutes + " minutes " + secondsR + " seconds";
		
		/* Your implementation ends here. */
		
		return result;
	}
}
