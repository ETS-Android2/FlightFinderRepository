package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.ArrayUtilities;

public class testArrayUtilities {

	@Test
	public void test() {
		int[] input = {2, 3, 4, 5};
		int[] expected = {2, 5, 9, 14};
		int[] result = ArrayUtilities.getIntermediateSums(input);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test1() {
		int[] input = {};
		int[] expected = {};
		int[] result = ArrayUtilities.getIntermediateSums(input);
		assertArrayEquals(expected, result);
	}
	
	
	// tests written by me
	@Test
	public void test2a() {
		int[] input1 = {2, 4, 6};
		int[] input2 = {1, 3, 5};
		int[] expected = {2, 1, 4, 3, 6, 5};
		int[] result = ArrayUtilities.getInterleaving(input1, input2);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test2d() {
		int[] input1 = {};
		int[] input2 = {};
		int[] expected = {};
		int[] result = ArrayUtilities.getInterleaving(input1, input2);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test2b() {
		int[] input1 = {2, 4, 6};
		int[] input2 = {1, 3};
		int[] expected = {2, 1, 4, 3, 6};
		int[] result = ArrayUtilities.getInterleaving(input1, input2);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test2c() {
		int[] input1 = {2, 4};
		int[] input2 = {1, 3, 5};
		int[] expected = {2, 1, 4, 3, 5};
		int[] result = ArrayUtilities.getInterleaving(input1, input2);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test2e() {
		int[] input1 = {2, 4, 0, -1, 3, 100};
		int[] input2 = {1, 3, 5, 6};
		int[] expected = {2, 1, 4, 3, 0, 5, -1, 6, 3, 100};
		int[] result = ArrayUtilities.getInterleaving(input1, input2);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test2f() {
		int[] input1 = {2, 4, 6, 8, 10, 12};
		int[] input2 = {1};
		int[] expected = {2, 1, 4, 6, 8, 10, 12};
		int[] result = ArrayUtilities.getInterleaving(input1, input2);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test2g() {
		int[] input1 = {2};
		int[] input2 = {1};
		int[] expected = {2, 1};
		int[] result = ArrayUtilities.getInterleaving(input1, input2);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test2h() {
		int[] input1 = {2, 4};
		int[] input2 = {1, 3, 5, 7, 9};
		int[] expected = {2, 1, 4, 3, 5, 7, 9};
		int[] result = ArrayUtilities.getInterleaving(input1, input2);
		assertArrayEquals(expected, result);
	}
	

}
