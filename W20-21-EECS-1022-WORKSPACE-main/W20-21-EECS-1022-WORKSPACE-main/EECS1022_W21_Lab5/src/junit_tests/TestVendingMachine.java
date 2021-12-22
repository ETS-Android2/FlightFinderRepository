package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Requirement: Any classes you create must reside in the `model` package and be imported properly.
 * For example, creating a new class `Foo` in the `model` package should result in:
 * 	import model.Foo;
 */
import model.VendingMachine;

public class TestVendingMachine {
	
	/*
	 * Before attempting this lab, it is expected that you already completed the pre-study materials:
	 * 	1. Week 6 Java Tutorials: 
	 * 		https://www.youtube.com/playlist?list=PL5dxAmCmjv_70YmHrdPYD809c6OeIixvV
	 * 	2. Written Notes on Inferring Classes from JUnit Tests:
	 * 		https://www.eecs.yorku.ca/~jackie/teaching/lectures/2021/W/EECS1022/notes/EECS1022_W21_Inferring_Classes_from_JUnit.pdf
	 * 
	 * Tests included in this class serve as documentation on how instances of a vending machine work.
	 * 
	 * Be sure to also read the following sections from your Lab5 instructions PDF: 
	 * 	- Section 2.3 The Vending Machine Problem
	 * 	- Section 2.4 Hints and Requirements
	 * 
	 * Programming IDEs such as Eclipse are able to fix such compilation errors for you. 
	 * However, you are advised to follow the guidance as specified in the written notes above
	 * to fix these compilation errors manually, because: 
	 * 	1) it helps you better understand how the intended classes and methods work together; and 
	 * 	2) you may be tested in a written test or exam without the assistance of IDEs.
	 * 
	 */
	
	/*
	 * Tests related to an initial, empty vending machine
	 */
	@Test
	public void test_VendingMachine_01a() {
		VendingMachine vm = new VendingMachine();
		String result = vm.checkStatus();
		assertEquals("Empty VM Started", result);
	}
	
	@Test
	public void test_VendingMachine_01b1() {
		VendingMachine vm = new VendingMachine();
		String result = vm.checkStock("Coke");
		assertEquals("Coke (0)", result);
		result = vm.checkStatus(); // status remains initialized
		assertEquals("Empty VM Started", result);
	}
	
	@Test
	public void test_VendingMachine_01b2() {
		VendingMachine vm = new VendingMachine();
		String result = vm.checkStock("Orange Juice");
		assertEquals("Orange Juice (0)", result);
		result = vm.checkStatus(); // status remains initialized
		assertEquals("Empty VM Started", result);
	} 
	
	@Test
	public void test_VendingMachine_01b3() {
		VendingMachine vm = new VendingMachine();
		String result = vm.checkStock("Kitkat Chunky Bar");
		assertEquals("Kitkat Chunky Bar (0)", result);
		result = vm.checkStatus(); // status remains initialized
		assertEquals("Empty VM Started", result);
	} 
	
	@Test
	public void test_VendingMachine_01b4() {
		VendingMachine vm = new VendingMachine();
		String result = vm.checkStock("Lay's Classic Chips");
		assertEquals("Lay's Classic Chips (0)", result);
		result = vm.checkStatus(); // status remains initialized
		assertEquals("Empty VM Started", result);
	}
	
	@Test
	public void test_VendingMachine_01b5() {
		VendingMachine vm = new VendingMachine();
		String result = vm.checkStock("Lay's BBQ Chips"); // invalid product name
		assertEquals("Invalid product: Lay's BBQ Chips", result); // Notice the space between colon (:) and the invalid product's name.
		result = vm.checkStatus(); // status remains initialized
		assertEquals("Empty VM Started", result);
	}
	
	@Test
	public void test_VendingMachine_01c() {
		VendingMachine vm = new VendingMachine();
		String result = vm.checkStock();
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
	}
	
