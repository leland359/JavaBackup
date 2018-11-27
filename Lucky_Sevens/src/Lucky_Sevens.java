/*LuckySevens.java
Simulate the game of lucky sevens until all funds are depleted.
1) Rules:
        roll two dice
        if the sum equals 7, win $4, else lose $1
2) The inputs are:
        the amount of money the user is prepared to lose 
3) Computations:
        use the random number generator to simulate rolling the dice
        loop until the funds are depleted 
        count the number of rolls
        keep track of the maximum amount
4) The outputs are:
        the number of rolls it takes to deplete the funds
        the maximum amount 
*/


public class Lucky_Sevens {
   public static void main (String [] args) {
	   int rowCounter, i, j;
	   rowCounter = 0;

	   for (i=1; i<6; i++) {   
	     for(j = 1; j<=5; j++) {
	       System.out.print((rowCounter*5+j)+i + " ");  
	     }
	     System.out.println();
	   }
   }
}