package model;

import java.util.Hashtable;

public class BirthdayBookV2 {
	
	private  Hashtable<String, Birthday> imp;
	
	public BirthdayBookV2() {
		this.imp = new Hashtable<>(); // or this.imp = new Hashtable<String, Birthday>();
	}
	
	// Return the number of entries (each of which containing a name and birthday) in the birthday book.
	public int getSize() {
		return this.imp.size();
	}
	
	// Return the birthday of the person whose name is 'name'
	// if the input 'name' does not exits, return null.
	public Birthday getBirthday(String name) {
		return this.imp.get(name);
	}
	
	public String[] remind(Birthday birthday) {
		int counter = 0;
		String[] temp = new String[this.imp.size()];
		
		for (String names : this.imp.keySet()) {
			if (this.imp.get(names).getDay() == birthday.getDay() && this.imp.get(names).getMonth() == birthday.getMonth()) {
				temp[counter] = names;
				counter ++;
			}
		}
		
		String[] result = new String[counter];
		for (int i = 0; i < counter; i ++ ) {
			result[i] = temp[i];
		}
		
		return result;
	}
	
	// Assumption: input 'name' does not exist in the birthday book
	public void addBirthday(String name, Birthday birthday) {
		this.imp.put(name, birthday);
	}
	
	// Assumption: input 'name' exists in the birthday book.
	public void removeBirthday(String name) {
		this.imp.remove(name);
	}
	
}
