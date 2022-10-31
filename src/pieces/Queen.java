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
    public String toString() {
        return "Queen{" + "color= " + color + '}';
    }

    @Override
    public void move(String endSquare) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
