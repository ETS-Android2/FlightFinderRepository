package model;

public class Equipment {
	// Attributes
	private String product;
	private int stock;
	private int tempStock;
	private boolean condition;
	private boolean condition2;
	
	
	private int now;


	/* ------------------------------------------- */
	// Constructor
	
	public Equipment(String product) {
		this.product = product;
		this.stock = 0;
		this.condition = false;
	}
	


	/* ------------------------------------------- */
	// Accessor

	public String  getName() {
		return this.product;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public int getnow() {
		return this.now;
	}
	
	public String  getStatus() {
		String result = null;
		if (this.condition == true) {
			result = "Error: non-positive quantity " + this.tempStock;
		}
		else if (this.condition2 == true ) {
			result = "Error: quantity is short of " + this.tempStock;
		}
		else {
			result = "Equipment: " + this.product + " (" + this.stock + ")";
		}
		
		return result;
	}
	
	


	/* ------------------------------------------- */
	// Mutator
	public void addStock() {

	}
	
	public void addStock(int stock) {
		this.now = stock;
		if (stock <= 0) {
			condition = true;
			this.tempStock = stock;
		}
		else {
			this.stock += stock;
			condition = false;
		}
	}
	
	public void removeStock(int stock) {
		if (stock <= 0) {
			condition = true;
			this.tempStock = stock;
		}
		else {
			if (stock <= this.stock) {
				this.stock -= stock;
				condition2 = false;
			}
			else if (stock > this.stock) {
				this.condition2 = true;
				this.condition = false;
				this.tempStock = stock - this.stock;
			}
		}
		
		
	}
	
	public void setStock(int num) {
		this.stock += num;
	}
	
}



















