package com.neotech.review01;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		//if you are a boy
		//if you are rich -- buy a Ferrari
		//otherwise -- play soccer
		
		//If you are a girl
		//If you are rich -- Buy a LV bag
		//otherwise -- Read a book
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your gender (F / M) ");
		char gender = scan.next().charAt(0);
		
		System.out.println("Are you rich (true/false)");
		boolean rich = scan.nextBoolean();
		
		
		if (gender =='m'|| gender =='M') {
			if (rich) {
			System.out.println("buy a Ferrari");	
			}
			
			else{
				System.out.println("Play soccer");
			}
			
		}
		
		else if (gender == 'f' || gender == 'F'){
			if (rich) {
				System.out.println("Buy a LV bag");	
				}
				
				else{
					System.out.println("Read a book");
				}
			
			
		}
			else {
				System.out.println("Invalid value");
			}
				
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
