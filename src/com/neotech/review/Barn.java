package com.neotech.review;

public class Barn {

	public static void main(String[] args) {

		Animal a1;
		a1 = new Dog();  //up-casting	
		Animal a2 = new Cat(); //up-casting
		Animal[] animalArray = new Animal[3];
		
		animalArray[0] = a1;
		animalArray[1] = a2;
		animalArray[2] = new Dog(); 
		
		for (Animal element: animalArray) {
			if(element instanceof Dog) {
				Dog d = (Dog) element; //down-casting
				d.bark();
			}else if (element instanceof Cat) {
				Cat c = (Cat) element; //down-casting
				c.Meowing();
			}
		}
	}
}
