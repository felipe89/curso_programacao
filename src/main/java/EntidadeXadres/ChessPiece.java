package EntidadeXadres;

public abstract class ChessPiece extends Piece {

    private Collor collor;

    public ChessPiece(Board board, Collor collor) {
        super(board);
        this.collor = collor;
    }

    public Collor getCollor() {
        return collor;
    }
    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getCollor() != collor;
    }
}


