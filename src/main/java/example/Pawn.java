package main.java.example;

class Pawn extends ChessPiece {

    public Pawn(String position, ChessBoard board) {
        super(position, board);
    }

    @Override
    public String[] possibleMoves() {
        if (board.isWithinBounds(row + 1, col)) {
            return new String[]{board.coordinatesToPosition(row + 1, col)};
        }
        return new String[]{};
    }
}
