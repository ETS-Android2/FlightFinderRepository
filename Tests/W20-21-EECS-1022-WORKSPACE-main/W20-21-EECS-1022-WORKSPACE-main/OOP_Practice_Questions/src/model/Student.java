package model;

public class Student {
	private String name;
	private int id;
	private static int globalId = -1;
	
	public Student(String name) {
		this.name= name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getID() {
		Student.globalId = Student.globalId - 2;
		return this.name + Student.globalId;
	}
	
	
}
