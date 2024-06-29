57.Clear Digits
You are given a string s.Your task is to remove all digits by doing this operation repeatedly:Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.

Example 1:

Input: s = "abc"
Output: "abc"

Solution:

class Solution {
    public String clearDigits(String s) {
        StringBuffer str = new StringBuffer(s);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                str.deleteCharAt(i);  
                if (i > 0) {         
                    str.deleteCharAt(i - 1);  
                    i--;  
                }
                i--;  
            }
        }

        return str.toString();
    }

}
