package com.neotech.codeSamples;

public class largestNumber {
	
	//int the array return largest number
	public int largestNumber(int[] arr){
		int largest = arr[0];
		
		for(int el : arr) {
			if (el > largest) {
				largest = el;
			}
		}
		
		
		return largest;
	} 
	
	
	
	
	
	
	
	

}
