package helper_methods;

import oop.Person;

/*
 * Poor version of code which "smells" (with lots of duplicates) 
 */
public class PersonCollectorImproved {
	private final int MAX = 100; /* max # of persons to be stored */  
	private Person[] ps;
	private int nop; /* number of persons */

	public PersonCollectorImproved() { 
		this.ps = new Person[MAX]; 
	} 
	public void addPerson(Person p) { 
		this.ps[this.nop] = p; 
		this.nop++; 
	} 

	/*  Tasks:
	 *  1. An accessor: boolean personExists(String n)
	 *  2. A mutator: void changeWeightOf(String n, double w)
	 *  3. A mutator: void changeHeightOf(String n, double h)
	 */

	// Helper Method
	
	/*
	 * Return the index of person with matching name;
	 * Return -1 if no person exist in the array
	 */
	private int indexOfPerson(String name) {
		int tempI = -1;
		for (int i = 0; i < this.nop; i ++) {
			if (this.ps[i].getName().equals(name)) {
				tempI = i;
			}
		}
		return tempI;
	}
	
	
	public boolean personExists(String n) {
		boolean found = false;
		int indexSameName = this.indexOfPerson(n);
		if (indexSameName != -1) {
			found = true;
		}
		return found;
	}

	public void changeWeightOf(String n, double w) {
		int indexSameName = this.indexOfPerson(n);
		if (indexSameName != -1) {
			this.ps[indexSameName].setWeight(w); 
		}
	}

	public void changeHeightOf(String n, double h) {
		int indexSameName = this.indexOfPerson(n);
		if (indexSameName != -1) {
			this.ps[indexSameName].setHeight(h); 
		}
	}
	
}
