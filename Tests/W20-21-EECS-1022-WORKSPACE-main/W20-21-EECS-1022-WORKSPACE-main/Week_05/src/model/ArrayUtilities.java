package model;

public class ArrayUtilities {
	
	/*
	 *  e.g., Given <2, 3, 4>, return the sum for sub-arrays: <2, 5, 9>
	 */
	public static int[] getIntermediateSums(int[] ns) {
		int[] result = null;// array variable stores no address
		int sum = 0;
		int i = 0;
		int[] arraySum = new int[ns.length];
		
		for(;(i < ns.length);) {
			sum += ns[i]; 
		//	sum = ns[i]; //wrong
			arraySum[i] = sum;
			i ++;
		}
		result = arraySum;

		return result;
	}

	public static int[] getInterleaving(int[] a1, int[] a2) { // This is an extra practice question that was given to me.
		int[] result = null;								// Draw diagrams or check Week_05|1022|Get Interleaving Arrays in OneNote to better understand. 
		
		int[] finalArray = new int[a1.length + a2.length];
		
		if (a1.length == a2.length) {
			for (int i = 0; i < finalArray.length; i++) {
				if (i % 2 == 0) {
					finalArray[i] = a1[i/2];
				}
				else if(i % 2 == 1) {
					finalArray[i] = a2[(i-1)/2];
				}
			}
		}
		else if (a1.length > a2.length) {
			for (int i = 0; i < (2 * a2.length); i++) {
				if (i % 2 == 0) {
					finalArray[i] = a1[i/2];
				}
				else if(i % 2 == 1) {
					finalArray[i] = a2[(i-1)/2];
				}	
			}
			int m = (2 * a2.length); 
			for (; (m < finalArray.length); m++) {
				finalArray[m] = a1[m-a2.length];
			}
		}
		else if (a1.length < a2.length) {
			for (int i = 0; i < (2 * a1.length); i++) {
				if (i % 2 == 0) {
					finalArray[i] = a1[i/2];
				}
				else if(i % 2 == 1) {
					finalArray[i] = a2[(i-1)/2];
				}	
			}
			int m = (2 * a1.length); 
			for (; (m < finalArray.length); m++) {
				finalArray[m] = a2[m-a1.length];
		}
	}
		result = finalArray;	
		return result;
	}
}


