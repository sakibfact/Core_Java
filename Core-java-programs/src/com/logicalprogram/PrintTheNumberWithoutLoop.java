package com.logicalprogram;

import java.util.stream.IntStream;

public class PrintTheNumberWithoutLoop {

	public static void main(String[] args) {
		// printNumber(1);
		// printNumber(10, 50);
		IntStream.range(1, 101).forEach(a -> System.out.println(a));   //Printing number with thw help of java 8

	}

	public static void printNumber(int num) {
		if (num <= 100) {
			System.out.println(num); // First Logic
			num++;
			printNumber(num);
		}

	}

	public static void printNumber(int startNumber, int endNumber) {
		if (startNumber <= endNumber) {
			System.out.println(startNumber);
			startNumber++;                   // Second logic
			printNumber(startNumber, endNumber);
		}
	}
}
