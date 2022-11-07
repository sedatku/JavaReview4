package com.neotech.test01;


class Vehicle{
	protected String brand = "Ford"; // Vehicle attribute
	public void honk() // Vehicle method
	{
		System.out.println("Tuut, tuuut!");
	}
}
	



public class InheritanceSubclassSuperclass extends Vehicle{
	
	
	

		private String modelName = "Mustang"; //Car attribute
		
		public static void main(String[] args) {
			
			InheritanceSubclassSuperclass c = new InheritanceSubclassSuperclass();
			
			c.honk();
			
		}
		

	
		
	
	
		}
