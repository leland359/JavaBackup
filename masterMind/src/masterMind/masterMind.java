///Miles Cumiskey

package masterMind;

import java.util.Random;
import java.util.Scanner;

public class masterMind {

	public static void main(String[] args) {
		
		generateRandomPattern ();
		askforInput();
		colourPositionSorter();
		cpuScorecard();
		    	
	}

	private static void askforInput() {
		Scanner reader = new Scanner(System.in);
		System.out.println("What do you think the combo is?");
		String playerResponse = reader.nextLine();
		System.out.print(playerResponse);
	}
	
	private static void cpuScorecard() {
		// TODO Auto-generated method stub
		
	}

	private static void generateRandomPattern() {
		Random generator = new Random();
		String blue = "blue", 
			   green = "green", 
			   yellow = "yellow",
			   black= "black";
		String randomCombo = "";
		
		int makePattern; 
		
		for (int patternLength = 1; patternLength <= 4; patternLength++) { //makes a string of 4 colors
			makePattern = generator.nextInt(4) + 1;
			
			if (makePattern == 1) {
				randomCombo = randomCombo + blue;
			} else if (makePattern == 2){
				randomCombo = randomCombo + green;
			} else if (makePattern == 3){
				randomCombo = randomCombo + yellow;
			} else if (makePattern == 4){
				randomCombo = randomCombo + black;
			}
		}		
	}

	private static void colourPositionSorter() {
	}
}
