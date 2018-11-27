
//Miles Cumiskey, Hackettstown High School
//12.11.16
//Program that takes strings and processes them to be plural in an alien language

import java.io.*;
import java.util.StringTokenizer;

public class alienAlphabet {

	private static FileInputStream inFile;
	private static BufferedReader reader;
	private static StringTokenizer strTkn;
	private static String word, line;

	private static String getPlural;
	private static String addSuffix;


	public static void main(String args[]) {
		importFile(); // imports the txt file for use
		tokenizeData(); // puts text into strings
		pluralForm(getPlural); // makes plural
		suffixConsonant();
		suffixACSL();
		printResults();
	}

	private static void importFile() {
		try {
			inFile = new FileInputStream("/Users/miles/compsciDownloads/vowel.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		InputStreamReader inReader = new InputStreamReader(inFile);
		reader = new BufferedReader(inReader);

	}

	private static void tokenizeData() {
		String line = reader.readLine();
		   
		   while (line != null) {
			   System.out.println("data line= " + line);
			   line = line.trim();
			   int blank = line.indexOf(" ");
			   String word = line.substring(0, blank);
			   String suffix =  line.substring(blank + 1);
			   
			   String plural = pluralForm(word);
			   String together = addSuffix(word, suffix);
			   		System.out.println("The plural is " + plural + "when you add the suffix you get " + together);
			   		line = reader.readLine();
	}

	private static void pluralForm(String word) {
	 if ((prefixOne.substring(0, word.length() - 1)).equalsIgnoreCase("")){
	 // TODO PLURAL FORMS - SINGLE CONSONANT
	
	 } else if ((prefixOne.substring(2,4).equalsIgnoreCase(""))) {
	 // TODO PLURAL FORMS - SINGLE VOWEL
	
	 } else if (((prefixOne.substring(2,4).equalsIgnoreCase("")))) {
	 // TODO PLURAL FORMS - DOUBLE EITHER
	 }
	 }

	private static void suffixConsonant() {
	 if (((suffixOne.substring(1,2).equalsIgnoreCase("")))) {
	 //TODO SUFFIX STARTS & ENDS WITH ONE CONSONANT
		 
	 } else if (((suffixOne.substring(1,2).equalsIgnoreCase("")))) {
	 //TODO SUFFIX STARTS WITH A CONSONANT & ENDS WITH A VOWEL
		 
	 } else if (((suffixOne.substring(1,2).equalsIgnoreCase("")))) {
	 //TODO SUFFIX STARTS WITH A CONSONANT & ENDS WITH DOUBLE EITHER
		 
	 }
	 }

	private static void suffixACSL() {
	 if (((suffixOne.substring(1,2).equalsIgnoreCase("")))) {
	 //TODO SUFFIX STARTS WITH A VOWEL ENDS WITH ONE CONSONANT
		 
	 } else if (((suffixOne.substring(1,2).equalsIgnoreCase("")))) {
	 //TODO SUFFIX STARTS WITH A VOWEL & ENDS WITH A VOWEL
		 
	 } else if (((suffixOne.substring(1,2).equalsIgnoreCase("")))) {
	 //TODO SUFFIX STARTS WITH A VOWEL & ENDS WITH DOUBLE EITHER
	 }
	 }

	private static void printResults() {
		// TODO Auto-generated method stub

	}

}