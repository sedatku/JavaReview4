package com.neotech.test01;

public class Degree {
	void getPrerequisite(){
		System.out.println("To get a degree you need high school diploma");
	}
}


class Bachelors extends Degree {
	
	
	
	@Override
	void getPrerequisite() {
		// TODO Auto-generated method stub
		super.getPrerequisite();
	}

	void getBachelors() {
		
		System.out.println("bachelors degree");
	}
	


}


class Masters extends Degree{
	void getPrerequisite(){
		System.out.println("To get a degree you need high school diploma");
		System.out.println("Masters degree");
	}
	
	
	
	
	
	
}