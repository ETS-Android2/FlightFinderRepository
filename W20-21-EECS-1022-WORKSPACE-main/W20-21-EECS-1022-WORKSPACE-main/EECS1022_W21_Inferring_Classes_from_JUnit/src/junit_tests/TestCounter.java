package junit_tests;

import static org.junit.Assert.*;

import model.Counter;

import org.junit.Test;

public class TestCounter {
	 
	@Test
	public void test_Counter() {
		Counter c1 = new Counter();
		Counter c2 = new Counter(5);
		int c1Value = c1.getValue();
		int c2Value = c2.getValue();
		assertEquals(0, c1Value);
		assertEquals(5, c2Value);
		
		c1.increment();
		c2.increment();
		c2.increment();
		assertEquals(1, c1.getValue());
		assertEquals(7, c2.getValue());
		
		c1.increment(3);
		c2.increment(3);
		assertEquals(4, c1.getValue());
		assertEquals(10, c2.getValue());
	}
}
