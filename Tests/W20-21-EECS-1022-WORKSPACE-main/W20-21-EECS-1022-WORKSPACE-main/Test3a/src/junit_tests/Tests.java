package junit_tests;

import model.*; /* Only classes created in the `model` package will be graded. */

import static org.junit.Assert.*;
import org.junit.Test;

/* Problem:
 * A warehouse stores a list of equipments.
 * When first created, a warehouse is set with a capacity 
 * (i.e., maximum number of equipments with distinct names). 
 * 
 * Each equipment is characterized by its name (e.g., "WD Hard Disk Drive", "iPad Pro") 
 * 	and its quantity in the warehouse (e.g., 4).
 *  
 * Given an equipment, we may add or remove its stock (by increasing or decreasing its quantity), 
 * 	as well as access its product name, quantity, or status. 
 * 
 * An equipment's status should be a summary of its name and current quantity in the warehouse. 
 * 	However, if the last invoked mutator resulted in an error (e.g., due to insufficient stock), then
 * 	the equipment's status should be the corresponding error message.
 * 
 * Given a warehouse, we may, e.g.:
 * 	- Add an input equipment. Here are the cases to consider:
 * 		+ If the warehouse's capacity is reached, then do nothing. 
 * 		+ If the input equipment already exists (by its name) in the warehouse, then update its stock accordingly.
 *     	+ If the input equipment does not exist, then add it to the end of the warehouse's stored list.
 * 
 * For other functionalities, details, and examples, see below for the test methods and in-line comments.
 */

public class Tests {
	
	/*
	 * Programming Requirements:
	 * 	- You are only allowed to use primitive arrays (e.g., int[], String[], Facility[]) 
	 * 		for declaring attributes and implementing methods.
	 * 	- Any use of a Java library class or method is forbidden 
	 * 		(that is, use selections and loops to build your solution from scratch instead):
	 * 	- Here are some examples of forbidden classes/methods: 
	 * 		- Arrays class (e.g., Arrays.copyOf)
	 * 		- System class (e.g., System.arrayCopy)
	 * 		- ArrayList class
	 * 		- String class (e.g., substring).
	 * 	- The use of some library classes does not require an import statement, 
	 * 		but these classes are also forbidden to be used.
	 * 	- Here are the exceptions (library methods which you are allowed to use if needed):
	 * 		- String class (equals, format)
	 * 
	 * You will receive an immediate zero if this requirement is violated.
	 */
	
	/*
	 * Your expected workflow should be:
	 * Step 1: Eliminate compilation errors. 
	 * 	Declare all the required classes and methods (returning default values if necessary), 
	 * 	so that the project contains no compilation errors (i.e., no red crosses shown on the Eclipse editor).
	 * Step 2: Pass all unit tests. Add private attributes and complete the method implementations accordingly, 
	 * 	so that executing all tests result in a green bar.
	 * 
	 * If necessary, you are free to declare (private or public) helper methods.
	 */

	@Test
	public void test_01() {
		/* Create a new equipment with an empty stock.
		 * No error checking is needed on the name of equipment. 
		 */
		Equipment e1 = new Equipment("iPad Pro");

		assertEquals("iPad Pro", e1.getName());
		assertEquals(0, e1.getStock());
		
		/* When there was no error, 
		 * the equipment's status summarizes its name and current quantity. 
		 * Note the spaces after the colon and before the opening parenthesis. 
		 */
		assertEquals("Equipment: iPad Pro (0)", e1.getStatus());
	}

    @Test
    public void test_02() {
    	Equipment e1 = new Equipment("iPad Pro");
    	
    	/* Quantity for stock addition must be positive. */
    	
    	e1.addStock(0);
    	/* When the last-invoked mutator resulted in an error, 
    	 * there should be no change on the equipment's name or quantity, 
    	 * and the equipment's status should be set to the corresponding error message.
    	 * 
    	 * Note. Invoking accessors does not modify the status of the equipment; 
    	 * 			Only invoking mutators may.
    	 */
    	assertEquals("Error: non-positive quantity 0", e1.getStatus());
    	
    	
    	e1.addStock(-3);
    	assertEquals("Error: non-positive quantity -3", e1.getStatus());
    	assertEquals(0, e1.getStock());
    }
    
    @Test
    public void test_03() {
    	Equipment e1 = new Equipment("iPad Pro");
    	
    	e1.addStock(10);
    	/* When there was no error, 
    	 * the quantity is updated accordingly,
		 * and the equipment's status summarizes its name and current quantity. 
		 */
    	assertEquals("Equipment: iPad Pro (10)", e1.getStatus());
    	assertEquals(10, e1.getStock());
    	
    	e1.addStock(4);
    	assertEquals("Equipment: iPad Pro (14)", e1.getStatus());
    	assertEquals(14, e1.getStock());
    }
    
