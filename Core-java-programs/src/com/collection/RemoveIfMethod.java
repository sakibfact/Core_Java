package com.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> students = new ArrayList<>();
		students.add("Sakib");
		students.add("Arshad");
		students.add("Asadullah");
		students.add("Aamir");
		students.add("Aatif");
		students.add("Ehtesham");

		students.removeIf(a -> (a.charAt(0) == 'A'));
		for (String str : students) {
			System.out.println(str);
		}
	}
}
