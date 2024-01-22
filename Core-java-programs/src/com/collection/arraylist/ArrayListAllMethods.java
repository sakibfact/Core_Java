package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListAllMethods {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Jhon");
		names.add("toom");
		names.add("seem");
		names.add("toom");
		names.add("Jack");
		names.add("Depth");

		names.add(1, "Robert");
		names.remove(2);
		names.get(3);
		// names.clear();
		System.out.println(names.get(2)); // getting name at index position 2/ seem

		names.set(0, "Jerry");// Replace with Jhon

		int size = names.size(); // Size of the list
		System.out.println(size);

		// names.clear(); // With the help of clear method remove the all elements in
		// the List

		boolean empty = names.isEmpty(); // Empty method is for checking list is empty or not
											// if List is empty return true otherwise false
		System.out.println("List is empty :-" + empty);

		boolean containsElement = names.contains("Jack"); /*
															 * contains method is repersent the if element is available
															 * return true otherwise return false.
															 */
		System.out.println(containsElement);

		int indexOf = names.indexOf("Jerry"); /*
												 * indexOf(Object obj): Returns the index of the first occurrence of the
												 * specified element in the list, or -1 if the element is not present.
												 */
		System.out.println(indexOf);
		
		Object[] array = names.toArray();
		System.out.println(array);

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String listOfName = iterator.next();
			System.out.println(listOfName);

		}
	}

}