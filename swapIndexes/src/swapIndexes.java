import java.util.Scanner;

/** Miles Cumiskey
 *  CSC 220
 *  reads a string and two index values from the user, 
 *  then swaps the characters with the specified index values.
 */

public class swapIndexes {
	public static void main (String [] args) {
    	Scanner reader = new Scanner(System.in);
    	String userString = "";
    	String newString;
    	int index1, index2;
    	boolean playing = true;
    	    	
    	while(playing = true){ 
	    	System.out.println("Please enter a string, and two index values to swap.");
	    	System.out.println("If you would like to stop playing, please type 'stop'");
	    	userString = reader.next();
	    	
	    	if ((userString.equals("stop")) || userString.equals("Stop")){
	    		playing = false;
	    		System.out.println("Program killed. Have a nice day :>");
	    		System.exit(0);
	    	}
	    	
	    	index1 = reader.nextInt();
	    	index2 = reader.nextInt();
	
	    	if ((index1 > userString.length()) || (index1 < 0) 
	    		|| (index2 > userString.length()) || (index2 < 0)) {
	        	System.out.println("You must enter indexes within your string. Please try again.");
	    	}
	    	newString = swapLetters(userString, index1, index2);
	    	System.out.println(newString);
    	}
	}
	
	private static String swapLetters(String currentWord, int firstIndex, int secondIndex) {
		char[] rearange = currentWord.toCharArray();
		char temp = rearange[firstIndex];
		
		rearange[firstIndex] = rearange[secondIndex];
		rearange[secondIndex] = temp;
		
		currentWord = String.valueOf(rearange);    
		return currentWord;
	}
}
