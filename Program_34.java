34. Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5

Solution

class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
      int index=s.lastIndexOf(' ');
      return s.length()-index-1;
    }
}

