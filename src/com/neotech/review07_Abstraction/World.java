package com.neotech.review07_Abstraction;
public class World {

	public static void main(String[] args) {
		
		//I cannot create on object from an abstract class
		//Human h1 = Human ("Melih");
		
		//up-casting and down-casting can be done ONLY 
		//because of INHERITANCE
		Human a1 = new Albanian("Valbona"); //up-casting
		a1.talk();
		a1.sleep();
		//a1.albanianDance();
		
		Human  t1 = new Turkish("Vane"); //up-casting
		t1.talk();
		t1.sleep();
		
		Turkish tur = (Turkish) t1; //down-casting
		tur.makeBaklava();
		
		Human t2 = new Albanian ("Elion");
		t2.talk();

		
		Human t3 = new Albanian ("Sabah");
		t3.talk();
		
		Human t4 = new Turkish ("Oguzhan");
		t4.talk();
		
		System.out.println("=====================");
		
		Human[] humans = new Human[5];
		humans[0] = t1;
		humans[1] = t2; 
		humans[2] = t3;  
		humans[3] = t4;  
		humans[4] = new Turkish("Ali"); 
		
		
		
		for (Human element : humans) {
			element.talk();
			element.sleep();
		}
	}

}
