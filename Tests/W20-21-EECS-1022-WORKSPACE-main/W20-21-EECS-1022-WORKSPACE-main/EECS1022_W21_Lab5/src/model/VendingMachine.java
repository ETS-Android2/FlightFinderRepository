package model;

public class VendingMachine {

	/* Attributes*/
	
	String items;
	
	int numCoke;
	int numOrange;
	int numKitKat;
	int numLays;
	int countAddRemoved;
	boolean add;

	/* Constructor*/
	
	public VendingMachine() {
		this.numCoke = 0;
		this.numOrange = 0;
		this.numKitKat = 0;
		this.numLays = 0;
		this.countAddRemoved = 0;	
		this.items = "";
		this.add = true;
	}
	
	/* Accessors*/
	
	public String checkStatus() {
		String result = "";
		
		if (this.add) {
			if ((this.numCoke == 0 && this.numOrange == 0 && this.numKitKat == 0 && this.numLays == 0) && this.countAddRemoved == 0) {
				result = "Empty VM Started";
			}
			else if (this.items.equals("Coke")){
				result = "Product added: " + this.items + " (" + this.countAddRemoved + ")";
			}
			else if (this.items.equals("Orange Juice")){
				result = "Product added: " + this.items + " (" + this.countAddRemoved + ")";
			}
			else if (this.items.equals("Kitkat Chunky Bar")){
				result = "Product added: " + this.items + " (" + this.countAddRemoved + ")";
			}
			else if (this.items.equals("Lay's Classic Chips")){
				result = "Product added: " + this.items + " (" + this.countAddRemoved + ")";
			}
			else {
				result = "Invalid product: " + this.items;
			}
		}
		else {																								// this is important because it will avoid getting the message "Empty VM started" message if we have added and then removed all of the items.
			if ((this.numCoke == 0 && this.numOrange == 0 && this.numKitKat == 0 && this.numLays == 0) && this.countAddRemoved == 0) {
				result = "Empty VM Started";
			}
			else if (this.items.equals("Coke")){
				result = "Product removed: " + this.items + " (" + this.countAddRemoved + ")";
			}
			else if (this.items.equals("Orange Juice")){
				result = "Product removed: " + this.items + " (" + this.countAddRemoved + ")";
			}
			else if (this.items.equals("Kitkat Chunky Bar")){
				result = "Product removed: " + this.items + " (" + this.countAddRemoved + ")";
			}
			else if (this.items.equals("Lay's Classic Chips")){
				result = "Product removed: " + this.items + " (" + this.countAddRemoved + ")";
			}
			else {
				result = "Invalid product: " + this.items;
			}
		}
		return  result;
	}
	
	public String checkStock(String items) {
		this.items = items;
		String result = "";
		
		if (this.items.equals("Coke")) {
			result = this.items + " (" + this.numCoke + ")";
		}
		else if (this.items.equals("Orange Juice") ) {
			result = this.items + " (" + this.numOrange + ")";
		}
		else if (this.items.equals("Kitkat Chunky Bar") ) {
			result = this.items + " (" + this.numKitKat + ")";
		}
		else if (this.items.equals("Lay's Classic Chips") ) {
			result = this.items + " (" + this.numLays + ")";
		}
		else {
			result = "Invalid product: " + this.items;
		}
		return result;
	}
	
	public String checkStock() {
		String result = "Stock: Coke (" + this.numCoke + "), Orange Juice (" + this.numOrange + "), Kitkat Chunky Bar (" + this.numKitKat + "), Lay's Classic Chips (" + this.numLays + ")";
		
		return result;
	}
	
	
	public void add(String items, int number) {
		this.items = items;
		this.countAddRemoved = number;
		this.add = true;
		
		if (this.items.equals("Coke")) {
			this.numCoke += this.countAddRemoved;
		}
		else if (this.items.equals("Orange Juice") ) {
			this.numOrange += this.countAddRemoved;
		}
		else if (this.items.equals("Kitkat Chunky Bar") ) {
			this.numKitKat += this.countAddRemoved;
		}
		else if (this.items.equals("Lay's Classic Chips") ) {
			this.numLays += this.countAddRemoved;
		}
	}
	
	
	public void dispense(String items, int number) {
		this.items = items;
		this.countAddRemoved = number;
		this.add = !true;
		
		if (this.items.equals("Coke")) {
			this.numCoke -= this.countAddRemoved;
		}
		else if (this.items.equals("Orange Juice") ) {
			this.numOrange -= this.countAddRemoved;
		}
		else if (this.items.equals("Kitkat Chunky Bar") ) {
			this.numKitKat -= this.countAddRemoved;
		}
		else if (this.items.equals("Lay's Classic Chips") ) {
			this.numLays -= this.countAddRemoved;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
