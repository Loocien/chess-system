package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        //Por padrao a variavel position ganha o valor null
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    //Verifica cada possível movimento de cada posição
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    //Verifica se tem pelo menos UM movimento possível
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
