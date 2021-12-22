package model;

/*
 *  A template for member objects.(Multiple member objects)
 */

public class Member {
	/* 
	 * Attributes (Class-level variable; all methods can access them)  ---> it's useful to make the structure
	 */
	private int id; // e.g. 123456, "p12345j"
	private char type; // e.g., 's' for silver, 'b' for bronze (10% discount rate on facilities), 'g' for golden (15%)
	private double balance; 
	// private variables are only accessible within the current class.
	// for other classes to access these private variables, call a public accsoor methods. (encapsulation)
	
	private String name; 
	
	private double weight;
	private double height;
	
	/*
	 * Constructors (create instances of the current class)      ---> For initializing 
	 */
	// without declaring any constructor explicitly, a *default* constructor is available.
	public Member() { // no explicitly default constructor
		// do nothing
	}
	
	//----------------------------------------------------------------------
	// as soon as a customized constructor is declared, the default constructor is ineffective.
	public Member(int id, char type, double balance) {
		this.id = id; // LHS: 'this'.id denotes the attribute 'id', whereas RHS denotes the input parameter 'id'
		this.type = type;
		this.balance = balance;
	}
	
	public Member(String name, int id, char type, double balance) {
		this(id, type, balance); // calling another constructor Member(int, char, balance)
		this.name = name;
	}
	//-----------------------------------------------------------------------
	
	
	// Constructor for only Height and Weight
	// Assumptions: weight in kilograms, height in centimeters
	public Member(double weight, double height) {
		this.height = height;
		this.weight = weight;
	}
	
	

	/*
	 * Accessor Methods (returning some useful information)
	 */
	
	public double getWeight() {  // we have put it so we can use their weight in junit_testing or console_apps by calling them using dereferencing(this.method)
		return this.weight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String getBMIReport() {
		String result = "";
		
		double heightInMeter = this.height / 100;
		double BMI = this.weight / (heightInMeter * heightInMeter);
		
		String intrepretation = "";
		if (BMI < 18.5) {
			intrepretation = "Underweight";
		}
		else if (BMI < 25.0) {
			intrepretation = "Normal";
		}
		else if (BMI < 30.0) {
			intrepretation = "Overweight";
		}
		else {   // bmi >= 30.0
			intrepretation = "Obese";
		}
		
		result = intrepretation + " (" + String.format("%.1f", BMI) + ")";
		
		return result;
	}
	
	/*
	 * Mutator Methods (not returning anything; modifying attributes)  ---> Notice the public *void* meaning there's no return statement unlike previously defined ancesstor, where they must have a return statement.
	 */
	
	public void changeTheWeightBy(double units) {
		this.weight += units;
	}
}
