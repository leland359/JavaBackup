/** Miles Cumiskey
 *  CSC 220
 *  April 14, 2018
 *  Program that prints a 2D array in a spiral
 */
public class spiral {
	public static void main (String [] args) {
		int size = args.length;
		
		if (size <= 0){
            System.out.println("You cannot have a negative argument. Please try again.");
    		System.exit(0);
		}

		int[][] table = new int[size][size];

	      // assign the n by n values
	      for (int row = 0; row < table.length; row++){
	         for (int col = 0; col < table[row].length; col++){
	             table[row][col] = (row * table[0].length) + col + 1;
	         }
	      }

	      // Print the table like a table
	      for (int row = 0; row < table.length; row++){
	         for (int col = 0; col < table[row].length; col++){
	            System.out.print(table[row][col] + "\t");
	         }
	         System.out.println();
	      }
	      
	      System.out.println();

	      //print table in a line
	      for (int row = 0; row < table.length; row++){
		         for (int col = 0; col < table[row].length; col++){
		            System.out.print(table[row][col] + " ");
		         }
		      }	
	      }
} 
