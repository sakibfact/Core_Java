package com.logicalprogram;

public class ReverceNumber {

	public static void main(String[] args) {

		int num=1234;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println(rev);
		
		System.out.println("Print reverse number using for loop");
		
		int number=12345;
		int reverse=0;
		int reminder=0;
		for(;number!=0;number=number/10) {
			reminder=number%10;
			reverse=reverse*10+reminder;
		}
		System.out.println(reverse);
	}

}
