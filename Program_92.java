Sudoku Solver

Write a program to solve a Sudoku puzzle by filling the empty cells. A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.

Input: board = [["5","3",".",".","7",".",".",".","."],
                ["6",".",".","1","9","5",".",".","."],
                [".","9","8",".",".",".",".","6","."],
                ["8",".",".",".","6",".",".",".","3"],
                ["4",".",".","8",".","3",".",".","1"],
                ["7",".",".",".","2",".",".",".","6"],
                [".","6",".",".",".",".","2","8","."],
                [".",".",".","4","1","9",".",".","5"],
                [".",".",".",".","8",".",".","7","9"]]
  
Output:       [["5","3","4","6","7","8","9","1","2"],
               ["6","7","2","1","9","5","3","4","8"],
               ["1","9","8","3","4","2","5","6","7"],
               ["8","5","9","7","6","1","4","2","3"],
               ["4","2","6","8","5","3","7","9","1"],
               ["7","1","3","9","2","4","8","5","6"],
               ["9","6","1","5","3","7","2","8","4"],
               ["2","8","7","4","1","9","6","3","5"],
               ["3","4","5","2","8","6","1","7","9"]]


Solution:

class Solution {
    public void solveSudoku(char[][] board) {
        if (solve(board)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }
    }

    public static boolean solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        if (isValid(board, i, j, k)) {
                            board[i][j] = k;
                            if (solve(board)) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false; 
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            
            if (board[i][col] == num || board[row][i] == num || 
                board[row - row % 3 + i / 3][col - col % 3 + i % 3] == num) {
                return false;
            }
        }
        return true;
    }
}
