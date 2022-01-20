package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilites {

	@Test
	public void test_getSequence1a() {
		String result = Utilities.getSequence1a(6, 11, 4);
		assertEquals("<6, 17, 28, 39> has average 22.5", result);
	}
	
	@Test
	public void test_getSequence1b() {
		String result = Utilities.getSequence1a(6, 11, 4);
		assertEquals("<6, 17, 28, 39> has average 22.5", result);
	}
	
	@Test
	public void test_getSequence2a() {
		String result = Utilities.getSequence2a(3, 5, 20);
		assertEquals("<3 8 13 18 > has average 10.5", result);
	}
	
	@Test
	public void test_getSequence2b() {
		String result = Utilities.getSequence2b(3, 5, 20);
		assertEquals("<3 8 13 18 > has average 10.5", result);
	}

}
