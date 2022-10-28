package chessgame;

import board.*;
import pieces.*;
import common.*;

/**
 *
 * @author Derek Fox
 */
public class ChessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Board b = new Board();
        
        b.initBoard();
        
        System.out.println(b.toString());
    }
    
}
