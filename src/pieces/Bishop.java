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
    public String toString() {
        return "Bishop{" + "color= " + color + '}';
    }

    @Override
    public void move(String endSquare) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
