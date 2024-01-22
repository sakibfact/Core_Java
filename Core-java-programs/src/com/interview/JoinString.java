package com.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinString {
	public static void main(String[] args) {

		// First way to join words
		
		String[] array = { "p", "r", "o", "g", "r", "a", "m", "m", "i", "n", "g" };
		String joinAllWords = String.join(":", array);
		System.out.println(joinAllWords);

		// Second way to join word with the help of stream java 8
		
		String collectionOfCharacters = Arrays.asList("I", "n", "d", "i", "a")
				.stream().collect(Collectors.joining("|"));
		System.out.println(collectionOfCharacters);
		
	
		System.out.println(joinString("|||", "s","a","k","i","b"));
	
}
	public static String joinString(String seperator,String... values) {
		StringBuilder sb =new StringBuilder();
		int end=0;
		for(String s : values) {
			
			if(s!=null) {
				sb.append(s);
				end=sb.length();
				sb.append(seperator);
			}
		}
		return sb.substring(0, end);
	}
}