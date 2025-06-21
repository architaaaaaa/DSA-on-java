package recursion;
import java.util.*;
public class nQueensProblem {
        public  static boolean isSafe(int row, int col, char[][] board) {
            // Check horizontal (row) for another Queen
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] == 'Q') {
                    return false;
                }
            }

            // Check vertical (column) for another Queen
            for (int i = 0; i < board.length; i++) {
                if (board[i][col] == 'Q') {
                    return false;
                }
            }

            // Check upper-left diagonal
            int r = row;
            for (int c = col; c >= 0 && r >= 0; c--, r--) {
                if (board[r][c] == 'Q') {
                    return false;
                }
            }

            // Check upper-right diagonal
            r = row;
            for (int c = col; c < board.length && r >= 0; r--, c++) {
                if (board[r][c] == 'Q') {
                    return false;
                }
            }

            // Check lower-left diagonal
            r = row;
            for (int c = col; c >= 0 && r < board.length; r++, c--) {
                if (board[r][c] == 'Q') {
                    return false;
                }
            }

            // Check lower-right diagonal
            r = row;
            for (int c = col; c < board.length && r < board.length; c++, r++) {
                if (board[r][c] == 'Q') {
                    return false;
                }
            }

            return true;
        }

        public static void saveBoard(char[][] board, List<List<String>> allBoards) {
            List<String> newBoard = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                String row = "";
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 'Q') {
                        row += 'Q';
                    } else {
                        row += '.';
                    }
                }
                newBoard.add(row);
            }
            allBoards.add(newBoard);
        }

        public  static void helper(char[][] board, List<List<String>> allBoards, int col) {
            if (col == board.length) {
                saveBoard(board, allBoards);
                return;
            }

            for (int row = 0; row < board.length; row++) {
                if (isSafe(row, col, board)) {
                    board[row][col] = 'Q'; // Place Queen
                    helper(board, allBoards, col + 1); // Recurse for next column
                    board[row][col] = '.'; // Backtrack (remove Queen)
                }
            }
        }

        public  static List<List<String>> solveNQueens(int n) {
            List<List<String>> allBoards = new ArrayList<>();
            char[][] board = new char[n][n];
            // Initialize board with '.'
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }
            helper(board, allBoards, 0);
            return allBoards;
        }

        public static void main(String args[]) {
            int N = 4;
            List < List < String >> queen = solveNQueens(N);
            int i = 1;
            for (List < String > it: queen) {
                System.out.println("Arrangement " + i);
                for (String s: it) {
                    System.out.println(s);
                }
                System.out.println();
                i += 1;
            }
        }
}
