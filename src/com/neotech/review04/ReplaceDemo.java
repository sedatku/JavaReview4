package com.neotech.review04;

public class ReplaceDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today because today is not Monday";
		
		String anotherStr = longStr.replace('a', 'e');
		
		System.out.println(anotherStr);
		
		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);
		
		System.out.println("======================");
		
		//regular expression
		anotherStr = longStr.replaceAll("[a-z]",  "*");
		System.out.println(anotherStr);
		
		String ssn = "131-45-9723";
		String newSSN = ssn.replaceAll("[0-9]", "*");
		System.out.println(newSSN);
		
		String newSSN2 = ssn.replaceAll("[3-7]", "*");//number 3, 4, 5, 6, 7 changing
		System.out.println(newSSN2);
		
		String newSSN3 = ssn.replaceAll("[37]", "*"); //just 3 and 7 changing
		System.out.println(newSSN3);
		
		
		System.out.println("Let's remove the dashes from ssn");
		String numbers = ssn.replace("-", "");
		System.out.println(numbers);
		
		
		//A task for hard working students
		//Hide all the numbers and leave the last four digits of ssn
		// ***-***-8745
		//Do NOT hard code it :)
		

	}

}
