package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Sequence;

public class TestSequence {

	@Test
	public void testGetSequence1() {
		assertEquals("<3, 5, 7, 9, 11>", Sequence.getSequence1(3, 2));
	}
	
	@Test
	public void testGetSum1() {
		assertEquals(35, Sequence.getSum1(3, 2));
	}
	
	@Test
	public void testGetSequence2() {
		assertEquals("<3, 5, 7, 9, 11>", Sequence.getSequence2(3, 2));
	}
	
	@Test
	public void testGetSum2() {
		assertEquals(35, Sequence.getSum2(3, 2));
	}

}
