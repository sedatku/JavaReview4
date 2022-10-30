package com.neotech.review02;

public class Task02 {

	public static void main(String[] args) {

// Add Even numbers
// Also add Odd numbers
// Also add All numbers
// Between 1 && 50
// Using for loop

//		int totalEven = 0;
//		int totalOdd = 0;
//		int total = 0;
//	
//		for (int i = 1; i <= 50; i++) {//Even
//			if (i % 2 == 0) {
//				totalEven += i;
//
//			} else {//Odd
//				totalOdd += i;
//
//			}
//
//		}
//		System.out.println("Total Even = " + totalEven);
//		System.out.println("Total Odd = " + totalOdd);
//		System.out.println("Total = " + (totalEven + totalOdd));

		// Smarter way
		int evenTotal = 0;
		int oddTotal = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				evenTotal += i;

			} else {
				// odd
				oddTotal += i;
			}
		}

		System.out.println("The sum of even numbers = " + evenTotal);
		System.out.println("The sum of odd numbers = " + oddTotal);
		System.out.println("The sum of all numbers = " + (evenTotal + oddTotal));

	}

}
