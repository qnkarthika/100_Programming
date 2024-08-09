Magic Squares In Grid

A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.
Given a row x col grid of integers, how many 3 x 3 contiguous magic square subgrids are there?
Note: while a magic square can only contain numbers from 1 to 9, grid may contain numbers up to 15.

Input: grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
Output: 1

Input: grid = [[8]]
Output: 0

Solution:

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i <= m - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagicSquare(int[][] grid, int row, int col) {
        int[] freq = new int[10]; 
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                int num = grid[i][j];
                if (num < 1 || num > 9) return false; 
                freq[num]++;
            }
        }

        for (int i = 1; i <= 9; i++) {
            if (freq[i] != 1) return false;
        }

        int row1 = grid[row][col] + grid[row][col+1] + grid[row][col+2];
        int row2 = grid[row+1][col] + grid[row+1][col+1] + grid[row+1][col+2];
        int row3 = grid[row+2][col] + grid[row+2][col+1] + grid[row+2][col+2];
        int col1 = grid[row][col] + grid[row+1][col] + grid[row+2][col];
        int col2 = grid[row][col+1] + grid[row+1][col+1] + grid[row+2][col+1];
        int col3 = grid[row][col+2] + grid[row+1][col+2] + grid[row+2][col+2];
        int diag1 = grid[row][col] + grid[row+1][col+1] + grid[row+2][col+2];
        int diag2 = grid[row][col+2] + grid[row+1][col+1] + grid[row+2][col];

        return row1 == row2 && row1 == row3 && row1== col1 &&
        col2 == row1 && col3 == row1 && diag1 == row1 && diag2 == row1;
    }
}
