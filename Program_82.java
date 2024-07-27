Bitwise subsequence
  
You have an array A of N integers A1 A2 .. An. Find the longest increasing subsequence Ai1 Ai2 .. Ak (1 <= k <= N) that satisfies the following condition:
For every adjacent pair of numbers of the chosen subsequence Ai[x] and Ai[x+1] (1 < x < k), the expression( Ai[x] & Ai[x+1] ) * 2 < ( Ai[x] | Ai[x+1] ) is true
Note: '&' is the bitwise AND operation, ' | ' is the bit-wise OR operation
  
Input:
The first line contains an integer, N, denoting the number of elements in A.
Each line i of the N subsequent lines (where 0 ≤ i < N) contains an integer describing Ai.
  
Sample cases:

Input:
5
15 6 5 12 1

Output:
2

Solution:

import java.util.Scanner;

public class BitwiseSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        System.out.println(findLongestSubsequence(A, N));
    }
    
    private static int findLongestSubsequence(int[] A, int N) {
        int maxLength = 1;

        for (int i = 0; i < N; i++) {
            int currentLength = 1;
            int lastElement = A[i];
            for (int j = i + 1; j < N; j++) {
                if ((lastElement < A[j]) && ((lastElement & A[j]) * 2 < (lastElement | A[j]))) {
                    currentLength++;
                    lastElement = A[j]; 
                } else {
                    break; 
                }
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        
        return maxLength;
    }
}
