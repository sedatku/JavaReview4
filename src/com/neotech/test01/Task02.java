package com.neotech.test01;

import java.util.Scanner;

public class Task02 {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] input = new String[6];
	String[][] splitted = new String[6][6];
	int[] sum = new int[5];

	System.out.println("Enter your name and cards please: ");
	for (int i = 0; i < 5; i++) {
		input[i] = scan.next();
	}
	for (int i = 0; i < 5; i++) {
		splitted[i] = input[i].toUpperCase().split("[:,]");
	}
	for (int i = 0; i < 5; i++) {
		for (int j = 1; j < 6; j++) {
			if (splitted[i][j].contains("S") | splitted[i][j].contains("H") | splitted[i][j].contains("D")
					| splitted[i][j].contains("C")) {
				if (splitted[i][j].contains("A")) {
					sum[i] += 1;
				} else if (splitted[i][j].contains("2")) {
					sum[i] += 2;
				} else if (splitted[i][j].contains("3")) {
					sum[i] += 3;
				} else if (splitted[i][j].contains("4")) {
					sum[i] += 4;
				} else if (splitted[i][j].contains("5")) {
					sum[i] += 5;
				} else if (splitted[i][j].contains("6")) {
					sum[i] += 6;
				} else if (splitted[i][j].contains("7")) {
					sum[i] += 7;
				} else if (splitted[i][j].contains("8")) {
					sum[i] += 8;
				} else if (splitted[i][j].contains("9")) {
					sum[i] += 9;
				} else if (splitted[i][j].contains("10")) {
					sum[i] += 10;
				} else if (splitted[i][j].contains("J")) {
					sum[i] += 11;
				} else if (splitted[i][j].contains("Q")) {
					sum[i] += 12;
				} else if (splitted[i][j].contains("K")) {
					sum[i] += 13;
				}
			} else {
				System.out.println("invalid input");
			}
		}
	}
	int largest = sum[0];
	int nameIndex = 0;
	for (int i = 0; i < sum.length; i++) {
		if (sum[i] > largest) {
			largest = sum[i];
			nameIndex = i;
		}
	}

	System.out.println(splitted[nameIndex][0] + ":" + largest);
}

}
