package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.PointCollector;

import model.Point;

public class PointTester {

	@Test
	public void test_01() {
		PointCollector pc = new PointCollector();
		
		assertEquals(0, pc.getNumberOfPoints());
		
		pc.addPoints(3, 4);
		assertEquals(1, pc.getNumberOfPoints());
		
		pc.addPoints(-3, 4);
		assertEquals(2, pc.getNumberOfPoints());
		
		pc.addPoints(3, -4);
		assertEquals(3, pc.getNumberOfPoints());
		
		pc.addPoints(-3, -4);
		assertEquals(4, pc.getNumberOfPoints());
		
		// Version 1 by instructor 
		Point[] ps1 = pc.getPointsinQudarantI_01();
		assertEquals(1, ps1.length);
		
		// Version 2 by me
		Point[] ps2 = pc.getPointsinQudarantI_02();
		assertEquals(1, ps2.length);
		
		
		
	
	}

}
