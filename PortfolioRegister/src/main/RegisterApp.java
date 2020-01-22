package main;

import lib.Name;
import lib.Register;

public class RegisterApp {


	public static String execute(Register reg, Name n) {	
		reg.removeName(1);
		reg.addName(n);
		String output = "";
		for (int i = 0; i < reg.registerSize(); i++) {
			if (reg.getName(i).getFamilyName().length() >= 5) {
				output = output + reg.getName(i).getFamilyName().toUpperCase() + ", " + reg.getName(i).getFirstName().charAt(0) + "\n";
			}
		}
		return output;
	}
}