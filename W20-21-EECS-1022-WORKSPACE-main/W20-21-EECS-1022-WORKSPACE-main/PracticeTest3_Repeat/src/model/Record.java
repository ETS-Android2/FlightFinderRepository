package model;

public class Record {
	
	// Attributes
	private String coffee;
	private double price;
	private int quantity;
	
	
	// Constructor
	public Record() {
		
	}
	
	public Record(String coffee, double price, int quantity) {
		this.coffee = coffee;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Accessor
	
	public String getItem() {
		return this.coffee;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int  getQuantity() {
		return this.quantity;
	}
	
	// Mutator
	
	public void setItem (String newCoffee){
		this.coffee = newCoffee;
	}
		
	public void setPrice(double newPrice){
		this.price = newPrice;
	}

	public void setQuantity(int newQuantity){
	this.quantity = newQuantity;
	}
}






















