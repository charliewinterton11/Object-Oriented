package lib;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

/**
 * A class that is an aggregation of names using the Name class, stored in an array list of type Name.
 * @author P2451562
 *
 */
public class Register implements Iterable<Name>  {
	//fields
	private ArrayList<Name> names; 
	
	//constructors
	/**
	 * Creates an empty array list of type Name.
	 */
	public Register() {
		names = new ArrayList<Name>();
	}
	/**
	 * Creates an empty array list of type Name
	 * @param name variable from the Register class
	 */
	public Register(ArrayList<Name> name) {
		this.names = name;
	}
	
	//methods
	/**
	 * Adds a name to the register
	 * @param toAdd The name object to be added
	 */
	public void addName(Name toAdd) {
		names.add(toAdd);
	}
	/**
	 * Removes every entry in the register
	 */
	public void clearRegister() {
		names.clear();
	}
	/**
	 * Removes a name at the index of i
	 * @param i index of the name to be removed
	 * @return removed name
	 */
	public Name removeName(int i) {
		return names.remove(i);
	}
	
	/**
	 * Searches the register for a specified family name and returns true or false based on its presence 
	 * @param s The name used when searching the register
	 * @return boolean value determining a name exists in the register
	 */
	public boolean searchRegisterByFamilyName(String s) {
		boolean found = false;
			for (int i = 0; i < names.size(); i++) {
				if (names.get(i).getFamilyName().equals(s)) {
					found = true;
				}
				else {
					;
				}
			}
		return found;
		}
	/**
	 * Counts the number of occurrences of first names ending with the provided character 
	 * @param c char used to search names
	 * @return integer of the number of times the character exists at the end of first names
	 */
	public int countFirstNameOccurrences(char c) {
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String name = "";
			name = names.get(i).getFirstName();
			if (name.charAt(name.length()-1) == c) {
				count = count + 1;
			}
		}
		return count;
	}
	
	/**
	 * Returns the name at the specified index of the array list
	 * @param i index of the name to be returned
	 * @return The name at index i
	 */
	public Name getName(int i) {
		return names.get(i);
	}
		
	
	/**
	 * Returns the number of entries in the register
	 * @return integer of number of names in the register
	 */
	public int registerSize() {
		return names.size();
	}
	
	/**
	 * Determines if the register is empty
	 * @return true or false depending if the register is empty or not
	 */
	public boolean isRegisterEmpty() {
		if (names.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Converts and returns the register in string form
	 * @return The register class as a string
	 */
	public String toString() {
		return "Register:[" + names + "]";
		}
	/**
	 * Returns an iterator to be able to iterate through the collection.
	 * @return an iterator on the list of names
	 */
	public Iterator<Name> iterator() {     
		return names.iterator(); 
		} 
	/**
	 * Uses the Collections class to sort and compare register names
	 */
	public void sortRegister() {
		Collections.sort(names);
	}
}




	

