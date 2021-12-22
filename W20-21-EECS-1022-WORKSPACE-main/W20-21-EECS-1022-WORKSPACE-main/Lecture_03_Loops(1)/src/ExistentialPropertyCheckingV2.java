
public class ExistentialPropertyCheckingV2 {

	public static void main(String[] args) {

		int[] ns = {-2, -3, 1, -4, -5};

		/*
		 * V2 (wrong): Scan the entire array but the result is not accumulative.
		 */
		boolean seenSomPosNum = false; 
		int i = 0;
		while (i < ns.length) {
			seenSomPosNum = ns[i] > 0;
			i = i + 1;
		}

		if (seenSomPosNum) { 
			System.out.println("At least one element is positive"); 
		}
		else { 
			System.out.println("None of the elements are positive"); 
		}

	}

}
