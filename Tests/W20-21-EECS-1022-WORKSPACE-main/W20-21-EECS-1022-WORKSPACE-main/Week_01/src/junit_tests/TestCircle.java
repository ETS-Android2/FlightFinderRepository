package junit_tests;
import static org.junit.Assert.*;

import org.junit.Test;

import model.Circle;

public class TestCircle {
	/*
	 * Each test method corresponds to ***manual***
	 * launch and interaction with the CircleApp2.
	 */
	@Test
	public void test1() {
		assertEquals(314.0, Circle.getArea(10.0), 1);	
	}
	
	@Test
	public void test2() {
		assertEquals(20.0 * 20.0 * 3.1415926, Circle.getArea(20.0), 1);
	}
	
}
