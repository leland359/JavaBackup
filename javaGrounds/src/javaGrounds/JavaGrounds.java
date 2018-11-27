package javaGrounds;
import java.util.Scanner;

public class JavaGrounds {

	public static void main (String[] args) { //basic setup for java programs
		
		int miles;
		Scanner reader = new Scanner (System.in);
		System.out.println("Input miles: ");
		miles = reader.nextInt();
		
		System.out.println(miles);
		
	}
}