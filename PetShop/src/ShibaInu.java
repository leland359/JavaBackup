
public class ShibaInu extends Dog {

	private String fur; 
	
	public ShibaInu(String dogName, int weight) {
		super(dogName, weight);
	}

	public String speak() {
		return "wan!!";
	}

	public String setColour(String shibaColour) {
		fur = shibaColour;
		return fur;
	}
	
	public String getColour() {
		return fur;
	}
	
	public String move() {
		return "jump";
	}

}
