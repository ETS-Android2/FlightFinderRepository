package console_apps;

import java.util.Scanner;

public class mileageApp1a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int CHICAGO 	= 0;
		final int BOSTON    = 1;
		final int NEW_YORK  = 2;
		final int ATLANTA   = 3;
		final int MIAMI     = 4;
		final int DALLAS    = 5;
		final int HOUSTON   = 6;
		
		int[] fromChicago = {0   , 983 , 787 , 714 , 1375, 967 , 1087};
		int[] fromBoston =  {983 , 0   , 214 , 1102, 1763, 1723, 1842};
		int[] fromNewYork = {787 , 214 , 0   , 888 , 1549, 1548, 1627};
		int[] fromAtlanta = {714 , 1102, 888 , 0   , 661 , 781 , 810 };
		int[] fromMiami =   {1375, 1763, 1549, 661 , 0   , 1426, 118 };
		int[] fromDallas =  {967 , 1723, 1548, 781 , 1426, 0   , 239 };
		int[] fromHouston = {1087, 1842, 1627, 810 , 1187, 239 , 0   };
		
		System.out.println("Enter the number of cities in your itinerary?");
		int howMany = input.nextInt();
		input.nextLine();	// consume the newline character so that later reading a String would be ok.
		
		String[] trip = new String[howMany];
		
		/* Read cities from the user and store them to 'trip'. */
		for (int i = 0; i < howMany; i ++)  {
			System.out.println("Enter a city?");
			String city = input.next();
			trip[i] = city;
		}
		
		/* Add up departure-to-destination distances*/
		int dist = 0;
		
		for (int i = 0; i < howMany - 1; i ++) {
			String dep = trip[i];	// Departure
			String dst = trip[i + 1];	// Destination;
			int currentDistance = 0;
			
			if (dep.equals("Chicago")) {
				if (dst.equals("Chicago")) {
					currentDistance = fromChicago[CHICAGO];
				}
				else if (dst.equals("Boston")) {
					currentDistance = fromChicago[BOSTON];
				}
				else if (dst.equals("New York")) {
					currentDistance = fromChicago[NEW_YORK];				
				}
				else if (dst.equals("Atlanta")) {
					currentDistance = fromChicago[ATLANTA];
				}
				else if (dst.equals("Miami")) {
					currentDistance = fromChicago[MIAMI];
				}
				else if (dst.equals("Dallas")) {
					currentDistance = fromChicago[DALLAS];
				}
				else if (dst.equals("Houston")) {
					currentDistance = fromChicago[HOUSTON];
				}
			}
			else if (dep.equals("Boston")) {
				if (dst.equals("Chicago")) {
					currentDistance = fromBoston[CHICAGO];
				}
				else if (dst.equals("Boston")) {
					currentDistance = fromBoston[BOSTON];
				}
				else if (dst.equals("New York")) {
					currentDistance = fromBoston[NEW_YORK];				
				}
				else if (dst.equals("Atlanta")) {
					currentDistance = fromBoston[ATLANTA];
				}
				else if (dst.equals("Miami")) {
					currentDistance = fromBoston[MIAMI];
				}
				else if (dst.equals("Dallas")) {
					currentDistance = fromBoston[DALLAS];
				}
				else if (dst.equals("Houston")) {
					currentDistance = fromBoston[HOUSTON];
				}
			}
			else if (dep.equals("New York")) {
				if (dst.equals("Chicago")) {
					currentDistance = fromNewYork[CHICAGO];
				}
				else if (dst.equals("Boston")) {
					currentDistance = fromNewYork[BOSTON];
				}
				else if (dst.equals("New York")) {
					currentDistance = fromNewYork[NEW_YORK];				
				}
				else if (dst.equals("Atlanta")) {
					currentDistance = fromNewYork[ATLANTA];
				}
				else if (dst.equals("Miami")) {
					currentDistance = fromNewYork[MIAMI];
				}
				else if (dst.equals("Dallas")) {
					currentDistance = fromNewYork[DALLAS];
				}
				else if (dst.equals("Houston")) {
					currentDistance = fromNewYork[HOUSTON];
				}
			}
			else if (dep.equals("Atlanta")) {
				if (dst.equals("Chicago")) {
					currentDistance = fromAtlanta[CHICAGO];
				}
				else if (dst.equals("Boston")) {
					currentDistance = fromAtlanta[BOSTON];
				}
				else if (dst.equals("New York")) {
					currentDistance = fromAtlanta[NEW_YORK];				
				}
				else if (dst.equals("Atlanta")) {
					currentDistance = fromAtlanta[ATLANTA];
				}
				else if (dst.equals("Miami")) {
					currentDistance = fromAtlanta[MIAMI];
				}
				else if (dst.equals("Dallas")) {
					currentDistance = fromAtlanta[DALLAS];
				}
				else if (dst.equals("Houston")) {
					currentDistance = fromAtlanta[HOUSTON];
				}
			}
			else if (dep.equals("Miami")) {
				if (dst.equals("Chicago")) {
					currentDistance = fromMiami[CHICAGO];
				}
				else if (dst.equals("Boston")) {
					currentDistance = fromMiami[BOSTON];
				}
				else if (dst.equals("New York")) {
					currentDistance = fromMiami[NEW_YORK];				
				}
				else if (dst.equals("Atlanta")) {
					currentDistance = fromMiami[ATLANTA];
				}
				else if (dst.equals("Miami")) {
					currentDistance = fromMiami[MIAMI];
				}
				else if (dst.equals("Dallas")) {
					currentDistance = fromMiami[DALLAS];
				}
				else if (dst.equals("Houston")) {
					currentDistance = fromMiami[HOUSTON];
				}
			}
			else if (dep.equals("Dallas")) {
				if (dst.equals("Chicago")) {
					currentDistance = fromDallas[CHICAGO];
				}
				else if (dst.equals("Boston")) {
					currentDistance = fromDallas[BOSTON];
				}
				else if (dst.equals("New York")) {
					currentDistance = fromDallas[NEW_YORK];				
				}
				else if (dst.equals("Atlanta")) {
					currentDistance = fromDallas[ATLANTA];
				}
				else if (dst.equals("Miami")) {
					currentDistance = fromDallas[MIAMI];
				}
				else if (dst.equals("Dallas")) {
					currentDistance = fromDallas[DALLAS];
				}
				else if (dst.equals("Houston")) {
					currentDistance = fromDallas[HOUSTON];
				}
			}
			else if (dep.equals("Houston")) {
				if (dst.equals("Chicago")) {
					currentDistance = fromHouston[CHICAGO];
				}
				else if (dst.equals("Boston")) {
					currentDistance = fromHouston[BOSTON];
				}
				else if (dst.equals("New York")) {
					currentDistance = fromHouston[NEW_YORK];				
				}
				else if (dst.equals("Atlanta")) {
					currentDistance = fromHouston[ATLANTA];
				}
				else if (dst.equals("Miami")) {
					currentDistance = fromHouston[MIAMI];
				}
				else if (dst.equals("Dallas")) {
					currentDistance = fromHouston[DALLAS];
				}
				else if (dst.equals("Houston")) {
					currentDistance = fromHouston[HOUSTON];
				}
			}
			
			dist += currentDistance;

		}
		
		System.out.println("Distance: " + dist);
		System.out.println("Bye!");
		
		input.close();
	}

}