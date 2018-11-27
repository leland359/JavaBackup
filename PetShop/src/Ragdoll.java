
public class Ragdoll extends Cat{

	public Ragdoll(String catName, int catWeight) {
		super(catName, catWeight);
	}
	public String speak()  // defines abstract method speak for Dog
	  {
	    return "mjau!!";
	  } 
	  
	  public String move()  // defines abstract method  move  for Dog
	  {
	    return  "waddle";
	  }
}
