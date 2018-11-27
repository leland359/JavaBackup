/** Miles Cumiskey
 *  CSC 220
 *  Program that simulates a Game of Mastermind
 *  May 4th, 2018
 */
import java.util.Scanner;

//the actual playing of the game

public class Mastermind {
	public static void main (String [] args) {
    	boolean playing = true;
    	Scanner player = new Scanner(System.in);
    	int numGuesses = 8;
    	String playerGuess = "";

		CodeMaster c = new CodeMaster();
		
    	System.out.println("If you would like to stop playing, please type 'stop'");
    	System.out.println("The code is four digits long; possible colors are: " + c.getColors());
    	System.out.println("Please enter four colors, separated by spaces.");

		while(playing = true){ 
			
	    	System.out.println("You have " + numGuesses +" guesses remaining");
	    	playerGuess = player.nextLine();
	    	numGuesses--;
	    	
	    	if ((playerGuess.equals("stop")) || playerGuess.equals("Stop")){
	    		playing = false;
	    		System.out.println("Game Over. Have a nice day :>");
	    		System.exit(0);
	    	}
	    	
	    	if (c.validatePlayerGuess(playerGuess)) {
	    		c.checkPlayerGuess(playerGuess);
	    	}
	    	
	    		    	
			if (numGuesses == 0) {
		    	System.out.println("You have lost!");
		    	System.out.println("The real code was: " + c.getCode());
	    		playing = false;
	    		System.exit(0);
			}
	    	
    	}
	}
}
