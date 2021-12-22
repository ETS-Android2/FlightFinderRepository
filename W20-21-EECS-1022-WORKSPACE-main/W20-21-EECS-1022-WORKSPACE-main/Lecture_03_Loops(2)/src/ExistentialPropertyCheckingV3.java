
public class ExistentialPropertyCheckingV3 {

	public static void main(String[] args) {

		int[] ns = {-2, -3, 1, -4, -5};

		/*
		 * V3 (correct): The result is accumulative until the early exit point.
		 */
		boolean seenSomPosNum = false; 
		int i = 0;
		while (!seenSomPosNum && i < ns.length) {
			seenSomPosNum = seenSomPosNum || (ns[i] > 0);
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
