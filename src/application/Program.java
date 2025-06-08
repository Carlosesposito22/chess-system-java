package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Sorce: ");
            ChessPosition souce = UI.readChessPosition(scanner);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(scanner);

            ChessPiece capturedPiece = chessMatch.performChessMove(souce, target);

        }
    }
}
