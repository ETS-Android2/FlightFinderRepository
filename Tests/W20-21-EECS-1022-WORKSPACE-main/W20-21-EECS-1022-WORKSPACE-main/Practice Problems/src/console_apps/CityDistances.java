package console_apps;

import java.util.Scanner;

public class CityDistances {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//      				0     1      2     3     4     5     6
		//   					CHIC  BOST  NY    ATLA  MIAM  DALL  HOUST
	int[] dis = /*0*/		    {0  , 983 , 787 , 714 , 1375, 967 , 1087,
			    /*1*/			983 , 0   , 214 , 1102, 1763, 1723, 1842,
			    /*2*/			787 , 214 , 0   , 888 , 1549, 1548, 1627,
			    /*3*/			714 , 1102, 888 , 0   , 661 , 781 , 810	,
			    /*4*/			1375, 1763, 1549, 661 , 0   , 1426, 1187,
			    /*5*/			967 , 1723, 1548, 781 , 1426, 0   , 239 ,
			    /*6*/			1087, 1842, 1627, 810 , 1187, 239 , 0   };
	
	
	String[] listOfCities = {"Chicago", "Boston", "New York", "Atlanta", "Miami", "Dallas", "Houston"};
	
	System.out.println("Enter the number of citie in your itinerary?");
	int numCities = input.nextInt();
	
	String[] cities = new String[numCities];
	
	for (int i = 0; i < numCities; i ++) {
		System.out.println("Enter a city?");
		cities[i] = input.next();
	}
	
	String result = "Error: ";
	int totalD = 0;
	boolean conditionCity1 = false;
	boolean conditionCity2 = false;
	boolean generalCity = true;
	
	for (int i = 0; i < numCities - 1; i ++) {
		int num1 = -1;
		int num2 = -1;
		
		String city1 = cities[i];
		String city2 = cities[i + 1];
		
		for (int m = 0; m < listOfCities.length; m ++) {
			if (listOfCities[m].equals(city1)) {
				conditionCity1 = true;
				break;
			}
			
		}
		
		for (int m = 0; m < listOfCities.length; m ++) {
			if (listOfCities[m].equals(city2)) {
				conditionCity2 = true;
				break;
			}
		}
		
		if (conditionCity1 == false || conditionCity2 == false) {
			generalCity = false;
		}
		
		if (!conditionCity1) {
			if (numCities - 2 == i) {
				result += city1;
			}
			else {
				result += city1 + ", ";
			}
		}
		
		if (!conditionCity2) {
			if (numCities - 2 == i) {
				result += city2;
			}
			else {
				result += city2 + ", ";
			}
		}
		
			
		if (conditionCity1 == true && conditionCity2 == true) {
			if (city1.equals("Chicago")) {
				num1 = 0;
			}
			else if (city1.equals("Boston")) {
				num1 = 1;
			}
			else if (city1.equals("New York")) {
				num1 = 2;
			}
			else if (city1.equals("Atlanta")) {
				num1 = 3;
			}
			else if (city1.equals("Miami")) {
				num1 = 4;
			}
			else if (city1.equals("Dallas")) {
				num1 = 5;
			}
			else if (city1.equals("Houston")) {
				num1 = 6;
			}
			
			if (city2.equals("Chicago")) {
				num2 = 0;
			}
			else if (city2.equals("Boston")) {
				num2 = 1;
			}
			else if (city2.equals("New York")) {
				num2 = 2;
			}
			else if (city2.equals("Atlanta")) {
				num2 = 3;
			}
			else if (city2.equals("Miami")) {
				num2 = 4;
			}
			else if (city2.equals("Dallas")) {
				num2 = 5;
			}
			else if (city2.equals("Houston")) {
				num2 = 6;
			}
			
			int index = num1 * 7 + num2;
			
			totalD += dis[index];
			System.out.println("From " + city1 + " to " + city2 + ": " + totalD);
		}
	}
	result += " are undefined.";
	
	if (generalCity) {
		System.out.println("Distance: " + totalD);
		System.out.println("Bye!");
	}
	else {
		System.out.println(result);
	}
		input.close();
	}
	
}
