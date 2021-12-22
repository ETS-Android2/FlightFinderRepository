package model;

public class EulerMethodCalculator {
	
	// CODED BY: ADNAN FAHAD FAIZI
	
	public static double calculateUsingEulerMethod(int n) {
		double result = 0;
		
		double h = 1.0/n;
		
		double[] arrayValues = new double[n];
		
		for (int i = 0; i < arrayValues.length; i ++ ) {
			if (i == 0) {
				arrayValues[i] = 0 + h * (0.5 * (2 - 0) * (Math.sqrt(1 - 0)));
			}
			else {
				arrayValues[i] = arrayValues[i - 1] + h * (0.5 * (2 - arrayValues[i - 1]) * (Math.sqrt(1 - arrayValues[i - 1])));
			}
		}
		
		result = arrayValues[arrayValues.length - 1];
		
		return result;
	}
}
