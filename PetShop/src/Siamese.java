
public class Siamese extends Cat{
	public Siamese(String catName, int catWeight) {
		super(catName, catWeight);
	}

	public String speak()  // defines abstract method speak for Dog
	  {
	    return "nyan!!";
	  } 
	  
	  public String move()  // defines abstract method  move  for Dog
	  {
	    return  "pounce";
	  }
}
