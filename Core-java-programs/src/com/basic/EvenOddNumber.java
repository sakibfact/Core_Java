package com.basic;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter A Number");
		int num=sc.nextInt();
		
		if(num>0) {
			if(num%2==0) { 
				System.out.println("Even Number ");
			}
			else
				System.out.println("Odd Number");
		}
		else
			System.out.println("Invalid Numbers");
	}

}
