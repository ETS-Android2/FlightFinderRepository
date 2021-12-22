package junit_tests;

import static org.junit.Assert.*;

import model.*;
import org.junit.Test;

public class TestBirthdayBook {

	@Test
	public void test_01() {
		// create an empty birthday book
		BirthdayBookV1 bb = new BirthdayBookV1();
		assertEquals(0, bb.getSize());
		
		
		// Add four entries in to the birthday book
		Birthday bd1 = new Birthday(5, 21);
		Birthday bd2 = new Birthday(8, 11);
		Birthday bd3 = new Birthday(10, 15);
		
		bb.addBirthday("Alan", bd1);
		bb.addBirthday("Mark", bd2);
		bb.addBirthday("Tom", bd2);
		bb.addBirthday("Jim", bd3);
		
		assertEquals(4, bb.getSize());
		
		// Inquire about the birthdays
		Birthday jimBirthday = bb.getBirthday("Jim");
		assertTrue(jimBirthday.getMonth() == 10 && jimBirthday.getDay() == 15);
		assertNull(bb.getBirthday("Jeremy"));
		
		// add another entry into the birthday book
		bb.addBirthday("Suyeeon", new Birthday(5, 21));
		assertEquals(5, bb.getSize());
		
		/* remove an entry associated with input name */
		bb.removeBirthday("Alan");
		assertEquals(4, bb.getSize());
		assertNull(bb.getBirthday("Alan"));
		
		/* get reminders of names of people whose birthday are the given birthday */
		String[] reminders1 = bb.remind(new Birthday(8, 11));
		String[] expectedReminders1 = {"Mark", "Tom"};
		assertArrayEquals(expectedReminders1, reminders1);
		
		String[] reminders2 = bb.remind(new Birthday(11, 23));
		String[] expectedReminders2 = {};
		assertArrayEquals(expectedReminders2, reminders2);
	}
	
	@Test
	public void test_02() {
		// create an empty birthday book
		BirthdayBookV2 bb = new BirthdayBookV2();
		assertEquals(0, bb.getSize());
		
		
		// Add four entries in to the birthday book
		Birthday bd1 = new Birthday(5, 21);
		Birthday bd2 = new Birthday(8, 11);
		Birthday bd3 = new Birthday(10, 15);
		
		bb.addBirthday("Alan", bd1);
		bb.addBirthday("Mark", bd2);
		bb.addBirthday("Tom", bd2);
		bb.addBirthday("Jim", bd3);
		
		assertEquals(4, bb.getSize());
		
		// Inquire about the birthdays
		Birthday jimBirthday = bb.getBirthday("Jim");
		assertTrue(jimBirthday.getMonth() == 10 && jimBirthday.getDay() == 15);
		assertNull(bb.getBirthday("Jeremy"));
		
		// add another entry into the birthday book
		bb.addBirthday("Suyeeon", new Birthday(5, 21));
		assertEquals(5, bb.getSize());
		
		/* remove an entry associated with input name */
		bb.removeBirthday("Alan");
		assertEquals(4, bb.getSize());
		assertNull(bb.getBirthday("Alan"));
		
		/* get reminders of names of people whose birthday are the given birthday */
		String[] reminders1 = bb.remind(new Birthday(8, 11));
		String[] expectedReminders1 = {"Tom", "Mark"};			// in the case of hashtable, the order in which keySet return is unpredictable
		assertArrayEquals(expectedReminders1, reminders1);
		
		String[] reminders2 = bb.remind(new Birthday(11, 23));
		String[] expectedReminders2 = {};
		assertArrayEquals(expectedReminders2, reminders2);
	}

}

