    @Test
    public void test_04() {
    	Equipment e1 = new Equipment("iPad Pro");
    	
    	/* Quantity for stock removal must be positive. */
    	
    	e1.removeStock(0);
    	assertEquals("Error: non-positive quantity 0", e1.getStatus());
    	
    	e1.removeStock(-3);
    	assertEquals("Error: non-positive quantity -3", e1.getStatus());
    	assertEquals(0, e1.getStock());
    	
    	e1.removeStock(10);
    	/* In case the current quantity is insufficient for the intended removal,
    	 * the error message should indicate how much it is short of.
    	 */
    	assertEquals("Error: quantity is short of 10", e1.getStatus());
    	assertEquals(0, e1.getStock());
    }
    
    @Test
    public void test_05() {
    	Equipment e1 = new Equipment("iPad Pro");
    	
    	e1.addStock(10);
    	assertEquals(10, e1.getStock());
    	
    	e1.removeStock(0);
    	assertEquals("Error: non-positive quantity 0", e1.getStatus());
    	
    	e1.removeStock(-5);
    	assertEquals("Error: non-positive quantity -5", e1.getStatus());
    	assertEquals(10, e1.getStock());
    	
    	e1.removeStock(12);
    	assertEquals("Error: quantity is short of 2", e1.getStatus());
    	assertEquals(10, e1.getStock());
    }
    
    @Test
    public void test_06() {
    	Equipment e1 = new Equipment("iPad Pro");
    	
    	e1.addStock(10); 
    	
    	e1.removeStock(4);
    	/* When there was no error, 
    	 * the quantity is updated accordingly,
		 * and the equipment's status summarizes its name and current quantity. 
		 */
    	assertEquals("Equipment: iPad Pro (6)", e1.getStatus());
    	assertEquals(6, e1.getStock());
    	
    	e1.removeStock(6);
    	assertEquals("Equipment: iPad Pro (0)", e1.getStatus());
    	assertEquals(0, e1.getStock());
    }

    @Test
    public void test_07() {
    	/* Create an empty warehouse which can potentially 
    	 * store up to the specified maximum number (e.g., 3) of equipments with distinct names. 
    	 */
		Warehouse house = new Warehouse(3); 
		
		/* Get all equipments stored in the warehouse. */
		Equipment[] equipments1 = house.getEquipments();
		
		/* Get those equipments stored in the warehouse, 
		 * each of which having its name matching one of those in the input array.
		 * 
		 * You can assume that the input array contains no duplicates, and each string
		 * may or may not match the name of some equipment in the warehouse.
		 */
		String[] names = {"iPad Pro", "iMac"};
		Equipment[] equipments2 = house.getEquipments(names);
		
		/* Get all equipments whose quantities are within the range specified by some lower bound and some upper bound.
		 * You can assume that the two input numbers, the lower and upper bounds, respectively,
		 * are always valid (no error checking is necessary). 
		 */
		Equipment[] equipments3 = house.getEquipmentsWithinRange(5, 10);
		
		/* All returned arrays are empty as the warehouse is empty. */
		assertEquals(0, equipments1.length); 
		assertEquals(0, equipments2.length);
		assertEquals(0, equipments3.length);
		
		/* Get the stored equipment object whose name matches the input string.
		 * The returned object is null as the warehouse is empty. 
		 */
		Equipment e = house.getEquipment("iPad Pro");
		assertNull(e);
	} 
    
    @Test
    public void test_08() {
    	Warehouse house = new Warehouse(10);
    	
    	/* If the input equipment does not exist, 
    	 * then add it to the end of the warehouse's stored list. 
    	 */
    	Equipment e1 = new Equipment("iPad Pro");
    	e1.addStock(10);
    	house.addEquipment(e1);
    	Equipment e2 = new Equipment("iMac");
    	e2.addStock(3);
    	house.addEquipment(e2);
    	Equipment e3 = new Equipment("Macbook Air");
    	e3.addStock(12);
    	house.addEquipment(e3);
    	Equipment e4 = new Equipment("Mac mini");
    	house.addEquipment(e4);
    	e4.addStock(5);
    	
    	/* Now the warehouse stores 4 equipments. */
    	
    	/* Expected to return all stored equipments in the warehouse. */
    	Equipment[] expected = {e1, e2, e3, e4};
    	assertArrayEquals(expected, house.getEquipments());
    }
    
