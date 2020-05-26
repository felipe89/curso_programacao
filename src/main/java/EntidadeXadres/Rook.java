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
}
