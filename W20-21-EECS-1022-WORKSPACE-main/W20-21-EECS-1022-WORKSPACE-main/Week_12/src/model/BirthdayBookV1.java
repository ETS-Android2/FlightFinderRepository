package model;

import java.util.ArrayList;

public class BirthdayBookV1 {
	
	private ArrayList<BirthdayBookEntry> imp; // Implementation
	// No need to declare an integer counter to keep track of stored entries anymore
	
	public BirthdayBookV1() {
		this.imp = new ArrayList<>(); // or imp = new ArrayList<BirthdayBookEntry>(); 
	}
	
	// Return the number of entries (each of which containing a name and birthday) in the birthday book.
	public int getSize() {
		return this.imp.size();
	}
	
	// Return the birthday of the person whose name is 'name'
	// if the input 'name' does not exits, return null.
	public Birthday getBirthday(String name) {
		Birthday result = null;
		
//		for (int i = 0; i < imp.size(); i ++) {
//			BirthdayBookEntry e = this.imp.get(i);
//			if (e.getName().equals(name)) {
//				result = e.getBirthday();
//			}
//		} 
		// OR
		
		int indexToGet = this.helperGetIndex(name);
		if (indexToGet != -1) {
			result = this.imp.get(indexToGet).getBirthday();
		}
		return result;
	}
	
	public String[] remind(Birthday birthday) {
		
		// Method 1
//		int counter = 0;
//		for (int i = 0; i < this.imp.size(); i ++) {
//			if (this.imp.get(i).getBirthday().getDay() == birthday.getDay() && this.imp.get(i).getBirthday().getMonth() == birthday.getMonth()) {
//				counter ++;
//			}
//		}
//		
//		String[] temp = new String[counter];
//		
//		int m = 0;
//		for (int i = 0; i < this.imp.size(); i ++) {
//			if (this.imp.get(i).getBirthday().getDay() == birthday.getDay() && this.imp.get(i).getBirthday().getMonth() == birthday.getMonth()) {
//				if(m < counter) {
//					temp[m]= this.imp.get(i).getName();
//					m ++;
//				}
//			}
//		}
		String[] temp = new String[this.imp.size()];
		int count = 0;
		
		for (int i = 0; i < this.imp.size(); i ++) {
			if (this.imp.get(i).getBirthday().getDay() == birthday.getDay() && this.imp.get(i).getBirthday().getMonth() == birthday.getMonth()) {
				temp[count] = this.imp.get(i).getName();
				count ++;
			}
		}
		
		String[] result = new String[count];
		
		for (int i = 0; i < count; i ++) {
			result[i] = temp[i];
		}
		return result;
	}
	
	// Assumption: input 'name' does not exist in the birthday book
	public void addBirthday(String name, Birthday birthday) {
		this.imp.add(new BirthdayBookEntry(name, birthday));
	}
	
	// Assumption: input 'name' exists in the birthday book.
	public void removeBirthday(String name) {
		int indexToBeRemoved = this.helperGetIndex(name);
		if (indexToBeRemoved != -1) {
			this.imp.remove(indexToBeRemoved);
		}	
	}
	

	
	// Helper method
	/*
	 * Return the index BirthdayBookEntry whose name
	 * matches the input 'name'
	 * Return -1 if the input 'name' does not exist in the birthday book.
	 */
	
	public int helperGetIndex(String name) {
		int index = -1;
		boolean earlyExit = true;
		for (int i = 0; earlyExit && i < this.imp.size(); i ++ ) {
			if (this.imp.get(i).getName().equals(name)) {
				index = i;
				earlyExit = false;
			}
		}
		return index;
	}
	
	
}















