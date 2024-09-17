package main.java.example;

abstract class ChessPiece {
    protected int row, col;
    protected ChessBoard board;

    public ChessPiece(String position, ChessBoard board) {
        int[] coordinates = board.positionToCoordinates(position);
        this.row = coordinates[0];
        this.col = coordinates[1];
        this.board = board;
    }

    public abstract String[] possibleMoves();
}