package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    //Serve para converter a matriz do tipo Piece em uma matriz do tipo ChessPiece
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++) {
            for (int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.getPiece(i,j);
            }
        }
        return mat;
    }

}
