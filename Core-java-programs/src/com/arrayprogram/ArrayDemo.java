package com.arrayprogram;

public class ArrayDemo {

	public static void main(String[] args) {

		int arr[] = { 6, 5, 7, 4, 3, 1, 2,10};
		int[] ascending = ArrayDemo.descending(arr);

		for (int a : ascending) {
			System.out.println(a);
		}
	}

	public static int[] ascending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] descending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
