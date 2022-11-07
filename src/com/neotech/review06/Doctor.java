package com.neotech.review06;

// OOP --> Object Oriented Programming
// 1. Inheritance  (
// 2. PolyMorphism
// 3. Abstraction
// 4. Encapsulation



// Every class in Java is extending the Object
// Object class is like ADAM in humanity :)


public class Doctor {
	String name;
	int salary;
	String licenceId;
	
	//it is a good practice to leave the default constructor
	Doctor(){
		
	}
	
	Doctor (String name, int salary, String licenceId){
		this.name = name;
		this.salary = salary;
		this.licenceId = licenceId;
	}
	
	public void checkUp(String name) {
		System.out.println("Doctor " + this.name + " makes a checkup on " + name);
		
	}
	
	
	

}
