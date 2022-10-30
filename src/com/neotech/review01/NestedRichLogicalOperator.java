package com.neotech.review01;

import java.util.Scanner;

public class NestedRichLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your gender: ");
		char gender = scan.next().charAt(0);
		
		System.out.println("Ar you rich? (true/false)");
		boolean rich = scan.nextBoolean();
		
		if (gender =='M' && rich) { //rich male
				System.out.println("Buy a Ferrari");
		}
		else if(gender =='M' &&!rich) { //poor male
				System.out.println("Play soccer");
		}
		else if(gender =='F' && rich) { //rich female
				System.out.println("Buy a LV bag");
			}
			else if (gender =='F' && !rich) {//poor female
				System.out.println("Read a book");
				
			}
				 
			
			
			
		

	}

}
