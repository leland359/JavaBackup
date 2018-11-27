/** Miles Cumiskey
 *  CSC 220
 *  Program that makes a rectangle according to
 *  project specifications, using doodlepad
 */
import doodlepad.*;

public class MyRectangle {
	private double x, y;
	private double height, width;
	private String color;
	
	/**
	 * Creates a new MyRectangle
	 * <p>
	 * @param   x   the x position (positive)
	 * @param   y   the y position (positive)
	 * @param   height   the height (positive)
	 * @param   width   the width (positive)
	 * @param   color   "red" "blue" "black" or "green" 
	 */
	public MyRectangle (double x, double y, double height, double width, String color){
		this.x = x;
		this.y = y; 
		this.height = height;
		this.width = width;
		this.color = color; 
		
		if (MyRectangle.isValid(x, y, width, height) == false) {
			if (x < 0) {
				this.x = 0;
			}
			if(y < 0) {
				this.y = 0;
			}
			if (height <= 0) {
				this.height = 1;
			}
			if (width <= 0) {
				this.width = 1;
			}
			//if the color is not red, blue, black, or green
			if (!((color.equals("red")) || (color.equals("blue"))
				|| (color.equals("green")) || ((color.equals("black"))))) {
					this.color = "red";
			}
		}
		
	}
	
	/**
	 * Returns the x coordinate of this object.
	 * <p>
	 * @return      the current x value
	 */
	public double getX() {
		return this.x;
	}
	/**
	 * Returns the y coordinate of this object.
	 * <p>
	 * @return      the current y value
	 */
	public double getY() {
		return this.y;
	}
	/**
	 * Returns the height of this object.
	 * <p>
	 * @return      the current height 
	 */
	public double getHeight() {
		return this.height;
	}
	/**
	 * Returns the width of this object.
	 * <p>
	 * @return      the current width 
	 */
	public double getWidth() {
		return this.width;
	}
	/**
	 * Returns the color of this object.
	 * <p>
	 * @return      the color as a string 
	 */
	public String getColor() {
		return this.color;
	}
	/**
	 * Sets a new X value
	 * <p>
	 * @param	x	the new x value
	 */
	void setX(double x) {
		if (x > 0) {
			this.x = x;
		}
	}
	/**
	 * Sets a new Y value
	 * <p>
	 * @param	y	the new x value
	 */
	void setY(double y) {
		if (y > 0) {
			this.y = y;
		}
	}
	/**
	 * Sets a new height value
	 * <p>
	 * @param	h	the new height 
	 */
	void setHeight(double h) {
		if (h >= 0) {
			this.height = h;
		}
	}
	/**
	 * Sets a new width value
	 * <p>
	 * @param	x	the new width 
	 */
	void setWidth(double w) {
		if (y >= 0) {
			this.width = w;
		}
	}
	/**
	 * Sets a new color 
	 * <p>
	 * @param	c	the new color (as a string) 
	 */
	void setColor (String c) {
		if ((c.equals("red")) || (c.equals("blue"))
				|| (c.equals("green")) || ((c.equals("black")) == true)) {
			this.color = c;
		}
	}
	/**
	 * Returns a string representation of the object.
	 * <p>
	 * @return      all variable values
	 */
	public String toString(){
		return "Current Values: "+"\n  X: " + this.getX() + "\n  Y: " + this.getY() 
		+ "\n  Height: " + this.getHeight() + "\n  Width: " 
		+ this.getWidth() + "\n  Color: " + this.getColor();
	}
	
	/**
	 * Calculates the perimeter 
	 * <p>
	 * @return     the value of the perimeter
	 */
	public double computePerimeter() {
		double perim = (2 * height) + (2 * width);
		return perim;
	}	
	/**
	 * Calculates the Area 
	 * <p>
	 * @return     the value of the area
	 */
	public double computeArea() {
		double area = height * width;
		return area;
	}
	
	/**
	 * Determines if the current rectangle has all the same values as another 
	 * <p>
	 * @param rect	a rectangle to compare
	 * @return     true for matching / false otherwise
	 */
	public boolean equals(MyRectangle rect) {
		if (this.x == rect.getX() && (this.y == rect.getY())
			&& (this.height == rect.getHeight()) && (this.width == rect.getWidth())
			&& (this.color.equalsIgnoreCase(rect.getColor()))) {
				return true;
		}
		return false;
	}
	
	/**
	 * Determines if the MyRectangle's dimensions are acceptable
	 * <p>
	 * @param	x	x coordinate
	 * @param	y	y coordinate
	 * @param	w	width 
	 * @param	h	height
	 * @return     true for valid / false otherwise
	 */
	static boolean isValid(double x, double y, double w, double h) {
		if ((x < 0) || (y < 0) || (w <= 0) || (h <= 0)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Determines if a point is within a certain area
	 * <p>
	 * @param	x	x coordinate
	 * @param	y	y coordinate
	 * @return     true for containing / false otherwise
	 */
	public boolean containsPoint(double x, double y) {
		double xRange, yRange;
		
		xRange = this.x + this.width;
		yRange = this.y + this.height;
		
		if (((x >= this.x) && (x <= xRange)) &&((y >= this.y) && (y <= yRange))){
			return true;
		}

		return false;
	}
	/**
	 * Returns true if this rectangle contains rectangle rect
	 * <p>
	 * @param	rect	the rectangle you are searching for
	 * @return     true for containing / false otherwise
	 */	
	boolean containsRectangle(MyRectangle rect) {
		double thisXRange, thisYRange;
		thisXRange = this.x + this.width;
		thisYRange = this.y + this.height;
		
		if (this.intersects(rect) == false){
			return false;
		} 
		if((this.x < rect.x) || (this.y < rect.y)) {
			return false;
		}
		if((thisXRange < rect.x + rect.width) || (thisYRange < rect.y + rect.height)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Returns true if rectangle rect and this rectangle intersect. 
	 * <p>
	 * @param	rect	the rectangle you are comparing
	 * @return     true for intersecting / false otherwise
	 */
	public boolean intersects(MyRectangle rect) {
		
		//check if the x/y ranges meet at any point
		  if (this.x + width <= rect.x){
			  return false;
		  }   if (rect.x + rect.width <= this.x) {
			  return false;
		  } if (this.y + this.height <= rect.y) {
			  return false;
		  } if (rect.y + rect.height <= this.y){
			  return false;
		  }

		//otherwise... 
		return true;
	}
	
	/**
	 * Displays the rectangle on the screen.  
	 */
	public void show() {
        Rectangle display = new Rectangle(this.x, this.y, this.height, this.width);

		if (this.color.equals("red")) {
	        display.setFillColor(255, 0, 0);
		} if (this.color.equals("green")) {
			display.setFillColor(0, 255, 0);
		} if (this.color.equals("blue")){
			display.setFillColor(0, 0, 255);
		} if (this.color.equals("black")) {
			display.setFillColor(0, 0, 0);
		}
	}
}


