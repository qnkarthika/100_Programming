Make a Square with the Same Color

You are given a 2D matrix grid of size 3 x 3 consisting only of characters 'B' and 'W'. Character 'W' represents the white color, and character 'B' represents the black color.
Your task is to change the color of at most one cell so that the matrix has a 2 x 2 square where all cells are of the same color.
Return true if it is possible to create a 2 x 2 square of the same color, otherwise, return false.

Example 1:
  
Input: grid = [["B","W","B"],["B","W","W"],["B","W","B"]]
Output: true

Solution:

class Solution {
    public boolean canMakeSquare(char[][] grid) {
        
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (isValidChange(i, j, grid)) {
                    return true;
                }
            }
        }
        return false;
    }
   
    private boolean isValidChange(int r, int c, char[][] grid) {
      
        int bcount = 0, wcount = 0;
        
        for (int i = r; i < r + 2; i++) {
            for (int j = c; j < c + 2; j++) {
                if (grid[i][j] == 'B') {
                    bcount++;
                } else {
                    wcount++;
                }
            }
        }
        
        if (bcount == 4 || wcount == 4) {
            return true; 
        } else if (bcount == 3 || wcount == 3) {
            return true; 
        } 
        
        return false;
    }
}
