package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,1,2,2,3,4,5,6,5,5,5,6,6,7,7,5,5,8,8));
		
		LinkedHashSet<Integer> removeDuplicate=new LinkedHashSet<>(numbers);
		
		ArrayList<Integer> withoutDuplicateNumbers=new ArrayList<>(removeDuplicate);
		
		for(int printNumbers : withoutDuplicateNumbers) {
			System.out.println(printNumbers);
		}
		System.out.println("----------------------------------");
		
		List<Integer> numberCount=new ArrayList<>(Arrays.asList(1,1,2,2,3,4,5,6,5,5,5,6,6,7,7,5,5,8,8));
		List<Integer> collectUniqeNumbers = numberCount.stream().distinct().collect(Collectors.toList());
		Iterator<Integer> iterate=collectUniqeNumbers.iterator();
		while(iterate.hasNext()) {
			
			System.out.println(iterate.next());
		}
	}
}