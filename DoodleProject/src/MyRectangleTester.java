/** Miles Cumiskey
 *  CSC 220
 *  Program that makes a rectangle according to
 *  project specifications, using doodlepad
 */

public class MyRectangleTester {
    public static void main(String[] args) {
      MyRectangle redFriend = new MyRectangle(-30, -10, 10, 10, "red");
      
      redFriend.show();
      
      System.out.println(redFriend.toString());
      
      System.out.println("Invalid x/y test: x = "+redFriend.getX() + ", y = " + redFriend.getY());
      
      redFriend.setHeight(-50);
      redFriend.setHeight(-30);
      System.out.println("Setting invalid height/width test: "+redFriend.getHeight() + ", " 
    		  				+ redFriend.getWidth());
      redFriend.setX(20);
      redFriend.setY(10);
      System.out.println("Setting valid x/y: "+redFriend.getX() + ", " + redFriend.getY());
      
      redFriend.setColor("yellow");
      System.out.println("Setting invalid color test: "+redFriend.getColor());
      
      System.out.println("Area: " + redFriend.computeArea());
      System.out.println("Perimeter: " + redFriend.computePerimeter());
      
      MyRectangle black = new MyRectangle(10, 10, 20, 20, "black");
      black.show();
      MyRectangle berryFriend = new MyRectangle(20, 10, 10, 10, "red");
      berryFriend.show();

      System.out.println("Is 'redFriend' the same as 'black'? " + redFriend.equals(black));
      System.out.println("Is it the same as 'berryFriend'? " + redFriend.equals(berryFriend));
      
      System.out.println("Is the point 15, 15? within 'black'? " + black.containsPoint(15, 15));
      System.out.println("Is the point 15, 15? within 'berryFriend'? " + berryFriend.containsPoint(15, 15));
      
      MyRectangle green = new MyRectangle(50, 50, 20, 20, "green");
      green.show();
      
      MyRectangle blue = new MyRectangle(10, 15, 10, 20, "blue");
      blue.show();

      System.out.println("Do redFriend and black intersect? " + redFriend.intersects(black));
      System.out.println("Do redFriend and green intersect? " + redFriend.intersects(green));
      
      System.out.println("Does black contain blue? " + black.containsRectangle(blue));

    }
}