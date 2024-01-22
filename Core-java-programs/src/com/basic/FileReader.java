package com.basic;

import java.util.HashSet;
import java.util.Set;

public class FileReader {

	public static void main(String[] args) throws Exception {

		String str = "Java Is Waste";
		Set<Object> hash = new HashSet();
		for (int i = 0; i < str.length(); i++) {
			if (!hash.add((str.charAt(i)))) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
