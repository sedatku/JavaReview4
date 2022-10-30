package com.neotech.review05_other;

import com.neotech.review05.USA;

public class Mexico {

	public static void main(String[] args) {

		USA us = new USA();

		System.out.println("Accessing the variables from inside Mexico ");
		System.out.println("public --> " + us.bestSchool);
		// Private, default, and protected variables

		// System.out.println("default --> " + us.normalState);
		// System.out.println("projected --> " + us.mainState);
		// capitalCity is private
		// System.out.println("private --> " + us.capitalCity);

		System.out.println("Accessing the methods from inside USA");

		us.speakEnglish();
		// us.playNBA();
		// selectPresident() is private
		// us.selectPresident();

	}

}
