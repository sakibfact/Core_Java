package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateStringUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "Hello World Hello Java World";

		String[] words = inputString.split(" ");
		Map<String, Integer> wordFrequency = new HashMap<>();

		for (String word : words) {
			word = word.toLowerCase();
			if (wordFrequency.containsKey(word)) {

				wordFrequency.put(word, wordFrequency.get(word) + 1);

			} 
			else {
				wordFrequency.put(word, 1);
			}
		}

		System.out.println("Duplicate words in the String is");
		for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