    @Test
    public void test_09() {
    	Warehouse house = new Warehouse(10);
    	
    	/* If the input equipment does not exist, 
    	 * then add it to the warehouse's stored list. 
    	 */
    	Equipment e1 = new Equipment("iPad Pro");
    	e1.addStock(10);
    	house.addEquipment(e1);
    	Equipment e2 = new Equipment("iMac");
    	e2.addStock(3);
    	house.addEquipment(e2);
    	Equipment e3 = new Equipment("Macbook Air");
    	e3.addStock(12);
    	house.addEquipment(e3);
    	Equipment e4 = new Equipment("Mac mini");
    	house.addEquipment(e4);
    	e4.addStock(5);
    	
    	/* Now the warehouse stores 4 equipments. */
    	
		String[] names1 = {"iPad Pro", "Macbook Air"}; 
		/* Expected to return all equipment objects matching the names. 
		 *
		 * You can assume that the input array contains no duplicates, and each string
		 * may or may not match the name of some equipment in the warehouse. 
		 */
		Equipment[] expected1 = {e1, e3}; /* e1's name matches "iPad Pro", e3's name matches "Macbook Air" */
		assertArrayEquals(expected1, house.getEquipments(names1));
		
		/* Stored at indices 1 and 3 are non-existing equipments in the warehouse. */
		String[] names2 = {"iPad Pro", "Blue yeti microphone", "Macbook Air", "iPhone 12"};
		Equipment[] expected2 = {e1, e3}; /* e1's name matches "iPad Pro", e3's name matches "Macbook Air" */
		/* Non-existing equipment names are ignored. 
		 * Only equipment objects matching the existing names are included in the returned array. 
		 */
		assertArrayEquals(expected2, house.getEquipments(names2)); 
    }
    
    @Test
    public void test_10() {
    	Warehouse house = new Warehouse(10);
    	
    	/* If the input equipment does not exist, 
    	 * then add it to the warehouse's stored list. 
    	 */
    	Equipment e1 = new Equipment("iPad Pro");
    	e1.addStock(10);
    	house.addEquipment(e1);
    	Equipment e2 = new Equipment("iMac");
    	e2.addStock(3);
    	house.addEquipment(e2);
    	Equipment e3 = new Equipment("Macbook Air");
    	e3.addStock(12);
    	house.addEquipment(e3);
    	Equipment e4 = new Equipment("Mac mini");
    	house.addEquipment(e4);
    	e4.addStock(5);
    	
    	/* Now the warehous stores 4 equipments. */ 
		
    	/* Expected to return all equipments whose quantities are 
    	 * within the range specified by the lower and upper bounds.
    	 * e.g., within the range from 5 to 10.
    	 * (No error checking is necessary. Assume these bounds are always valid.) 
    	 */
		Equipment[] expected3 = {e1, e4};
		assertArrayEquals(expected3, house.getEquipmentsWithinRange(5, 10));
    }
    
    @Test
    public void test_11() {
    	Warehouse house = new Warehouse(10);
    	
    	/* If the input equipment does not exist, 
    	 * then add it to the warehouse's stored list. 
    	 */
    	Equipment e1 = new Equipment("iPad Pro");
    	e1.addStock(10);
    	house.addEquipment(e1);
    	Equipment e2 = new Equipment("iMac");
    	e2.addStock(3);
    	house.addEquipment(e2);
    	Equipment e3 = new Equipment("Macbook Air");
    	e3.addStock(12);
    	house.addEquipment(e3);
    	Equipment e4 = new Equipment("Mac mini");
    	house.addEquipment(e4);
    	e4.addStock(5);
    	
    	/* Now the warehouse stores 4 equipments. */ 
		
    	/* Expected to return the equipment object matching the input name.
    	 * If no equipments match the name, then return null. 
    	 */
		assertTrue(e1 == house.getEquipment("iPad Pro"));
		assertTrue(e2 == house.getEquipment("iMac"));
		assertTrue(e3 == house.getEquipment("Macbook Air"));
		assertTrue(e4 == house.getEquipment("Mac mini"));
		assertNull(house.getEquipment("Blue yeti microphone")); /* non-existing equipment */
    }
    
    @Test
    public void test_12() {
    	/* Note: the maximum number of equipments with distinct names is set to 4. */
    	Warehouse house = new Warehouse(4);
    	
    	/* If the input equipment does not exist, 
    	 * then add it to the warehouse's stored list. 
    	 */
    	Equipment e1 = new Equipment("iPad Pro");
    	e1.addStock(10);
    	house.addEquipment(e1);
    	Equipment e2 = new Equipment("iMac");
    	e2.addStock(3);
    	house.addEquipment(e2);
    	Equipment e3 = new Equipment("Macbook Air");
    	e3.addStock(12);
    	house.addEquipment(e3);
    	Equipment e4 = new Equipment("Mac mini");
    	house.addEquipment(e4);
    	e4.addStock(5);
    	
    	/* Now the warehouse is full. */ 
    	
    	Equipment e5 = new Equipment("Blue yeti microphone");
    	house.addEquipment(e5); /* do nothing; warehouse unchanged */ 
    	
    	Equipment[] expected = {e1, e2, e3, e4};
    	assertArrayEquals(expected, house.getEquipments());
    }
    
