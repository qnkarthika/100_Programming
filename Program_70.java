Check if Matrix Is X-Matrix

A square matrix is said to be an X-Matrix if both of the following conditions hold:
All the elements in the diagonals of the matrix are non-zero.All other elements are 0.
Given a 2D integer array grid of size n x n representing a square matrix, return true if grid is an X-Matrix. Otherwise, return false.

Input: grid = [[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]]
Output: true
Explanation: Refer to the diagram above. 
An X-Matrix should have the green elements (diagonals) be non-zero and the red elements be 0.
Thus, grid is an X-Matrix.

Solution:

  class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==j || i+j==n-1) && grid[i][j]==0) return false;
                else if(i!=j && i+j!=n-1 && grid[i][j]!=0) return false;
                
            }
        }
        return true;
    }
}
