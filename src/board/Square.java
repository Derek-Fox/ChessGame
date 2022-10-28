package board;

import common.Color;
import pieces.Piece;

/**
 *
 * @author Derek Fox
 */
public class Square {
    public final String name;
    public final Color color;
    private Piece currentPiece;

    public Square(String name, Color color, Piece currentPiece) {
        this.name = name;
        this.color = color;
        this.currentPiece = currentPiece;
    }

    public Square(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Piece getCurrentPiece() {
        return currentPiece;
    }

    public void setCurrentPiece(Piece currentPiece) {
        this.currentPiece = currentPiece;
    }

    
    
    @Override
    public String toString() {
        return "Square{" + "name=" + name + ", color=" + color + ", currentPiece=" + currentPiece + '}';
    }
    
    
}
