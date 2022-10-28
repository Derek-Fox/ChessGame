package pieces;

import common.Color;

/**
 *
 * @author Derek Fox
 */
public class Queen extends Piece {

    public Queen(Color color) {
        super(color, 9);
    }

    @Override
    protected void move() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Queen{" + "color= " + color + '}';
    }
    
    
}
