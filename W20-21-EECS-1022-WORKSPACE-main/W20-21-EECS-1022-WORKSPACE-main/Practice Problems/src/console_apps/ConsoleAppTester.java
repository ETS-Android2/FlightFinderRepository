package console_apps;

import java.util.ArrayList;

public class ConsoleAppTester {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());
		System.out.println(list.contains("A"));
		System.out.println(list.indexOf("A"));
		list.add("A");
		list.add("B");
		System.out.println(list.contains("A"));	
		System.out.println(list.contains("B"));
		System.out.println(list.contains("C"));
		System.out.println(list.indexOf("A"));
		System.out.println(list.indexOf("B"));
		System.out.println(list.indexOf("C"));
		list.add(1, "C");
		System.out.println(list.contains("A"));	
		System.out.println(list.contains("B"));
		System.out.println(list.contains("C"));
		System.out.println(list.indexOf("A"));
		System.out.println(list.indexOf("B"));
		System.out.println(list.indexOf("C"));
		list.remove("C");
		System.out.println(list.contains("A"));	
		System.out.println(list.contains("B"));
		System.out.println(list.contains("C"));
		System.out.println(list.indexOf("A"));
		System.out.println(list.indexOf("B"));
		System.out.println(list.indexOf("C"));
		
		for (int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}
		
	}
}