package main;

import java.util.ArrayList;

import lib.Player;

public class PlayerApp {

	public static String execute(ArrayList<Player> players, String fullName) {
		players.get(0).setFullPlayerName(fullName);
		String output = "";
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).getName().getFullName().contains("a")) {
				output =  output + players.get(i).getName().getFirstName().toLowerCase() + ", " + players.get(i).getName().getFamilyName().toUpperCase()+"\n";
			}
	
		}
		return output;
	}
	
}
