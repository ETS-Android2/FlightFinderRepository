package console_apps;

public class Arrays2 {

	public static void main(String[] args) {
		int[] numbers = new int[3];  // Creating a new array object
		System.out.println("Size of array numbers: " + numbers.length);
		System.out.println("1st element: " + numbers[0]);
		System.out.println("2nd element: " + numbers[1]);
		System.out.println("3rd element: " + numbers[2]);
		
		System.out.println("After changing elements of the array: ");
		
		numbers[0] = 23;// change the 1st element of array to 23
		numbers[1] = 46;
		numbers[2] = 69;
		
		System.out.println("Size of array numbers: " + numbers.length);
		System.out.println("1st element: " + numbers[0]);
		System.out.println("2nd element: " + numbers[1]);
		System.out.println("3rd element: " + numbers[2]);
	}

}
