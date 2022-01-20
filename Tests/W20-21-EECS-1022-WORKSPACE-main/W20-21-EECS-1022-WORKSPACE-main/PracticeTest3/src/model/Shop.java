package model;

public class Shop {
		// Attributes
	private Customer[] costumerList;
	private Customer[] backup;
	private int noc;
	
		// Constructor
	public Shop() {
		this.costumerList = new Customer[100];
		
	}
		
		// Accessor
		public Customer[] getCustomers() {
			if(this.noc <= 100) {
				this.backup = new Customer[this.noc];
				for (int i = 0; i < this.noc; i ++) {
					this.backup[i] = this.costumerList[i];
				}
			}
			return this.backup;
		}
		
		// Mutator 
		public void addCustomer(Customer nameC) {
			this.costumerList[this.noc] = nameC;
			this.noc ++;
			
		}
		
//		public void pay(String nameC) {
//			double sum = 0;
//			double spend = 0;
//			Customer c = null;
//			for (int i = 0; i < this.noc; i ++) {
//				if (this.costumerList[i].getName().equals(nameC)) {
//					c = this.costumerList[i];
//				}
//			}
//			if(c != null) {
//				for (int m = 0; m < c.getNOO(); m ++) {
//					spend += c.getList()[m].getPrice() * c.getList()[m].getQuantity();
//				}
//				sum = c.getBalance() - spend;
//				c.deposit(sum);
//				c.setNOO();
//			}
//		}
		
		// Version 2 (easier)
		public void pay(String nameC) {
			double sum = 0;
			double spend = 0;
			Customer c = null;
			for (int i = 0; i < this.noc; i ++) {
				if (this.costumerList[i].getName().equals(nameC)) {
					c = this.costumerList[i];
				}
			}
			
			if (c != null) {
				double left = c.getBalance() - c.getAmountDue();
				c.deposit(left);
				c.setNOO();
			}
		}
}
