package oop;

public class PersonTester {

	public static void main(String[] args) {
		Person jim = new Person(45, 72, 1.72);
		Person jonathan = new Person(62, 65, 1.81);
		
		double jimBMI = jim.getBMI();
		double jonathanBMI = jonathan.getBMI();
		System.out.println("Jim's BMI: " + jimBMI);
		System.out.println("Jonathan's BMI: " + jonathanBMI);
		
		jim.gainWeight(3);
		jonathan.gainWeight(3);
		
		jimBMI = jim.getBMI();
		jonathanBMI = jonathan.getBMI();
		System.out.println("Jim's BMI: " + jimBMI);
		System.out.println("Jonathan's BMI: " + jonathanBMI);
	}

}
