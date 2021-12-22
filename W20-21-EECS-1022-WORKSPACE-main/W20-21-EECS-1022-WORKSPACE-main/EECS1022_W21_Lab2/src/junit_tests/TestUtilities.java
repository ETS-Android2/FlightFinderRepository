package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {
	/*
	 * Tests related to Utilities.getRPSReport
	 */
	/* Case 1.1 */
	@Test
	public void testGetRPS_p1Win_p1Win() {
		String result = Utilities.getRPSGameReport("A", "B", 'R', 'S', 'R', 'S');
		assertEquals("Game over: A wins! [Round 1: A wins (R vs. S) ; Round 2: A wins (R vs. S)]", result);
	}
	/* Case 1.2 */
	@Test
	public void testGetRPS_p1Win_p1Lose() {
		String result = Utilities.getRPSGameReport("C", "D", 'P', 'R', 'R', 'P');
		assertEquals("Game over: Tie! [Round 1: C wins (P vs. R) ; Round 2: D wins (P vs. R)]", result);
	}
	/* Case 1.3 */
	@Test
	public void testGetRPS_p1Win_Tie() {
		String result = Utilities.getRPSGameReport("E", "F", 'S', 'P', 'R', 'R');
		assertEquals("Game over: E wins! [Round 1: E wins (S vs. P) ; Round 2: Tie (R vs. R)]", result);
	}
	/* Case 2.1 */
	@Test
	public void testGetRPS_p1Lose_p1Win() {
		String result = Utilities.getRPSGameReport("G", "H", 'R', 'P', 'P', 'R');
		assertEquals("Game over: Tie! [Round 1: H wins (P vs. R) ; Round 2: G wins (P vs. R)]", result);
	}
	/* Case 2.2 */
	@Test
	public void testGetRPS_p1Lose_p1Lose() {
		String result = Utilities.getRPSGameReport("I", "J", 'P', 'S', 'P', 'S');
		assertEquals("Game over: J wins! [Round 1: J wins (S vs. P) ; Round 2: J wins (S vs. P)]", result);
	}
	/* Case 2.3 */
	@Test
	public void testGetRPS_p1Lose_Tie() {
		String result = Utilities.getRPSGameReport("K", "L", 'S', 'R', 'P', 'P');
		assertEquals("Game over: L wins! [Round 1: L wins (R vs. S) ; Round 2: Tie (P vs. P)]", result);
	}
	/* Case 3.1 */
	@Test
	public void testGetRPS_Tie_p1Win() {
		String result = Utilities.getRPSGameReport("M", "N", 'R', 'R', 'S', 'P');
		assertEquals("Game over: M wins! [Round 1: Tie (R vs. R) ; Round 2: M wins (S vs. P)]", result);
	}
	/* Case 3.2 */
	@Test
	public void testGetRPS_Tie_p1Lose() {
		String result = Utilities.getRPSGameReport("W", "X", 'P', 'P', 'S', 'R');
		assertEquals("Game over: X wins! [Round 1: Tie (P vs. P) ; Round 2: X wins (R vs. S)]", result);
	}
	/* Case 3.3 */
	@Test
	public void testGetRPS_Tie_Tie() {
		String result = Utilities.getRPSGameReport("Y", "Z", 'S', 'S', 'S', 'S');
		assertEquals("Game over: Tie! [Round 1: Tie (S vs. S) ; Round 2: Tie (S vs. S)]", result);
	}
	
	/*
	 * Tests related to Utilities.getTaxReport
	 */
	@Test
	public void testGetTaxReport_invalid_01() {
		String result = Utilities.getTaxReport(3, 1000);
		assertEquals("Illegal Status: 3", result);
	}
	
	@Test
	public void testGetTaxReport_invalid_02() {
		String result = Utilities.getTaxReport(-1, 30000);
		assertEquals("Illegal Status: -1", result);
	}
	
	@Test
	public void testGetTaxReport_case_1_single() {
		String result = Utilities.getTaxReport(1, 6900);
		assertEquals("Single Filing: $690.00 (Part I: $690.00)", result);
	}
	
	@Test
	public void testGetTaxReport_case_1_married() {
		String result = Utilities.getTaxReport(2, 6900);
		assertEquals("Married Filing: $690.00 (Part I: $690.00)", result);
	}
	
	@Test
	public void testGetTaxReport_case_2_single() {
		String result = Utilities.getTaxReport(1, 12579);
		assertEquals("Single Filing: $1469.35 (Part I: $835.00, Part II: $634.35)", result);
	}
	
	@Test
	public void testGetTaxReport_case_2_married() {
		String result = Utilities.getTaxReport(2, 12579);
		assertEquals("Married Filing: $1257.90 (Part I: $1257.90)", result);
	}
	
	@Test
	public void testGetTaxReport_case_3_single() {
		String result = Utilities.getTaxReport(1, 22354);
		assertEquals("Single Filing: $2935.60 (Part I: $835.00, Part II: $2100.60)", result);
	}
	
	@Test
	public void testGetTaxReport_case_3_married() {
		String result = Utilities.getTaxReport(2, 22354);
		assertEquals("Married Filing: $2518.10 (Part I: $1670.00, Part II: $848.10)", result);
	}
	
	@Test
	public void testGetTaxReport_case_4_single() {
		String result = Utilities.getTaxReport(1, 59783);
		assertEquals("Single Filing: $11133.25 (Part I: $835.00, Part II: $3840.00, Part III: $6458.25)", result);
	}
	
	@Test
	public void testGetTaxReport_case_4_married() {
		String result = Utilities.getTaxReport(2, 59783);
		assertEquals("Married Filing: $8132.45 (Part I: $1670.00, Part II: $6462.45)", result);
	}
	
	@Test
	public void testGetTaxReport_case_5_single() {
		String result = Utilities.getTaxReport(1, 82947);
		assertEquals("Single Filing: $16924.25 (Part I: $835.00, Part II: $3840.00, Part III: $12249.25)", result);
	}
	
	@Test
	public void testGetTaxReport_case_5_married() {
		String result = Utilities.getTaxReport(2, 82947);
		assertEquals("Married Filing: $13111.75 (Part I: $1670.00, Part II: $7680.00, Part III: $3761.75)", result);
	}
}
