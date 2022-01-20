package model;

public class Instructor {
	// Attributes
	private String name;
	private int id;
	private String email;
	// Constructor
	
	public Instructor(String name, int id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
		
	}
	
	// Accessor
	
	public String getName() {
		return this.name;
	}
	
	public int getPhoneExtension() {
		return this.id;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getInformation() {
		String result = "";
		result = "Instructor " + this.name + " has campus phone extension " + this.id + " and contact email " + this.email;
		return result;
	}
	
	// Mutator
	
	public void setName(String newName) {
		this.name = newName;
		
	}
	
	public void setPhoneExtension(int newExt) {
		this.id = newExt;
		
	}
	
	public void setEmail(String newEmail) {
		this.email = newEmail;
		
	}
}























