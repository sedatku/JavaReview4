package com.neotech.review07_Abstraction2;

public class Orange extends Fruit implements Peelable {

	public Orange(String color) {
		super(color);
	}

	@Override
	public void peel() {
		System.out.println(color + " orange can be peel.");
	}

}
