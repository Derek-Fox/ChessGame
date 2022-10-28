package pieces;

import common.Color;

/**
 *
 * @author Derek Fox
 */
public class King extends Piece {

    public King(Color color) {
        super(color, 0);
    }

    @Override
    protected void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "King{" + "color= " + color + '}';
    }
    
    
}
