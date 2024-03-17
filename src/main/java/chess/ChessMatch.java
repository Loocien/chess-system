package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
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

    //Método por iniciar partida de Xadrez, coloando as peças no tabuleiro
    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.placePiece(new King(board, Color.BLACK), new Position(0,4));
    }

}