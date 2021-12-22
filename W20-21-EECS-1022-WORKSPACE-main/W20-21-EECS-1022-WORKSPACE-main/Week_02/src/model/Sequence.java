package model;

public class Sequence {
	/*
	 * First version of method called by SequenceApp1
	 */
	
	public static String getSequence1(int ft, int d) {
		int term1 = ft;
		int term2 = ft + d; //Or// term1 + d
		int term3 = ft + 2 * d; // term2 + d
		int term4 = ft + 3 * d; // term3 + d
		int term5 = ft + 4 * d; // term4 + d
		
		String seq = "<" + term1 + ", " + term2 + ", " + term3 + ", "+ term4 + ", "+ term5 + ">";
		
		return seq;
	}
	
	public static int getSum1(int ft, int d ) {
		int term1 = ft;
		int term2 = ft + d; //Or// term1 + d
		int term3 = ft + 2 * d; // term2 + d
		int term4 = ft + 3 * d; // term3 +  d
		int term5 = ft + 4 * d; // term4 + d
		
		int sum = term1 + term2 + term3 + term4 + term5;
				
		return sum;	
	}
	
	/*
	 * Second version of method called by SequenceApp2
	 */
	public static String getSequence2(int ft, int d) {
		String seq = "<" + ft + ", " + (ft + d) + ", " + (ft + 2 * d) + ", "+ (ft + 3 * d) + ", "+ (ft + 4 * d) + ">";
				
		return seq;
		
	}
	
	public static int getSum2(int ft, int d ) {
		int sum = 5 * ft + (1 + 2 + 3 + 4) * d;
		
		return sum;
	}
}