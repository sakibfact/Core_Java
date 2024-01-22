package com.arrayprogram;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArrayAssendingAndDescendingOrder {

	public static void main(String[] args) {
		int numberOfElement[] = { 9, 11, 8, 5, 3, 4, 2, 7, 10, 1, 6, 0 };

		int min = Arrays.stream(numberOfElement).min().orElse(Integer.MIN_VALUE);
		System.out.println(min);
		Integer maximumValue = Arrays.stream(numberOfElement).boxed().max(Integer::compareTo).get();
		System.out.println("maximum value " + maximumValue);
		Integer secondHighest = Arrays.stream(numberOfElement).boxed().sorted(Comparator.reverseOrder()).skip(2)
				.findFirst().get();
		System.out.println("Second highest slary " + secondHighest);

		System.out.println("Before Sorting :" + Arrays.toString(numberOfElement));
		Arrays.sort(numberOfElement);
		System.out.println("After Sorting" + Arrays.toString(numberOfElement));

		String strWord[] = { "B", "D", "A", "C", "F", "E" };

		System.out.println("Before sorting  :" + Arrays.toString(strWord));
		Arrays.sort(strWord);
		Arrays.sort(strWord, Comparator.reverseOrder());
		System.out.println("Sorted Array :" + Arrays.toString(strWord));
	}
}
