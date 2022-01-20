package helper_methods;

/*
 * Poor version of code which "smells" (with lots of duplicates) 
 */
public class Student {
	private String name; 
	private double balance;
	public Student(String n, double b) { 
		name = n; 
		balance = b; 
	} 

	/* Tasks:
	 * 1. A mutator void receiveScholarship(double val)
	 * 2. A mutator void payLibraryOverdue(double val)
	 * 3. A mutator void payCafeCoupons(double val)
	 * 4. A mutator void transfer(Student other, double val)
	 */

	public void receiveScholarship(double val) {
		this.balance = this.balance + val;
	}
	
	public void payLibraryOverdue(double val) {
		this.balance = this.balance - val;
	}
	
	public void payCafeCoupons(double val) {
		this.balance = this.balance - val;
	}
	
	public void transfer(Student other, double val) {
		this.balance = this.balance - val;
		other.balance = other.balance + val;
	}
}	
