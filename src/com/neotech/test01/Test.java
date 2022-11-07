package com.neotech.test01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	    Scanner scan= new Scanner(System.in);
	    System.out.println("Please enter a string");
	    String word = scan.next();
	    // Write your code here

	    int fLength = word.length();
	    int lLength =0;
	    
	    
	  if( word.contains("java"))
	  {
	    String[] spt = word.split("java");
	    String newWord = spt.toString();

	    lLength = newWord.length();
	    System.out.println((fLength - lLength)/4);
	    
	  }


	  }

	}


