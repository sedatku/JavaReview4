package com.neotech.review01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// ask the user to enter 2 numbers
		// ask the user for the operator (+, -, *, /)
		// solve it using if-else AND using switch

		
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();

		System.out.println("Please enter the operator (+, -, *, /)");
		char operator = scan.next().charAt(0);

		// using if-else
		if(operator == '+') {
			System.out.println( firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber+secondNumber));			
		}
		else if(operator == '-') {
			System.out.println( firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber-secondNumber));
			
		}
		else if (operator =='*') {
			System.out.println( firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber*secondNumber));
		}
		else if (operator == '/') {
			System.out.println( firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber/secondNumber));
		}
		else {
			System.out.println("Invalid value");
		}
//		
//		
		// using switch
//		switch (operator) {
//		case '+':
//			result = firstNumber + secondNumber;
//			break;
//		case '-':
//			result = firstNumber - secondNumber;
//			break;
//		case '*':
//			result = firstNumber * secondNumber;
//			break;
//		case '/':
//			result = firstNumber / secondNumber;
//			break;
//		default:
//			System.out.println("invalid value");
//			return;
//		}

		//System.out.println(result);

	}

}
