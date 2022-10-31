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
    public String toString() {
        return "King{" + "color= " + color + '}';
    }

    @Override
    public void move(String endSquare) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
