40.Consider a N X N chessboard with a Queen and K obstacles. The Queen cannot pass through obstacles. Given the position (x, y) of Queen, the task is to find the number of cells the queen can move.

Example: 

Input : N = 8, x = 4, y = 4, K = 0
Output : 27

Solution:

import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int x=s.nextInt();
       int y=s.nextInt();
       int k=s.nextInt();
       int kx[]=new int[k];
       int ky[]=new int[k];
       for(int i=0;i<k;i++){
           kx[i]=s.nextInt();
           ky[i]=s.nextInt();
       }
       int count=0;
       boolean result[][]=new boolean[n][n];
       for(int i=0;i<k;i++){
           result[kx[i]][ky[i]]=true;
       }
       for(int i=y-1;i>=0;i--){
           if(!result[x][i]){
               count++;
           }
           else{
               break;
           }
       }
       for(int i=y+1;i<n;i++){
           if(!result[x][i]){
               count++;
           }
           else{
               break;
           }
       }
       for(int i=x-1;i>=0;i--){
           if(!result[i][y]){
               count++;
           }
           else{
               break;
           }
       }
       for(int i=x+1;i<n;i++){
           if(!result[i][y]){
               count++;
           }
           else{
               break;
           }
       }
       
       for(int i=x-1,j=y+1;i>=0 && j<n;i--,j++){
           if(!result[i][j]){
               count++;
           }
           else{
               break;
           }
       }
       for(int i=x-1,j=y-1;i>=0 && j>=0;i--,j--){
           if(!result[i][j]){
               count++;
           }
           else{
               break;
           }
       }
       
       for(int i=x+1,j=y-1;i<n && j>=0;i++,j--){
           if(!result[i][j]){
               count++;
           }
           else{
               break;
           }
       }
       for(int i=x+1,j=y+1;i<n && j<n;i++,j++){
           if(!result[i][j]){
               count++;
           }
           else{
               break;
           }
       }
           System.out.print(count);
       
    }
}
