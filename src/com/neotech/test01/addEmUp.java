package com.neotech.test01;

import java.util.Scanner;

public class addEmUp {

	public static void main(String[] args) {
		int numberOfPlayers = 5;
		String[] players = new String[numberOfPlayers];
		int index = 0;
		System.out.println("Please enter name and cards: (Sample: Name:AH,3C,8C,2S,JD) ");
		while (index < numberOfPlayers) {
			// to do: read input
			Scanner scan = new Scanner(System.in);
			String input = scan.next();
			players[index] = input;
			index++;
		}
		int max = 0;
		String maxPlayers = "";

		for (int i = 0; i < players.length; i++) {
			// System.out.println(players[i]);
			String str = players[i];

			String[] arr = str.split(":");
			String playerName = arr[0];

			String[] playerCards = arr[1].split(",");
			int sum = 0;
			for (int j = 0; j < playerCards.length; j++) {
				String card = playerCards[j];
				if ('A' == card.charAt(0)) {
					sum = sum + 1;
				} else if ('J' == card.charAt(0)) {
					sum = sum + 11;
				} else if ('Q' == card.charAt(0)) {
					sum = sum + 12;
				} else if ('K' == card.charAt(0)) {
					sum = sum + 13;
				} else {
					String x = card.substring(0, card.length() - 1);
					sum = sum + Integer.parseInt(x);
				}
			}
			if(sum >=max) {
				if(sum> max) {
					maxPlayers = playerName;
				}else {
					maxPlayers = maxPlayers + " = " + playerName;
				}
				max = sum;	
			}
			//max = Math.max(max, sum);
		}
		System.out.println("maxPlayers = " + maxPlayers +" Max = " + max );

	}
}
