
public class UniversalPropertyCheckingV3 {

	public static void main(String[] args) {

		int[] ns = {2, 3, -1, 4, 5};

		/*
		 * V3 (correct): The result is accumulative until the early exit point.
		 */
		boolean soFarOnlyPosNums = true; 
		int i = 0;
		while (soFarOnlyPosNums && i < ns.length) {
			soFarOnlyPosNums = soFarOnlyPosNums && (ns[i] > 0);
			i = i + 1;
		}

		if (soFarOnlyPosNums) { 
			System.out.println("All elements are positive"); 
		}
		else { 
			System.out.println("Not all elements are positive"); 
		}

	}

}
