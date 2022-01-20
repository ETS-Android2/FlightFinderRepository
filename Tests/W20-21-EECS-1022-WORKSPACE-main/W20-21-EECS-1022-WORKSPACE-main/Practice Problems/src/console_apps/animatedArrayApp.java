package console_apps;

import java.util.Arrays;

public class animatedArrayApp {

	public static void main(String[] args) {
	
	String[] array = {"-", ">", " ", " ", " ", " ", " ", " ", " ", " ", " "};
	boolean go = true;
		
	while(go) {	
	int m = 0;
	System.out.println(Arrays.toString(array));
	
		if ( m <= 9) {
			String temp1 = " ";
			for (; m < array.length - 2; ) {
				array[m + 2] = array[m + 1];
				array[m + 1] = array[m];
				array[m] = temp1;
				System.out.println(Arrays.toString(array));
				m ++;
			}
			m++;
			}
		
		if ( m >= 10) {
			String temp1 = " ";
			for (; m > array.length - 10; m --) {
				array[m - 2] = array[m - 1];
				array[m - 1] = array[m];
				array[m] = temp1;
				System.out.println(Arrays.toString(array));
			}
			m = 0;
		}
	}
		
				
			}

	}

