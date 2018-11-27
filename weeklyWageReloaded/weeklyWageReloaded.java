//Miles Cumiskey, Hackettstown High School, Weekly Wage - now with Tokens
//11.14

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class weeklyWageReloaded {
	  private static FileInputStream inFile;
	  private static InputStreamReader inReader;
	  private static  BufferedReader reader;
	  private static StringTokenizer strTkn;
	  private static String line, firstName, lastName;
	  private static double payRate, regMon, overMon, regTues, overTues, regWed, overWed; 
	  private static double regThurs, overThurs, regFri, overFri, regularPay, overtimePay, finalPay; 


public static void main (String args[])
	  {
		  initFile(); //imports the txt file for use
		  getData(); //prints data from the txt file for my reference
		  tokenizeData(); 
		  calcWeeklyPay();
		  printResults();
	  }

public static void initFile() {	  
		try {  //it wants this for when it can't find a file
				inFile = new FileInputStream ("/Users/miles/compsciDownloads/vowel.txt");
			} catch (FileNotFoundException e) { //if they try doesnt work
				e.printStackTrace();
			}
	    inReader = new InputStreamReader(inFile);
	    reader = new BufferedReader(inReader);
	    	System.out.println("Hello" +inFile.toString()); 
	    	//Shows thing is working + prints the location of the inFile	    	  
  		}

public static void getData()
{
  try {
	line = reader.readLine();
  		} catch (IOException e) {
	e.printStackTrace();
  		}   //acquiring the data line as a string
  
  //System.out.println ("Original Data:" + line ); // view data line as one string
	}

public static void tokenizeData() {
	
	strTkn = new StringTokenizer(line);  // attaching the string tokenizer to the line

	firstName = strTkn.nextToken(); //creating string variable 
	//System.out.println ("First name: " + firstName );
	lastName = strTkn.nextToken();
	//System.out.println ("Last name: " + lastName );
	payRate = Double.parseDouble(strTkn.nextToken());
	//System.out.println ("Hourly Wage: " + payRate );
	
	regMon = Double.parseDouble(strTkn.nextToken());
	overMon = Double.parseDouble(strTkn.nextToken());
	
	regTues = Double.parseDouble(strTkn.nextToken());
	overTues = Double.parseDouble(strTkn.nextToken());
	
	regWed = Double.parseDouble(strTkn.nextToken());
	overWed = Double.parseDouble(strTkn.nextToken());
	
	regThurs = Double.parseDouble(strTkn.nextToken());
	overThurs = Double.parseDouble(strTkn.nextToken());
	
	regFri = Double.parseDouble(strTkn.nextToken());
	overFri = Double.parseDouble(strTkn.nextToken());
}

public static void calcWeeklyPay(){
	regularPay = ((regMon + regTues + regWed + regThurs + regFri) * payRate);
	overtimePay = (overMon + overTues + overWed + overThurs + overFri) * 1.5 * payRate;
	finalPay = regularPay + overtimePay;
}

private static void printResults() {
	System.out.println("The employee's first name is: " +firstName);
	System.out.println("The employee's last name is: " +lastName);
	System.out.println("Their total weekly pay is: $" +finalPay);

}

}