package com.neotech.review02;

public class Hotel {

	public static void main(String[] args) {
		// in my hotel I have 4 floors
		// in each floor I have 6 rooms
		// room numbers in floor 1 are 1.1 1.2 1.3 1.4. 1.5 1.6
		// room numbers in floor 2 are 2.1 2.2 2.3 2.4. 2.5 2.6

		for (int floor = 1; floor <= 4; floor++) {
			System.out.println("Floor -> " + floor);
			for (int room = 1; room <= 6; room++) {
				System.out.print(floor + "." + room + " ");
			}
			System.out.println();
		}

	}

}
