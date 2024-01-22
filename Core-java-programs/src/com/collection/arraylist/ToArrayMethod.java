package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToArrayMethod {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Aa");
		list.add("Bb");
		list.add("Cc");
		list.add("Dd");
		list.add("Ee");

		String[] array = list.toArray(new String[0]);

		for (String elemnts : array) {
			System.out.println(elemnts);

			System.out.println("-----------------");

			
			for (int i = 0; i < array.length; i++) {

				System.out.println(array[i] + " ");

			}

			System.out.println("-----------------");

			list.forEach(item -> {
				System.out.println(item);
			});
		}

		System.out.println("-----------------");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
