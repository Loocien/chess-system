package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {


    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        if (this.getColor().equals(Color.BLACK)) {
            return "♔";
        }
        else {
            return "♚";
        }
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
