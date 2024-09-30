This is a console-based Java application that simulates the movements of chess pieces on an 8x8 chessboard.
The supported chess pieces are Pawn, King, and Queen, each with its own specific movement rules. 
The application accepts user input specifying the type of piece and its position, and then outputs all possible valid moves for that piece.

Features
1) Simulates an 8x8 chessboard.
2) Supports movement rules for three chess pieces: Pawn, King, and Queen.
3) Handles boundary conditions to ensure no moves go beyond the limits of the board.
4) Clean, modular design with object-oriented principles.
   
Chess Pieces and Movement
1) Pawn: Moves one step vertically forward.
2) King: Moves one step in any of the eight directions (vertical, horizontal, diagonal).
3) Queen: Moves any number of steps in any of the eight directions.
   
Example Inputs and Outputs

- Input: Pawn, G1
- Output: G2

- Input: King, D5
- Output: C4, C5, C6, D4, D6, E4, E5, E6

- Input: Queen, E4
- Output: A4, B4, C4, D4, F4, G4, H4, E1, E2, E3, E5, E6, E7, E8, A8, B7, C6, D5, F3, G2, H1, B1, C2, D3, F5, G6, H7
