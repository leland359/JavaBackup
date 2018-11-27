//Miles Cumiskey, Hackettstown High School
//1.15.17
//Program that takes strings and processes them to be plural in an alien language

package alienAlphabet;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevisedProject {

		public static void main(String[] args) throws IOException {
			
			importFile(); //has if statement that leads to the other methods
			
		}

		private static void importFile() throws IOException {
			
			FileInputStream inFile;
			BufferedReader reader;
			inFile = new FileInputStream("/Users/miles/compsciDownloads/vowels.txt"); //input		
			InputStreamReader inReader = new InputStreamReader(inFile);
			reader = new BufferedReader(inReader);
			
			while (reader.ready()) { //while there is content to be read
				  
			    String line = reader.readLine();
			    
			    printOriginalString(line);

			    String originalWord = line.substring(0, line.lastIndexOf(" ")); //the word is the first thing before space
			    String suffix = line.substring(line.lastIndexOf(" ") + 1); //suffix follows space
			    
			    // Get first letters of suffixes for methods  
			 	String firstLetter = suffix.substring(0,1);

				// Get last and last two letters
				String lastLetter = originalWord.substring((originalWord.length()-1) , (originalWord.length()));
				String secondToLastLetter = line.substring((originalWord.length() - 2) , (originalWord.length() - 1) );
				
				//sorting time
				if ((lastLetter.equalsIgnoreCase("A") || lastLetter.equalsIgnoreCase("C")  //ugly but useful -finds 'vowels'
					|| (lastLetter.equalsIgnoreCase("S") || lastLetter.equalsIgnoreCase("L")))) {
					
					if (secondToLastLetter.equalsIgnoreCase("A") || secondToLastLetter.equalsIgnoreCase("C") //finds double vowel
						|| secondToLastLetter.equalsIgnoreCase("S") || secondToLastLetter.equalsIgnoreCase("L")) {	
						
						getPluralDoubleEnd(originalWord, suffix, lastLetter);	//method call to the one that sorts things like AA
						
					} else { //if it isnt two vowels
					
						getPluralVOWELEND(originalWord, suffix, firstLetter);	//method call to the FA and RC sort of things				
					}
					
				} else { //anything that doesnt have a vowel ending
					if (!(secondToLastLetter.equalsIgnoreCase("A")) || !(secondToLastLetter.equalsIgnoreCase("C")) //finds double consonant
						|| !(secondToLastLetter.equalsIgnoreCase("S")) || !(secondToLastLetter.equalsIgnoreCase("L"))) {
						
						getPluralDoubleEnd(originalWord, suffix, firstLetter); //method call to the FF and WWs
						
					} else { //if it isnt two consonants		
						
						getPluralConsonantEnd(originalWord, suffix);      //method call to the AWs and sorts
					}
				}
			}
		}
		
		private static void getPluralConsonantEnd(String originalWord, String suffix) {
				String pluralForm = originalWord + "gh";
				String getSuffix = originalWord + suffix; //consonant form has suffix stay the same
				
				printPluralFormAndSuffix(pluralForm, getSuffix);
		}

		private static void getPluralVOWELEND(String originalWord, String suffix, String firstLetter) {
				String pluralForm = (originalWord.substring(0,originalWord.length() - 1)) + "g";
				String getSuffix;
				
				if ((firstLetter.equalsIgnoreCase("A") || (firstLetter.equalsIgnoreCase("C"))  //ugly but useful -finds 'vowels'
					|| (firstLetter.equalsIgnoreCase("S")) || (firstLetter.equalsIgnoreCase("L")))) {
					
						 getSuffix = originalWord + (suffix.substring(1, suffix.length()));
						
				} else {
					    getSuffix = originalWord + ((suffix.charAt(0)) + suffix);
				}
				
				printPluralFormAndSuffix(pluralForm, getSuffix);
		}	
		
		private static void getPluralDoubleEnd(String originalWord, String suffix, String firstLetter) {
				String pluralForm = originalWord + (originalWord.charAt(originalWord.length()-1)) +"h";
				String getSuffix; 
				
				if ((firstLetter.equalsIgnoreCase("A") || (firstLetter.equalsIgnoreCase("C"))  //ugly but useful -finds 'vowels'
					|| (firstLetter.equalsIgnoreCase("S")) || (firstLetter.equalsIgnoreCase("L")))) {
					
					getSuffix = originalWord + (suffix.charAt(0) + suffix);	
					
				} else {
					getSuffix = (originalWord.substring(0, originalWord.length()-2)) + (originalWord.charAt(originalWord.length()-1)) + suffix;
				}
				
				printPluralFormAndSuffix(pluralForm, getSuffix);
		}		
		
		private static void printOriginalString(String line) {

			System.out.println("---------------------------"); //divider 
			System.out.println("Original String: " + line); //original line of data
			  
		 }
		
		
		private static void printPluralFormAndSuffix(String pluralForm,String getSuffix) {

			System.out.println("Plural: " + pluralForm.toUpperCase()); //follows example ie. in uppercase
			System.out.println("Plural with Suffix: " + getSuffix.toUpperCase());
  
		 }

	}



