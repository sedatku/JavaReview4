package com.neotech.review05;

//public class Test {

	
	// construction method
//	void m1() {
//		System.out.println("m1 method");
//	}
//
//	Test() {
//		System.out.println("0-arg constructor");
//	}
//
//	Test(int i) {
//		System.out.println("1-arg constructor");
//	}
//
//	public static void main(String[] args) {
//		Test t1 = new Test();
//		Test t2 = new Test(10);
//		t1.m1();
//		t2.m1();

		
	
	
	//this keyword
	
	class Test{
		int rollno;
		String name;
		float fee;
		Test(int rollno, String name, float fee){
			this.rollno = rollno;
			this.name = name;
			this.fee = fee;
		}
		
		void display() {
			System.out.println(rollno + " " + name + " " + fee);
		}
		
	}
	
	class TestThis2{
		public static void main(String[] args) {
			Test s1 = new Test(111, "ankit", 5000f);
			Test s2 = new Test(112, "sumit", 5000f);
			s1.display();
			s2.display();
		}
	}
		
		
		
		
		
		
//	}

//}
