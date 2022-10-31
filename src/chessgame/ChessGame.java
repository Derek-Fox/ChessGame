package chessgame;

import board.*;
import pieces.*;
import common.*;
import java.util.Scanner;

/**
 * TODO: refactor move method in Piece and subclasses to take a board parameter. Then, implement moves for different piece subclasses. Then, captures. Also probably want a GUI...
 * @author Derek Fox
 */
public class ChessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board b = new Board();

        b.initBoard();

        movePiece(Color.WHITE, b);
    }

    /**
     * Method to handle moving pieces. Gets a valid starting square to determine
     * which piece to move, and a valid ending square to see if that piece can
     * move there. TODO: handle captures. oh and also checks eventually.
     *
     * @param player Color of current moving player
     * @param b Current board
     *
     */
    public static void movePiece(Color player, Board b) {
        Scanner in = new Scanner(System.in);

        System.out.print("Move piece on which square?: ");
        String startSquare = in.next();

        boolean valid;

        do {
            try {
                valid = validMoveInput(startSquare);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                valid = false;
                System.out.print("Move piece on which square?: ");
                startSquare = in.next();
            }
        } while (!valid);

        Piece p = b.squares[startSquare.charAt(0) - 'A'][startSquare.charAt(1) - '1'].getCurrentPiece(); //get piece on desired move square (may be null!)

        if (p == null) { //no piece on square
            System.out.println("No piece on that square!");
            movePiece(player, b);
        } else if (p.color != player) { //trying to move piece of wrong color
            System.out.println("That isn't your piece!");
            movePiece(player, b);
        }

        String endSquare; //need this outside the loop.

        do {
            System.out.print("Move piece where?: ");
            endSquare = in.next();

            try {
                valid = validMoveInput(endSquare);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                valid = false;

            }

            if (endSquare.equals(startSquare)) {
                System.out.println("Cannot move piece to the square it is already on.");
                valid = false;
            }
        } while (!valid);

        /*
        * We now have a piece to move and an endsquare of the valid format. 
        * Just need to pass the endsquare to the piece to check if that kind of 
        * piece can perform the desired move.
         */
        try {
            p.move(endSquare);
        } catch (Exception e) {
        }
    }

    /**
     * Check if input square for a move is valid in the context of the current
     * board state. Throws IAE for invalid inputs, including string not being 2
     * chars, chars being out of range, and no piece on move square.
     *
     * @param move String input move square name
     * @param b Board current board
     */
    private static boolean validMoveInput(String move) {
        if (move.length() != 2) { //sanity checks
            throw new IllegalArgumentException("Square name should be 2 characters e.g. 'A4'.");
        } else if ((move.charAt(0) < 'A') || (move.charAt(0) > 'H')) {
            throw new IllegalArgumentException("Invalid file. Should be A - H.");
        } else if (move.charAt(1) < '1' || move.charAt(1) > '8') {
            throw new IllegalArgumentException("Invalid rank. Should be 1 - 8.");
        }

        return true;
    }

}
