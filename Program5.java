5.Maximum Element in an Array

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Size of an array: ");
        int n = s.nextInt();
        System.out.print("Elements in Array: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Number in an Array: " + max);
    }
}
