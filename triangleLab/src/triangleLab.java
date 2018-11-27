/** Miles Cumiskey
 *  CSC 220
 *  Program that uses Heron's Formula to find the area of a triangle
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class triangleLab {
	public static void main (String [] args) {
		Scanner reader = new Scanner (System.in);
		double a, b, c, s, area;
		
		System.out.println("Please input the side lengths of triangle:");
		System.out.print("a: ");
		a = reader.nextDouble();
		System.out.print("b: ");
		b = reader.nextDouble();
		System.out.print("c: ");
		c = reader.nextDouble();
		
		s = (a + b + c) / 2;
		
		area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		
		DecimalFormat format = new DecimalFormat ("0.###");
		
		System.out.println("The area of the triangle is: " +format.format(area));

	}
}