    @Test
    public void test_13() { 
    	Warehouse house = new Warehouse(4);
    	
    	/* If the input equipment does not exist, 
    	 * then add it to the warehouse's stored list. 
    	 */
    	Equipment e1 = new Equipment("iPad Pro");
    	e1.addStock(10);
    	house.addEquipment(e1);
    	Equipment e2 = new Equipment("iMac");
    	e2.addStock(3);
    	house.addEquipment(e2);
    	Equipment e3 = new Equipment("Macbook Air");
    	e3.addStock(12);
    	house.addEquipment(e3); 
    	
    	/* Now the warehouse stores 3 equipments. */
    	
    	Equipment e4 = new Equipment("iMac");
    	e4.addStock(5);
    	/* If the input equipment already exists (by its name) in the warehouse, 
    	 * then update its stock accordingly. 
    	 */
    	house.addEquipment(e4); /* As the iMac object already exists, only update its stock by e4's stock. */
    	assertTrue(
    			/* e4 was not added */
    			house.getEquipments().length == 3 
    		&&	house.getEquipments()[0] == e1
    		
    			/* stock of iMac was updated */
    		&& 	house.getEquipments()[1] == e2
    		&& 	e2.getName().equals("iMac")
    		&& 	e2.getStock() == 3 + 5
    		
    		&& 	house.getEquipments()[2] == e3
    	);
    }
    
    @Test
    public void test_14() {
    	/* Note: the maximum number of equipments with distinct names is set to 4. */
    	Warehouse house = new Warehouse(4);
    	
    	/* If the input equipment does not exist, 
    	 * then add it to the warehouse's stored list. 
    	 */
    	Equipment e1 = new Equipment("iPad Pro");
    	e1.addStock(10);
    	house.addEquipment(e1);
    	Equipment e2 = new Equipment("iMac");
    	e2.addStock(3);
    	house.addEquipment(e2);
    	Equipment e3 = new Equipment("Macbook Air");
    	e3.addStock(12);
    	house.addEquipment(e3);
    	Equipment e4 = new Equipment("Mac mini");
    	house.addEquipment(e4);
    	e4.addStock(5);
    	
    	/* Now the warehouse is full. */ 
    	
    	Equipment e5 = new Equipment("iMac");
    	e5.addStock(5);
    	/* If the input equipment already exists (by its name) in the warehouse, 
    	 * then update its stock accordingly (even if the warehouse is full). 
    	 */
    	house.addEquipment(e5); /* As the iMac object already exists, only update its stock by e5's stock. */
    	assertTrue(
    			/* e5 was not added */
    			house.getEquipments().length == 4 
    		&&	house.getEquipments()[0] == e1
    		
    			/* stock of iMac was updated */
    		&& 	house.getEquipments()[1] == e2
    		&& 	e2.getName().equals("iMac")
    		&& 	e2.getStock() == 3 + 5
    		
    		&& 	house.getEquipments()[2] == e3
    		&& 	house.getEquipments()[3] == e4
    	);
    }
    
    @Test
    public void test_15() { 
    	Warehouse house = new Warehouse(4);
    	
    	/* If the input equipment does not exist, 
    	 * then add it to the warehouse's stored list. 
    	 */
    	Equipment e1 = new Equipment("iPad Pro");
    	e1.addStock(10);
    	house.addEquipment(e1);
    	Equipment e2 = new Equipment("iMac");
    	e2.addStock(3);
    	house.addEquipment(e2);
    	Equipment e3 = new Equipment("Macbook Air");
    	e3.addStock(12);
    	house.addEquipment(e3); 
    	
    	/* Now the warehouse stores 3 equipments. */
    	
    	/* Add stock to the equipment matching the input name, if it exists. */
    	house.addStock("iPad Pro", 2);
    	house.addStock("iMac", 2);
    	house.addStock("Macbook Air", 2);
    	house.addStock("Blue yeti microphone", 5); /* non-existing equipment: do nothing to the warehouse */
    	
    	assertTrue( 
    			house.getEquipments().length == 3 
    		&&	house.getEquipments()[0] == e1 
    		&& 	house.getEquipments()[1] == e2 
    		&& 	house.getEquipments()[2] == e3
    		&&	house.getEquipment("iPad Pro").getStock() 		== 10 + 2
    		&& 	house.getEquipment("iMac").getStock()			== 3  + 2
    		&& 	house.getEquipment("Macbook Air").getStock()	== 12 + 2
    		&& 	house.getEquipment("Blue yeti microphone")		== null
    	);
    }
}