	/*
	 * Tests related to adding stock to the vending machine
	 */
	@Test
	public void test_VendingMachine_02() {
		VendingMachine vm = new VendingMachine();
		
		/*
		 * Add stock of Coke
		 */
		vm.add("Coke", 5); // this changes the status
		
		String result = vm.checkStatus();
		assertEquals("Product added: Coke (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Coke");
		assertEquals("Coke (5)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		/*
		 * Add stock of Orange Juice
		 */
		vm.add("Orange Juice", 5); // this changes the status
		
		result = vm.checkStatus();
		assertEquals("Product added: Orange Juice (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Orange Juice");
		assertEquals("Orange Juice (5)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		/*
		 * Add stock of Kitkat Chunky Bar
		 */
		vm.add("Kitkat Chunky Bar", 5); // this changes the status
		
		result = vm.checkStatus();
		assertEquals("Product added: Kitkat Chunky Bar (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Kitkat Chunky Bar");
		assertEquals("Kitkat Chunky Bar (5)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (5), Lay's Classic Chips (0)", result);
		
		/*
		 * Add stock of Lay's Classic Chips
		 */
		vm.add("Lay's Classic Chips", 5); // this changes the status
		
		result = vm.checkStatus();
		assertEquals("Product added: Lay's Classic Chips (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Lay's Classic Chips");
		assertEquals("Lay's Classic Chips (5)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (5), Lay's Classic Chips (5)", result);
		
		/*
		 * Add stock of an invalid product
		 */
		vm.add("Maltesers Chocolate", 4); // this changes the status
		
		result = vm.checkStatus();
		assertEquals("Invalid product: Maltesers Chocolate", result); // Notice the space between colon (:) and the invalid product's name.
		
		result = vm.checkStock("Maltesers Chocolate");
		assertEquals("Invalid product: Maltesers Chocolate", result); // Notice the space between colon (:) and the invalid product's name.
		
		result = vm.checkStock(); // stock of existing products remain the same
		assertEquals("Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (5), Lay's Classic Chips (5)", result);
	}
	
	/*
	 * Tests related to reducing stock from the vending machine
	 */
	@Test
	public void test_VendingMachine_03() {
		VendingMachine vm = new VendingMachine();
		
		/*
		 * Add stocks of products
		 */
		vm.add("Coke", 5); 
		vm.add("Orange Juice", 6);
		vm.add("Kitkat Chunky Bar", 7); 
		vm.add("Lay's Classic Chips", 8);
		String result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (6), Kitkat Chunky Bar (7), Lay's Classic Chips (8)", result);
		
		/*
		 * Remove stock of Coke
		 */
		vm.dispense("Coke", 1); // this changes the status
		
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (1)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Coke");
		assertEquals("Coke (4)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (6), Kitkat Chunky Bar (7), Lay's Classic Chips (8)", result);
		
		/*
		 * Remove stock of Orange Juice
		 */
		vm.dispense("Orange Juice", 2); // this changes the status
		
		result = vm.checkStatus();
		assertEquals("Product removed: Orange Juice (2)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Orange Juice");
		assertEquals("Orange Juice (4)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (4), Kitkat Chunky Bar (7), Lay's Classic Chips (8)", result);
		
		/*
		 * Remove stock of Kitkat Chunky Bar
		 */
		vm.dispense("Kitkat Chunky Bar", 3); // this changes the status
		
		result = vm.checkStatus();
		assertEquals("Product removed: Kitkat Chunky Bar (3)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Kitkat Chunky Bar");
		assertEquals("Kitkat Chunky Bar (4)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (4), Kitkat Chunky Bar (4), Lay's Classic Chips (8)", result);
		
		/*
		 * Remove stock of Lay's Classic Chips
		 */
		vm.dispense("Lay's Classic Chips", 4); // this changes the status
		
		result = vm.checkStatus();
		assertEquals("Product removed: Lay's Classic Chips (4)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Lay's Classic Chips");
		assertEquals("Lay's Classic Chips (4)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (4), Kitkat Chunky Bar (4), Lay's Classic Chips (4)", result);
		
		/*
		 * Remove stock of an invalid product
		 */
		vm.dispense("M & M's Chocoloate Bag", 4); // this changes the status
		
		result = vm.checkStatus();
		assertEquals("Invalid product: M & M's Chocoloate Bag", result); // Notice the space between colon (:) and the invalid product's name.
		
		result = vm.checkStock("M & M's Chocoloate Bag");
		assertEquals("Invalid product: M & M's Chocoloate Bag", result); // Notice the space between colon (:) and the invalid product's name.
		
		result = vm.checkStock(); // stock of existing products remain the same
		assertEquals("Stock: Coke (4), Orange Juice (4), Kitkat Chunky Bar (4), Lay's Classic Chips (4)", result);
	}
	// try when you add and remove and get 0, 0, 0, 0 --> checkstatus to see if it works
	
	/*
	 * Additional tests related to using a vending machine
	 */
	@Test
	public void test_VendingMachine_04() {
		VendingMachine vm = new VendingMachine();
		
		/* You may add additional, similar tests on other products */
		 
		vm.add("Kitkat Chunky Bar", 7);
		assertEquals("Kitkat Chunky Bar (7)", vm.checkStock("Kitkat Chunky Bar"));
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (7), Lay's Classic Chips (0)", vm.checkStock());
		
		vm.dispense("Kitkat Chunky Bar", 3);
		assertEquals("Kitkat Chunky Bar (4)", vm.checkStock("Kitkat Chunky Bar"));
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (4), Lay's Classic Chips (0)", vm.checkStock());
		
		vm.add("Kitkat Chunky Bar", 5);
		assertEquals("Kitkat Chunky Bar (9)", vm.checkStock("Kitkat Chunky Bar"));
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (9), Lay's Classic Chips (0)", vm.checkStock());
	}
	
	
	// tests by me
	@Test
	public void test_VendingMachine_05() {
		VendingMachine vm = new VendingMachine();
		
		/*
		 * Add stock of Coke
		 */
		vm.add("Coke", 5); // this changes the status
		
		String result = vm.checkStatus();
		assertEquals("Product added: Coke (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Coke");
		assertEquals("Coke (5)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		vm.add("Coke", 19);
		result = vm.checkStock();
		assertEquals("Stock: Coke (24), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		result = vm.checkStatus();
		assertEquals("Product added: Coke (19)", result);
		
		vm.dispense("Coke", 3);
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (3)", result);
		result = vm.checkStock();
		assertEquals("Stock: Coke (21), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
	}
	
	@Test
	public void test_VendingMachine_06() {
		VendingMachine vm = new VendingMachine();
		
		/*
		 * Add stock of Coke
		 */
		vm.add("Coke", 9); // this changes the status
		
		String result = vm.checkStatus();
		assertEquals("Product added: Coke (9)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Coke");
		assertEquals("Coke (9)", result);
		
		result = vm.checkStock("Orange Juice");
		assertEquals("Orange Juice (0)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (9), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		vm.add("Kitkat Chunky Bar", 6);
		
		result = vm.checkStatus();
		assertEquals("Product added: Kitkat Chunky Bar (6)", result);
		
		result = vm.checkStock("Kitkat Chunky Bar");
		assertEquals("Kitkat Chunky Bar (6)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (9), Orange Juice (0), Kitkat Chunky Bar (6), Lay's Classic Chips (0)", result);
		
		vm.dispense("Coke", 3);
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (3)", result);
		result = vm.checkStock();
		assertEquals("Stock: Coke (6), Orange Juice (0), Kitkat Chunky Bar (6), Lay's Classic Chips (0)", result);
	}
	
	@Test
	public void test_VendingMachine_07() {
		VendingMachine vm = new VendingMachine();
		
		/*
		 * Add stock of Coke
		 */
		vm.add("Coke", 9); // this changes the status
		
		String result = vm.checkStatus();
		assertEquals("Product added: Coke (9)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Coke");
		assertEquals("Coke (9)", result);
		
		result = vm.checkStock("Orange Juice");
		assertEquals("Orange Juice (0)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (9), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		vm.add("Kitkat Chunky Bar", 6);
		
		result = vm.checkStatus();
		assertEquals("Product added: Kitkat Chunky Bar (6)", result);
		
		result = vm.checkStock("Kitkat Chunky Bar");
		assertEquals("Kitkat Chunky Bar (6)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (9), Orange Juice (0), Kitkat Chunky Bar (6), Lay's Classic Chips (0)", result);
		
		vm.dispense("Coke", 3);
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (3)", result);
		result = vm.checkStock();
		assertEquals("Stock: Coke (6), Orange Juice (0), Kitkat Chunky Bar (6), Lay's Classic Chips (0)", result);
		
		
		vm.dispense("Kitkat Chunky Bar", 6);
		result = vm.checkStatus();
		assertEquals("Product removed: Kitkat Chunky Bar (6)", result);
		
		vm.dispense("Coke", 2);
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (2)", result);
		result = vm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		vm.dispense("Coke", 4);
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (4)", result);
		
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (4)", result);
		
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (4)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
	}
	
	@Test
	public void test_VendingMachine_08() {
		VendingMachine vm = new VendingMachine();
		
		/*
		 * Add stock of Coke
		 */
		vm.add("Coke", 9); // this changes the status
		
		String result = vm.checkStatus();
		assertEquals("Product added: Coke (9)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Coke");
		assertEquals("Coke (9)", result);
		
		result = vm.checkStock("Orange Juice");
		assertEquals("Orange Juice (0)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (9), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		vm.add("Kitkat Chunky Bar", 6);
		
		result = vm.checkStatus();
		assertEquals("Product added: Kitkat Chunky Bar (6)", result);
		
		result = vm.checkStock("Kitkat Chunky Bar");
		assertEquals("Kitkat Chunky Bar (6)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (9), Orange Juice (0), Kitkat Chunky Bar (6), Lay's Classic Chips (0)", result);
		
		vm.dispense("Coke", 3);
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (3)", result);
		result = vm.checkStock();
		assertEquals("Stock: Coke (6), Orange Juice (0), Kitkat Chunky Bar (6), Lay's Classic Chips (0)", result);
		
		vm.dispense("Kitkat Chunky Bar", 6);
		result = vm.checkStatus();
		assertEquals("Product removed: Kitkat Chunky Bar (6)", result);
		
		vm.dispense("Coke", 2);
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (2)", result);
		result = vm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		vm.dispense("Coke", 4);
		result = vm.checkStatus();
		assertEquals("Product removed: Coke (4)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
	}
	
	@Test
	public void test_VendingMachine_09() {
		VendingMachine vm = new VendingMachine();
		
		/* You may add additional, similar tests on other products */
		 
		vm.add("Pepsi", 7);
		assertEquals("Invalid product: Pepsi", vm.checkStock("Pepsi"));
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", vm.checkStock());
		
		vm.add("Kitkat Chunky Bar", 102);
		assertEquals("Kitkat Chunky Bar (102)", vm.checkStock("Kitkat Chunky Bar"));
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (102), Lay's Classic Chips (0)", vm.checkStock());
		
		vm.dispense("Kitkat Chunky Bar", 99);
		assertEquals("Kitkat Chunky Bar (3)", vm.checkStock("Kitkat Chunky Bar"));
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (3), Lay's Classic Chips (0)", vm.checkStock());
	}
}
