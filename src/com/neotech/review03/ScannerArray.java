package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {

	//Ask the user: How many numbers do you want to store in the array?
	//Ask him to enter the numbers: Read numbers and enter them into the array
	//Print the numbers from the array
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How many numbers do you want to store in the array?");
		int arrSize = scan.nextInt();
		
		// Declaring the array
		int[] arr = new int [arrSize]; 
		
		
		// Read numbers and enter them into the array
		for (int i =0; i<arrSize; i++) {
			System.out.println("Enter a number;");
			arr[i] = scan.nextInt();
				
		}
		
		//Print the numbers from the array
		System.out.println("Let's print the numbers from the array");
		
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("Let's print the numbers using enhanced for loop");
		for (int element: arr) {
			System.out.print(element + " ");
			
		}
		System.out.println();
		
		
		// HOMEWORK - Practice   
		//Print the sum of the numbers in the array
		//1. using NORMAL for loop
		//2. using Enhanced/advanced or loop
		
	}

}
