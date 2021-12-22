package model;

import javax.security.auth.x500.X500Principal;


/*
 * Input parameters:
 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
 *  - `income` is the tax payer's income (an integer value)
 *  
 * Assumptions:
 * 	- `income` passed by user is always positive (> 0)
 *  
 * Refer to you lab instructions for what the method should return.
 * 
 * See this short tutorial video illustrating how to compute tax:
 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
 */
// Task 1
public class Utilities {
	/* Your implementation of this method starts here. 
	 * Recall from Week 1's tutorial videos:
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, an explicit, final `return` statement is placed for you.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
	
	public static String getTaxReport(int status, int income) {
		String result = "";
		
		double part1 = 0;
		double part2 = 0; 
		double part3 = 0;
		double sum = 0;
		
		// case of Single Filing;
		if (status == 1) {
			// Splitted into three parts 
			if (income > 33950) { 
				
				part1 = (8350 * 0.10);
				String part1s = String.format("%.2f", part1);  // Usage of formating to have two decimal places.
				
				part2 = ((33950 - 8350) * 0.15);
				String part2s = String.format("%.2f", part2);
				
				part3 = ((income - 33950) * 0.25);
				String part3s = String.format("%.2f", part3);
				
				sum = part1 + part2 + part3;
				String sumS = String.format("%.2f", sum);
				
				result = "Single Filing: $" + sumS + " (Part I: $" + part1s + ", Part II: $" + part2s + ", Part III: $" + part3s + ")";
			}
			
			// Splitted into two parts
			else if ((income > 8350) && (income <= 33950)) {
				part1 = 8350 * 0.10;
				String part1s = String.format("%.2f", part1);
				
				part2 = ((income - 8350) * 0.15);
				String part2s = String.format("%.2f", part2);
				
				sum = part1 + part2;
				String sumS = String.format("%.2f", sum);
				
				result = "Single Filing: $" + sumS + " (Part I: $" + part1s + ", Part II: $" + part2s + ")";
				
			}
			
			// Splitted into one part
			else if (income <= 8350) {
				part1 = (income * 0.10);
				String part1s = String.format("%.2f", part1);
				
				sum = part1;
				String sumS = String.format("%.2f", sum);
				
				result = "Single Filing: $" + sumS + " (Part I: $" + part1s + ")";
			}	
		}
		
		// case of Married filing 
		else if (status == 2) {
			// Splitting into three parts
			if (income > 67900) { 
				part1 = (16700 * 0.10);
				String part1s = String.format("%.2f", part1);
				
				part2 = ((67900 - 16700) * 0.15);
				String part2s = String.format("%.2f", part2);
				
				part3 = ((income - 67900) * 0.25);
				String part3s = String.format("%.2f", part3);
				
				sum = part1 + part2 + part3;
				String sumS = String.format("%.2f", sum);
				
				result = "Married Filing: $" + sumS + " (Part I: $" + part1s + ", Part II: $" + part2s + ", Part III: $" + part3s + ")";
			}
			
			// Splitted into two parts
			else if ((income > 16700) && (income <= 67900)) {
				part1 = 16700 * 0.10;
				String part1s = String.format("%.2f", part1);
				
				part2 = ((income - 16700) * 0.15);
				String part2s = String.format("%.2f", part2);
				
				sum = part1 + part2;
				String sumS = String.format("%.2f", sum);
				
				result = "Married Filing: $" + sumS + " (Part I: $" + part1s + ", Part II: $" + part2s + ")";
			}
			
			// Splitted into one part
			else if (income <= 16700) {
				part1 = (income * 0.10);
				String part1s = String.format("%.2f", part1);
				
				sum = part1;
				String sumS = String.format("%.2f", sum);
				
				result = "Married Filing: $" + sumS + " (Part I: $" + part1s + ")";
			}
		}
		else {
			result = "Illegal Status: " + status;
		}
		
		return result;
		/* Your implementation ends here. */
	}
	
	/*
	 * Input parameters:
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
	 */
	// Task 2
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		String result = "";
		boolean p1WonR1 = true;
		boolean p2WonR1 = true;
		boolean tieR1 = !p1WonR1 && !p2WonR1;  // --> False at the moment 
		
		//Round 1
		if (((p1r1 == 'R') && (p2r1 == 'R')) || ((p1r1 == 'P') && (p2r1 == 'P')) || ((p1r1 == 'S') && (p2r1 == 'S'))  ) {
			tieR1 = !tieR1;
			p1WonR1 = !p1WonR1;  //  Making others false helps in the case of not executing their if-statements.
			p2WonR1 = !p2WonR1;
		}
		else if ((p1r1 == 'R') && (p2r1 == 'P')) {
			p2WonR1 = p2WonR1;
			p1WonR1 = !p1WonR1;
		}
		else if ((p1r1 == 'R') && (p2r1 == 'S')) {
			p1WonR1 = p1WonR1;
			p2WonR1 = !p2WonR1;
		}
		else if ((p1r1 == 'P') && (p2r1 == 'R')) {
			p1WonR1 = p1WonR1;
			p2WonR1 = !p2WonR1;
		}
		else if ((p1r1 == 'P') && (p2r1 == 'S')) {
			p2WonR1 = p2WonR1;
			p1WonR1 = !p1WonR1;
		}
		else if ((p1r1 == 'S') && (p2r1 == 'R')) {
			p1WonR1 = p2WonR1;	
			p1WonR1 = !p1WonR1;
		}
		else if ((p1r1 == 'S') && (p2r1 == 'P')) {
			p1WonR1 = p1WonR1;
			p2WonR1 = !p2WonR1;
		}

		// Round 2
		boolean p1WonR2 = true;
		boolean p2WonR2 = true;
		boolean tieR2 = !p1WonR2 && !p2WonR2; 
		
		if (((p1r2 == 'R') && (p2r2 == 'R')) || ((p1r2 == 'P') && (p2r2 == 'P')) || ((p1r2 == 'S') && (p2r2 == 'S'))  ) {
			tieR2 = !tieR2;
			p1WonR2 = !p1WonR2;
			p2WonR2 = !p2WonR2;
		}
		else if ((p1r2 == 'R') && (p2r2 == 'P')) {
			p2WonR2 = p2WonR2;
			p1WonR2 = !p1WonR2;
		}
		else if ((p1r2 == 'R') && (p2r2 == 'S')) {
			p1WonR2 = p1WonR2;
			p2WonR2 = !p2WonR2;
		}
		else if ((p1r2 == 'P') && (p2r2 == 'R')) {
			p1WonR2 = p1WonR2;
			p2WonR2 = !p2WonR2;
		}
		else if ((p1r2 == 'P') && (p2r2 == 'S')) {
			p2WonR2 = p2WonR2;
			p1WonR2 = !p1WonR2;
		}
		else if ((p1r2 == 'S') && (p2r2 == 'R')) {
			p2WonR2 = p2WonR2;
			p1WonR2 = !p1WonR2;
		}
		else if ((p1r2 == 'S') && (p2r2 == 'P')) {
			p1WonR2 = p1WonR2;
			p2WonR2 = !p2WonR2;
		}
	
		// Winning case for p1
		if (p1WonR1 && p1WonR2) {
			result = "Game over: " + p1 + " wins! [Round 1: " + p1 + " wins (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: " + p1 + " wins (" + p1r2 + " vs. " + p2r2 + ")]" ;
		}
		else if (p1WonR1 && tieR2) {
			result = "Game over: " + p1 + " wins! [Round 1: " + p1 + " wins (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: Tie (" + p1r2 + " vs. " + p2r2 + ")]";
		}
		else if (tieR1 && p1WonR2) {
			result = "Game over: " + p1 + " wins! [Round 1: Tie (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: " + p1 + " wins (" + p1r2 + " vs. " + p2r2 + ")]";
		}
		
		//Winning case for p2
		else if (p2WonR1 && p2WonR2) {
			result = "Game over: " + p2 + " wins! [Round 1: " + p2 + " wins (" + p2r1 + " vs. " + p1r1 + ") ; Round 2: " + p2 + " wins (" + p2r2 + " vs. " + p1r2 + ")]";
		}
		else if (p2WonR1 && tieR2) {
			result = "Game over: " + p2 + " wins! [Round 1: " + p2 + " wins (" + p2r1 + " vs. " + p1r1 + ") ; Round 2: Tie (" + p1r2 + " vs. " + p2r2 + ")]";
		}
		else if (tieR1 && p2WonR2) {
			result = "Game over: " + p2 + " wins! [Round 1: Tie (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: " + p2 + " wins (" + p2r2 + " vs. " + p1r2 + ")]";
		}
		
		//Tie
		else if (tieR1 && tieR2) {
			result = "Game over: Tie! [Round 1: Tie (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: Tie (" + p1r2 + " vs. " + p2r2 + ")]";
		}
		else if (p1WonR1 && p2WonR2) {
			result = "Game over: Tie! [Round 1: " + p1 + " wins (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: " + p2 + " wins (" + p2r2 + " vs. " + p1r2 + ")]";
		}
		else if (p2WonR1 && p1WonR2) {
			result = "Game over: Tie! [Round 1: " + p2 + " wins (" + p2r1 + " vs. " + p1r1 + ") ; Round 2: " + p1 + " wins (" + p1r2 + " vs. " + p2r2 + ")]";
		}
		/* Your implementation ends here. */
		return result;
	}
}
