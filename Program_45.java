45.Stepping Numbers are numbers in which the adjacent digits differ by 1. For example, 123, 545, and 98 are stepping numbers, while 321, 444, and 75 are not. 
The task is to find all stepping numbers in a given range [n, m].

For example
Range: [100, 500]
Stepping Numbers: 101, 121, 123, 210, 212, 232, 234, 321, 323, 343, 345
Explanation: The stepping numbers between 100 and 500 are 101, 121, 123, 210, 212, 232, 234, 321, 323, 343, and 345. These numbers have adjacent digits that differ by 1.
  
Solution:

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<Integer> steppingNumbers = new ArrayList<>();
        
        for (int i = n; i <= m; i++) {
            if (isSteppingNumber(i)) {
                steppingNumbers.add(i);
            }
        }
        
        for (int num : steppingNumbers) {
            System.out.print(num + " ");
        }
    }

    public static boolean isSteppingNumber(int num) {
        int rem1 = num % 10;
        num = num / 10;
        
        while (num > 0) {
            int rem2 = num % 10;
            if (Math.abs(rem1 - rem2) != 1) {
                return false;
            }
            rem1 = rem2;
            num = num / 10;
        }
        
        return true;
    }
}
