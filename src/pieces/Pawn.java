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
    public String toString() {
        return "Pawn{" + "color=" + color + '}';
    }

    @Override
    public void move(String endSquare) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
