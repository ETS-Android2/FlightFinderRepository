package helper_methods;

/*
 * Poor version of code which "smells" (with lots of duplicates) 
 */
public class StudentImproved {
	private String name; 
	private double balance;
	public StudentImproved(String n, double b) { 
		name = n; 
		balance = b; 
	} 

	/* Tasks:
	 * 1. A mutator void receiveScholarship(double val)
	 * 2. A mutator void payLibraryOverdue(double val)
	 * 3. A mutator void payCafeCoupons(double val)
	 * 4. A mutator void transfer(Student other, double val)
	 */
	
	
	/*
	 * Two helper mutators for incrementing and decrementing balances.
	 */
	
	private void deposit(double val) {
		this.balance = this.balance + val;
	}
	
	private void Withdraw(double val) {
		this.balance = this.balance - val;
	}
	
	
	
	public void receiveScholarship(double val) {
		this.deposit(val);
	}
	
	public void payLibraryOverdue(double val) {
		this.Withdraw(val);
	}
	
	public void payCafeCoupons(double val) {
		this.Withdraw(val);
	}
	
	public void transfer(StudentImproved other, double val) {
		this.Withdraw(val);
		other.deposit(val);;
	}
}	














