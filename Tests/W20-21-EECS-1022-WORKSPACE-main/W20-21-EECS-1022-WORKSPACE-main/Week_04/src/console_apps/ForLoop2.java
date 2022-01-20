package console_apps;

public class ForLoop2 {

	public static void main(String[] args) {
		int i = 0;
		for(; i < 5;) {
			System.out.println("i is: " + i);
			 i ++;
		}
//		System.out.println("i is " + i); // is outside the scope of the for loop
	}

}
