package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Sakib");
		map.put(2, "Arshad");
		map.put(3, "Aamir");
		map.put(4, null);

		for (Map.Entry<Integer, String> student : map.entrySet()) {

			System.out.println(student.getKey() + " " + student.getValue());
		}

	}
}
