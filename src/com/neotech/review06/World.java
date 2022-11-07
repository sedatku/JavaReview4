package com.neotech.review06;

public class World {

	public static void main(String[] args) {
		
		//1st way, using the constructor with NO parameters
		Person p1 = new Person();
		

		p1.name = "Murad";
		p1.age = 25;
		p1.weight = 200;
		
		p1.displayInfo();
		
		System.out.println("=============");
		//2nd way, using the constructor with 2 parameters
		Person p2 = new Person ("Volkan", 32);
		p2.displayInfo();
		p2.weight = 150;
		
		p2.displayInfo();
		
		//3rd way, using the constructor with 3 parameters
		
		Person p3 = new Person("Ankutyo", 35, 178);
		p3.displayInfo();
		
		
		

	}

}
