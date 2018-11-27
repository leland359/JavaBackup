import doodlepad.*;

public class board {
	public static void main (String [] args) {
		Pad gamescreen = new Pad (500, 700);
		int turnNum = 1;
		setupGame();
		
	}

	private static void setupGame() {

		for (int i = 0; i > 700; i+=100) {
			Rectangle pegBoard = new Rectangle(20, 0+i, 75, 75);
		}
		
	}
}
