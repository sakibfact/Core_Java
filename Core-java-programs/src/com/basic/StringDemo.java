package com.basic;

public class StringDemo {
	public static void main(String[] args) {

		String s = null;
		String s1 = "asad";
		String s2 = "dev";
		String s3 = "sak";
		System.out.println(s + s1);
		//System.out.println(s.concat(s1));
		System.out.println(s3 + s2);
		System.out.println(s3.concat(s2));

		String str = new String("khan");
		String str1 = new String("Sakib");
		str.concat(str1);
		str1 = str + str1;
		System.out.println(str);
		System.out.println(str1);

	}
}
