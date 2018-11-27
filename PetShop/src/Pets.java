// Adapted from Java Software Solutions by Lewis/Loftus/Cocking

// Demonstrates the useof Abstract Classes

// Instantiates objects of type pet and prints information
public class Pets
{
  public static void main(String Args[])
  {
	  
    Ragdoll kitty =new Ragdoll ("Kitty", 23);
    System.out.println(kitty);
    System.out.println(kitty.getName() + " " + "says " + kitty.speak());
    System.out.println(kitty.move() + " " + kitty.getName() + " " + kitty.move());
    System.out.println();
    
    ShibaInu tipsy = new ShibaInu("Tipsy", 60);
    tipsy.setColour("black");
    System.out.println(tipsy + ", with " +tipsy.getColour() +" fur");
    System.out.println(tipsy.getName() + " " + "says " + tipsy.speak());
    System.out.println(tipsy.move() + " " + tipsy.getName() + " " + tipsy.move());
    System.out.println();
    
    
    Python perry  = new Python ("Perry", 4);
    System.out.println(perry);
    System.out.println(perry.getName() + " " + "says " + perry.speak());
    System.out.println(perry.move() + " " + perry.getName() + " " + perry.move());
    System.out.println();
    
    Pigeon fancy  = new Pigeon ("Fancy", 16);
    System.out.println(fancy);
    fancy.setMotive("eat all the french fries");
    System.out.println(fancy.getName() +" wants to " +fancy.getMotivation());
    System.out.println(fancy.getName() + " " + "says " + fancy.speak());
    System.out.println(fancy.move() + " " + fancy.getName() + " " + fancy.move());
    System.out.println();
    
  }
}
    
     
   
