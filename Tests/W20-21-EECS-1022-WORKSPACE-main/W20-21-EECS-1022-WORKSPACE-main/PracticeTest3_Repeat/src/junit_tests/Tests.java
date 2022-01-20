package junit_tests;

import model.*;
import model.Record;

import static org.junit.Assert.*;
import org.junit.Test;

/* Problem:
 * A coffee shop has a list of up to 100 customers. 
 * Each customer has a name, a list of up to 30 current order records, and a balance of their account (e.g., 40.5). 
 * Each record is characterized by the item (e.g., "Americano", "Cafe Latte", etc.), its unit price (e.g., 4.7), and the quantity (e.g., 4). 
 * Given a record, we may get its product name, unit price, or quantity. 
 * Given a customer, we may:
 * 	- add a record or a list of records to their basket, 
 * 	- current balance, current list of records, 
 * 	- amount to pay (based on the records they have added so far), or
 * 	- retrieve the list of orders more worth than a given price. 
 * Given a shop, we may:
 * 	- add a customer, or 
 * 	- return the current list of customers. G
 * 	- given a customer name, if it exists, pay for that customer’s current records, by deducting their balance and clearing their charged records accordingly.
 * 
 * For more details, see the in-line comments in the Tester class given to you.
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
		Record r1 = new Record("GreenTeaLatte", 2.5, 4);

		assertEquals("GreenTeaLatte", r1.getItem());
		assertEquals(2.5, r1.getPrice(), 0.01);
		assertEquals(4, r1.getQuantity()); 
	}//new Record("GreenTeaLatte", 3.5, 4) expects values to be set

	@Test
	public void test_02() {
        Record r2 = new Record();

        assertEquals(null, r2.getItem());
        assertEquals(0.0, r2.getPrice(), 0.01);
        assertEquals(0, r2.getQuantity());
    }//new Record() expects default values to be set

    @Test
    public void test_03() {
        Record r2 = new Record();
        r2.setItem("GreenTeaLatte");
        r2.setPrice(2.5);
        r2.setQuantity(3);

        assertEquals("GreenTeaLatte", r2.getItem()); 
        assertEquals(2.5, r2.getPrice(), 0.01); 
        assertEquals(3, r2.getQuantity()); 
    }//new Record() then setter methods to set customized values

    @Test
    public void test_04() {
        Customer alan = new Customer("Alan", 150.0);
        assertEquals("Alan", alan.getName());
        assertEquals(150.0, alan.getBalance(), 0.01);
    }//new Customer("Alan", 150.0) creates a customer with initial balance 150.0

    @Test
    public void test_05() {
        Customer mark = new Customer("Alan"); /* a customer with initial balance 0.0 */
        assertEquals(0.0, mark.getBalance(), 0.01);
    }//new Customer("Alan") creates a customer with initial balance 0.0

    @Test
    public void test_06() {
		Customer alan = new Customer("Alan", 150.0); 
		Record[] alanRecords = alan.getRecords();

		assertEquals(0, alanRecords.length); 
	}//new Customer("Alan", 150.0) creates a customer with an empty array of records

	@Test
	public void test_07() {
		Customer alan = new Customer("Alan", 150.0); 
		double alanPay = alan.getAmountDue();

		assertEquals(0.0, alanPay, 0.01);
	}//new Customer("Alan", 150.0) creates a customer with 0.0 to pay

	@Test
	public void test_08() {
		Customer mark = new Customer("Mark");
		Record[] markRecords = mark.getRecords();

		assertEquals(0, markRecords.length);
	}//new Customer("Alan") creates a customer with an empty array of records

	@Test
	public void test_09() {
		Customer mark = new Customer("Mark");
		double markPay = mark.getAmountDue();

		assertEquals(0.0, markPay, 0.01);
	}//new Customer("Alan") creates a customer with 0.0 to pay

	@Test
	public void test_10() {
		Customer mark = new Customer("Mark");
		mark.deposit(200.0);

		assertEquals(200.0, mark.getBalance(), 0.01);
	}//new Customer("Alan") then deposit(200.0) leaves a customer with balance 200.0

	@Test
	public void test_11() {
		Record r1 = new Record("GreenTeaLatte", 2.5, 4);
		Customer alan = new Customer("Alan", 150.0); 
		alan.addRecord(r1);
		Record[] alanRecords = alan.getRecords();
		Record alanRecord1 = alanRecords[0];

		assertEquals(1, alanRecords.length);
		assertEquals("GreenTeaLatte", alanRecord1.getItem());
		assertEquals(2.5, alanRecord1.getPrice(), 0.01);
		assertEquals(4, alanRecord1.getQuantity());
	}//addRecord(r1) adds in r1 accordingly

	@Test
	public void test_12() {
		Record r1 = new Record("GreenTeaLatte", 2.5, 4);
		Customer alan = new Customer("Alan", 150.0); 
		alan.addRecord(r1);
		double alanPay = alan.getAmountDue();

		assertEquals(10.0, alanPay, 0.01);
	}//addRecord(r1) followed by getAmountDue

	@Test
	public void test_13() {
		Record r1 = new Record("GreenTeaLatte", 2.5, 4);
		Customer alan = new Customer("Alan", 150.0); 
		alan.addRecord(r1);
		alan.addRecord("DietCoke", 1.5, 7);

		Record[] alanRecords = alan.getRecords();

		assertEquals(2, alanRecords.length);
		Record alanRecord1 = alanRecords[0];

		assertEquals("GreenTeaLatte", alanRecord1.getItem());
		assertEquals(2.5, alanRecord1.getPrice(), 0.01);
		assertEquals(4, alanRecord1.getQuantity());

		Record alanRecord2 = alanRecords[1];
		assertEquals("DietCoke", alanRecord2.getItem());
		assertEquals(1.5, alanRecord2.getPrice(), 0.01);
		assertEquals(7, alanRecord2.getQuantity());
	}//add two records to a customer

	@Test
	public void test_14() {
		Record r1 = new Record("GreenTeaLatte", 2.5, 4);
		Customer alan = new Customer("Alan", 150.0); 
		alan.addRecord(r1);
		alan.addRecord("DietCoke", 1.5, 7);
		double alanPay = alan.getAmountDue();

		assertEquals(20.5, alanPay, 0.01);
	}//add two records to a customer and getAmountDue
	
	@Test
	public void test_15() {
		Customer alan = new Customer("Alan");
		Record[] orders = new Record[0];
		alan.addRecords(orders);
		assertEquals(0, alan.getRecords().length);
	}//alan.addRecords({}) where alan has an empty array of orders

	@Test
	public void test_16() {
		Customer alan = new Customer("Alan");
		Record[] orders = {new Record()};
		alan.addRecords(orders);
		assertEquals(1, alan.getRecords().length);
	}//alan.addRecords({_}) where m has an empty array of orders

	@Test
	public void test_17() {
		Customer alan = new Customer("Alan");
		Record[] orders = {new Record(), new Record()};
		alan.addRecords(orders);
		assertEquals(2, alan.getRecords().length);
	}//alan.addRecords({_, _}) where m has an empty array of orders

	@Test
	public void test_18() {
		Customer alan = new Customer("Alan");
		Record[] orders = new Record[30];
		for(int i = 0; i < 30; i ++) {
			orders[i] = new Record();
		}
		alan.addRecords(orders);
		assertEquals(30, alan.getRecords().length);
	}//alan.addRecords(30 orders) where m has an empty array of orders

	@Test
	public void test_19() {
		Customer alan = new Customer("Alan");
		alan.addRecord(new Record());
		alan.addRecord(new Record());
		alan.addRecord(new Record());
		Record[] orders = new Record[0];
		alan.addRecords(orders);
		assertEquals(3, alan.getRecords().length);
	}//alan.addRecords({}) where m has a non-empty array of orders

	@Test
	public void test_20() {
		Customer alan = new Customer("Alan");
		alan.addRecord(new Record());
		alan.addRecord(new Record());
		alan.addRecord(new Record());
		Record[] orders = {new Record()};
		alan.addRecords(orders);
		assertEquals(4, alan.getRecords().length);
	}//alan.addRecords({_}) where m has a non-empty array of orders

	@Test
	public void test_21() {
		Customer alan = new Customer("Alan");
		alan.addRecord(new Record());
		alan.addRecord(new Record());
		alan.addRecord(new Record());
		Record[] orders = {new Record(), new Record()};
		alan.addRecords(orders);
		assertEquals(5, alan.getRecords().length);
	}//alan.addRecords({_, _}) where m has a non-empty array of orders

	@Test
	public void test_22() {
		Customer alan = new Customer("Alan");
		alan.addRecord(new Record());
		alan.addRecord(new Record());
		alan.addRecord(new Record());
		Record[] orders = new Record[27];
		for(int i = 0; i < 27; i ++) {
			orders[i] = new Record();
		}
		alan.addRecords(orders);
		assertEquals(30, alan.getRecords().length);
	}//alan.addRecords(27 orders) where m already has 3 orders
	
	@Test
	public void test_23() {
		Customer alan = new Customer("Alan");
		Record o1 = new Record("Coke", 3.4, 8);
		alan.addRecord(o1);
		Record[] expected = {};
		// 3.4 * 8 is not more worth than 28
		assertArrayEquals(expected, alan.getRecordsLargerThan(28));
	}//alan.getRecordsLargerThan() test 1
	
	@Test
	public void test_24() {
		Customer alan = new Customer("Alan");
		Record o1 = new Record("Coke", 3.4, 8);
		alan.addRecord(o1);
		Record[] expected = {o1};
		// 3.4 * 8 is not more worth than 27
		assertArrayEquals(expected, alan.getRecordsLargerThan(27));
	}//alan.getRecordsLargerThan() test 2
	
	@Test
	public void test_25() {
		Customer alan = new Customer("Alan");
		Record o1 = new Record("One", 3, 7);
		Record o2 = new Record("Two", 3, 3);
		Record o3 = new Record("Three", 3, 9);
		Record o4 = new Record("Four", 3, 1);
		alan.addRecord(o1);
		alan.addRecord(o2);
		alan.addRecord(o3);
		alan.addRecord(o4);
		Record[] expected = {};
		assertArrayEquals(expected, alan.getRecordsLargerThan(30));
	}//alan.getRecordsLargerThan() test 3
	
	@Test
	public void test_26() {
		Customer alan = new Customer("Alan");
		Record o1 = new Record("One", 3, 7);
		Record o2 = new Record("Two", 3, 3);
		Record o3 = new Record("Three", 3, 9);
		Record o4 = new Record("Four", 3, 1);
		alan.addRecord(o1);
		alan.addRecord(o2);
		alan.addRecord(o3);
		alan.addRecord(o4);
		Record[] expected = {o1, o3};
		assertArrayEquals(expected, alan.getRecordsLargerThan(20));
	}//alan.getRecordsLargerThan() test 4

	@Test
	public void test_27() {
		Shop hollys = new Shop();
		Customer[] customers = hollys.getCustomers();

		assertEquals(0, customers.length);
	}//new Shop has an empty array of customers

	@Test
	public void test_28() {
		Shop hollys = new Shop();
		Customer alan = new Customer("Alan", 150.0); 
		Customer mark = new Customer("Mark");
		mark.deposit(200.0);
		hollys.addCustomer(mark);
		hollys.addCustomer(alan);
		Customer[] customers = hollys.getCustomers();

		assertEquals(2, customers.length);
	}//two customers added to an empty shop

	@Test
	public void test_29() {
		Record o1 = new Record("GreenTeaLatte", 2.5, 4);
		Customer alan = new Customer("Alan", 150.0); 
		alan.addRecord(o1);
		alan.addRecord("DietCoke", 1.5, 7);
		Customer mark = new Customer("Mark");
		mark.deposit(200.0);
		Shop hollys = new Shop();
		hollys.addCustomer(mark);

		/* charge a non-existing customer: do nothing */
		hollys.pay("mem1");

		assertEquals(150, alan.getBalance(), 0.01);
		assertEquals(200, mark.getBalance(), 0.01);
	}//checkout on a non-existing customer does not modify others' balances

	@Test
	public void test_30() {
		Record o1 = new Record("GreenTeaLatte", 2.5, 4);
		Customer alan = new Customer("Alan", 150.0); 
		alan.addRecord(o1);
		alan.addRecord("DietCoke", 1.5, 7);
		Customer mark = new Customer("Mark");
		mark.deposit(200.0);
		Shop hollys = new Shop();
		hollys.addCustomer(mark);
		hollys.addCustomer(alan);
		hollys.pay(alan.getName());
		hollys.pay(mark.getName());

		assertEquals(129.5, alan.getBalance(), 0.01);
		assertEquals(200.0, mark.getBalance(), 0.01);
	}//checkout on existing customers modifies their balances

	@Test
	public void test_31() {
		Record o1 = new Record("GreenTeaLatte", 2.5, 4);
		Customer alan = new Customer("Alan", 150.0); 
		alan.addRecord(o1);
		alan.addRecord("DietCoke", 1.5, 7);
		Customer mark = new Customer("Mark");
		mark.deposit(200.0);
		Shop hollys = new Shop();
		hollys.addCustomer(mark);
		hollys.addCustomer(alan);
		hollys.pay(alan.getName());
		hollys.pay(mark.getName());
		Record[] alanRecords = alan.getRecords();

		assertEquals(0, alanRecords.length);
	}//after checkout, a customer's array of records defaults to empty

	@Test
	public void test_32() {
		Record o1 = new Record("GreenTeaLatte", 2.5, 4);
		Customer alan = new Customer("Alan", 150.0); 
		alan.addRecord(o1);
		alan.addRecord("DietCoke", 1.5, 7);
		Customer mark = new Customer("Mark");
		mark.deposit(200.0);
		Shop hollys = new Shop();
		hollys.addCustomer(mark);
		hollys.addCustomer(alan);
		hollys.pay(alan.getName());
		hollys.pay(mark.getName());
		double alanPay = alan.getAmountDue();
		double markPay = mark.getAmountDue();

		assertEquals(0.0, alanPay, 0.01);
		assertEquals(0.0, markPay, 0.01);
	}//after checkout, a customer's amount to pay defaults to 0.0
}
