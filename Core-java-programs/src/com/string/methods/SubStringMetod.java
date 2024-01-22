package com.string.methods;

public class SubStringMetod {

	public static void main(String[] args) {
		
		String words="Where are you going for dinner";
		
		String substring = words.substring(9);
		System.out.println(substring);
		
		String substring2 = words.substring(4, 16);
		System.out.println(substring2);
		
		CharSequence subSequence = words.subSequence(2, 7);
		System.out.println(subSequence);
	}
}
