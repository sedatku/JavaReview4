package com.neotech.codeSamples;

public class Vehicle {
	protected String brand = "Ford";        // Vehicle attribute
	  public void honk() {                    // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
	}

	
class Car extends Vehicle {
	
	public static void main(String[] args) {
		Car myObj = new Car();
		myObj.honk();
	}
	
	
	
}