package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Facility;
import model.Member;
import model.Trainer;

public class TestMember {

	@Test
	public void test_aliasing_01a() {
		Member alan = new Member(85, 175);
		Member mark = new Member(101, 181);
		
		// Initial measures
		assertEquals(85, alan.getWeight(), 0.1);             // Just to check if they returns the correct weight and height |
		assertEquals(101, mark.getWeight(), 0.1);			// Just to check if they returns the correct weight and height  |  Although they are all accessors
		assertEquals(175, alan.getHeight(), 0.1);			// Just to check if they returns the correct weight and height  |
		assertEquals(181, mark.getHeight(), 0.1);			// Just to check if they returns the correct weight and height  |
		
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport());
		// Change measures
		alan.changeTheWeightBy(-13);  // Only Alan changes the weight
		assertEquals("Normal (23.5)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport());  // Mark's BMI remains the same
	}
	
	@Test
	public void test_aliasing_01b() {
		Member alan = new Member(85, 175);
		Member mark = new Member(101, 181);
		
		// Initial measures
		assertEquals(85, alan.getWeight(), 0.1);             
		assertEquals(101, mark.getWeight(), 0.1);
		assertEquals(175, alan.getHeight(), 0.1);
		assertEquals(181, mark.getHeight(), 0.1);
		
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport());
		
		assertFalse(mark == alan);  // Both Alan and Mark objects are pointing to two *different locations*
		mark = alan;				// object mark is bounded to the object alan, meaning that mark will point to the same address as alan is pointing to.
		assertTrue(mark == alan);   // Both Alan and Mark objects are pointing to two *same locations*
		
		// Change measures
		alan.changeTheWeightBy(-13);  // Only Alan changes the weight
		assertEquals("Normal (23.5)", alan.getBMIReport());
		assertEquals("Normal (23.5)", mark.getBMIReport());
	}
	
	@Test		// TO understand it better check the sides related to this in the Java weekly Tutorials in oneNote
	public void test_aliasing_02() {
		Member alan = new Member();
		Member mark = new Member();
		Member oldAlan = alan;      // To have the old address of alan.
		Member oldMark = mark;		// To have the old address of mark.
		
		assertTrue(alan == oldAlan);
		assertTrue(mark == oldMark);
		
		// We will swap the addresses of mark and alan using a backup object which is tom in this case to keep track of the address of alan.
		Member tom = alan;
		alan = mark; 
		mark = tom;
		
		assertTrue(alan == oldMark);
		assertTrue(mark == oldAlan);
	}
	
	@Test
	public void test_MemberTrainer01() {
		Member alan = new Member("Alan");
		Member mark = new Member("Mark");
		Member tom = new Member("Tom");
		assertTrue(alan.getTrainer() == null);
		assertNull(mark.getTrainer()); // Equivalent to: alan.getTrainer() == null)
		assertFalse(tom.getTrainer() != null);
		
		
		Trainer jared = new Trainer("Jared");
		Trainer jon = new Trainer("Jon");
		
		alan.registerTrainer(jared);
		mark.registerTrainer(jon);
		assertTrue(alan.getTrainer() != null && alan.getTrainer() == jared);
		assertTrue(mark.getTrainer() == jon); 
		// tom's trainer is null at the moment(tom.trainer == null)
		assertNull(tom.getTrainer());
		
		
		tom.referTrainer(mark);
		// tom's trainer is no longer null and it's the same as mark's trainer. in other words it's pointing to the same address as mark is pointing to.(tom.trainer == null)
		assertTrue(tom.getTrainer() != null && tom.getTrainer() == jon);
		
		tom.referTrainer(alan);
		// tom's trainer is no longer null and it's the same as alan's trainer. in other words it's pointing to the same address as alan is pointing to.(tom.trainer == null)
		assertTrue(tom.getTrainer() != null && tom.getTrainer() == jared);
		
		//Example1
		alan.swapTrainer(mark);
		assertTrue(alan.getTrainer() != null && alan.getTrainer() == jon);
		assertTrue(mark.getTrainer() != null && mark.getTrainer() == jared);
		
		
		// Lets swap alan and mark back to their normal *trainers*
		alan.swapTrainer(mark);
		assertTrue(alan.getTrainer() != null && alan.getTrainer() == jared);
		assertTrue(mark.getTrainer() != null && mark.getTrainer() == jon);
		
		Facility gym = new Facility("Gym", 1, 2);
		Facility spa = new Facility("Spa", 2, 2);
		Facility tennis = new Facility("Tennis", 3, 2);
		
		alan.registerFacility(gym);
		alan.registerFacility(spa);
		alan.registerFacility(tennis);
		
		assertEquals(12, alan.getPaymentDue(), 0.1);
	}
}
