package model;

public class Item {
	// Attributes 
	private String item;
	private int amount;
	private String info;
	private boolean errorExist;
	
	private int tempAmount;
	
	// Constructor
	public Item(String item) {
		this.amount = 0;
		this.item = item;
		this.errorExist = false;
	}
	
	// Accessor 
	public String getTitle() {
		return this.item;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public String getInfo() {
		if (!this.errorExist) {
			this.info = "Item: " + this.item + " (" + this.amount + ")";
		}
		else {
		}
		
		return this.info;
	}
	
	public int getTempAmount() {
		return this.tempAmount;
	}
	// Mutator
	public void increaseAmount(int newAmount) {
		this.tempAmount = newAmount;
		if (newAmount <= 0) {
			this.info = "Error: non-positive amount " + newAmount;
			this.errorExist = true;
		}
		else {
			this.amount += newAmount;
		}
	}
	
	public void decreaseAmount(int newAmount) {
		this.tempAmount = newAmount;
		if (newAmount <= 0) {
			this.info = "Error: non-positive amount " + newAmount;
			this.errorExist = true;
		}
		else if (newAmount > this.amount) {
			this.info = "Error: amount is short of " + (newAmount - this.amount);
		}
		else {
			this.amount -=  newAmount;
		}
	}
	
}

























