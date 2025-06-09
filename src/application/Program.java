package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.exceptions.ChessException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScrenn();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Sorce: ");
                ChessPosition source = UI.readChessPosition(scanner);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScrenn();
                UI.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(scanner);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
