package console_apps;

import java.util.ArrayList;

import model.Person;

public class PersonConsoleApp {

	public static void main(String[] args) {
		
		/*
		 * EXAMPLE 1
		 */
//		Person p1 = new Person("Ahmad");
//		Person p2 = new Person("Javid");
//		Person p3 = new Person("Rahmat");
//		Person p4 = new Person("Samir");
//		
//		p4 = p1;
//		p1 = p4;
//		p2 = p3;
//		p1 = p3;
//		
//		Person[] persons1 = {p1, p4, p2};
//		persons1[1] = p3;
//		Person[] persons2 = new Person[persons1.length];
//		
//		for (int i = 0; i < persons1.length; i += 2) {
//			persons2[i] = persons1[i];
//		}
//		
//		persons2[2] = p3;
//		persons1[0] = p1;
//		
//		System.out.println(p1.getName()); // rahmet
//		System.out.println(p2.getName());	// rahmat
//		System.out.println(p3.getName()); // rahmat
//		System.out.println(p4.getName());	// ahmad
//		
//		System.out.println(p1 == p2);	// T
//		System.out.println(p1 == p4); // F
//		System.out.println(p3 == p2);	// T
//		System.out.println(persons1[0] == p1);	// T
//		System.out.println(persons1[2].getName().equals(p3.getName()));	// T
//		System.out.println(persons1[2] == p2);	// T
//		System.out.println(persons1[1] == p1);	// F ...
//		System.out.println(p1.getName().equals(p3.getName()));	// T
//		System.out.println(persons2[1] == p3);	// F
//		System.out.println(persons2[0] == p1);	// T
//		System.out.println(p3.getName().equals(p4.getName()));	// F 
//		System.out.println(persons2[2] == p4);	// F
//		System.out.println(p2.getName().equals(p1.getName()));	// T
//		
//		System.out.println(persons2[1] == null);	// T
		
		/*---------------------------------------------------------------------------------------------------------------------------*/
		
		/*
		 * EXAMPLE 2
		 */
//		Person p1 = new Person("Ahmad");
//		Person p2 = new Person("Javid");
//		Person p3 = new Person("Rahmat");
//		Person p4 = new Person("Samir");
//		
//		Person p5;
//		
//		p5 = p4;
//		p4 = p1;
//		p3 = p5;
//		p1 = p5; 
//		p2 = p3;
//		
//		Person[][] persons1 = {
//				{p1, p2},
//				{p3, p4},
//		};
//		
//		Person[][] persons2 = new Person[2][2];
//		
//		persons1[1][1] = p4;
//		persons2[1][1] = p1;
//		
//		for (int i = 0; i < persons1.length; i ++ ) {
//			for (int m = 0; m < persons1[i].length; m ++) {
//				persons2[i][m] = persons1[i][m];
//			}
//		}
//		
//		System.out.println(p5 == p1);	// T
//		System.out.println(p2 == p1);	// t
//		System.out.println(p3 == p1);	// T
//		System.out.println(p5 == p3);	// T
//		System.out.println(p4 == p1);	// F
//		System.out.println(p4 == p5);	// F
//		System.out.println(p2 == p4);	//F
//		System.out.println(p4 == p3);	// F
//		
//		System.out.println(p4.getName().equals(p1.getName())); // F
//		System.out.println(p2.getName().equals(p2.getName())); // T
//		System.out.println(p5.getName().equals(p1.getName()));	// T
//		System.out.println(p2.getName().equals(p3.getName()));	// T
//		System.out.println(p4.getName().equals(p5.getName()));	// F
//		System.out.println(p2.getName().equals(p5.getName()));	// T
//		System.out.println(p3.getName().equals(p5.getName()));	// T
		
		/*---------------------------------------------------------------------------------------------------------------------------*/
		
		ArrayList<Person> ar = new ArrayList<>();
		
		Person p1 = new Person("Ahmad");
		Person p2 = new Person("Javid");
		Person p3 = new Person("Rahmat");
		Person p4 = new Person("Samir");
		
		Person p5 = p2;
		p2 = p4;
		p4 = p5;
		p3 = p1;
		
		ar.add(p1);
		ar.add(p4);
		ar.add(p3);
		ar.add(p2);
		
		ar.remove(2);
		Person[] persons = new Person[ar.size()];
		
		for (int i = 0; i < ar.size(); i ++) {
			persons[i] = ar.get(i);
		}
		
		persons[2] = p1;
		
		System.out.println(p1 == p2);	// F
		System.out.println(p3 == p2);	// f
		System.out.println(p4 == p2);	// f
		System.out.println(p5 == p2);	// f
		System.out.println(p1 == p3);	// T
		System.out.println(p3 == p5);	// f
		
		System.out.println(persons[2] == p2);	// f
		System.out.println(persons[1] == p4);	// t
		System.out.println(persons[2] == ar.get(0));	// t
		System.out.println(p3 == ar.get(2));	// f
		System.out.println(p4 == ar.get(2));	// f
		System.out.println(persons[2] == p1);	// t
		
	}

}
