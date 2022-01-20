package console_apps;

import java.util.Scanner;

public class mileageApp2 {
	
	// Helper Method for returning the correspondence index array.
	public static int indexOf(String city ) {
		int index = -1;
		if (city.equals("Chicago")) {
			index = mileageApp2.CHICAGO;
		}
		else if (city.equals("Boston")) {
			index = mileageApp2.BOSTON;
		}
		else if (city.equals("New York")) {
			index = mileageApp2.NEW_YORK;				
		}
		else if (city.equals("Atlanta")) {
			index = mileageApp2.ATLANTA;
		}
		else if (city.equals("Miami")) {
			index = mileageApp2.MIAMI;
		}
		else if (city.equals("Dallas")) {
			index = mileageApp2.DALLAS;
		}
		else if (city.equals("Houston")) {
			index = mileageApp2.HOUSTON;
		}
		
		return index;
	}
	
	public static final int CHICAGO 	= 0;
	public static final int BOSTON    = 1;
	public static final int NEW_YORK  = 2;
	public static final int ATLANTA   = 3;
	public static final int MIAMI     = 4;
	public static final int DALLAS    = 5;
	public static final int HOUSTON   = 6;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] fromChicago = {0   , 983 , 787 , 714 , 1375, 967 , 1087};
		int[] fromBoston =  {983 , 0   , 214 , 1102, 1763, 1723, 1842};
		int[] fromNewYork = {787 , 214 , 0   , 888 , 1549, 1548, 1627};
		int[] fromAtlanta = {714 , 1102, 888 , 0   , 661 , 781 , 810 };
		int[] fromMiami =   {1375, 1763, 1549, 661 , 0   , 1426, 1187 };
		int[] fromDallas =  {967 , 1723, 1548, 781 , 1426, 0   , 239 };
		int[] fromHouston = {1087, 1842, 1627, 810 , 1187, 239 , 0   };
		
//		int[][] distance2 = {
//				{0   , 983 , 787 , 714 , 1375, 967 , 1087},
//				{983 , 0   , 214 , 1102, 1763, 1723, 1842},
//				{787 , 214 , 0   , 888 , 1549, 1548, 1627},
//				{714 , 1102, 888 , 0   , 661 , 781 , 810 },
//				{1375, 1763, 1549, 661 , 0   , 1426, 1187 },
//				{967 , 1723, 1548, 781 , 1426, 0   , 239 },
//				{1087, 1842, 1627, 810 , 1187, 239 , 0   }
//		};
		
		int[][] distance1 = {
				fromChicago, 
				fromBoston , 
				fromNewYork, 
				fromAtlanta, 
				fromMiami  , 
				fromDallas , 
				fromHouston
				};
		
		System.out.println("Enter the number of cities in your itinerary?");
		int howMany = input.nextInt();
		input.nextLine();	// consume the newline character so that later reading a String would be ok.
		
		String[] trip = new String[howMany];
		String[] undefinedCities = new String[howMany];
		
		int numberOfUndefinedCities = 0;
		int numberOfDefinedCities = 0;
		
		/* Read cities from the user and store them to 'trip'. */
		for (int i = 0; i < howMany; i ++)  {
			System.out.println("Enter a city?");
			String city = input.next();
			
			int index = mileageApp2.indexOf(city);
			if (index == -1) {
				undefinedCities[numberOfUndefinedCities] = city;
				numberOfUndefinedCities ++;
			}
			trip[numberOfDefinedCities] = city;
			numberOfDefinedCities ++;
		}
		
		if (numberOfUndefinedCities == 0) {
			int dist = 0;
			
			for (int i = 0; i < howMany - 1; i ++) {
				int currentDistance = 0;
				String dep = trip[i];		// Departure
				String dst = trip[i + 1];	// Destination
				
				int depIndex = mileageApp2.indexOf(dep);
				int disIndex = mileageApp2.indexOf(dst);
			
				currentDistance = distance1[depIndex][disIndex];
				dist += currentDistance;
				System.out.println("From " + dep + " to " + dst + ": " + currentDistance );
				System.out.println("Distance: " + dist);
			}
		}
		else {
			System.out.print("Undefined cities: ");
			for (int i = 0; i < numberOfUndefinedCities; i ++ ) {
				System.out.print(undefinedCities[i]);
				if (i < numberOfUndefinedCities - 1)
					System.out.print(", ");
			}
			System.out.println();
		}
		/* Add up departure-to-destination distances*/

		System.out.println("Bye!");	
	
		input.close();
	}
	
	
}
