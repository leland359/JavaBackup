/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */

//Miles Cumiskey, Hackettstown High School
//4.25.17 - edits to the PictureLab project

public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}
	
	/**
	 * Method to keep only blue rgb values
	 */
	private static void testKeepOnlyBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.onlyBlue();
		beach.explore();		
	}
	
	/**
	 * Method to invert the colors of a picture
	 * 
	 */
	private static void testNegate() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();		
	}
	
	private static void testGrayscale() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.toGrayscale();
		beach.explore();		
	}
	
	private static void testFixUnderwater() {
		Picture underwater = new Picture("water.jpg");
		underwater.explore();
		underwater.fixUnderwater();
		underwater.explore();		
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}
	
	/** Method to test mirrorVerticalRightToLeft */
	public static void testMirrorVerticalRightToLeft() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVerticalRightToLeft();
		caterpillar.explore();
	}
	
	/** Method to test mirrorHorizontal */
	private static void testMirrorHorizontal() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorHorizontal();
		caterpillar.explore();		
	}
	
	/** Method to test mirrorHorizontalBottomToTop */
	private static void testMirrorHorizontalBottomToTop() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorHorizontalBottomToTop();
		caterpillar.explore();			
	}
	
	/** Method to test mirrorDiagonal */
	private static void testMirrorDiagonal() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorDiagonal();
		caterpillar.explore();			
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}
	
	/** Method to test mirrorGull */
	private static void testMirrorGull() {
		Picture gull = new Picture("seagull.jpg");
		gull.explore();
		gull.mirrorGull();
		gull.explore();		
	}

	/** Method to test mirrorArms */
	private static void testMirrorArms() {
		Picture frosty = new Picture("snowman.jpg");
		frosty.explore();
		frosty.mirrorArms();
		frosty.explore();			
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(20);
		swan.explore();
	}
	
	/**
	 * Method to test copy
	 */
	private static void testCopy() {
		Picture base = new Picture("640x480.jpg");
		Picture copy = new Picture("femaleLionAndHall.jpg");
		base.copyPart(copy, 220, 325, 385, 475);
		base.explore();
		copy.explore();
	}
	
	/**
	 * Makes a collage out of Io
	 */
	private static void testMyCollage() {
		Picture collage = new Picture("Io.jpg");
		collage.explore();
		collage.makeMyCollage();
		collage.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {

		//testZeroBlue();
		//testKeepOnlyBlue();
		//testNegate();
		//testGrayscale();
		//testFixUnderwater();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		
//		testMirrorVertical();
//		testMirrorVerticalRightToLeft();
//		testMirrorHorizontal();
//		testMirrorHorizontalBottomToTop();
//		testMirrorDiagonal();
//		testMirrorTemple();
//		testMirrorArms();
//		testMirrorGull();
		
		//testCollage();
		//testCopy();
		//testMyCollage();
		
		testEdgeDetection();
		
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}