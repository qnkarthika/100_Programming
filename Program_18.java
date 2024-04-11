18. Find the given number is Power of Four or not

import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean flag = true;
        int copy = n;
        while (n > 1) {
            if (n % 4 != 0) {
                flag = false;
                break;
            }
            n = n / 4;
        }
        if (n == 1 && flag) {
            System.out.println("Yes, " + copy + " is a power of 4");
        } else {
            System.out.println("No, " + copy + " is not a power of 4");
        }
    }
}
