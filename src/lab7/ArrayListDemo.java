package lab7;

import java.util.*;
public class ArrayListDemo {
	public static void main (String[] args) {
		//Creating a new ArrayList
		ArrayList  arlTest = new ArrayList();
		//Size of arrayList
		System.out.println("Size of ArrayList at creation:" +arlTest.size());
		//Lets add some elements to it
		arlTest.add("B");
		arlTest.add("I");
		arlTest.add("T");
		arlTest.add("S");
		arlTest.add("P");
		arlTest.add("I");
		arlTest.add("L");
		arlTest.add("A");
		arlTest.add("N");
		arlTest.add("I");
		//Recheck the size after adding elements
		System.out.println("Size of ArrayList after adding elements: "+arlTest.size());
		//Display all contents of ArrayList
		System.out.println("List of all elements: " +
		arlTest);
		//Remove some elements from the list
		arlTest.remove("B");
		System.out.println("See contents after removing one element: " + arlTest);
		//Remove element by index
		arlTest.remove(1);
		System.out.println("See contents after removing element by index: " + arlTest);
		//Check size after removing elements
		System.out.println("Size of arrayList after removing elements: " + arlTest.size());
		System.out.println("List of all elements after removing elements: " + arlTest);
			System.out.println(arlTest.contains("T"));
			
		Iterator itr=arlTest.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element +"\n");
			}
	}
	}

