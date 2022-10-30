package com.neotech.review01;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		int firstNumber = scan.nextInt();
		int secondNumber = scan.nextInt();

		System.out.println("Please enter the operator (+, -, *, /)");
		String operator = scan.next();
		

		// using switch
		switch (operator) {
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "*":
				result = firstNumber * secondNumber;
				break;
			case "/":
				result = firstNumber / secondNumber;
				break;
			default:
				System.out.println("invalid value");
				return;
		}

			System.out.println(result);
		
		

	}

}
