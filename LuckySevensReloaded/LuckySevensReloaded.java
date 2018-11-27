//Miles Cumiskey, Hackettstown High School
//11.26.16
//LuckySevensReloaded now taking the average amount of times it takes to go broke

import java.util.Scanner;
import java.util.Random;

public class LuckySevensReloaded {
	public static void main(String[] args) {

		    Scanner reader = new Scanner(System.in);
		    Random generator = new Random();
		    
		      int die1, die2,       
		          dollars,          // input of initial dollar amount
		          dollarsPerLoop,   //dollars in each loop
		          rolls,            
		          totalRolls,       // total rolls
		          averageRolls;		// average rolls

			  // Initialize rolls at zero (no dice yet rolled)
		      rolls = 0;
		      totalRolls = 0;
		      averageRolls = 0;
		      
		      System.out.print("How many dollars do you have? ");
		      dollarsPerLoop = reader.nextInt();

		      for (int i=1; i <= 100; i++) { 
		    	  
		    	  //System.out.println(i);
		    	  //makes sure loop runs 100 times

		    	  dollars = dollarsPerLoop;
		          //System.out.println(dollarsPerLoop);
		    	  //ensures the loop is testing for originally specified amount and not another number

		          rolls = 0; //resets to zero to see how many rolls it will take this time

		          while (dollars > 0){ // how long until player is broke -from original code
		             rolls++;
		             		             
		             die1 = generator.nextInt (6) + 1; 
		             die2 = generator.nextInt (6) + 1; 
		         
		             // calculate the winnings or losses - from original code
		             if (die1 + die2 == 7) {
		                dollars += 4;
		             }
		             else {
		                dollars -= 1; 
		             }
		          
		          }
		          
		         totalRolls = totalRolls + rolls; 
		         //adds how many rolls it took to go broke to the total rolls 
		         
		      }
		   
		      averageRolls = totalRolls / 100; //get average
		      
		      System.out.println("You are broke after an average of " + averageRolls + " rolls.");
		   }
		}