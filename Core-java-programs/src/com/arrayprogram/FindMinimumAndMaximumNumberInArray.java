package com.arrayprogram;

public class FindMinimumAndMaximumNumberInArray {

	public static void main(String[] args) {
		
		int numbers[]= {1,20,78,99,66,3,89};
		int minimum=numbers[0];
		int maximum=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]<minimum) {
				minimum=numbers[i];
			}
			else if (numbers[i]>maximum) {
				maximum=numbers[i];
			}
		}
		System.out.println("Minimum Number"+minimum);
		System.out.println("Maximum Number"+maximum);
	}
}
