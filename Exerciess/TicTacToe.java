package Exerciess;
import java.util.Scanner;

public class TicTacToe {
    public static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    public static char currentPlayer = 'X';
    public static boolean gameOver = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard();
            playerMove(scanner);
            checkForWinner();
            switchPlayer();
        }
        scanner.close();
    }

    // Method to print the Tic-Tac-Toe board
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Method to handle player move
    public static void playerMove(Scanner scanner) {
        int row, col;
        boolean validMove = false;

        while (!validMove) {
            System.out.println("Player " + currentPlayer + ", it's your turn!");
            System.out.print("Enter row (0-2) and column (0-2) to make your move (e.g., 1 1): ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                validMove = true;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    // Method to check if there is a winner
    public static void checkForWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
                return;
            }
        }

        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            printBoard();
            System.out.println("Player " + currentPlayer + " wins!");
            gameOver = true;
            return;
        }

        // Check for draw
        boolean isDraw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    isDraw = false;
                    break;
                }
            }
        }

        if (isDraw) {
            printBoard();
            System.out.println("It's a draw!");
            gameOver = true;
        }
    }

    // Method to switch the player between 'X' and 'O'
    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
