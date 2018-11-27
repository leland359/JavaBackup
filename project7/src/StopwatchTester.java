import java.util.Scanner;

public class StopwatchTester {
	public static void main (String [] args) {
		String response = "";
		Stopwatch s = new Stopwatch();
		s.start();double z = 0.0;
		
		Scanner reader = new Scanner(System.in);
		response = reader.nextLine();
		
		s.stop();
		
		System.out.println("elapsed  time  in  milliseconds: "   +s);

	}
}
