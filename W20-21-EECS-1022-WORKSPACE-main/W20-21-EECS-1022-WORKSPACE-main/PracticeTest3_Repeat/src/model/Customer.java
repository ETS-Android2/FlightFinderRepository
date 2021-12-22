package model;

public class Customer {
	
	// Attributes
	private String name;
	private double balance;
	private Record[] records;
	private int count;
	private Record[] backup;
	
	// Constructor
	
	public Customer(String name) {
		this.name = name;
		this.records = new Record[30];
		
	}
	
	public Customer(String name, double balance) {
		this(name);
		this.balance = balance;
	}
	
	
	// Accessor
	
	public String getName(){
		return this.name;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public Record[] getRecords(){
		this.backup = new Record[count];
		for (int i = 0; i < this.count; i ++) {
			this.backup[i] = this.records[i];
		}
		return this.backup;
	}
	
	public double getAmountDue() {
		double amount = 0;
		for (int i = 0; i < this.count; i ++) {
			amount += this.records[i].getPrice() * this.records[i].getQuantity();
		}
		return amount;
	}
	
	public Record[] getRecordsLargerThan(int num) {
		int repeat = 0;
		int m = 0;
		boolean stay = true;
		for(int i = 0; i < this.count; i ++) {
			if (this.records[i].getPrice() * this.records[i].getQuantity() > num) {
				repeat ++;
			}
		}
		
		Record[] temp = new Record[repeat];
		
		for(int i = 0; i < this.count; i ++) {
			if (this.records[i].getPrice() * this.records[i].getQuantity() > num) {
				stay = true;
				for(; stay && m < repeat; m ++) {
					temp[m] = this.records[i];
					stay = false;
				}
			}
		}
		
		return temp;
	}
	// Mutator
	
	public void deposit(double newBalance) {
		this.balance = newBalance;
	}
	
	public void addRecord(Record record) {
		this.records[this.count] = record;
		this.count ++;
	}
	
	public void addRecords(Record[] records) {
		for (int i = 0; i < records.length; i ++) {
			this.records[this.count] = records[i];
			this.count ++ ;
		}
		
	}
	
	public void addRecord(String coffee, double price, int quantity) {
		Record r = new Record(coffee, price, quantity);
		this.records[this.count] = r;
		this.count ++;
	}
	
	public void setcount() {
		this.count = 0;
	}
	
	
	
}




















