package model;

public class Instructor { // Class object created according to junit_testings
	
	// Attributes
	private String prof;
	private int extension;
	private String email;
	
	// Constructor
	public Instructor(String prof, int extension, String email) {
		this.prof = prof;
		this.extension = extension;
		this.email = email;
	}
	
	// Accessor 
	public String getName() {
		return this.prof;
	}
	
	public int getPhoneExtension() {
		return this.extension;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getInformation() {
		String result = "Instructor " + this.prof + " has campus phone extension " + this.extension + " and contact email " + this.email;
		return result;
	}
	
	// Mutator 
	
	public void setName(String newProf) { // Used to change the course's instructor
		this.prof = newProf;
	}
	
	public void setPhoneExtension(int newExtension) { // used to change instrucor's extension number
		this.extension = newExtension;
	}
	
	public void setEmail(String newEmail) { // For changing email of an instructor
		this.email = newEmail;
	}
	
}
