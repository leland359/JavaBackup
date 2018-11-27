/** Miles Cumiskey
 *  CSC 220
 *  Game about scrambling and unscrambling words
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.*; 

public class project2 {
    public static void main(String[] args) throws IOException {
    	String word = "", 
    		   scrambledWord;
    	ArrayList<String> words = new ArrayList<String>();  
    	Random chooseWord = new Random();
    	Scanner inputScan = new Scanner(System.in);
    	int numSwaps = 0,
    		inputNum;
    	boolean gameState = true;     	

    	Scanner fileScan = new Scanner (new File("words.txt"));
    	
    	while (fileScan.hasNext()) {
    		words.add(fileScan.next());
    	}
    	
    	word = words.get(chooseWord.nextInt(words.size()-1));

      	scrambledWord = scrambleWord(word);
    	
    	printGame(scrambledWord);
    	
    	while(gameState = true){ //while a player is still playing...
    	
    		inputNum = inputScan.nextInt();
    	
	        if (inputNum == 1) {
	        	System.out.println("Enter indexes separated by spaces.");
	        	scrambledWord = swapLetters(scrambledWord, inputScan.nextInt(), inputScan.nextInt());
	        	printGame(scrambledWord);
	        	numSwaps++;
	        } else if (inputNum == 2) {
	        	if (scrambledWord.equals(word)){
	            	System.out.println("Congratulations! You have won in " +numSwaps + " steps.");
		        	System.exit(0);
	        	} else if (!scrambledWord.equals(word)) {
	            	System.out.println("Sorry, '" +word +"' was the correct answer. Play again soon!");
		        	System.exit(0);
	        	}
	        } else if (inputNum == 3) {
	        	gameState = false;
	        	System.exit(0);
	        } 
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

	private static void printGame(String currentWord) {
    	System.out.println("---------");  //box with word + index
    	for(int i =0; i < currentWord.length(); i++){
    		System.out.print(i);
    	}
		System.out.print("\n");
    	System.out.println(currentWord);
    	System.out.println("---------");
    	
    	System.out.println("Enter 1 to swap letters");
    	System.out.println("Enter 2 to solve");
    	System.out.println("Enter 3 to quit.");		// TODO Auto-generated method stub
	}

	private static String scrambleWord(String input) {
		char[] shuffle = input.toCharArray();
		Random randChar = new Random();
		
		for (int i = shuffle.length-1; i > 0; i--){
		      int index = randChar.nextInt(i + 1);
		      char a = shuffle[index];
		      shuffle[index] = shuffle[i];
		      shuffle[i] = a;
		}
		
		input = String.valueOf(shuffle);    //toString returns a memory location
		return input; 
	}
}
