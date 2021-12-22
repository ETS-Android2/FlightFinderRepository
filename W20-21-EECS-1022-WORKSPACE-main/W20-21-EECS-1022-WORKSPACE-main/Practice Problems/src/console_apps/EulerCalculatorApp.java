package console_apps;

import java.util.Scanner;

import model.EulerMethodCalculator;

public class EulerCalculatorApp {
	
	// CODED BY: ADNAN FAHAD FAIZI 
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the number of n: ");
	int n = input.nextInt();
	double result = EulerMethodCalculator.calculateUsingEulerMethod(n);
	
	System.out.println("Using the step size(h) " + ((double)1 / n) + " with Euler method x(1) = " + result);

	}

}
