package model;

// e.g., gym, tennis, spinning class, group power class
public class Facility {
	
	// Attributes
	String name;
	double price; // unit price
	int units;
	
	public Facility(String name, double price, int units) {
		this.name = name;
		this.price = price;
		this.units = units;
	}
	
	
}
