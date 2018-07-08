
// Java program to demonstrate working of HashSet
import java.util.*;

class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();

		// Adding elements into HashSet usind add()
		hashSet.add("India");
		hashSet.add("Australia");
		hashSet.add("South Africa");
		hashSet.add("India");// adding duplicate elements

		// Displaying the HashSet
		System.out.println(hashSet);
		System.out.println("List contains India or not:" + hashSet.contains("India"));

		// Removing items from HashSet using remove()
		hashSet.remove("Australia");
		System.out.println("List after removing Australia:" + hashSet);

		// Iterating over hash set items
		System.out.println("Iterating over list:");
		Iterator<String> i = hashSet.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}