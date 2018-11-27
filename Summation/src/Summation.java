//Miles Cumiskey, Hackkettstown High School
//3.4.17
//Class that sums numbers within set bounds

public class Summation {

	private static int low, high, result; //VARIABLES USED IN THIS CLASS.
	
	//CONSTRUCTOR METHOD 1
	
	public Summation(){

		low=1;

		high=10;

		result = sum(low,high);

		}

	//CONSTRUCTOR METHOD 2

	public Summation(int a, int b){

		low = a;

		high = b;

		result = sum(low, high);

	}

	//STATIC METHOD FOR SUM

	private static int sum (int a, int b) {
		System.out.println("The parameters this recursion are: " +a +", " +b);
	    if (a > b) {
	        System.out.println("This call returns: 0");
	        return 0;
	    } else {
	        System.out.println("This call returns: " +a);
	        return a + sum(a + 1, b);
	    }
	}

	public String toString(){

		String a = "The recursive sum is: " + result;

		return a;

	} 

}