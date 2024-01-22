package com.arrayprogram;

import java.util.Arrays;

public class FindThirdHighestSalaryInArray {

	public static void main(String[] args) {
		
		int [] salaries= {10000,20000,40000,70000,55000,90000};
		
		Arrays.sort(salaries);
		reverseArray(salaries);
		
		int thirdHighestSalary=findThirdDistinctElemnt(salaries);
		System.out.println("Third Highest Salary :" +thirdHighestSalary);
		
	}

	private static int findThirdDistinctElemnt(int[] salaries) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void reverseArray(int[] salaries) {
		
		
	}
}
