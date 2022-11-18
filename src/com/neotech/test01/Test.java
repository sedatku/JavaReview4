package com.neotech.test01;

import java.util.Scanner;

public class Test {

	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Please enter a word: ");
		    String word = scan.next();
		    //YOUR CODE HERE


		    if (word.length()>=5 && word.length()%2==1){
		      int middle = word.length()/2;
		       //   System.out.println(word.substring(middle-1, middle+2));  
		       //   System.out.println(word.substring(1, 4));  
		          System.out.println(word.substring(1,2)); 
		          System.out.println(word.substring(1,3));
		          System.out.println(word.substring(1,4));

		    }else System.out.println("invalid");
		    
		  }

	}


