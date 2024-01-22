package com.arrayprogram;

public class FindingDublicateElement {

	public static void main(String[] args) {

		int[] a = { 1, 1, 2, 3, 2, 5, 6, 5, 6, 4, 3, 3, 4, 7 };

		for (int i = 0; i < a.length; ++i) {
			int x = a[i];
			int count = 0;
			if (x == -1)
				continue;
			for (int j = 0; j < a.length; ++j) {
				if (a[j] == x) {
					++count;
					a[j] = -1;
				}
			}
			System.out.println("Frequency of " + x + " is " + count);

		}
	}
}
