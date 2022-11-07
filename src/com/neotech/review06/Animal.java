package com.neotech.review06;

//You can have multiple classes in one file
// Only one class can be public
//The public class name should be same as file name
public class Animal {
	
	String name;
	int legs;
	
	Animal(){
		
	}
	
	
	Animal(String name, int legs){
		this.name = name;
		this.legs = legs;
	}
	
	
	public void slee() {
		System.out.println("All animals sleep");
	}
	
	void displayInfo() {
		System.out.println(name + " hasa " + legs + " legs");
	}
	
}


class Snake extends Animal{
	
	
}
