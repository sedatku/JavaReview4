package com.neotech.review02;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// Ask the the user to enter a positive number and add it to the total
		// He should enter -1 to stop - -1 will not be added to the total

		Scanner scan = new Scanner(System.in);
		int total = 0;
		int num = 0;

		// while loop
//		System.out.println("Please enter a number! To STOP enter -1");
//		num = scan.nextInt();
//
//		while (num != -1) {
//			total += num;
//
//			System.out.println("Please enter a positive number! To STOP ENTER -1");
//			num = scan.nextInt();
//		}
//		System.out.println("Total = " + total);

		// Do While Loop
//		do {
//			System.out.println("Please enter a positive number! To STOP ENTER -1");
//			num = scan.nextInt();
//			if (num != -1) {
//				total += num;
//			}
//		} while (num != -1);
//		System.out.println("Total = " + total);

		// for loop
		// 1st iteration -> 1. initialization; 2. check condition
		// next iterations -> 1. increment; 2. check condition

//		for (int i =1; i<=5; i++) {
//			System.out.println(i);
//		}

		System.out.println("Please enter a positive number! To STOP ENTER -1");
		num = scan.nextInt();

		for (; num != -1;) {
			total += num;
			System.out.println("Please enter a positive number! To STOP ENTER -1");
			num = scan.nextInt();

		}
		System.out.println("Total = " + total);

	}

}
