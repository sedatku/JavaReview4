package com.neotech.review07_Abstraction2;

public class FruitDemo {

	public static void main(String[] args) {

		Apple a = new Apple("Yellow");
		a.peel();
		a.wash();

		Coconut c = new Coconut("Green");
		c.crack();

		Fruit f = new Apple("Red"); // up-casting
//		f.peel();
//		f.wash();

		Apple a2 = (Apple) f; // down-casting
		a2.peel();
		a2.wash();

		// Trump, no we can't create an object
		// Peelable p = new Peelable ();

		Peelable p1 = new Apple("Green"); // up-casting
		p1.peel();
		// p2.wash() //not possible

		Fruit f1 = new Apple("Red");
		Fruit f2 = new Orange("Pink");
		Fruit f3 = new Orange("Yellow");

		Fruit[] pArray = { f1, f2, f3 };

		for (Fruit el : pArray) {

			if (el instanceof Apple) {
				((Apple) el).peel();
				((Apple) el).wash();
			} else if (el instanceof Orange) {
				((Orange) el).peel();
			}
		}
	}
}
