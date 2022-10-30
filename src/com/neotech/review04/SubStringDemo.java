package com.neotech.review04;

public class SubStringDemo {
	
	public static void main(String[] args) {
		
		String longStr = "I am very happy today because today is not Monday";
		
		String anotherStr = longStr.substring(5,7);
		
		System.out.println(anotherStr);
		
		String anotherStr2 = longStr.substring(5);
		System.out.println(anotherStr2);
		
		System.out.println(longStr);// No change
		
		longStr = longStr.substring(10);
		
		System.out.println(longStr);
		
		// longStr.substring(8, 5); // run-time error
		
		// longStr.substring(5, 100); // run-time error
		
		// longStr.substring(-5, 10); // run-time error
		

	}

}
