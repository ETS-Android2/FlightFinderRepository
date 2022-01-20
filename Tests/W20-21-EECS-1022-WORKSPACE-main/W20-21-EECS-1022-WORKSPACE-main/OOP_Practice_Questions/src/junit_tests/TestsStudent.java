package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Student;

public class TestsStudent {

	@Test
	public void test() {
		Student alan = new Student("Alan");
		Student mark = new Student("Mark");
		Student tom = new Student("Tom");
		
		assertEquals("Alan", alan.getName());
		assertEquals("Mark", mark.getName());
		assertEquals("Tom", tom.getName());
		
		assertEquals("Alan-3", alan.getID());
		assertEquals("Mark-5", mark.getID());
		assertEquals("Tom-7", tom.getID());
	}

}
