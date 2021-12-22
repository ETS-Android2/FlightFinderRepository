package model;

public class Client {
	// Attributes
	private String name;
	private double amount;
	private String[] statement;
	private String[] backupStat;
	
	private int counter;
	
	// Constructor
	public Client(String name, double amount) {
		this.name = name;
		this.amount = amount;
		this.statement = new String[11];
		this.counter = 1;
	}
	// Accessor
	public String getStatus() {
		String result = "";
		result = this.name + ": $" + String.format("%.2f", this.amount);
		this.statement[0] = result;
		return result;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public String[] getStatement() {
		this.backupStat = new String[this.counter];
		this.backupStat[0] = this.name + ": $" + String.format("%.2f", this.amount);;
		for (int i = 1; i < this.counter; i ++) {
			this.backupStat[i] = this.statement[i];
		}
		return this.backupStat;
	}
		
	// Mutator
	public void deposit(double amount) {
		this.amount += amount;
		Transaction transaction = new Transaction("DEPOSIT", amount);
		this.statement[this.counter] = transaction.getStatus();
		this.counter ++;
	}
	
	public void withdraw(double amount) {
		this.amount -= amount;
		Transaction transaction = new Transaction("WITHDRAW", amount);
		this.statement[this.counter] = transaction.getStatus();
		this.counter ++;
	}
}





















