package pieces;

import common.Color;

/**
 *
 * @author Derek Fox
 */
public class Knight extends Piece{

    public Knight(Color color) {
        super(color, 3);
    }

    @Override
    protected void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Knight{" + "color=" + color + '}';
    }
    
    
    
    
}
