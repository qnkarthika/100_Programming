7. Finding the missing element from 1 to n

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) { 
            arr[i] = s.nextInt();
        }
        int sumOfNatural = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Missing element from 1 to n is " + (sumOfNatural - sum));
    }
}
