package com.basic;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int NumberOfOccure = sc.nextInt();
		Pattern1 printPattern = new Pattern1();
		printPattern.printPatternOfStar(NumberOfOccure);
	}

	public void printPatternOfStar(int occurenceOfCharacter) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < (n) * occurenceOfCharacter; j++) {
				if ((j % n) == 1 || (i == n && ((j % 5) > 0)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
	}

}