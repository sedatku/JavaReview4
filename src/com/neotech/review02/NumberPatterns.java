package com.neotech.review02;

public class NumberPatterns {

	public static void main(String[] args) {
		// 1111
		// 2222
		// 3333
		// 4444

		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.print(row);
			}
			System.out.println();

		}

		System.out.println("------------");
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.print(col);
			}
			System.out.println();

		}

		System.out.println("------------");

		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();

		}
		System.out.println("------------");

		// 1111
		// 222
		// 33
		// 4

//		for (int row =1; row <=4; row++) {
//			for(int col =)
//		}
//		

	}

}
