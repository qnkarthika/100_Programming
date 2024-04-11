15. Transpose of a matrix

import java.util.*;
class Main {
    public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
           System.out.print("Enter number of rows and columns: ");
           int n=s.nextInt();
           int m=s.nextInt();
           int arr[][]=new int[n][m];
           int temp[][]=new int[m][n];
           System.out.println("Enter the array elements:");
           for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   arr[i][j]=s.nextInt();
               }
           }
           for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   temp[j][i]=arr[i][j];
               }
           }
            System.out.println("Transpose of the given matrix:");
            for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                   System.out.print(temp[i][j]+" ");
               }
               System.out.println();
           }
      }
}
