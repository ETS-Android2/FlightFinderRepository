package model;

public class Transaction {
// Attributes
	private String type;
	private double amount;
	
// Constructor
	public Transaction(String type, double amount) {
		this.amount = amount;
		this.type = type;
	}
	
// Accessor
	public String getStatus() {
		return 
				"Transaction " + this.type + ": $" + String.format("%.2f", this.amount);
	}
	
// Mutator
}
