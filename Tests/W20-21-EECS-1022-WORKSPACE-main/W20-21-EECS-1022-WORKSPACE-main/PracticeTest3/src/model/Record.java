package model;

public class Record {
	// Attributes
	private String item;
	private double price;
	private int quantity;
	
	// Constructor
	public Record() {
		this.item = null;
		this.price = 0;
		this.quantity = 0;
		
	}
	public Record(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Accessor
	public String getItem() {
		return this.item;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	// Mutator 
	public void setItem(String newItem) {
		this.item = newItem;
		
	}
	
	public void setPrice(double newPrice) {
		this.price = newPrice;
		
	}
	
	public void setQuantity(int newQuantity) {
		this.quantity = newQuantity;
		
	}
}






















