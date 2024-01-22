package com.string.methods;

import java.util.stream.IntStream;

public class StringAllMethodsUse {

	public static void main(String[] args) {

		String str="Hello Java";
		boolean contains = str.contains("o");
		System.out.println(contains);
		
		String str1="Hello World";
		char charAt = str1.charAt(2);
		System.out.println(charAt);
		
		String str2="Java program";
		int codePointAt = str2.codePointAt(1);
		System.out.println(codePointAt);
		
		int codePointBefore = str2.codePointBefore(6);
		System.out.println(codePointBefore);
		
		int codePointCount = str2.codePointCount(2, 5);
		System.out.println(codePointCount);
		
		IntStream codePoints = str2.codePoints();
		System.out.println(codePoints);
	}

}
