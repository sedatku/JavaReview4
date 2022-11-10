package com.neotech.review06;

public class TaskCard {

	public static void main(String[] args) {
		String[] players = new String[5];
		players[0] = "James:AH,3C,8C,2S,JD";
		players[1] = "Mary:KD,QH,10C,4C,AC";
		players[2] = "Brian:6S,8D,3D,JH,2D";
		players[3] = "Emma:9H,8S,KH,AS,9D";
		players[4] = "John:JS,3H,2H,2C,4D";

		int biggest = 0;
		String winner ="";
		
		for(String player: players) {
			
			String[] nameCards = player.split(":");
			String name = nameCards[0];
			String cards = nameCards[1];
			
			int points = calculatePoints(cards);	
			
			System.out.println(name +" "+ cards + " = " + points);
			
			if (points > biggest) {
				biggest = points;
				winner = name;
			} else if(points == biggest) {
				winner = winner + "," + name;
			}			
			
		}
		
		System.out.println(winner + ":" + biggest);
		
	}
	
	public static int calculatePoints(String cards) {
		
		String[] cardArray = cards.split(",");
		
		int points = 0;
		
		for(String card: cardArray) {
			
			String value = card.substring(0, card.length()-1);
			
			if(value.equals("A")) {
				points += 1;
			}else if(value.equals("T")) {
				points +=10;		
			}else if(value.equals("J")) {
				points +=11;		
			}else if(value.equals("Q")) {
				points +=12;		
			}else if(value.equals("K")) {
				points +=13;		
			}else {
				points += Integer.parseInt(value);
			}
			
		}
		
		return points;
		
	}
}
