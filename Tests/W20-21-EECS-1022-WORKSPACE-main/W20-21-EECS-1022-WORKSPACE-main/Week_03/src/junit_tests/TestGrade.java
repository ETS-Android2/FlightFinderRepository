package junit_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Grade;

class TestGrade {

	@Test
	void test1() {
		String result = Grade.getLetterGrade1(63);
		assertEquals("C", result);
	}
	

	@Test
	void test2() {
		String result = Grade.getLetterGrade2(63);
		assertEquals("C", result);

}
	@Test
	void test3() {
		String result = Grade.getLetterGrade2(91);
		assertEquals("A+", result);
	}
		
	@Test
	void test4() {
		String result = Grade.getLetterGrade3(63);
		assertEquals("C", result);
	}
		
	@Test
	void test5() {
		String result = Grade.getLetterGrade3(91);
		assertEquals("A+", result);
	}
		
	@Test
	void test6() {
		String result = Grade.getLetterGrade3(67);
		assertEquals("C+", result);
	}

	@Test
	void test7() {
		String result = Grade.getGradeReport(61);
		assertEquals("Grade C: Well Done!", result);
	}
		
	@Test
	void test8() {
		String result = Grade.getGradeReport(59);
		assertEquals("Grade D+: You Can Do Better Next Time!", result);
		

}
}
