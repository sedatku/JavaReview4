package com.neotech.review04;

public class School {

	public static void main(String[] args) {
	
		Student student1 = new Student();
		Student student2 = new Student();
		
		Teacher teacher = new Teacher();
		
		student1.name = "Kenan";
		student1.studentNr =368;
		student1.gradeLevel = 10;
		
		
		
		student2.name = "Victor";
		student2.studentNr =001;
		student2.gradeLevel = 5;
		
		teacher.name = "Sabah";
		teacher.salary = 150000;
		teacher.subject = "Java";
		
		System.out.println("Let's call the method");
		
		
		student1.study();
		student2.sleep();
		

		teacher.teach();
		teacher.yealAtStudent(student1.name);

	}

}
