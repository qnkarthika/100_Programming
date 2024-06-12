36.Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, 
rest portion contains even numbers sorted in ascending order.

Example:

Input: N = 7
Arr = {1, 2, 3, 5, 4, 7, 10}
Output: 7 5 3 1 2 4 10
Explanation:
Array elements 7 5 3 1 are odd and sorted in descending order, whereas 2 4 10 are even numbers and sorted in ascending order.


Solution:

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Separate odd and even numbers
        int i = 0, j = 0;
        while (j < n) {
            if (arr[j] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        // Sort the odd numbers in descending order
        Arrays.sort(arr, 0, i);
        reverse(arr, 0, i - 1);

        // Sort the even numbers in ascending order
        Arrays.sort(arr, i, n);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
