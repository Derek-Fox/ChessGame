package board;

import common.Color;
import java.util.Arrays;
import pieces.*;

/**
 *
 * @author Derek Fox
 */
public class Board {

    private int numCurrentPieces;
    public final Square[][] squares;

    public Board() {
        numCurrentPieces = 0;
        squares = new Square[8][8];
    }

    public void initBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square("" + (char) ('A' + i) + (1 + j), ((i + j) % 2 == 1) ? Color.WHITE : Color.BLACK); //if i + j is odd, then the square is white.
                if (j == 0 || j == 7) {
                    switch (i) {
                        case 0:
                        case 7:
                            squares[i][j].setCurrentPiece(new Rook((j == 0) ? Color.WHITE : Color.BLACK));
                            break;
                        case 1:
                        case 6:
                            squares[i][j].setCurrentPiece(new Knight((j == 0) ? Color.WHITE : Color.BLACK));
                            break;
                        case 2:
                        case 5:
                            squares[i][j].setCurrentPiece(new Bishop((j == 0) ? Color.WHITE : Color.BLACK));
                            break;
                        case 3:
                            squares[i][j].setCurrentPiece(new Queen((j == 0) ? Color.WHITE : Color.BLACK));
                            break;
                        case 4:
                            squares[i][j].setCurrentPiece(new King((j == 0) ? Color.WHITE : Color.BLACK));
                            break;
                    }
                } else if (j == 1 || j == 6) {
                    squares[i][j].setCurrentPiece(new Pawn((j == 1) ? Color.WHITE : Color.BLACK)); //if in row 2, then pawn is white
                }
            }
        }

        this.updatePieceCount();
    }

    public void updatePieceCount() {
        int count = 0;
        for (Square[] row : squares) {
            for (Square square : row) {
                if (square.getCurrentPiece() != null) {
                    count++;
                }
            }
        }

        this.numCurrentPieces = count;
    }

    @Override
    public String toString() {
        return "Board{" + "numCurrentPieces=" + numCurrentPieces + ", squares=" + Arrays.deepToString(squares) + '}';
    }

}
