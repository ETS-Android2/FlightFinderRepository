package junit_tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Utilities;

class testUtilities {
	
	
	/*
	 * Tests related to sorting arrays in an increasing order.
	 */
	@Test
	public void test_arrayIncreasing_01() {
	int[] array = {4, 2, 3, 1};
	int[] result = Utilities.increasing(array);
	int[] expected = {1, 2, 3, 4};
	assertArrayEquals(expected, result);
	
	}
	
	@Test
	public void test_arrayIncreasing_02() {
		int[] input = {4,3,2,1};
		int[] result = Utilities.increasing(input);
		int[] expected = {1, 2, 3, 4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_arrayIncreasing_03() {
		int[] input = {6, 4, 7, 2, 5, 1, 3};
		int[] result = Utilities.increasing(input);
		int[] expected = {1, 2, 3, 4, 5, 6, 7};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_arrayIncreasing_04() {
		int[] input = {2, 1};
		int[] result = Utilities.increasing(input);
		int[] expected = {1, 2};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_arrayIncreasing_05() {
		int[] input = {1, 2, 3, 4, 5, 6, 7};
		int[] result = Utilities.increasing(input);
		int[] expected = {1, 2, 3, 4, 5, 6, 7};
		assertArrayEquals(expected, result);
	}
	
	
//-------------------------------------------------------------------------------------------------------------------
	/*
	 * Tests related to sorting arrays in an decreasing order.
	 */
	
	@Test
	public void test_arraydecreasing_01() {
		int[] input = {4, 2, 3, 1};
		int[] result = Utilities.decreasing(input);
		int[] expected = {4, 3, 2, 1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_arraydecreasing_02() {
		int[] input = {5, 2, 1, 4, 3};
		int[] result = Utilities.decreasing(input);
		int[] expected = {5, 4, 3, 2, 1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_arraydecreasing_03() {
		int[] input = {4};
		int[] result = Utilities.decreasing(input);
		int[] expected = {4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_arraydecreasing_04() {
		int[] input = {6, 2, 7, 3, 9};
		int[] result = Utilities.decreasing(input);
		int[] expected = {9, 7, 6, 3, 2};
		assertArrayEquals(expected, result);
	}
	
//-------------------------------------------------------------------------------------------------------------------
	
	/*
	 * Tests related to sorting arrays in an decreasing order.
	 */
	@Test
	public void test_nonDescending_01() {
		int[] input = {4, 2, 2, 1};
		int[] result = Utilities.nonDescending(input);
		int[] expected = {1, 2, 2, 4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_nonDescending_02() {
		int[] input = {4, 2};
		int[] result = Utilities.nonDescending(input);
		int[] expected = {2, 4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_nonDescending_03() {
		int[] input = {2, 2};
		int[] result = Utilities.nonDescending(input);
		int[] expected = {2, 2};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_nonDescending_04() {
		int[] input = {5, 2, 6, 6, 8, 1, 3, 3, 9};
		int[] result = Utilities.nonDescending(input);
		int[] expected = {1, 2, 3, 3, 5, 6, 6, 8, 9};
		assertArrayEquals(expected, result);
	}
	
//-------------------------------------------------------------------------------------------------------------------	
	
	/*
	 * Tests related to sorting arrays in an decreasing order.
	 */
	@Test
	public void test_nonAscending_01() {
		int[] input = {5, 2, 6, 6, 8, 1, 3, 3, 9};
		int[] result = Utilities.nonAscending(input);
		int[] expected = {9, 8, 6, 6, 5, 3, 3, 2, 1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_nonAscending_02() {
		int[] input = {5, 5};
		int[] result = Utilities.nonAscending(input);
		int[] expected = {5, 5};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_nonAscending_03() {
		int[] input = {};
		int[] result = Utilities.nonAscending(input);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_nonAscending_04() {
		int[] input = {1, 2, 2, 4, 4, 3, 7, 2, 9};
		int[] result = Utilities.nonAscending(input);
		int[] expected = {9, 7, 4, 4, 3, 2, 2, 2, 1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_nonDecreasing_01() {
		int[] input = {1, 2, 2, 4};
		boolean result = Utilities.nonDecreasing(input);
		assertEquals(true, result);
	}
	
	@Test
	public void test_nonDecreasing_02() {
		int[] input = {1, 2, 2, 0};
		boolean result = Utilities.nonDecreasing(input);
		assertEquals(false, result);
	}
	
	@Test
	public void test_nonDecreasing_03() {
		int[] input = {2, 2};
		boolean result = Utilities.nonDecreasing(input);
		assertEquals(true, result);
	}
	
//-------------------------------------------------------------------------------------------------------------------
	
	// Tests related to fix34
	
	@Test
	public void test_fix34_01() {
		int[] input = {1, 3, 1, 4};
		int[] result = Utilities.fix34(input);
		int[] expected = {1, 3, 4, 1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_fix34_02() {
		int[] input = {1, 3, 1, 4, 4, 3, 1};
		int[] result = Utilities.fix34(input);
		int[] expected = {1, 3, 4, 1, 1, 3, 4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_fix34_03() {
		int[] input = {3, 2, 2, 4};
		int[] result = Utilities.fix34(input);
		int[] expected = {3, 4, 2, 2};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_fix34_04() {
		int[] input = {3, 2, 4};
		int[] result = Utilities.fix34(input);
		int[] expected = {3, 4, 2};
		assertArrayEquals(expected, result);
	}
	
//-------------------------------------------------------------------------------------------------------------------
	// Test related to determineDuplicate method.
	
	@Test
	public void test_determine_Duplicate_01() {
		int[] input = {3, 2, 4};
		boolean result = Utilities.determineDuplicate(input);
		assertEquals(false, result);
	}
	
	@Test
	public void test_determine_Duplicate_02() {
		int[] input = {1, 3, 2, 4};
		boolean result = Utilities.determineDuplicate(input);
		assertEquals(false, result);
	}
	
	@Test
	public void test_determine_Duplicate_03() {
		int[] input = {2, 3, 4, 3, 2, 4};
		boolean result = Utilities.determineDuplicate(input);
		assertEquals(true, result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
