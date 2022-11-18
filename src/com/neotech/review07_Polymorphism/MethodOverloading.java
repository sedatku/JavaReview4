package com.neotech.review07_Polymorphism;

// Method signature = method name + parameters
// access modifier is NOT part of Method signature
// return type is NOT part of Method signature

public class MethodOverloading {
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.methodOne("Dardan");
		
		mo.medhodOne(4.5, 6);
		
		
		// polymorphism
		// method overloading
		// compile time polymorphism / early binding / static binding
		
	}

	public void methodOne() {
		
	}
	
	public void medhodOne(int a) {
		
	}
	
	public void methodOne (String a) {
		
	}

	public void medhodOne(int a, int b) {
		
	}
	
	public void medhodOne(double a, double b) {
		
	}
	
	public void medhodOne(double a, int b) {
		
	}
	
	public void medhodOne(int a, double b) {
		
	}
	
	





}





