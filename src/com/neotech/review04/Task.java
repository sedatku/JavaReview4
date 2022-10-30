package com.neotech.review04;

public class Task {
	

	void sayGreetingWithNumber (int n, String greeting) {
		for (int i =1; i <=n; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Task g = new Task();
		
		g.sayGreetingWithNumber(3, "Selam");

	}

}
