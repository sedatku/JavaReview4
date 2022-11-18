package com.neotech.review07_Polymorphism;

public class Turkish extends Human{
	public Turkish (String name){
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("Ben Turkce konusuyorum. Benim adim " + name);
	}
	
	public void makeBakava() {
		System.out.println("I am making baklava");
		
	}

}
