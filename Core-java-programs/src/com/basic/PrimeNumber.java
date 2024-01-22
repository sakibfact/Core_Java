package com.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=100; for(int i=0;i<=a;i++) { if(i%2==1) {
		 * System.out.println("Prime Number"+i); }
		 * 
		 * }
		 */
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter Your City Name :");
		String name=sc.nextLine().toLowerCase().trim();
		if (name.equals("Mumbai")) {
			System.out.println("Welcome to the Mumbai");
		}
		else if (name.equals("pune")) {
			System.out.println("Welcome to Pune");
		}
		else if(name.equals("uttarPradesh")) {
			System.out.println("Welcome to Uttar Pradesh ");
			
		}
		else if (name.equals("gujrat")) {
			System.out.println("Welcome to Gujrat");
		}
		else {
			System.out.println("Please Enter The Valid City Name :");
		}
	}

}
