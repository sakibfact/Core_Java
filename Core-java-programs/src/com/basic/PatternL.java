package com.basic;

import java.util.Scanner;

public class PatternL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int NumberOfOccure = sc.nextInt();
		PatternL printPattern = new PatternL();
		printPattern.printPatternOfStar(NumberOfOccure);
	}

	public void printPatternOfStar(int occurenceOfCharacter) {
		int n = 5;
		int x = n;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 2 * n * occurenceOfCharacter + 2; j++) {
				if (j % (n * 2) == x || j % (n * 2) == (n + i))
					System.out.print("*");
				else if (i == (n / 2) + 1 && j % (n * 2) <= n + i - 1 && j % (n * 2) >= x)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
			x--;

		}
	}

}
