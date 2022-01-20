package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {
	
	/*
	 * Tests related to getBMIReport
	 */
	@Test
	public void test_getBMIReport_01() {
		String result = Utilities.getBMIReport("kilogram", 40, "foot", 5.57);
		assertEquals("BMI is: 13.88 (Underweight)", result);
	}
	
	@Test
	public void test_getBMIReport_02() {
		String result = Utilities.getBMIReport("kilogram", 70, "inch", 66.92);
		assertEquals("BMI is: 24.23 (Normal)", result);
	}
	
	@Test
	public void test_getBMIReport_03() {
		String result = Utilities.getBMIReport("pound", 154.3, "foot", 5.13);
		assertEquals("BMI is: 28.63 (Overweight)", result);
	}
	
	@Test
	public void test_getBMIReport_04() {
		String result = Utilities.getBMIReport("pound", 167.3, "inch", 60.92);
		assertEquals("BMI is: 31.69 (Obese)", result);
	}
	
	@Test
	public void test_getBMIReport_05a() {
		String result = Utilities.getBMIReport("Pounds", -154.3, "Inches", -66.92);
		assertEquals("Error: Pounds is not a valid weight unit", result);
	}
	
	@Test
	public void test_getBMIReport_05b() {
		String result = Utilities.getBMIReport("pound", -154.3, "Inches", -66.92);
		assertEquals("Error: Inches is not a valid height unit", result);
	}
	
	@Test
	public void test_getBMIReport_05c() {
		String result = Utilities.getBMIReport("pound", 154.3, "inch", -66.92);
		assertEquals("Error: both weight and height must be positive", result);
	} 
	
	/*
	 * Tests related to getLargestTwoNumbers
	 */
	@Test
	public void test_getLargestTwoNumbers_01() {
		String result = Utilities.getLargestTwoNumbers(1, 2, 3, 4);
		assertEquals("largest is 4 and second largest is 3", result);
	}
	
	@Test
	public void test_getLargestTwoNumbers_02() {
		String result = Utilities.getLargestTwoNumbers(4, 3, 2, 1);
		assertEquals("largest is 4 and second largest is 3", result);
	}
	
	@Test
	public void test_getLargestTwoNumbers_03() {
		String result = Utilities.getLargestTwoNumbers(3, 2, 4, 1);
		assertEquals("largest is 4 and second largest is 3", result);
	}
	
	@Test
	public void test_getLargestTwoNumbers_04() {
		String result = Utilities.getLargestTwoNumbers(4, 2, 4, 1);
		assertEquals("largest is 4 and second largest is 4", result);
	}
	
	/*
	 * Tests related to getWinnerOfRPS
	 */
	@Test
	public void test_getWinnerOfRPS_01() {
		String result = Utilities.getWinnerOfRPS("Alan", 'r', "Mark", 'p');
		assertEquals("Mark", result);
	}
	
	@Test
	public void test_getWinnerOfRPS_02() {
		String result = Utilities.getWinnerOfRPS("Alan", 'r', "Mark", 'r');
		assertEquals("tie", result);
	}
}
