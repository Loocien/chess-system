package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //Por padrao a variavel position ganha o valor null
    }

    protected Board getBoard() {
        return board;
    }

}
