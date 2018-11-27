//this program was made by miles for demo by paul
//3.2.17

public class RandomPrimeNumber {
	
public static void main (String [] args) { 
	
	int randomNum; //initialize the int
	
	//cast Math.random * the upper bound to get a number between 1 and 8999
	//then add 1000 as a minimum value
	randomNum = 1000 + (int)(Math.random() * 8999); 
	
	//print the number we generate
	System.out.println("Checking if " + randomNum +" is prime...");
	
	
	//calls the method that takes randomNum as a parameter and returns a boolean 
	//(jump to static boolean isPrime)
	
	if (isPrime(randomNum) == true) {
		System.out.println(randomNum + " is prime.");
		
	} else if (isPrime(randomNum) == false) {
	
		System.out.print(randomNum +" is not prime.");
	}
}	

//this is a method. Methods are friends
static boolean isPrime(int randomNum) {

	
	//if randomNum is even, it is not prime
	if (randomNum % 2 == 0) {
    	return false;
    	}
	
	//divide the random number by every odd number?
	//I found this online for checking primes but that is basically what it does
    else for(int i = 2 ; i * i <= randomNum; i ++) {
        if(randomNum % i == 0) {
            return false;
        	}
    	}  
    //this bit of code ONLY RUNS if neither of the other execute 
   return true;
    }
}


