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
	// for other classes to access these private variables, call a public accesor methods. (encapsulation)
	
	private String name; 
	
	private double weight;
	private double height;

	/* Single-valued, reference-typed attribute */
	Trainer trainer; // stores A SINGLE Trainer object's address
	
	/* Multi-valued, reference-typed attribute */
	Facility[] facilities; // stores an array of Facility object's addresses
	int nof; /* number of facilities */
	
	/* Exercise (after reading the written notes)*/
	public double getPaymentDue() {
		// go over the facilities of the member, and add up the (price * unit) of each booked facility.
		double sum = 0;
		for (int i = 0; i < this.nof; i ++) {
			sum += this.facilities[i].price * this.facilities[i].units;
		}
		return sum;
	}
	
	/*
	 * Constructors (create instances of the current class)      ---> For initializing 
	 */
	// without declaring any constructor explicitly, a *default* constructor is available.
	public Member() { // no explicitly default constructor
		// do nothing
	}
	
	public Member(String name) { //variable shadowing\\
		this.name = name;
		this.facilities = new Facility[100];
	}
	
//-----------------------------------------------------------------
	
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
	
	public Trainer getTrainer() { /* return the address of some Trainer object */
		return this.trainer;
	}
	

	/*
	 * Mutator Methods (not returning anything; modifying attributes)  ---> Notice the public *void* meaning there's no return statement unlike previously defined ancesstor, where they must have a return statement.
	 */
	
	// *********
	// version where there is no clash between parameter 't' and attribute 'trainer'
	// therefore, the 'this' keyword is not necessary
//	public void registerTrainer(Trainer t) {
//		trainer = t;
//	}  **********
	
	public void registerTrainer(Trainer trainer) {  // variable shadowing
		this.trainer = trainer;
	}
	
	public void registerFacility(Facility facility) {  // variable shadowing
		this.facilities[this.nof] = facility;
		this.nof ++;
	}
	
	/*
	 *  Refer input member 'm''s trainer to the context object
	 */
	
	public void referTrainer(Member m) {
		this.trainer = m.getTrainer(); // Or // this.trainer = m.trainer;
		
	}
	
	/* Exercise: swap the trainer of two members */
	public void swapTrainer(Member m) {
		//this.trainer should become m.trainer
		// m.trainer should become this.trainer
		//Write some test for this!
		Trainer backup = new Trainer("");
		backup = this.trainer; // in the case of example 1 we mean, alan's trainer by this.trainer
		this.trainer = m.getTrainer(); // by m.getTrainer we mean mark's trainer and we can use the acessor getTrainer to get information about his trainer which we can already see in the junit testing before that *mark* got registered for the trainer *jared* 
		m.trainer = backup; // we use the backup value we have previously used to store the value of this.trainer which in example 1 case was alan.trainer
	}

	public void changeTheWeightBy(double units) {
		this.weight += units;
	}
	
}
