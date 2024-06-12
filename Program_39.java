39.Given an array of size N with repeated numbers, You Have to Find the top three repeated numbers. 

Input : arr[] = {2, 4, 3, 2, 3, 4, 5, 5, 3, 2, 2, 5} 
Output : Three largest elements are 2 3 5

Solution:

import java.util.*;

class Main {
    public static void main(String[] args) {
        int a[] = new int[]{2, 4, 3, 2, 3, 4, 5, 5, 3, 2, 2, 5};
        int x = 0, y = 0, z = 0, count = 1;
        Arrays.sort(a);
        int first = a[0], second = a[0], third = a[0];
        int value = 0;

        for (int i = 0, j = 1; j < a.length; j++) {
            value = a[i];
            if (a[i] == a[j]) {
                count++;
            } else {
                if (count > x) {
                    z = y;
                    y = x;
                    x = count;
                    third = second;
                    second = first;
                    first = value;
                } else if (count > y) {
                    z = y;
                    y = count;
                    third = second;
                    second = value;
                } else if (count > z) {
                    z = count;
                    third = value;
                }

                count = 1;
                i = j;
            }
        }

        if (count > x) {
            z = y;
            y = x;
            x = count;
            third = second;
            second = first;
            first = value;
        } else if (count > y) {
            z = y;
            y = count;
            third = second;
            second = value;
        } else if (count > z) {
            z = count;
            third = value;
        }

        System.out.print(first + " " + second + " " + third);
    }
}
