package pieces;

import common.Color;

/**
 *
 * @author Derek Fox
 */
public class Pawn extends Piece {
    
    public Pawn(Color color) {
        super(color, 1);
    }

    
    @Override
    protected void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Pawn{" + "color=" + color + '}';
    }

    
    
    
}