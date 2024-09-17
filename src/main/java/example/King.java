package main.java.example;

import java.util.ArrayList;

class King extends ChessPiece {

    public King(String position, ChessBoard board) {
        super(position, board);
    }

    @Override
    public String[] possibleMoves() {
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}
        };
        ArrayList<String> moves = new ArrayList<>();
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if (board.isWithinBounds(newRow, newCol)) {
                moves.add(board.coordinatesToPosition(newRow, newCol));
            }
        }
        return moves.toArray(new String[0]);
    }
}