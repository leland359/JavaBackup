
public class Chicken extends Bird{

	public Chicken(String petName, int birdWingSpan) {
		super(petName, birdWingSpan);
	}
	
	public String speak() {
		return "cluck!!";
	}

	public String move() {
		return "roam";
	}
}

