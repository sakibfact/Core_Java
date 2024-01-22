package com.string.methods;

public class EqualsIgnoreCaseMethod {

	public static void main(String[] args) {
		
		String name="JhoN";
		boolean equalsIgnoreCase = name.equalsIgnoreCase(name);
		System.out.println(equalsIgnoreCase);
		
		String name1="Sonu";
		String name2="Sonu";
		
		boolean equalsIgnoreCase2 = name1.equalsIgnoreCase(name2);
		System.out.println(equalsIgnoreCase2);
	}
}
