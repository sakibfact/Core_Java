package com.arrayprogram;

import java.util.Arrays;

public class FindMinimumAndMaximumUsingJava8 {

	public static void main(String[] args) {
		int numbers[]= {18,67,29,1,99};
		
		int minimum=Arrays.stream(numbers).min().orElse(Integer.MIN_VALUE);
		int maximum=Arrays.stream(numbers).max().orElse(Integer.MAX_VALUE);
		System.out.println("Minimum Number of Array "+minimum);
		System.out.println("Maximum Number of Array "+ maximum);
	}
}
