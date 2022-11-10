package com.neotech.test01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE
		  System.out.println("Please enter the string: ");
		    String input = scan.next();

		       char letter;
		      int count =0;
		    char[] chrArray = input.toCharArray();

		    for (int i =0; i<chrArray.length-2; i++)
		    { 
		     if(chrArray[i]== chrArray[i+1] &&  chrArray[i] ==  chrArray[i+2]){
			        count++;
		         
		      }
		    }
		    System.out.println(count);
		    

		  }

	}


