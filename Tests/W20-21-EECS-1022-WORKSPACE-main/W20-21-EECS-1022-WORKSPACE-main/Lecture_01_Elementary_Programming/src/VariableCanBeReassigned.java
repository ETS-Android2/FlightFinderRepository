
public class VariableCanBeReassigned {
	public static void main(String[] args) {  
		/* A variable can be initialized. */
		double radius = 5.4;
		System.out.println("Radius is: " + radius);
		
		/* A variable may be re-assigned for as many times as necessary */
		radius = 3.9;
		System.out.println("Radius is: " + radius);
		System.out.println("Radius is: " + radius);
		
		radius = 9.6;
		System.out.println("Radius is: " + radius); 
	}
}



