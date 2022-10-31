package pieces;

import common.Color;

/**
 *
 * @author Derek Fox
 */
public class Rook extends Piece {

    public Rook(Color color) {
        super(color, 5);
    }

    

    @Override
    public String toString() {
        return "Rook{" + "color=" + color + '}';
    }

    @Override
    public void move(String endSquare) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
