package oop;

public class Person {
	/*
	 * Attributes
	 */
	private String name;
	private int age;
	private String nationality;
	private double weight; /* kg */
	private double height; /* meters */
	
	/*
	 * Constructors
	 */
	public Person (int age, double weight, double height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	/*
	 * Accessors
	 */
	public String getName() {
		return this.name;
	}
	
	public double getBMI() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;
	}
	
	/*
	 * Mutators
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void gainWeight(double amount) {
//		this.weight = this.weight + amount;
		this.setWeight(this.weight + amount);
	}
}
