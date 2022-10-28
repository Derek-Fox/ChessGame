package pieces;

import common.Color;


/**
 *
 * @author Derek Fox
 */
public abstract class Piece {
    public final Color color;
    public final int value;

    public Piece(Color color, int value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Piece{" + "color=" + color + ", value=" + value + '}';
    }
        
    protected abstract void move();
    
}
