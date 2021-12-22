package model;

public class Instructor {
// Attributes
	private String name;
	private int ext;
	private String email;
	
	
// Constructor
	public Instructor(String name, int ext, String email) {
		this.name = name;
		this.email = email;
		this.ext = ext;
	}
	
// Accessor 
	public String getName() {
		return this.name;
	}
	
	public int getPhoneExtension() {
		return this.ext;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getInformation() {
		String result = "";
		result = "Instructor " + this.name + " has campus phone extension " + this.ext + " and contact email " + this.email;
		return result;
	}
	
// Mutator
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setPhoneExtension(int newExt) {
		this.ext = newExt;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
}
