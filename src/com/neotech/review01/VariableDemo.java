package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {
		//Declaring a variable
		String firstName;
		
		//Assign a value (initialize)
		firstName = "Cesur";
		System.out.println("My first name is " + firstName);
		
		// Declare a variable & Assign a value
		String lastName = "Unsur";
		
		int age = 28;
		
		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));
		
		//after 5 years
		//re-assign a new value to container
		age +=5;
		System.out.println(age);
		
		lastName = "Aniston";
		
		System.out.println("After getting married!");
		
		System.out.println(firstName + " " + lastName + " " + age) ;

	}

}
