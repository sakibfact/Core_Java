package com.arrayprogram;

public class TwoDArray {

	public static void main(String[] args) {

		int[][][][] initializingValues = 
		{ {
				{ { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20,122,133 }},
				{ { 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35 }, { 36, 37, 38, 39, 40 } },
				{ { 41, 42, 43, 44, 45 }, { 46, 47, 48, 49, 50 }, { 51, 52, 53, 54, 55 }, { 56, 57, 58, 59, 60 } }
				
		} };
		for (int i = 0; i < initializingValues.length; i++) {
			for (int j = 0; j < initializingValues[i].length; j++) {
				for (int k = 0; k < initializingValues[i][j].length; k++) {
					for (int l = 0; l < initializingValues[i][j][k].length; l++) {
						System.out.println("The Three D Array value is" + initializingValues[i][j][k][l] + " ");

					}
					System.out.println();

				}

			}
		}
	}

}
