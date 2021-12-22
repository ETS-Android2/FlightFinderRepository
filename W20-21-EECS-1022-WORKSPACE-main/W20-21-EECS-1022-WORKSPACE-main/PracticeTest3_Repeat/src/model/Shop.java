package model;

public class Shop {
		// Attributes
	private Customer[] customers;
	private Customer[] back;
	private int num;
	
	
	
		// Constructor
	
	public Shop() {
		this.customers = new Customer[100];
		this.num = 0;
		
	}
	
		// Accessor
	
	public Customer[] getCustomers() {
		this.back = new Customer[this.num];
		for(int i = 0; i < this.num; i ++) {
			this.back[i] = this.customers[i];
		}
		return this.back;
	}
		
		// Mutator
	
	public void addCustomer(Customer customer) {
		this.customers[this.num] = customer;
		this.num ++;
		
	}
	
	public void pay(String name) {
		double total = 0;
		double spend = 0;
		Customer temp = null;
		boolean stay = true;
		boolean stay1 = true;
		
		for (int i = 0; stay && i < this.num; i ++) {
			if (this.customers[i].getName().equals(name)) {
				temp = this.customers[i];
				for(int m = 0; stay1 && m < this.customers[i].getRecords().length; m ++) {
						spend += this.customers[i].getRecords()[m].getPrice() * this.customers[i].getRecords()[m].getQuantity();
					}
				stay = false;
			}
		}
		
		if (temp != null) {
			total = temp.getBalance() - spend;
			temp.deposit(total);
			temp.setcount();
		}
		
			
	}
}























