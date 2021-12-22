package static_variables;

public class CounterTester {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		System.out.println("c1's local: " + c1.getLocal());
		System.out.println("c2's local: " + c2.getLocal());
		
		/* Counter.global does not belong to any instances like c1 or c2.
		 * So you can just access global by calling Counter.global */
		System.out.println("Global accessed via c1: " + c1.g);
		System.out.println("Global accessed via c2: " + c2.g);
		System.out.println("Global accessed via Counter: " + Counter.g);

		System.out.println("========================");
		c1.incrementLocal();
		System.out.println("After updating c1's local:");
		System.out.println("========================");
		
		System.out.println("c1's local: " + c1.getLocal());
		System.out.println("c2's local: " + c2.getLocal());
		System.out.println("Global accessed via c1: " + c1.g);
		System.out.println("Global accessed via c2: " + c2.g);
		System.out.println("Global accessed via Counter: " + Counter.g);
	
		System.out.println("========================");
		c2.incrementLocal();
		System.out.println("After updating c2's local:");
		System.out.println("========================");
		
		System.out.println("c1's local: " + c1.getLocal());
		System.out.println("c2's local: " + c2.getLocal());
		System.out.println("Global accessed via c1: " + c1.g);
		System.out.println("Global accessed via c2: " + c2.g);
		System.out.println("Global accessed via Counter: " + Counter.g);
		
		System.out.println("========================");
		c1.incrementGlobal();
		System.out.println("After updating global from c1's point of view:");
		System.out.println("========================");
	
		System.out.println("c1's local: " + c1.getLocal());
		System.out.println("c2's local: " + c2.getLocal());
		System.out.println("Global accessed via c1: " + c1.g);
		System.out.println("Global accessed via c2: " + c2.g);
		System.out.println("Global accessed via Counter: " + Counter.g);
		
		System.out.println("========================");
		c2.incrementGlobal();
		System.out.println("After updating global from c2's point of view:");
		System.out.println("========================");
	
		System.out.println("c1's local: " + c1.getLocal());
		System.out.println("c2's local: " + c2.getLocal());
		System.out.println("Global accessed via c1: " + c1.g);
		System.out.println("Global accessed via c2: " + c2.g);
		System.out.println("Global accessed via Counter: " + Counter.g);
	
		System.out.println("========================");
		Counter.g = Counter.g + 1; // Counter.global ++;
		System.out.println("After updating global from Counter point of view:");
		System.out.println("========================");
		
		System.out.println("c1's local: " + c1.getLocal());
		System.out.println("c2's local: " + c2.getLocal());
		System.out.println("Global accessed via c1: " + c1.g);
		System.out.println("Global accessed via c2: " + c2.g);
		System.out.println("Global accessed via Counter: " + Counter.g);
	}

}






