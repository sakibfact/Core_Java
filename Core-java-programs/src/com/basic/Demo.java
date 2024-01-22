package com.basic;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		/*
		 * int x=10; int y=5; int result=(x<y)?(x<15?1:2):0; System.out.println(result);
		 */

		List<String> words = List.of("Apple", "Bat", "Cat", "Orange");
		List<String> duplicateWord = new ArrayList<>(words);
		for (int i = 0; i < duplicateWord.size(); i++) {
			System.out.println(duplicateWord.get(i));
			if (duplicateWord.get(i).endsWith("at")) {
				duplicateWord.remove(duplicateWord.get(i));
			}
		}
		System.out.println(duplicateWord);
	}
}
