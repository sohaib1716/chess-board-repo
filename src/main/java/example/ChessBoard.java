package main.java.example;

public class ChessBoard {
    private static final int BOARD_SIZE = 8;
    private static final char[] COLUMNS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    public boolean isWithinBounds(int row, int col) {
        return row >= 1 && row <= BOARD_SIZE && col >= 0 && col < BOARD_SIZE;
    }

    public int[] positionToCoordinates(String position) {
        char column = position.charAt(0);
        int row = Character.getNumericValue(position.charAt(1));
        int col = new String(COLUMNS).indexOf(column);
        return new int[]{row, col};
    }

    public String coordinatesToPosition(int row, int col) {
        return COLUMNS[col] + Integer.toString(row);
    }
}
