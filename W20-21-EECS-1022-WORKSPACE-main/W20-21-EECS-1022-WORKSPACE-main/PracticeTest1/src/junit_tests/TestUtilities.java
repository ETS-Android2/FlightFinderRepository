package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {

	@Test
	public void test_areaOfCircle_01() {
		double result = Utilities.areaOfCircle(5);
		assertEquals(78.5, result, 0.1);
	}
	
	@Test
	public void test_areaOfCircle_02() {
		double result = Utilities.areaOfCircle(1);
		assertEquals(3.14, result, 0.1);
	}
	
	@Test
	public void test_areaOfCircle_03() {
		double result = Utilities.areaOfCircle(0);
		assertEquals(0, result, 0.1);
	}
	
	@Test
	public void test_averageOf_01() {
		double result = Utilities.averageOf(23, 45, 67, 19);
		assertEquals(38.5, result, 0.1);
	}
    
    @Test
	public void test_maximumOf_01() {
		int result = Utilities.maximumOf(23, 45, 67);
		assertEquals(67, result);
	}
    
    @Test
	public void test_maximumOf_02() {
		int result = Utilities.maximumOf(45, 67, 23);
		assertEquals(67, result);
	}
    
    @Test
	public void test_maximumOf_03() {
		int result = Utilities.maximumOf(67, 45, 23);
		assertEquals(67, result);
	}
    
    @Test
	public void test_isArithmeticSeq_01() {
    	String result = Utilities.isArithmeticSeq(23, 23, 23, 23);
		assertEquals("It is an arithmetic sequence with common difference 0", result);
	}
    
    @Test
	public void test_isArithmeticSeq_02() {
		String result = Utilities.isArithmeticSeq(23, 46, 69, 92);
		assertEquals("It is an arithmetic sequence with common difference 23", result);
	}
    
    @Test
	public void test_isArithmeticSeq_03() {
    	String result = Utilities.isArithmeticSeq(23, 0, -23, -46);
		assertEquals("It is an arithmetic sequence with common difference -23", result);
	}
    
    @Test
	public void test_isArithmeticSeq_04() {
    	String result = Utilities.isArithmeticSeq(23, 46, 68, 90);
		assertEquals("It is not an arithmetic sequence", result);
	}
    
    @Test
	public void test_isArithmeticSeq_05() {
    	String result = Utilities.isArithmeticSeq(23, 0, -24, -48);
		assertEquals("It is not an arithmetic sequence", result);
	}
}
