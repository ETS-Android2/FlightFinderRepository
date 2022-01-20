package model;

/*
 * This class is only used for Version 1 where ArrayList is used.
 */

public class BirthdayBookEntry {
	private String name;
	private Birthday birthday;
	
	public BirthdayBookEntry(String name, Birthday birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Birthday getBirthday() {
		return this.birthday;
	}
	
	
}
