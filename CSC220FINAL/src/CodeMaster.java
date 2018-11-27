/** Miles Cumiskey
 *  CSC 220
 *  Program that simulates a 'mastermind'
 *  Evaluates user strings, generates a code, etc
 *  May 4th, 2018
 */

import java.util.ArrayList;
import java.util.Random;

public class CodeMaster {
	private final int NUMPEGS = 4; //do not change
	private final String [] colors = {"blue", "green", "red", "yellow"};
	private ArrayList<String> code = new ArrayList<String>();
	private int blackPegs = 0
			, whitePegs = 0;

	
	public CodeMaster(){
		setCode();
	}
		
	private void setCode() {
		Random colorPos = new Random();
		int randomColor;
		
		for(int i = 0; i < NUMPEGS ; i++){
			randomColor = colorPos.nextInt(NUMPEGS);
			code.add(colors[randomColor]);
		}
		
	}
	
	public String getCode(){
		return code.toString();
	}
	
	/** MAKES SURE THAT THE USER HAS ENTERED A VALID INPUT
	 * 
	 * @param playerGuess
	 * @return true if guess is valid
	 */
	public boolean validatePlayerGuess(String playerGuess){
		if ((playerGuess.isEmpty())){
    		System.out.println("You entered no pegs. Please enter four and try again.");
    		return false;
    	}
		
		String [] currentGuess = playerGuess.split(" ");
		
		if ((currentGuess.length < 4) || (currentGuess.length > 4)) {
			System.out.println("Please enter four pegs.");
    		return false;
		}
		
		int validNums = 0;
		for(int i = 0; i < currentGuess.length; i++) { 
			for(int j = 0; j < currentGuess.length; j++) { 
				if(colors[i].equalsIgnoreCase(currentGuess[j])){
					validNums++;
				} 
			}
		}
		if (validNums < 4) {
			System.out.println("Please only use the colors " + this.getColors());
    		return false;
		}
		
		return true;
	}
	
	/** looks at a valid playerGuess, and checks the four colors
	 * if they are in the right spot + right color, add white
	 * if they are right color, wrong spot, add black
	 * 
	 * @param playerGuess - String the player enters via System.in
	 */
	public void checkPlayerGuess(String playerGuess){
		whitePegs = 0;
		blackPegs = 0;

		String [] currentGuess = playerGuess.split(" ");	
		
		//checks for a right color in the right place
		//if found, adds a white peg then sets the place to " " for finding the black pegs
		for(int i = 0; i < currentGuess.length; i++) { 
			if(currentGuess[i].equals(code.get(i))){
				currentGuess[i] = " ";
				addWhitePeg();
			} 
		}
		
		//checks to see if the colors of the remaining pegs are correct
		for(int i = 0; i < currentGuess.length; i++) { 
			for(int j = 0; j < currentGuess.length; j++) { 
				if(code.get(j).compareToIgnoreCase(currentGuess[i]) == 0){
					addBlackPeg();
					currentGuess[i] = " ";
				} 
			}
		}
		
		if (whitePegs == 4) {
			System.out.println("You've cracked the code! Congradulations");
    		System.exit(0);
		} else {
			System.out.println("Right color in the Right Place: " + this.whitePegs);
			System.out.println("Right color in the Wrong Place: " + this.blackPegs);
		}
	}
	
	private void addBlackPeg(){
		blackPegs++;
	}
	
	private void addWhitePeg(){
		whitePegs++;
	}
	
	public String getColors(){
		String colorString = "";
		for (int i = 0; i < colors.length; i++){
			colorString += (colors[i] + ", ");
		}
		return colorString;
	}
}
