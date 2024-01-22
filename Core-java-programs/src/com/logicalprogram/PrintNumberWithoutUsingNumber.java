package com.logicalprogram;

public class PrintNumberWithoutUsingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int one='A'/'A';
		String s1="..........";                                //First way
		for (int i=one;i<=(s1.length()*s1.length());i++) {
			
			System.out.println(i);
		}
		
		for (int i=one;i<='d';i++) {                         //Second way with ascii value d ascii value is 100
			System.out.println(i);
		}
	}

}
