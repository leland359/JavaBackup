// Checkers.java

// Import the entire DoodlePad library
import doodlepad.*;

// Define the main class as a subclass of Pad
public class Checkers extends Pad
{
    // Define a constructor that sets up the game board
    public Checkers() {
        
        // Invoke the Pad constructor to set window title and size
        super("Checkers", 640, 640);
        
        // Draw board as alternating black and white squares.
        // Use Rectangle Shape objects.
        // By default, these shapes will remain in place.
        int r, c;
        for (r=0; r<8; ++r) {
            for (c=0; c<8; ++c) {
                Rectangle box = new Rectangle(c*80, r*80, 80, 80);
                if ((r + c) % 2 == 1) {
                    box.setFillColor(0);            // Black fill color
                } else {
                    box.setFillColor(255);          // White fill color
                }
            }
        }
        
        // Create game pieces from Oval Shape objects.
        // Make shapes draggable so players can play game.
        // Hide shapes on double click so they can be removed when captured.
        
        // Create red game pieces.
        for (r=0; r<3; ++r) {
            for (c=0; c<8; ++c) {
                if ((r + c) % 2 == 1) {
                    Oval piece = new Oval(c*80+2, r*80+2, 76, 76);
                    piece.setFillColor(255, 0, 0);  // Red fill color
                    piece.setDraggable(true);
                    piece.setMouseDoubleClickedHandler( this::hidePiece );
                }
            }
        }
        
        // Create white game pieces.
        for (r=5; r<8; ++r) {
            for (c=0; c<8; ++c) {
                if ((r + c) % 2 == 1) {
                    Oval piece = new Oval(c*80+2, r*80+2, 76, 76);
                    piece.setFillColor(255);
                    piece.setDraggable(true);
                    piece.setMouseDoubleClickedHandler( this::hidePiece );
                }
            }
        }
    }
    
    // Hide pieces when they are double clicked.
    public void hidePiece(Shape shp, double x, double y, int b) {
        shp.setVisible(false);
    }
    
}