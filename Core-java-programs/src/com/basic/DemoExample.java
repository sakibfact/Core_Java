package com.basic;

public class DemoExample {

	public static void main(String[] args) {
		int x = 5;
		int result = 0;
		try {
			result = x / 0;
		} catch (NumberFormatException e) {
			result = 1;

		} finally {
			result += 2;
		}
		System.out.println(result);
	}
}
