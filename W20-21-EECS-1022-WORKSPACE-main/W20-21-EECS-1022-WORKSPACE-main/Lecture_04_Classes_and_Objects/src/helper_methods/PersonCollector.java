package helper_methods;

import oop.Person;

/*
 * Poor version of code which "smells" (with lots of duplicates) 
 */
public class PersonCollector {
	private final int MAX = 100; /* max # of persons to be stored */  
	private Person[] ps;
	private int nop; /* number of persons */

	public PersonCollector() { 
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

	public boolean personExists(String n) {
		boolean found = false;
		for(int i = 0; i < this.nop; i ++) {
			if(this.ps[i].getName().equals(n)) { 
				found = true; 
			}
		}
		return found;
	}

	public void changeWeightOf(String n, double w) {
		for(int i = 0; i < this.nop; i ++) {
			if(this.ps[i].getName().equals(n)) { 
				this.ps[i].setWeight(w); 
			} 
		}
	}

	public void changeHeightOf(String n, double h) {
		for(int i = 0; i < this.nop; i ++) {
			if(this.ps[i].getName().equals(n)) { 
				this.ps[i].setHeight(h); 
			} 
		}
	}
}
