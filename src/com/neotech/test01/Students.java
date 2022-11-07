package com.neotech.test01;

public class Students {

	String name;
	int math;
	int physics;
	int art;
	int avr;

	Students() {

	}

	Students(String name, int math, int physics, int art) {
		name = name;
		math = math;
		physics = physics;
		art = art;

		avr = (math + physics + art) / 3;

		System.out.println(name + " average = " + avr);

	}

	public static void main(String[] args) {

		Students st1 = new Students("Mark", 75, 70, 95);
		Students st2 = new Students("Ankutyo", 70, 88, 99);
		Students st3 = new Students("Ali", 75, 95, 100);
		Students st4 = new Students("Haci", 65, 85, 80);
		Students st5 = new Students("Jim", 85, 75, 90);
	}

}
