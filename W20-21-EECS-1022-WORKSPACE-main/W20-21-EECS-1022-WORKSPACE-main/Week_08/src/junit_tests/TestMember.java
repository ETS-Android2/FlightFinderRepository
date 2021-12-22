package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Facility;
import model.Member;

public class TestMember {

	@Test
	public void test_01a() {
		Facility f1 = new Facility("Spinning Class", 2.5, 1);
		Facility f2 = new Facility("Gym", 2.0, 2);
		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0, heeyeon.getNumberOfFacilites());
		heeyeon.addFacility(f1);
		assertEquals(1, heeyeon.getNumberOfFacilites());
		heeyeon.addFacility(f2);
		assertEquals(2, heeyeon.getNumberOfFacilites());
		heeyeon.addFacility(f3);
		assertEquals(3, heeyeon.getNumberOfFacilites());
		
	}
//	
	@Test
	public void test_01b() { // anonymous object (objects without name - that means that you don't store any address to any variable and you pass it to your intended position as an argument)
//		Facility f1 = new Facility("Spinning Class", 2.5, 1);
//		Facility f2 = new Facility("Gym", 2.0, 2);
//		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0, heeyeon.getNumberOfFacilites());
		
		heeyeon.addFacility(new Facility("Spinning Class", 2.5, 1)); /*Anonymous object <----> *//* Passing the address of an object being created on the fly (without first storing its address in a varuable)*/
		assertEquals(1, heeyeon.getNumberOfFacilites());
		
		heeyeon.addFacility(new Facility("Gym", 2.0, 2));
		assertEquals(2, heeyeon.getNumberOfFacilites());
		
		heeyeon.addFacility(new Facility("Locker", 1.5, 3));
		assertEquals(3, heeyeon.getNumberOfFacilites());
		// Cons of anonymous objects we cannot use variables such as 'f1', 'f2', 'f3' to refer to the objects.
		// Instead, we need to get access to the underlying private 'facilities' array.
		// heeyeon.facilities (this is invalid because facilities is private and thus unvisible)
		
	}
	
	@Test
	public void test_01c() { // Overloaded version
		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0, heeyeon.getNumberOfFacilites());
		
		heeyeon.addFacility("Spinning Class", 2.5, 1); /*Anonymous object <----> *//* Passing the address of an object being created on the fly (without first storing its address in a varuable)*/
		assertEquals(1, heeyeon.getNumberOfFacilites());
		
		heeyeon.addFacility("Gym", 2.0, 2);
		assertEquals(2, heeyeon.getNumberOfFacilites());
		
		heeyeon.addFacility("Locker", 1.5, 3);
		assertEquals(3, heeyeon.getNumberOfFacilites());
		// Cons of anonymous objects we cannot use variables such as 'f1', 'f2', 'f3' to refer to the objects.
		// Instead, we need to get access to the underlying private 'facilities' array.
		// heeyeon.facilities (this is invalid because facilities is private and thus unvisible)
	}
	
	@Test 
	public void test_2() {
		Facility f1 = new Facility("Spinning Class", 2.5, 1);
		Facility f2 = new Facility("Gym", 2.0, 2);
		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		heeyeon.addFacility(f1);
		heeyeon.addFacility(f2);
		heeyeon.addFacility(f3);
		
		assertEquals(2.5 * 1 + 2.0 * 2 + 1.5 * 3, heeyeon.getPaymentDue(), 0.01);
	}
	
	@Test 
	public void test_3() {
		Facility f1 = new Facility("Spinning Class", 2.5, 1);
		Facility f2 = new Facility("Gym", 2.0, 2);
		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		heeyeon.addFacility(f1);
		heeyeon.addFacility(f2);
		heeyeon.addFacility(f3);
		
		// Version 1 - Using getFacility1 and getFacilityUnit methods
		int units = heeyeon.getFacilityUnit("Gym");
		assertEquals(2, units);
		
		// Version 2 - Using getFacility2
		int units2 = heeyeon.getFacility2("Gym");
		assertEquals(2, units2);
		
		// Version 1 
		heeyeon.extendFacilityUnits("Gym", 2);
		assertEquals(4, heeyeon.getFacilityUnit("Gym"));
		assertEquals(2.5 * 1 + 2.0 * 4 + 1.5 * 3, heeyeon.getPaymentDue(), 0.01);
	
		
		// Version 2
		heeyeon.extendFacilityUnits1("Gym", 2);
		assertEquals(4, heeyeon.getFacilityUnit("Gym"));
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
