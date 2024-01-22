package com.basic;

public class SeparatingNumber {
	public static void main(String[] args) {
		int number=1218;
		
		String strNumber=Integer.toString(number);
		
		for(int i=0;i<strNumber.length();i++) {
			
			char digitChar=strNumber.charAt(i);
			//int digit=Character.getNumericValue(digitChar);
			System.out.println("Digit at position" + i + ":"+digitChar);
			
		}
	}

}
