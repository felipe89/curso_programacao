package EntidadeXadres;

import java.awt.*;

public class Rook extends ChessPiece{

    public Rook(Board board, Collor collor) {
        super(board, collor);
    }
    @Override
    public String toString(){
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
