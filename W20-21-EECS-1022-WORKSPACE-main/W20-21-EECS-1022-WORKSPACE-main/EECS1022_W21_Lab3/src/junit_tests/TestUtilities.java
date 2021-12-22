package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {
	
	/*
	 * Tests related to getNumbers 
	 */
	@Test
	public void test_getNumbers_01a() {
		String result = Utilities.getNumbers(-5, -1);
		assertEquals("Error: both bounds must be non-negative", result);
	}
	
	@Test
	public void test_getNumbers_01b() {
		String result = Utilities.getNumbers(-2, -7);
		assertEquals("Error: both bounds must be non-negative", result);
	}
	
	@Test
	public void test_getNumbers_01c() {
		String result = Utilities.getNumbers(-13, 4);
		assertEquals("Error: both bounds must be non-negative", result);
	}
	
	@Test
	public void test_getNumbers_01d() {
		String result = Utilities.getNumbers(7, -20);
		assertEquals("Error: both bounds must be non-negative", result);
	}
	
	@Test
	public void test_getNumbers_01e() {
		String result = Utilities.getNumbers(-2, -2);
		assertEquals("Error: both bounds must be non-negative", result);
	}
	
	@Test
	public void test_getNumbers_01f() {
		String result = Utilities.getNumbers(-2, 0);
		assertEquals("Error: both bounds must be non-negative", result);
	}
	
	@Test
	public void test_getNumbers_01g() {
		String result = Utilities.getNumbers(0, -2);
		assertEquals("Error: both bounds must be non-negative", result);
	}
	
	@Test
	public void test_getNumbers_01h() {
		String result = Utilities.getNumbers(5, -2);
		assertEquals("Error: both bounds must be non-negative", result);
	}
	
	@Test
	public void test_getNumbers_01i() {
		String result = Utilities.getNumbers(-3, -5);
		assertEquals("Error: both bounds must be non-negative", result);
	}
	
	@Test
	public void test_getNumbers_02a() {
		String result = Utilities.getNumbers(46, 29);
		assertEquals("Error: lower bound 46 is not less than or equal to upper bound 29", result);
	}
	
	@Test
	public void test_getNumbers_02b() {
		String result = Utilities.getNumbers(99, 0);
		assertEquals("Error: lower bound 99 is not less than or equal to upper bound 0", result);
	}
	
	@Test
	public void test_getNumbers_03a() {
		String result = Utilities.getNumbers(63, 63);
		assertEquals("1 number between 63 and 63: <(63)>", result);
	}
	
	@Test
	public void test_getNumbers_03b() {
		String result = Utilities.getNumbers(76, 76);
		assertEquals("1 number between 76 and 76: <[76]>", result);
	}
	
	@Test
	public void test_getNumbers_03c() {
		String result = Utilities.getNumbers(83, 83);
		assertEquals("1 number between 83 and 83: <{83}>", result);
	}
	
	@Test
	public void test_getNumbers_03d() {
		String result = Utilities.getNumbers(0, 0);
		assertEquals("1 number between 0 and 0: <(0)>", result);
	}
	
	@Test
	public void test_getNumbers_04a() {
		String result = Utilities.getNumbers(0, 8);
		assertEquals("9 numbers between 0 and 8: <(0), [1], {2}, (3), [4], {5}, (6), [7], {8}>", result);
	}
	
	@Test
	public void test_getNumbers_04b() {
		String result = Utilities.getNumbers(10, 16);
		assertEquals("7 numbers between 10 and 16: <[10], {11}, (12), [13], {14}, (15), [16]>", result);
	}
	
	@Test
	public void test_getNumbers_04c() {
		String result = Utilities.getNumbers(29, 36);
		assertEquals("8 numbers between 29 and 36: <{29}, (30), [31], {32}, (33), [34], {35}, (36)>", result);
	}
	
	@Test
	public void test_getNumbers_04d() {
		String result = Utilities.getNumbers(1, 2);
		assertEquals("2 numbers between 1 and 2: <[1], {2}>", result);
	}
	
	@Test
	public void test_getNumbers_04e() {
		String result = Utilities.getNumbers(0, 1);
		assertEquals("2 numbers between 0 and 1: <(0), [1]>", result);
	}
	
	/*
	 * Tests related to getIntermediateStats 
	 */
	@Test
	public void test_getIntermediateStats_01() {
		String result = Utilities.getIntermediateStats(7, 3, 0);
		assertEquals("{}", result);
	}
	
	@Test
	public void test_getIntermediateStats_02() {
		String result = Utilities.getIntermediateStats(7, 3, 1);
		String expected = "{[sum of <7>: 7 ; avg of <7>: 7.00]}"; 
		assertEquals(expected, result);
	}
	
	@Test
	public void test_getIntermediateStats_03() {
		String result = Utilities.getIntermediateStats(7, 3, 2);
		String expected = "{";
		expected += "[sum of <7>: 7 ; avg of <7>: 7.00]" + ", ";
		expected +=	"[sum of <7, 10>: 17 ; avg of <7, 10>: 8.50]";
		expected += "}";
		assertEquals(expected , result);
	}
	
	@Test
	public void test_getIntermediateStats_06() {
		String result = Utilities.getIntermediateStats(7, 0, 2);
		String expected = "{";
		expected += "[sum of <7>: 7 ; avg of <7>: 7.00]" + ", ";
		expected +=	"[sum of <7, 7>: 14 ; avg of <7, 7>: 7.00]";
		expected += "}";
		assertEquals(expected , result);
	}
	 
	@Test
	public void test_getIntermediateStats_04() {
		String result = Utilities.getIntermediateStats(7, 3, 3);
		String expected = "{";
		expected += "[sum of <7>: 7 ; avg of <7>: 7.00]" + ", ";
		expected +=	"[sum of <7, 10>: 17 ; avg of <7, 10>: 8.50]" + ", ";;
		expected +=	"[sum of <7, 10, 13>: 30 ; avg of <7, 10, 13>: 10.00]";
		expected += "}";
		assertEquals(expected, result);
	}
	
	@Test
	public void test_getIntermediateStats_05() {
		String result = Utilities.getIntermediateStats(7, 3, 4);
		String expected = "{";
		expected += "[sum of <7>: 7 ; avg of <7>: 7.00]" + ", ";
		expected +=	"[sum of <7, 10>: 17 ; avg of <7, 10>: 8.50]" + ", ";
		expected +=	"[sum of <7, 10, 13>: 30 ; avg of <7, 10, 13>: 10.00]" + ", ";
		expected +=	"[sum of <7, 10, 13, 16>: 46 ; avg of <7, 10, 13, 16>: 11.50]";
		expected += "}";
		assertEquals(expected, result);
	}
	
	@Test
	public void test_getIntermediateStats_07() {
		String result = Utilities.getIntermediateStats(-1, -2, 4);
		String expected = "{";
		expected += "[sum of <-1>: -1 ; avg of <-1>: -1.00]" + ", ";
		expected +=	"[sum of <-1, -3>: -4 ; avg of <-1, -3>: -2.00]" + ", ";
		expected +=	"[sum of <-1, -3, -5>: -9 ; avg of <-1, -3, -5>: -3.00]" + ", ";
		expected +=	"[sum of <-1, -3, -5, -7>: -16 ; avg of <-1, -3, -5, -7>: -4.00]";
		expected += "}";
		assertEquals(expected, result);
	}
	
	/*
	 * Tests related to getInterleavings 
	 */
	@Test
	public void test_getInterleavings_01a() {
		String result = Utilities.getInterlevaings(1, 2, 0, -1, -2, 0);
		assertEquals("<>", result);
	}
	
	@Test
	public void test_getInterleavings_01b() {
		String result = Utilities.getInterlevaings(1, 2, 0, -1, -2, 3);
		assertEquals("<[-1], [-3], [-5]>", result);
	}
	
	@Test
	public void test_getInterleavings_01c() {
		String result = Utilities.getInterlevaings(1, 2, 3, -1, -2, 0);
		assertEquals("<(1), (3), (5)>", result);
	}
	
	@Test
	public void test_getInterleavings_03a() {
		String result = Utilities.getInterlevaings(1, 2, 3, -1, -2, 3);
		assertEquals("<(1), [-1], (3), [-3], (5), [-5]>", result);
	}
	
	@Test
	public void test_getInterleavings_03b() {
		String result = Utilities.getInterlevaings(-23, -11, 5, 54, 17, 5);
		assertEquals("<(-23), [54], (-34), [71], (-45), [88], (-56), [105], (-67), [122]>", result);
	}
	
	@Test
	public void test_getInterleavings_04a() {
		String result = Utilities.getInterlevaings(1, 2, 5, -1, -2, 3);
		assertEquals("<(1), [-1], (3), [-3], (5), [-5], (7), (9)>", result);
	}
	
	@Test
	public void test_getInterleavings_04b() {
		String result = Utilities.getInterlevaings(-23, -11, 7, 54, 17, 5);
		assertEquals("<(-23), [54], (-34), [71], (-45), [88], (-56), [105], (-67), [122], (-78), (-89)>", result);
	}
	
	@Test
	public void test_getInterleavings_05a() {
		String result = Utilities.getInterlevaings(1, 2, 3, -1, -2, 5);
		assertEquals("<(1), [-1], (3), [-3], (5), [-5], [-7], [-9]>", result);
	}
	
	@Test
	public void test_getInterleavings_05b() {
		String result = Utilities.getInterlevaings(-23, -11, 5, 54, 17, 7);
		assertEquals("<(-23), [54], (-34), [71], (-45), [88], (-56), [105], (-67), [122], [139], [156]>", result);
	}
}
