Grid Path
  
Given a grid. Each cell of the grid contains a single integer value. These values are described by 2D integer array a with N rows and 2 columns, where a[i][j] is the value in the cell located in row i,
column j. Standing in (i; j), the player can move to any cell of the next row (i+1; j2) under the condition that a[i+1][j2] > a[i][j]. In other words, the value in the next cell of the player's path should be 
strictly greater than the value in the current cell of the player's path. The player can't make any moves if he's already in the last row.If the player starts in any cell of the first row (either (1; 1) or
(1; 2)), what is the maximum possible total sum of values in all cells he can visit on his path?
Print the answer modulo 10^9+7.
  
Sample cases:

2
1 2
3 4

6 Optimal path is (1;2)->(2;2).
The answer is 2+4=6.


Solution:

import java.util.Scanner;

public class GridPath {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            a[i][0] = s.nextInt();
            a[i][1] = s.nextInt();
        }

        long sum = 0;
        int flag = 0; 
        int i = 0; 
        
        if (a[0][0] > a[0][1]) {
            sum += a[0][0];
            flag = 0;
        } else {
            sum += a[0][1];
            flag = 1;
        }
        

        while (i < n - 1) {
            if (flag == 0) { 
                if (a[i + 1][0] > a[i][0] && a[i + 1][0] >= a[i + 1][1]) {
                    sum += a[i + 1][0];
                    flag = 0;
                } else if (a[i + 1][1] > a[i][0]) {
                    sum += a[i + 1][1];
                    flag = 1;
                } else {
                    break;
                }
            } else { 
                if (a[i + 1][1] > a[i][1] && a[i + 1][1] >= a[i + 1][0]) {
                    sum += a[i + 1][1];
                    flag = 1;
                } else if (a[i + 1][0] > a[i][1]) {
                    sum += a[i + 1][0];
                    flag = 0;
                } else {
                    break;
                }
            }
            i++;
        }

      
        System.out.println(sum % MOD);

        s.close();
    }
}
