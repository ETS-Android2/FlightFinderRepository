package model;

public class Counter {
	
	// Attributes
	int value;
	
	
	// Constructor
	
	public Counter() {
		this.value = 0;
		
	}
	
	public Counter(int value) {
		this.value = value;
	}
	
	// Accessors
	
	public int getValue() {
		return this.value;
	}
	
	// Mutator
	
	public void increment() {
		this.value ++;
		
	}
	
	public void increment(int value) {
		this.value += value;
	}


}