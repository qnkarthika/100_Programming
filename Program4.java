4.Maximum Number 

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter value1: ");
        int a = s.nextInt();
        System.out.print("Enter value2: ");
        int b = s.nextInt();
        System.out.print("Enter value3: ");
        int c = s.nextInt();

        if (a > b && a > c)
            System.out.print(a + " is maximum");
        else if (b > a && b > c)
            System.out.print(b + " is maximum");
        else if (c > a && c > b)
            System.out.print(c + " is maximum");
        else
            System.out.print("Two or more values are equal and maximum");
    }
}
