package main.java.example;

import java.util.ArrayList;

class Queen extends ChessPiece {

    public Queen(String position, ChessBoard board) {
        super(position, board);
    }

    @Override
    public String[] possibleMoves() {
        ArrayList<String> moves = new ArrayList<>();
        // Horizontal, Vertical, and Diagonal movements
        for (int i = 1; i <= 8; i++) {
            if (i != row) moves.add(board.coordinatesToPosition(i, col)); // Vertical
            if (i != col) moves.add(board.coordinatesToPosition(row, i)); // Horizontal
        }
        for (int i = 1; i <= 8; i++) {
            if (board.isWithinBounds(row + i, col + i))
                moves.add(board.coordinatesToPosition(row + i, col + i));
            if (board.isWithinBounds(row - i, col - i))
                moves.add(board.coordinatesToPosition(row - i, col - i));
            if (board.isWithinBounds(row + i, col - i))
                moves.add(board.coordinatesToPosition(row + i, col - i));
            if (board.isWithinBounds(row - i, col + i))
                moves.add(board.coordinatesToPosition(row - i, col + i));
        }
        return moves.toArray(new String[0]);
    }
}
