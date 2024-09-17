package main.java.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the chess piece and position (e.g. King, D5):");
        String input = scanner.nextLine();
        String[] inputParts = input.split(", ");
        String pieceType = inputParts[0];
        String position = inputParts[1];

        ChessPiece piece;
        switch (pieceType.toLowerCase()) {
            case "pawn":
                piece = new Pawn(position, board);
                break;
            case "king":
                piece = new King(position, board);
                break;
            case "queen":
                piece = new Queen(position, board);
                break;
            default:
                System.out.println("Invalid piece type.");
                return;
        }

        String[] moves = piece.possibleMoves();
        if (moves.length == 0) {
            System.out.println("No possible moves.");
        } else {
            System.out.println("Possible moves:");
            for (String move : moves) {
                System.out.print(move + " ");
            }
        }
    }
}