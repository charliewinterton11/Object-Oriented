package lib;


/**
 * The Player class has a Name and a Pair of dice.
 * the class is a composition of Name and PairOfDice 
 * @author P2451562
 *
 */

public class Player implements Comparable<Player>{
	
	//Fields
	private Name playerName;
	private Rollable dice;
	
	
	//Constructors
	/**
	 * Default constructor that creates a new instance of player 
	 */
	public Player() {
		playerName = new Name();
		dice = new PairOfDice();	
	}
	
	/**
	 * Custom constructor 
	 * @param playerName is the player's name
	 */
	public Player(Name playerName){
		this.playerName = playerName;
		dice = new PairOfDice();
	}
	/**
	 * Second custom constructor 
	 * @param playerName the player's name 	
	 *
	 * @param dice the player's dice
	 */
	public Player(Name playerName, Rollable dice) {
		this.playerName = playerName;
		this.dice = dice;
	}
	
	//Methods 
	/**
	 * Returns the player's name
	 * @return Player's name
	 */
	public Name getName(){
		return playerName;
	}
	/**
	 * Returns the dice values
	 * @return the dice values
	 */
	public Rollable getRollable() {
		return dice;
	}
	/**
	 * Returns the dice score 
	 * @return the score on the dice
	 */
	public int getDiceScore() {
		return dice.getScore();
	}
	
	/**
	 * Sets the player's name to the given name object
	 * @param name
	 */
	public void setName(Name name) {
		this.playerName = name;
	}
	/**
	 * Rolls the dice by generating a set of random numbers
	 */
	public void rollDice() {
		dice.roll();
	}
	/**
	 * Accepts a full name, e.g. John Smith and stores both first and second name in the name object.
	 * @param fullName
	 * @param playerName
	 */
	public void setFullPlayerName(String fullName) {
		String first = "";
		String last = "";
		first = fullName.split(" ")[0];
		last = fullName.split(" ")[1];
		playerName.setFirstName(first);
		playerName.setFamilyName(last);
	}
		
		//toString method
	/**
	 * Converts the player class to a string output 
	 */
	public String toString() {
		return ("Player:[name = " + playerName + ", pair of dice = " + dice + " ]");
		}
	
	/**
	 * Used to compare instances of the player class using the compare to function in the Name class.
	 * @return
	 */
	public int compareTo(Player player) {
		return playerName.compareTo(player.getName());
	}
}


