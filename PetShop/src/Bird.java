
public class Bird extends AbstrPets{
	
	private int wingSpan;

	public Bird(String petName, int birdWingSpan) {
		super(petName);
		wingSpan = birdWingSpan;
	}
	
	public int getWingsh() {
		return wingSpan;
	}

	public String toString() 
	{
		return super.toString() + " is a bird, with a wingspan of " + wingSpan + " inches";
	}

	public String speak() // defines abstract method speak for Snake
	{
		return "squawk!!";
	}

	public String move() // defines abstract method move for Snake
	{
		return "fly";
	}
}


