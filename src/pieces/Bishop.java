package pieces;

import common.Color;

/**
 *
 * @author Derek Fox
 */
public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color, 3);
    }

    @Override
    protected void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Bishop{" + "color= " + color + '}';
    }
    
    
    
}
