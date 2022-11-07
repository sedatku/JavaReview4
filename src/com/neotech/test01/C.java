package com.neotech.test01;

public class C {
	  int modelYear;
	  String modelName;
	  
	  
	  
	  
	  public C(int year, String name){
		  this.modelYear = year;
		  this.modelName = name;
		  
		  
	  }
	public static void main(String[] args) {
		
		C myCar = new C(1969, "Mustang");
		
		System.out.println(myCar.modelYear + " " + myCar.modelName);
		
		
 
		 
	}



}
