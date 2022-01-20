
public class UniversalPropertyCheckingV1 {

	public static void main(String[] args) {

		int[] ns = {2, 3, -1, 4, 5};

		/*
		 * V1 (correct): Scan the entire array and accumulate the result.
		 */
		boolean soFarOnlyPosNums = true; 
		int i = 0;
		while (i < ns.length) {
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
