package model;

public class Customer {
	
		// Attributes
		private String name;
		private double balance;
		private Record[] maxListOrder;
		private Record[] orderRecord;
		private int noo;
		private final int MAX_NUM_ORDER = 30;
	
		// Constructor
		public Customer(String name) {
			this.name = name;
			this.maxListOrder = new Record[MAX_NUM_ORDER];
			
		}
		
		public Customer(String name, double balance) {
			this(name);
			this.balance = balance;
		}
		
		// Accessor
		public String getName() {
			return this.name;
		}
		
		public double getBalance() {
			return this.balance;
		}
		
		
		public Record[] getRecords() {
			if(this.noo <= MAX_NUM_ORDER) {
				this.orderRecord = new Record[this.noo];
				for (int i = 0; i < this.noo; i ++) {
					this.orderRecord[i] = this.maxListOrder[i];
				}
			}
			return this.orderRecord;
		}
		
		public double getAmountDue() {
			double amount = 0;
			for (int i = 0; i < this.noo; i ++) {
				amount += this.maxListOrder[i].getQuantity() * this.maxListOrder[i].getPrice();
			}
			return amount;
		}
		
		public int getNOO() {
			return this.noo;
		}
		
		public Record[] getList() {
			return this.maxListOrder;
		}
		
		public Record[] getRecordsLargerThan(int num) {
			int count = 0;
			boolean stay = true;
			int k = 0;
			for (int i = 0; i < this.noo; i ++) {
				if((this.maxListOrder[i].getPrice() * this.maxListOrder[i].getQuantity()) > num) {
					count ++;
				}
			}
			
			Record[] arrayNow = new Record[count];
			for (int m = 0; m < this.noo; m ++) {
				if((this.maxListOrder[m].getPrice() * this.maxListOrder[m].getQuantity()) > num) {
					stay = true;
					for (;stay && k < count; k ++) {
					arrayNow[k] = maxListOrder[m];
					stay = false;
					}
				}
			}
			return arrayNow;
		}
		
		
		// Mutator 
		public void deposit(double newBalance) {
			this.balance = newBalance;
			
		}
		
		public void addRecord(Record newRecord) {
			this.maxListOrder[this.noo] = newRecord;
			this.noo ++;
			
		}
	
		public void addRecord(String newItem, double newPrice, int newQuantity) {
			Record r = new Record(newItem, newPrice, newQuantity);
			this.maxListOrder[this.noo] = r;
			this.noo ++;
		}
		
		public void addRecords(Record[] orders) {
			for (int i = 0; i < orders.length; i ++) {
				this.maxListOrder[this.noo] = orders[i];
				this.noo ++;
			}
		}
		
		public void setNOO() {
			this.noo = 0;
		}
		
		
}


























