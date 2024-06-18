41. Given a string str and the task is to count palindrome words present in the string str.

Examples: 

Input : Madam Arora teaches malayalam
Output : 3
The string contains three palindrome words (i.e.,
Madam, Arora, malayalam) so the count is three.

Input : Nitin speaks malayalam
Output : 2
The string contains two palindrome words (i.e.,
Nitin, malayalam) so the count is two.

Solution:

import java.util.*;

class Main {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        str = str.toLowerCase();
        int i = 0, j = n - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int countPalindrome(String str) {
        int count = 0;
        str = str + " ";
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                if (!word.isEmpty() && isPalindrome(word)) {
                    count++;
                }
                word = "";
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine();
        System.out.println("Count: " + countPalindrome(str));
        s.close();
    }
}
