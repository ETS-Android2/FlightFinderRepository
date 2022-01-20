package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {
	
	/*
	 * Tests related to getMultiplesOf3 
	 */
	@Test
	public void test_getMultiplesOf3_01() {
		int[] input = {1, 2, 3, 4, 5, 6};
		int[] result = Utilities.getMultiplesOf3(input);
		int[] expected = {3, 6};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getMultiplesOf3_02() {
		int[] input = {1, 2, 4, 5, 7, 8};
		int[] result = Utilities.getMultiplesOf3(input);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getMultiplesOf3_03() {
		int[] input = {1};
		int[] result = Utilities.getMultiplesOf3(input);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getMultiplesOf3_04() {
		int[] input = {3};
		int[] result = Utilities.getMultiplesOf3(input);
		int[] expected = {3};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getMultiplesOf3_05() {
		int[] input = {3, 9, 12, 102, 3, 6};
		int[] result = Utilities.getMultiplesOf3(input);
		int[] expected = {3, 9, 12, 102, 3, 6};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getMultiplesOf3_06() {
		int[] input = {};
		int[] result = Utilities.getMultiplesOf3(input);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	/*
	 * Tests related to getFilteredSeq
	 */
	@Test
	public void test_getFilteredSeq_01() {
		int[] input = {4, 2, 3, 1, 4, 2, 4, 3, 4, 3};
		int[] result = Utilities.getFilteredSeq(input, 1);
		int[] expected = {4, 2, 3, 4, 2, 4, 3, 4, 3};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFilteredSeq_02() {
		int[] input = {4, 2, 3, 1, 4, 2, 4, 3, 4, 3};
		int[] result = Utilities.getFilteredSeq(input, 2);
		int[] expected = {4, 3, 1, 4, 4, 3, 4, 3};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFilteredSeq_03() {
		int[] input = {4, 2, 3, 1, 4, 2, 4, 3, 4, 3};
		int[] result = Utilities.getFilteredSeq(input, 3);
		int[] expected = {4, 2, 1, 4, 2, 4, 4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFilteredSeq_04() {
		int[] input = {4, 2, 3, 1, 4, 2, 4, 3, 4, 3};
		int[] result = Utilities.getFilteredSeq(input, 4);
		int[] expected = {2, 3, 1, 2, 3, 3};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFilteredSeq_05() {
		int[] input = {4, 2, 3, 1, 4, 2, 4, 3, 4, 3};
		int[] result = Utilities.getFilteredSeq(input, 5);
		int[] expected = {4, 2, 3, 1, 4, 2, 4, 3, 4, 3};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFilteredSeq_06() {
		int[] input = {4, 4, 4, 4, 4, 4};
		int[] result = Utilities.getFilteredSeq(input, 4);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFilteredSeq_07() {
		int[] input = {4, 4, 4, 4, 4, 5};
		int[] result = Utilities.getFilteredSeq(input, 4);
		int[] expected = {5};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFilteredSeq_08() {
		int[] input = {};
		int[] result = Utilities.getFilteredSeq(input, 4);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	/*
	 * Tests related to getAllPrefixes
	 */
	@Test
	public void test_getAllPrefixes_01() {
		int[] input = {3};
		String[] result = Utilities.getAllPrefixes(input);
		String[] expected = {"[3]"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getAllPrefixes_02() {
		int[] input = {3, 1};
		String[] result = Utilities.getAllPrefixes(input);
		String[] expected = {"[3]", "[3, 1]"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getAllPrefixes_03() {
		int[] input = {3, 1, 4};
		String[] result = Utilities.getAllPrefixes(input);
		String[] expected = {"[3]", "[3, 1]", "[3, 1, 4]", };
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getAllPrefixes_0312() {
		int[] input = {3, 2, 1, 4};
		String[] result = Utilities.getAllPrefixes(input);
		String[] expected = {"[3]", "[3, 2]", "[3, 2, 1]", "[3, 2, 1, 4]"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getAllPrefixes_04() {
		int[] input = {3, 1, 4, 5};
		String[] result = Utilities.getAllPrefixes(input);
		String[] expected = {"[3]", "[3, 1]", "[3, 1, 4]", "[3, 1, 4, 5]"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getAllPrefixes_05() {
		int[] input = {};
		String[] result = Utilities.getAllPrefixes(input);
		String[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getAllPrefixes_06() {
		int[] input = {3, 10, 1, 3, 4, 7};
		String[] result = Utilities.getAllPrefixes(input);
		String[] expected = {"[3]", "[3, 10]", "[3, 10, 1]", "[3, 10, 1, 3]", "[3, 10, 1, 3, 4]", "[3, 10, 1, 3, 4, 7]"};
		assertArrayEquals(expected, result);
	}
	
	/*
	 * Tests related to getGroupedNumbers 
	 */
	@Test
	public void test_getGroupedNumbers_00() {
		int[] input = {};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_01() {
		int[] input = {1, 2, 3, 4, 5, 6};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {3, 6, 1, 4, 2, 5};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_02() {
		int[] input = {1, 2, 4, 5};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {1, 4, 2, 5};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_03() {
		int[] input = {2, 3, 5, 6};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {3, 6, 2, 5};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_04() {
		int[] input = {1, 3, 4, 6};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {3, 6, 1, 4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_05() {
		int[] input = {27, 3, 21, 6};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {27, 3, 21, 6};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_06() {
		int[] input = {1, 3};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {3, 1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_07() {
		int[] input = {1, 5};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {1, 5};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_08() {
		int[] input = {3, 6};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {3, 6};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_09() {
		int[] input = {1, 3, 4, 9, 12};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {3, 9, 12, 1, 4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_11() {
		int[] input = {3, 5};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {3, 5};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getGroupedNumbers_10() {
		int[] input = {1, 5, 14, 8, 2, 4};
		int[] result = Utilities.getGroupedNumbers(input);
		int[] expected = {1, 4, 5, 14, 8, 2};
		assertArrayEquals(expected, result);
	}
}
