
public class Cat extends AbstrPets {
	
		   private int weight;
		   
		   public Cat (String catName, int catWeight)
		   {
		    super (catName);   //  invokes the concrete constructor in the 
		                       // abstract class  AbstrPets
		    weight = catWeight;
		  }
		  
		  public int getWeight()
		  {
		    return weight;
		  }
		  
		  public String toString()  // the closest toString method to the object
		                            // is in play.  If this toString was absent,
		                            // the obejct would use the toString in super.
		  {
		    return (super.toString() + " is a cat, weighing " + weight + " pounds");
		  }
		  
		  public String speak()  // defines abstract method speak for Cat
		  {
		    return "meow!!";
		  } 
		  
		  public String move()  // defines abstract method  move  for Cat
		  {
		    return  "prowl";
		  }
		  
		  
		}
