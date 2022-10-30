package com.neotech.review05;

public class ToCharArray {

	public static void main(String[] args) {
	
		
		String longStr = "I am very happy today, because today is not Monday";
		
		System.out.println("String length --> "+ longStr.length());
		
		char[] charArray = longStr.toCharArray();
		System.out.println("char[] length --> " + charArray.length);
		
		for(char el: charArray) {
			System.out.print(el);
			
		}
		
		System.out.println();
		
		System.out.println("\n\tPrint the whole array, but replace \"a\" with \"e\"");
		//first way
//		for(int i = 0; i <charArray.length; i++) {
//			
//			if(charArray[i] =='a') {
//				charArray[i] ='e';
//				
//			}
//		
//			System.out.print(charArray[i]);
//		}
//
//		System.out.println();
//		
		
//		print the whole array, but replace 'a' with 'e'  \\   \"a\" --> "a"
//		don't use replace/replaceAll method
		
		
			//second way
		for (char el: charArray) {
			if (el =='a') {
				System.out.print('e');
			}
			else {
				System.out.print(el);
			}
		}
		
		
		
		
	}

}
