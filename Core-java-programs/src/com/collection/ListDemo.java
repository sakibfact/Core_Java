package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {

		List<String> animal = new ArrayList<>();
		animal.add("Dog");
		animal.add("CAt");
		animal.add("Bull");
		animal.add("Zebra");
		animal.add("snake");
		animal.add("monkey");
		animal.add("Dunky");
		animal.add("Cow");
		animal.add("lion");
        
		//animal.clear(); clear() method use for clear the all element present in the list. 
		
		System.out.println(animal.size());//size() method use for count the total number of elements present in the list . 
		
        System.out.println(animal.remove(1));                //remove()method use for removing the element of index basis. like 0 index 1 index .....nTh no of indexes.	
        
        animal.add(1, "Jaguar");   //add(int index, String element) basically use for adding the element on specified position based on index number where you want to store element .
        
        String string = animal.get(3);//getIndex() method use for getting the element base on index number.
        System.out.println(string);
        
        System.out.println(animal.isEmpty());//isEmpty() method is used for checking the list is empty or not if list is empty return true otherwise return false.
        
        System.out.println(animal.contains("Dog")); //contains()method used for checking the element is present in the list or not if present return true otherwise false
		
        System.out.println(animal);

		Iterator<String> itr = animal.iterator();
		while (itr.hasNext()) {
			String animals = itr.next();
			animals.charAt(1);
			System.out.println(animals);

		}

        System.out.println("++++++++++++++++++++++");
        
		ListIterator<String> lstr = animal.listIterator();
		while(lstr.hasNext()) {
			
			boolean hasPrevious = lstr.hasPrevious();
			System.out.println(hasPrevious);
			
			String animals1 = lstr.next();
			System.out.println(animals1);
			
			
		}

	}

}
