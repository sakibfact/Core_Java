package com.arrayprogram;

public class CopyElementOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {1,2,3,4,5};
		int arr1[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		
		//System.out.println();
		System.out.println("Print original array");
	       
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("Printing new Array");
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+ " ");
		}
		
		System.out.println();
		System.out.println("Adding one array to another array of string array");
		String str[]=new String [] {"Sakib","khan","Mohammad","India"};
		String str1[]=new String[str.length];
		
		for(int i=0;i<str.length;i++) {
			str1[i]=str[i];
			
		}
		System.out.println();
		System.out.println("Original String array ");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i] + " ");
		}
		System.out.println();
		System.out.println("New string array");
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]+ " ");
			
		}
	}
}
