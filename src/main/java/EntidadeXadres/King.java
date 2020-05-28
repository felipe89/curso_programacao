package EntidadeXadres;

public class King extends ChessPiece{

    public King(Board board, Collor collor) {
        super(board, collor);
    }
    @Override
    public String toString(){
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
