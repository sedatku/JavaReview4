package com.neotech.review03;

import java.util.Scanner;

public class Scanner_2DArray {

	public static void main(String[] args) {
		/**
		 * Create the array (String[][] names) fill the array print the array
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("How many rows do you want in the array?");
		int rows = input.nextInt();

		System.out.println("How many columns do you want in the array?");
		int cols = input.nextInt();

		String[][] arr = new String[rows][cols];

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.println("Please enter " + r + " row and " + c + " column's element:");
				arr[r][c] = input.next();

			}

		}

		for (String[] r : arr) {
			for (String element : r) {
				System.out.print(element + " ");

			}
			System.out.println();
		}

	}
}
