package com.neotech.codeSamples;

public class average {
	
	
	public double average (int[] arr){
		double sum = 0;

		for (int el : arr) {
			sum += el;
		}

		double avg = sum /arr.length;
		return avg;
		
	}
	
	public static void main(String[] args) {

	}

}
