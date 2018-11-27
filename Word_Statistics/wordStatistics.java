//Miles Cumsikey, Hackkettstown High School
//11.6.16
//Program for generating the number of words in a sentence, 
//the length of a sentence, and the average length of words using a scanner

import java.util.Scanner;
	
public class wordStatistics {
		
	   public static void main (String [] args) {
		   
	      Scanner reader = new Scanner(System.in);
	      String input;
	      int wordCount = 0; //initialized here b/c it is not input dependant
	      
	    System.out.print("What sentence would you like analyzed?");
	    input = reader.nextLine(); //reads input
		Scanner stringReader = new Scanner(input); //reads the reading of the input

	    while (stringReader.hasNext()) { //builds word strings and counts them
	    	System.out.println(stringReader.next());
	    	wordCount++;
	    	}
	    
	    System.out.println("There are " +wordCount +" words");
	    int sentenceLength = input.length();
		System.out.println("The sentance was: "+(sentenceLength - (wordCount-1)) +" letters long");
		System.out.println("The average word length was: " + (sentenceLength / wordCount) +" letters");

    
	      
	   }
	   
}
	   


