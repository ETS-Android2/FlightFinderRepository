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
	private Trainer trainer; // stores A SINGLE Trainer object's address
	
	
	/* Multi-valued, reference-typed attribute */
	private final int MAX_NUMBER_OF_FACILITIES = 6;		/* Assumption: each member can book for up to 6 facilities. */
	private Facility[] facilities; // stores an array of Facility object's addresses
	private int nof; /* number of facilities */
	 
	/*
	 * There are two purposes of "nof" attributes:
	 * 	1. Records how many facility object addresses have been stored in 'facilities' array so far.
	 * 	2. Indicates the index into 'facilities' array for storing the next Facility object's address.
	 */
	
	
	/*
	 * Constructors (create instances of the current class)      ---> For initializing 
	 */
	
	// without declaring any constructor explicitly, a *default* constructor is available.
	public Member() { // no explicitly default constructor
		// default actions applicable to all other versions of constructor
		this.facilities = new Facility[MAX_NUMBER_OF_FACILITIES];
		this.nof = 0;
	}
	
	public Member(String name) { //variable shadowing\\
		this(); // calling the constructor performing default actions
		this.name = name;
	}
	
	
	
	//----------------------------------------------------------------------
	// as soon as a customized constructor is declared, the default constructor is ineffective.
	public Member(int id, char type, double balance) {
		this(); // calling the constructor performing default actions
		this.id = id; // LHS: 'this'.id denotes the attribute 'id', whereas RHS denotes the input parameter 'id'
		this.type = type;
		this.balance = balance;
	}
	
	// You can only call a maximum one helper constructor as the first line.
	public Member(String name, int id, char type, double balance) {
		// Calling the helper constructor below will also in turn call the other helper constructor performing the default action.
		this(id, type, balance); // calling another constructor Member(int, char, balance)
		this.name = name;
	}
	
	//-----------------------------------------------------------------------
	
	
	// Constructor for only Height and Weight
	// Assumptions: weight in kilograms, height in centimeters
	public Member(double weight, double height) {
		this(); // calling the constructor performing default actions
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
	
	public int getNumberOfFacilites() {
		return this.nof;
	}
	
	/* Exercise (after reading the written notes)*/
	public double getPaymentDue() {
		// go over the facilities of the member, and add up the (price * unit) of each booked facility.
		double sum = 0;
		/*
		 * Note: Having the loop stay condition 'i < this.facilities.length'
		 * 				may result in NullPointerException
		 * (The only scenario where a NullPointerException cannot be resulted is when this.nof == this.facilities.length)
		 */
		for (int i = 0; i < this.nof; i ++) {
			/*
			 * Alternatively:
			 * Facility f = this.facilites[0];
			 * result += g.getPaymentDue;
			 */
			sum += this.facilities[i].getPaymentDue();
		}
		return sum;
	}
	
	public int getFacilityUnit(String name) { // Assumption: Facility names are unique
		
		Facility f = this.getFacility1(name);
		
		int units = -1;
		if (f != null) {
			units = f.getUnits();
		}
		return units;
		
		
//		if (f == null) {
//			// The input 'name' does not denote any added facilities
//			return -1;
//		}
//		else {
//			return f.getUnits();
//		}
	}

	/* -------------------------------------------------------------------------------------------------------------------------------------- */
	// Version 1 by instructor 
	private Facility getFacility1(String name) { // Helper method that is used to avoid duplicate that can occur if not used in (Accessor getFacilityUnit) and (Mutator extendFacilityUnits).
		Facility f = null;
		boolean hasFound = false;
		for (int i = 0; !hasFound && i < this.nof; i ++) {
			if (this.facilities[i].getName().equals(name)) {
				f = this.facilities[i];
				hasFound = true;
			}
		}
		return f;
	}
	
	// Version 2
	public int getFacility2(String name) { // Helper method that is used to avoid duplicate that can occur if not used in (Accessor getFacilityUnit) and (Mutator extendFacilityUnits).
		int facilityUnit = 0;
		boolean hasFound = false;
		for (int i = 0; !hasFound && i < this.nof; i ++) {
			if (this.facilities[i].getName().equals(name)) {
				facilityUnit = this.facilities[i].getUnits();
				hasFound = true;
			}
		}
		return facilityUnit;
	}
	/* -------------------------------------------------------------------------------------------------------------------------------------- */
	
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
	
	/*
	 *  Refer input member 'm''s trainer to the context object
	 */
	
	public void referTrainer(Member m) {
		this.trainer = m.trainer;
		
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
	
	/* Add a new facility objects to the end of the 'facilities' array */
	public void addFacility(Facility f) {
		this.facilities[this.nof] = f;
		this.nof ++;
	}
	
	/*
	 *  Overloaded methods: methods with the same name, but distinguished by their distinct lists of parameter types.
	 */
	
	public void addFacility(String name, double price, int units) {
		Facility f = new Facility(name, price, units);
		this.addFacility(f);
	}
	
	// Version 1 by instructor
	public void extendFacilityUnits(String name, int howMany) {
		Facility f = this.getFacility1(name); // Helper Method
		
		if (f != null) { /* hasFound == true*/
			f.setUnits(f.getUnits() + howMany);
		}
		else { // f == null
			// the input name denotes some facility not being added, then do nothing.
		}
	}
	
	// Version 2 by me
		public void extendFacilityUnits1(String name, int howMany) {
			int units = getFacility2(name);
			boolean hasFound = false;
			Facility f = null;
			for (int i = 0; !hasFound && i < this.nof; i ++) {
				if (this.facilities[i].getName().equals(name)) {
					f = this.facilities[i];
					hasFound = true;
				}
			}
			f.setUnits(units);
		}
	
}
