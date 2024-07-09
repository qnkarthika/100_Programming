Find a Peak Element II

A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.
Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the length 2 array [i,j].
You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.
You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.
  
Example 1:
Input: mat = [[1,4],[3,2]]
Output: [0,1]
Explanation: Both 3 and 4 are peak elements so [1,0] and [0,1] are both acceptable answers.

Solution:

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int arr[] = new int[2];
        int res[][]=new int[n+2][m+2];
      
        for(int i=1;i<res.length-1;i++){
            for(int j=1;j<res[0].length-1;j++){
                res[i][j]=mat[i-1][j-1];
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int num=res[i][j];
                if(res[i-1][j]<num && res[i+1][j]<num && res[i][j+1]<num && res[i][j-1]<num){
                    arr[0]=i-1;
                    arr[1]=j-1;
                    return arr;
                  }
            }
        }
        return arr;
    }
}
