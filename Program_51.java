51.Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

Solution:

 public class Solution{
    public boolean exist(char[][] board,String word){
        if(board.length==0 || word.length()==0 || word==null || board==null || board[0].length==0) return false;
        int m=board.length;
        int n=board[0].length;
        boolean result[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(exist(board,word,result,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean exist(char[][] board,String word,boolean[][] visited,int i,int j,int index){
        if(index==word.length()) return true;
        int m=board.length;
        int n=board[0].length;

        if(i<0 || i>=m || j<0 || j>=n || visited[i][j] || board[i][j]!=word.charAt(index) ) return false;
        
        visited[i][j]=true;
        boolean found=(exist(board,word,visited,i+1,j,index+1) ||
                      exist(board,word,visited,i,j+1,index+1) ||
                      exist(board,word,visited,i-1,j,index+1) ||
                      exist(board,word,visited,i,j-1,index+1) );
        visited[i][j]=false;
        return found;
    }
}
