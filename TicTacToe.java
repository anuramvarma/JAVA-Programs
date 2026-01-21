import java.util.Scanner;
public class TicTacToe {
    private static final int NUM_PLAYERS = 2;
    private static final int BOARD_SIZE = 3;
    private String[] playerNames = new String[NUM_PLAYERS];
    private char[] playerSymbols = {'X', 'O'};
    private char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
    private int movesCount;
    private int[] playerMovesCount = new int[NUM_PLAYERS];
    private int currentPlayerIndex;
    private final Scanner scanner = new Scanner(System.in);

    /* ================== MAIN ================== */

    public static void main(String[] args) {
        new TicTacToe().start();
    }
    public void start() {
        displayWelcomeMessage();
        setupGame();

        boolean keepPlaying = true;
        while (keepPlaying) {
            GameResult result = runMatch();
            displaySummary(result);

            System.out.print("\nPlay again? (y/n): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.startsWith("y")) {
                resetBoard();
            } else {
                keepPlaying = false;
                System.out.println("\nThank you for playing TicTacToe!");
            }
        }
    }

    /* ================== SETUP ================== */
    private void displayWelcomeMessage() {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║      TIC TAC TOE         ║");
        System.out.println("╚══════════════════════════╝");
    }

    private void setupGame() {
        System.out.print("Enter Player 1 name (X): ");
        playerNames[0] = scanner.nextLine().trim();

        System.out.print("Enter Player 2 name (O): ");
        playerNames[1] = scanner.nextLine().trim();

        resetBoard();

        System.out.println("\nGame Setup Complete!");
        System.out.println("Board Size : 3 x 3");
        System.out.println("Win Rule   : 3 in a row\n");
    }

    private void resetBoard() {
        for (int i = 0; i < BOARD_SIZE; i++)
            for (int j = 0; j < BOARD_SIZE; j++)
                board[i][j] = ' ';

        movesCount = 0;
        currentPlayerIndex = 0;
        playerMovesCount[0] = playerMovesCount[1] = 0;
    }

    /* ================== GAME LOOP ================== */

    private GameResult runMatch() {
        long startTime = System.currentTimeMillis();

        while (true) {
            displayBoard();

            String name = playerNames[currentPlayerIndex];
            char symbol = playerSymbols[currentPlayerIndex];

            int row, col;

            while (true) {
                System.out.print(name + " (" + symbol + "), enter move [row col]: ");
                String input = scanner.nextLine().trim();
                String[] parts = input.split("\\s+");

                if (parts.length != 2) {
                    System.out.println("Enter two numbers (example: 2 3)");
                    continue;
                }

                try {
                    row = Integer.parseInt(parts[0]) - 1;
                    col = Integer.parseInt(parts[1]) - 1;
                } catch (NumberFormatException e) {
                    System.out.println("Numbers only.");
                    continue;
                }

                if (row < 0 || row >= BOARD_SIZE ||
                    col < 0 || col >= BOARD_SIZE) {
                    System.out.println("Out of range.");
                    continue;
                }

                if (board[row][col] != ' ') {
                    System.out.println("Cell already occupied.");
                    continue;
                }

                break;
            }

            board[row][col] = symbol;
            movesCount++;
            playerMovesCount[currentPlayerIndex]++;

            if (checkWinner(row, col, symbol)) {
                displayBoard();
                return new GameResult(
                        name,
                        true,
                        movesCount,
                        (System.currentTimeMillis() - startTime) / 1000,
                        playerMovesCount.clone()
                );
            }

            if (movesCount == BOARD_SIZE * BOARD_SIZE) {
                displayBoard();
                return new GameResult(
                        null,
                        false,
                        movesCount,
                        (System.currentTimeMillis() - startTime) / 1000,
                        playerMovesCount.clone()
                );
            }

            currentPlayerIndex = 1 - currentPlayerIndex;
        }
    }

    /* ================== WIN CHECK ================== */

    private boolean checkWinner(int r, int c, char s) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[r][i] != s) break;
            if (i == BOARD_SIZE - 1) return true;
        }

        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][c] != s) break;
            if (i == BOARD_SIZE - 1) return true;
        }

        if (r == c) {
            for (int i = 0; i < BOARD_SIZE; i++) {
                if (board[i][i] != s) break;
                if (i == BOARD_SIZE - 1) return true;
            }
        }

        if (r + c == BOARD_SIZE - 1) {
            for (int i = 0; i < BOARD_SIZE; i++) {
                if (board[i][BOARD_SIZE - 1 - i] != s) break;
                if (i == BOARD_SIZE - 1) return true;
            }
        }

        return false;
    }

    /* ================== DISPLAY ================== */

    private void displayBoard() {
        System.out.println();
        System.out.println("    1   2   3");
        System.out.println("  ┌───┬───┬───┐");

        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print((i + 1) + " │");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(" " + board[i][j] + " │");
            }
            System.out.println();
            if (i < BOARD_SIZE - 1)
                System.out.println("  ├───┼───┼───┤");
        }

        System.out.println("  └───┴───┴───┘\n");
    }

    /* ================== SUMMARY ================== */

    private void displaySummary(GameResult r) {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║        GAME SUMMARY      ║");
        System.out.println("╚══════════════════════════╝");

        if (r.isWin)
            System.out.println("WINNER: " + r.winnerName);
        else
            System.out.println("RESULT: DRAW");

        System.out.println("Moves: " + r.totalMoves);
        System.out.println(playerNames[0] + ": " + r.perPlayerMoves[0]);
        System.out.println(playerNames[1] + ": " + r.perPlayerMoves[1]);
        System.out.println("Duration: " + r.durationSeconds + " seconds");
    }

    /* ================== RESULT ================== */

    private static class GameResult {
        String winnerName;
        boolean isWin;
        int totalMoves;
        long durationSeconds;
        int[] perPlayerMoves;

        GameResult(String w, boolean win, int m, long d, int[] p) {
            winnerName = w;
            isWin = win;
            totalMoves = m;
            durationSeconds = d;
            perPlayerMoves = p;
        }
    }
}
