package com.neotech.review05;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {

		int[] array = { 7, 3, 5, 9, 8 };
		// To print one element with index 2
		// System.out.println(array[2]);

		// Print the array using

		System.out.println(Arrays.toString(array));
		
		ArrayParameter ap = new ArrayParameter();
		int result = ap.largestNumber(array);
		
	System.out.println("THe largest number in the array is --> " + result);
		
		
		//ArrayParameter obj = new ArrayParameter();
		
		System.out.println("The sum of the array is--->: " + ap.sum(array));
		
		
	//	ArrayParameter obj2 = new ArrayParameter();
		
		System.out.println("The average of the array is -->: " + ap.average(array));

	}

	
	public int largestNumber(int[] arr){
		int largest = arr[0];
		
		for(int el : arr) {
			if (el > largest) {
				largest = el;
			}
		}
		
		
		return largest;
	} 

	
	// Task2
	//Create a method that will get an array of integers
	//and return the sum
	//make the method protected

	protected int sum (int[] arr){
		int sum =0;
		
		for(int el : arr) {
			sum +=el;
				
			}
		
		return sum;
	} 


	//task3
	//create method that will get an array of integers,
	//and return the average as a double
	//make the method private
	
	private double average (int[] arr){
		
		int sum = sum(arr);
		int avg = sum /arr.length;
		return avg;
			
//		
//		double avr =0;
//		int sum =0;
//		
//		for(int el : arr) {
//			sum +=el;
//				
//			}
//		avr = sum / arr.length;
//		
//		
//		return avr;
	} 
	

}
