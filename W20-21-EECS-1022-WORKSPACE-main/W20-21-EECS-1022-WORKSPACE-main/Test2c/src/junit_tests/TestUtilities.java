package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {
	
	/*
	 * Tests related to Task 1
	 */
	@Test
	public void test_task1_01() {
		int[] seq = {3, 7, 4, 5};
		int[] indices = {2, 1, 3};
		int[] result = Utilities.task1(seq, indices);
		int[] expected = {4, 7, 5}; /* elements at indices 2, 1, 3 of `seq` */
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task1_02() {
		int[] seq = {3, 7, 4, 5};
		int[] indices = {2, -1, 0, 1, -2, 5, 3, 1, 0, 4}; /* invalid indices: -1, -2, 5, 4 */
		int[] result = Utilities.task1(seq, indices);
		int[] expected = {4, 3, 7, 5, 7, 3};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task1_03() {
		int[] seq = {};
		int[] indices = {2, -1, 0, 1, -2, 5, 3, 1, 0, 4}; 
		int[] result = Utilities.task1(seq, indices);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task1_04() {
		int[] seq = {3, 7, 4, 5};
		int[] indices = {-1, -2, 5, 4}; /* invalid indices: -1, -2, 5, 4 */
		int[] result = Utilities.task1(seq, indices);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task1_05() {
		int[] seq = {3, 7, 4, 5};
		int[] indices = {}; /* invalid indices: -1, -2, 5, 4 */
		int[] result = Utilities.task1(seq, indices);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task1_06() {
		int[] seq = {};
		int[] indices = {0, 1, 2, 7}; /* invalid indices: -1, -2, 5, 4 */
		int[] result = Utilities.task1(seq, indices);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task1_07() {
		int[] seq = {2, 3, 4, 9};
		int[] indices = {3, 3, 3, 3, 3, 3}; /* invalid indices: -1, -2, 5, 4 */
		int[] result = Utilities.task1(seq, indices);
		int[] expected = {9, 9, 9, 9, 9, 9};
		assertArrayEquals(expected, result);
	}
	
	/*
	 * Tests related to Task 2
	 */
    @Test
	public void test_task2_1() {
		int[] seq = {3, 1, 1, 1, 2, 2, 2, 2};
		int[] expected = {3, 1, 1, 3, 2, 4};
		assertArrayEquals(expected, Utilities.task2(seq));
	}

	@Test
	public void test_task2_2() {
		int[] seq = {1, 1, 1, 2, 2, 2, 2};
		int[] expected = {1, 3, 2, 4};
		assertArrayEquals(expected, Utilities.task2(seq));
	} 
	
	@Test
	public void test_task2_3() {
		int[] seq = {2, 2, 2, 2, 1, 1, 1};
		int[] expected = {2, 4, 1, 3};
		assertArrayEquals(expected, Utilities.task2(seq));
	} 
	
	/*
	 * Tests related to Task 3
	 */
	@Test
	public void test_task3_01() {
		int[] input = {3};
		String[] result = Utilities.task3(input);
		String[] expected = {"[3]"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task3_02() {
		int[] input = {3, 1};
		String[] result = Utilities.task3(input);
		String[] expected = {"[3, 1]", "[1]"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task3_03() {
		int[] input = {3, 1, 4};
		String[] result = Utilities.task3(input);
		String[] expected = {"[3, 1, 4]", "[1, 4]", "[4]"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task3_04() {
		int[] input = {3, 1, 4, 5};
		String[] result = Utilities.task3(input);
		String[] expected = {"[3, 1, 4, 5]", "[1, 4, 5]", "[4, 5]", "[5]"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task3_05() {
		int[] input = {};
		String[] result = Utilities.task3(input);
		String[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task3_06() {
		int[] input = {1, 1};
		String[] result = Utilities.task3(input);
		String[] expected = {"[1, 1]", "[1]"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_task3_07() {
		int[] input = {3, 1, 4, 5, 7, 8};
		String[] result = Utilities.task3(input);
		String[] expected = {"[3, 1, 4, 5, 7, 8]", "[1, 4, 5, 7, 8]", "[4, 5, 7, 8]", "[5, 7, 8]", "[7, 8]", "[8]"};
		assertArrayEquals(expected, result);
	}
	
	/*
	 * Tests related to Task 4
	 */
	@Test
    public void test_task4_1() {
    	String[] seq = {"a"};
    	String expected = "a";
    	assertEquals(expected, Utilities.task4(seq));
    }
    
    @Test
    public void test_task4_2() {
    	String[] seq = {"a", "a", "a"};
    	String expected = "a";
    	assertEquals(expected, Utilities.task4(seq));
    }
    
    @Test
    public void test_task4_3() {
    	String[] seq = {"b", "a", "c", "d", "a"};
    	String expected = "a";
    	assertEquals(expected, Utilities.task4(seq));
    }
    
    @Test
    public void test_task4_4() {
    	String[] seq = {"a", "b", "b", "b"};
    	String expected = "b";
    	assertEquals(expected, Utilities.task4(seq));
    }
    
    @Test
    public void test_task4_5() {
    	String[] seq = {"a", "b", "b", "b", "a"};
    	String expected = "b";
    	assertEquals(expected, Utilities.task4(seq));
    }
    
    @Test
    public void test_task4_6() {
    	String[] seq = {"a", "b", "c", "c", "c", "c", "b", "b"};
    	String expected = "c";
    	assertEquals(expected, Utilities.task4(seq));
    }
}
