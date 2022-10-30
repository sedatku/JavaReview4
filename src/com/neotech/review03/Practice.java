package com.neotech.review03;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter size of array: ");
		int size = scan.nextInt();
		int[] nums = new int[size];
		int[] numsNew = new int[2*size];
		// int last = 0;
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter numbers: ");
			nums[i] = scan.nextInt();
			numsNew[i] = 0; 

		}
		// WRITE YOUR CODE HERE
		numsNew[2*size-1] = nums[size-1];

//		String firstValue = "";
//		String lastValue = "";
//		String otherValues = "";

//		for (int i = 0; i < size + 1; i++) {
//			if (i == 0) {
//
//				firstValue = "[" + 0 + ", ";
//			} else if (i == size) {
//				lastValue = nums[size - 1] + "]";
//			} else {
//				otherValues += "0, ";
//			}

//		}

		//System.out.print(firstValue + otherValues + lastValue);
		
		for (int i =0; i< numsNew.length; i++) {
			
			if (i == 0) {
			System.out.print("[" + numsNew[i] + ", ");
			}
			else if(i !=numsNew.length-1) {
				System.out.print(numsNew[i] + ", ");
				
			}
			else {
				System.out.println(numsNew[2*size-1] + "]");
			}
		}
		System.out.println();

	}

}
