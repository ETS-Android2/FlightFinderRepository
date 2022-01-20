package junit_tests;

import model.*; /* Only classes created in the `model` package will be graded. */

import static org.junit.Assert.*;
import org.junit.Test;

/* Problem:
 * A repository stores a list of items.
 * When first created, a repository is set with a capacity 
 * (i.e., maximum number of items with distinct titles). 
 * 
 * Each item is characterized by its title (e.g., "WD Hard Disk Drive", "iPad Pro") 
 * 	and its amount in the repository (e.g., 4).
 *  
 * Given an item, we may increase or decrease its amount, 
 * 	as well as access its product title, amount, or info.
 *  
 * An item's info should be a summary of its title and current amount in the repository. 
 * 	However, if the last invoked mutator resulted in an error (e.g., due to insufficient amount), then
 * 	the item's info should be the corresponding error message.
 * 
 * Given a repository, we may, e.g.,:
 * 	- Add an input item. Here are the cases to consider:
 * 		+ If the repository's capacity is reached, then do nothing. 
 * 		+ If the input item already exists (by its title) in the repository, then update its amount accordingly.
 *     	+ If the input item does not exist, then add it to the end of the repository's stored list.
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
		/* Create a new item with no storage.
		 * No error checking is needed on the title of item. 
		 */
		Item i1 = new Item("iPad Pro");

		assertEquals("iPad Pro", i1.getTitle());
		assertEquals(0, i1.getAmount());
		
		/* When there was no error, 
		 * the item's info summarizes its title and current amount.
		 * Note the spaces after the colon and before the opening parenthesis. 
		 */
		assertEquals("Item: iPad Pro (0)", i1.getInfo());
	}

    @Test
    public void test_02() {
    	Item i1 = new Item("iPad Pro");
    	
    	/* Amount for increase must be positive. */
    	
    	i1.increaseAmount(0);
    	/* When the last-invoked mutator resulted in an error, 
    	 * there should be no change on the item's title or amount, 
    	 * and the item's info should be set to the corresponding error message.
    	 * 
    	 * Note. Invoking accessors does not modify the info of the item.
    	 * 			Only invoking mutators may.
    	 */
    	assertEquals("Error: non-positive amount 0", i1.getInfo());
    	
    	
    	i1.increaseAmount(-3);
    	assertEquals("Error: non-positive amount -3", i1.getInfo());
    	assertEquals(0, i1.getAmount());
    }
    
    @Test
    public void test_03() {
    	Item i1 = new Item("iPad Pro");
    	
    	i1.increaseAmount(10);
    	/* When there was no error, 
    	 * the amount is updated accordingly,
		 * and the item's info summarizes its title and current amount. 
		 */
    	assertEquals("Item: iPad Pro (10)", i1.getInfo());
    	assertEquals(10, i1.getAmount());
    	
    	i1.increaseAmount(4);
    	assertEquals("Item: iPad Pro (14)", i1.getInfo());
    	assertEquals(14, i1.getAmount());
    }
    
    @Test
    public void test_04() {
    	Item i1 = new Item("iPad Pro");
    	
    	/* Amount for decrease must be positive. */
    	
    	i1.decreaseAmount(0);
    	assertEquals("Error: non-positive amount 0", i1.getInfo());
    	
    	i1.decreaseAmount(-3);
    	assertEquals("Error: non-positive amount -3", i1.getInfo());
    	assertEquals(0, i1.getAmount());
    	
    	i1.decreaseAmount(10);
    	/* In case the current amount is insufficient for the intended decrease,
    	 * the error message should indicate how much it is short of.
    	 */
    	assertEquals("Error: amount is short of 10", i1.getInfo());
    	assertEquals(0, i1.getAmount());
    }
    
    @Test
    public void test_05() {
    	Item i1 = new Item("iPad Pro");
    	
    	i1.increaseAmount(10);
    	assertEquals(10, i1.getAmount());
    	
    	i1.decreaseAmount(0);
    	assertEquals("Error: non-positive amount 0", i1.getInfo());
    	
    	i1.decreaseAmount(-5);
    	assertEquals("Error: non-positive amount -5", i1.getInfo());
    	assertEquals(10, i1.getAmount());
    	
    	i1.decreaseAmount(12);
    	assertEquals("Error: amount is short of 2", i1.getInfo());
    	assertEquals(10, i1.getAmount());
    }
    
    @Test
    public void test_06() {
    	Item i1 = new Item("iPad Pro");
    	
    	i1.increaseAmount(10); 
    	
    	i1.decreaseAmount(4);
    	/* When there was no error, 
    	 * the amount is updated accordingly,
		 * and the item's info summarizes its title and current amount. 
		 */
    	assertEquals("Item: iPad Pro (6)", i1.getInfo());
    	assertEquals(6, i1.getAmount());
    	
    	i1.decreaseAmount(6);
    	assertEquals("Item: iPad Pro (0)", i1.getInfo());
    	assertEquals(0, i1.getAmount());
    }

    @Test
    public void test_07() {
    	/* Create an empty repository which can potentially 
    	 * store up to the specified maximum number (e.g., 3) of items with distinct titles. 
    	 */
		Repository repos = new Repository(3); 
		
		/* Get all items stored in the repository. */
		Item[] items1 = repos.getItems();
		
		/* Get those items stored in the repository, 
		 * each of which having its title matching one of those in the input array.
		 * 
		 * You can assume that the input array contains no duplicates, and each string
		 * may or may not match the title of some item in the repository. 
		 */
		String[] titles = {"iPad Pro", "iMac"};
		Item[] items2 = repos.getItems(titles);
		
		/* Get all items whose amounts are outside the range specified by some upper bound and some lower bound.
		 * You can assume that the two input numbers, the upper and lower bounds, respectively,
		 * are always valid (no error checking is necessary). 
		 */
		Item[] items3 = repos.getItemsOutsideRange(10, 5);
		
		/* All returned arrays are empty as the repository is empty. */
		assertEquals(0, items1.length); 
		assertEquals(0, items2.length);
		assertEquals(0, items3.length);
		
		/* For the stored item object whose title matches the input string, if it exists, get its amount. 
		 * The returned amount is -1 as such an item object does not exist in the empty repository. 
		 */
		int amt = repos.getAmount("iPad Pro");
		assertEquals(-1, amt);
	} 
    
    @Test
    public void test_08() {
    	Repository repos = new Repository(10);
    	
    	/* If the input item does not exist, 
    	 * then add it to the end of the repository's stored list. 
    	 */
    	Item i1 = new Item("iPad Pro");
    	i1.increaseAmount(10);
    	repos.addItem(i1);
    	Item i2 = new Item("iMac");
    	i2.increaseAmount(3);
    	repos.addItem(i2);
    	Item i3 = new Item("Macbook Air");
    	i3.increaseAmount(12);
    	repos.addItem(i3);
    	Item i4 = new Item("Mac mini");
    	repos.addItem(i4);
    	i4.increaseAmount(5);
    	
    	/* Now the repository stores 4 items. */
    	
    	/* Expected to return all stored items in the repository. */
    	Item[] expected = {i1, i2, i3, i4};
    	assertArrayEquals(expected, repos.getItems());
    }
    
    @Test
    public void test_09() {
    	Repository repos = new Repository(10);
    	
    	/* If the input item does not exist, 
    	 * then add it to the repository's stored list. 
    	 */
    	Item i1 = new Item("iPad Pro");
    	i1.increaseAmount(10);
    	repos.addItem(i1);
    	Item i2 = new Item("iMac");
    	i2.increaseAmount(3);
    	repos.addItem(i2);
    	Item i3 = new Item("Macbook Air");
    	i3.increaseAmount(12);
    	repos.addItem(i3);
    	Item i4 = new Item("Mac mini");
    	repos.addItem(i4);
    	i4.increaseAmount(5);
    	
    	/* Now the repository stores 4 items. */
    	
		String[] titles1 = {"iPad Pro", "Macbook Air"}; 
		/* Expected to return all item objects matching the titles.
		 * 
		 * You can assume that the input array contains no duplicates, and each string
		 * may or may not match the title of some item in the repository.  
		 */
		Item[] expected1 = {i1, i3};
		assertArrayEquals(expected1, repos.getItems(titles1)); /* i1's title matches "iPad Pro", i3's title matches "Macbook Air" */
		
		/* Stored at indices 1 and 3 are non-existing items in the repository. */
		String[] titles2 = {"iPad Pro", "Blue yeti microphone", "Macbook Air", "iPhone 12"};
		Item[] expected2 = {i1, i3}; /* i1's title matches "iPad Pro", i3's title matches "Macbook Air" */
		/* Non-existing item titles are ignored. 
		 * Only item objects matching existing titles are included in the returned array. 
		 */
		assertArrayEquals(expected2, repos.getItems(titles2)); 
    }
    
    @Test
    public void test_10() {
    	Repository repos = new Repository(10);
    	
    	/* If the input item does not exist, 
    	 * then add it to the repository's stored list.
    	 */
    	Item i1 = new Item("iPad Pro");
    	i1.increaseAmount(10);
    	repos.addItem(i1);
    	Item i2 = new Item("iMac");
    	i2.increaseAmount(3);
    	repos.addItem(i2);
    	Item i3 = new Item("Macbook Air");
    	i3.increaseAmount(12);
    	repos.addItem(i3);
    	Item i4 = new Item("Mac mini");
    	repos.addItem(i4);
    	i4.increaseAmount(5);
    	
    	/* Now the repository stores 4 items. */ 
		
    	/* Expected to return all items whose amounts are 
    	 * outside the range specified by the upper and lower bounds.
    	 * e.g., outside the range with upper bound 10 and lower bound 5 (that is, strictly above 10 or strictly below 5)
    	 * (No error checking is necessary. Assume these bounds are always valid.) 
    	 */
		Item[] expected3 = {i2, i3};
		assertArrayEquals(expected3, repos.getItemsOutsideRange(10, 5));
    }
    
    @Test
    public void test_11() {
    	Repository repos = new Repository(10);
    	
    	/* If the item does not exist, 
    	 * then add it to the repository's stored list. 
    	 */
    	Item i1 = new Item("iPad Pro");
    	i1.increaseAmount(10);
    	repos.addItem(i1);
    	Item i2 = new Item("iMac");
    	i2.increaseAmount(3);
    	repos.addItem(i2);
    	Item i3 = new Item("Macbook Air");
    	i3.increaseAmount(12);
    	repos.addItem(i3);
    	Item i4 = new Item("Mac mini");
    	repos.addItem(i4);
    	i4.increaseAmount(5);
    	
    	/* Now the repository stores 4 items. */ 
		
    	/* For the item object matching the title, if it exists, return its amount in the repository.
    	 * If no items match the title, then return -1. 
    	 */
		assertTrue(10 == repos.getAmount("iPad Pro"));
		assertTrue(3  == repos.getAmount("iMac"));
		assertTrue(12 == repos.getAmount("Macbook Air"));
		assertTrue(5  == repos.getAmount("Mac mini"));
		assertTrue(-1 == repos.getAmount("Blue yeti microphone")); /* non-existing item */
    }
    
    @Test
    public void test_12() {
    	/* Note: the maximum number of items with distinct titles is set to 4. */
    	Repository repos = new Repository(4);
    	
    	/* If the input item does not exist, 
    	 * then add it to the repository's stored list. 
    	 */
    	Item i1 = new Item("iPad Pro");
    	i1.increaseAmount(10);
    	repos.addItem(i1);
    	Item i2 = new Item("iMac");
    	i2.increaseAmount(3);
    	repos.addItem(i2);
    	Item i3 = new Item("Macbook Air");
    	i3.increaseAmount(12);
    	repos.addItem(i3);
    	Item i4 = new Item("Mac mini");
    	repos.addItem(i4);
    	i4.increaseAmount(5);
    	
    	/* Now the repository is full. */ 
    	
    	Item i5 = new Item("Blue yeti microphone");
    	repos.addItem(i5); /* do nothing; repository unchanged */ 
    	
    	Item[] expected = {i1, i2, i3, i4};
    	assertArrayEquals(expected, repos.getItems());
    }
    
    @Test
    public void test_13() { 
    	Repository repos = new Repository(4);
    	
    	/* If the input item does not exist, 
    	 * then add it to the repository's stored list. 
    	 */
    	Item i1 = new Item("iPad Pro");
    	i1.increaseAmount(10);
    	repos.addItem(i1);
    	Item i2 = new Item("iMac");
    	i2.increaseAmount(3);
    	repos.addItem(i2);
    	Item i3 = new Item("Macbook Air");
    	i3.increaseAmount(12);
    	repos.addItem(i3); 
    	
    	/* Now the repository stores 3 items. */
    	
    	Item i4 = new Item("iMac");
    	i4.increaseAmount(5);
    	/* If the input item already exists (by its title) in the repository, 
    	 * then update its amount accordingly. 
    	 */
    	repos.addItem(i4); /* As the iMac object already exists, only update its amount by i4's amount. */
    	assertTrue(
    			/* i4 was not added */
    			repos.getItems().length == 3 
    		&&	repos.getItems()[0] == i1
    		
    			/* amount of iMac was updated */
    		&& 	repos.getItems()[1] == i2
    		&& 	i2.getTitle().equals("iMac")
    		&& 	i2.getAmount() == 3 + 5
    		
    		&& 	repos.getItems()[2] == i3
    	);
    }
    
    @Test
    public void test_14() {
    	/* Note: the maximum number of items with distinct titles is set to 4. */
    	Repository repository = new Repository(4);
    	
    	/* If the input item does not exist, 
    	 * then add it to the repository's stored list. 
    	 */
    	Item i1 = new Item("iPad Pro");
    	i1.increaseAmount(10);
    	repository.addItem(i1);
    	Item i2 = new Item("iMac");
    	i2.increaseAmount(3);
    	repository.addItem(i2);
    	Item i3 = new Item("Macbook Air");
    	i3.increaseAmount(12);
    	repository.addItem(i3);
    	Item i4 = new Item("Mac mini");
    	repository.addItem(i4);
    	i4.increaseAmount(5);
    	
    	/* Now the repository is full. */ 
    	
    	Item i5 = new Item("iMac");
    	i5.increaseAmount(5);
    	/* If the input item already exists (by its title) in the repository, 
    	 * then update its amount accordingly (even if the repository is full). 
    	 */
    	repository.addItem(i5); /* As the iMac object already exists, only update its amount by i5's amount. */
    	assertTrue(
    			/* i5 was not added */
    			repository.getItems().length == 4 
    		&&	repository.getItems()[0] == i1
    		
    			/* amount of iMac was updated */
    		&& 	repository.getItems()[1] == i2
    		&& 	i2.getTitle().equals("iMac")
    		&& 	i2.getAmount() == 3 + 5
    		
    		&& 	repository.getItems()[2] == i3
    		&& 	repository.getItems()[3] == i4
    	);
    }
    
    @Test
    public void test_15() { 
    	Repository repos = new Repository(4);
    	
    	/* If the item does not exist, 
    	 * then add it to the repository's stored list. 
    	 */
    	Item i1 = new Item("iPad Pro");
    	i1.increaseAmount(10);
    	repos.addItem(i1);
    	Item i2 = new Item("iMac");
    	i2.increaseAmount(3);
    	repos.addItem(i2);
    	Item i3 = new Item("Macbook Air");
    	i3.increaseAmount(12);
    	repos.addItem(i3); 
    	
    	/* Now the repository stores 3 items. */
    	
    	/* Decrease the amount of the item matching the input title, if it exists. */
    	repos.decreaseAmount("iPad Pro", 2);
    	repos.decreaseAmount("iMac", 2);
    	repos.decreaseAmount("Macbook Air", 2);
    	repos.decreaseAmount("Blue yeti microphone", 5); /* non-existing item: do nothing to the repository */
    	
    	assertTrue( 
    			repos.getItems().length == 3 
    		&&	repos.getItems()[0] == i1 
    		&& 	repos.getItems()[1] == i2 
    		&& 	repos.getItems()[2] == i3
    		&&	repos.getAmount("iPad Pro") 			== 10 - 2
    		&& 	repos.getAmount("iMac") 				== 3  - 2
    		&& 	repos.getAmount("Macbook Air") 			== 12 - 2
    		&& 	repos.getAmount("Blue yeti microphone")	== -1
    	);
    }
}