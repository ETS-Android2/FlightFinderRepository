package console_apps;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Member;

public class testMember {

	@Test
	public void test_Member_01() {
		Member member1 = new Member(); // Default constructor - No parameter
		Member member2 = new Member();
	//	assertEquals(false, member1 == member2);
		assertFalse(member1 == member2);
		
	}
	
	@Test
	public void test_Member_02() {
		Member member1 = new Member(); // Default constructor - No parameter
		Member member2 = new Member();
		//assertEquals(true, member1 != member2);
		assertTrue(member1 != member2);
		
	}
	
	@Test
	public void test_Member_03() {
		Member suyeon = new Member(12345, 's', 100.0);
		Member yuna = new Member(12346, 'b', 200.0);
		Member jihye = new Member("jihye",12348, 'g', 300.0);
		assertFalse(suyeon == yuna);
		assertFalse(suyeon == jihye);
		assertFalse(yuna == jihye);
	}
	
	@Test
	public void test_Member_04() {
		Member alan = new Member(85, 175);
		Member mark = new Member(101, 181);
		
		String alanBMI = alan.getBMIReport();
		
		// Initial measures
		assertEquals(85, alan.getWeight(), 0.1);            // Just to check if they returns the correct weight and height
		assertEquals(101, mark.getWeight(), 0.1);			// Just to check if they returns the correct weight and height
		assertEquals(175, alan.getHeight(), 0.1);			// Just to check if they returns the correct weight and height
		assertEquals(181, mark.getHeight(), 0.1);			// Just to check if they returns the correct weight and height
		
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport());
		// Change measures
		alan.changeTheWeightBy(-13);
		mark.changeTheWeightBy(-13);
		assertEquals("Normal (23.5)", alan.getBMIReport());
		assertEquals("Overweight (26.9)", mark.getBMIReport());
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
