
//Miles Cumiskey, Hackketstown High School
//Game where the computer guesses the players number
//12.3.16 revamp

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGameCPU {

	public static void main(String Args[]) {
		Scanner reader = new Scanner(System.in);
	    Random generator = new Random();
		int computerGuess, guessLimitHIGH, guessLimitLOW, counter; // counter is how many times the loop is run
		counter = 1; //starts off at one to account for initial guess
		computerGuess = 50; // computers first guess
		guessLimitHIGH = 100;
		guessLimitLOW = 1;

		// initial question, format instructions, and computer's first guess
		System.out.println("Think of a number between 1 and 100.");
		System.out.println("If your number is higher than what I guess, type 'h'");
		System.out.println("If your number is lower than what I guess, type 'l'");
		System.out.println("If my number is correct, type 'y'");
		System.out.print("Is your number: " + computerGuess +" ");

		do {

			String playerResponse = reader.nextLine(); // players response is
														// now a
														// string to be used

			if (playerResponse.length() == 0) {
				System.out.println("Please type (h)igher, (l)ower, or 'y' if I guessed your number. ");
				
				
			} else if (playerResponse.length() > 1) {
				System.out.println("Please only type (h)igher, (l)ower, or 'y' if I guessed your number.");
				
				
			} else if (playerResponse.startsWith("h")) {
				guessLimitLOW = computerGuess; //all new numbers generated will be higher
				computerGuess = guessLimitLOW + (generator.nextInt(guessLimitHIGH - guessLimitLOW));
						//BREAKDOWN OF WHAT THIS DOES: the random (generator) chooses a number in the
					    //range (high - low). However, that alone would just generate
						//0 through (high - low) so it then adds the low value. Now the random
						//number is between the highest and lowest guess. 
				System.out.println("Is your number: " + computerGuess + " ");
				counter++;
				
			} else if (playerResponse.startsWith("l")) {
				guessLimitHIGH = computerGuess; //all new numbers generated will be lower
				computerGuess = guessLimitLOW + (generator.nextInt(guessLimitHIGH - guessLimitLOW));
						//this code is explained in the 'h' section. It generates a random number between
						//the highest and lowest guesses
				System.out.println("Is your number: " + computerGuess + " ");
				counter++;
				
			} else if (playerResponse.startsWith("y")) {
				System.out.println("Horray! It took me " + counter + " try(s) to guess your number.");
			}
			
		} while (counter > 1); //I want the program to run forever - the user can quit when they want to
	}
}
