package com.neotech.review06;

public class Student {
	
	// instance variables
	String name; 
	int age;
	
	// static/class variables
	static String school;
	
	// Constructor
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
		public void displayStudentInfo() {
			System.out.println("My name is " + name + " my name is "   //can use this.name
		+ age + " I study at " + school );
		}
	
	
	
	public static void main(String[] args) {
		
		Student.school = "NeoTech"; // or school = "NeoTech";
		
		
		//we don't have the default Constructor
		//Student s1 = new Student();
		
		Student s2 = new Student ("Aykut", 15);
		s2.displayStudentInfo();
		
		Student s3 = new Student("Sema", 23);
		s3.displayStudentInfo();
		
	}
	
	
	
	

}
