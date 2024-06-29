58. Minimum Number of Chairs in a Waiting Room
You are given a string s. Simulate events at each second i:
If s[i] == 'E', a person enters the waiting room and takes one of the chairs in it.
If s[i] == 'L', a person leaves the waiting room, freeing up a chair.
Return the minimum number of chairs needed so that a chair is available for every person who enters the waiting room given that it is initially empty.

Example 1:

Input: s = "EEEEEEE"
Output: 7

Explanation:
After each second, a person enters the waiting room and no person leaves it. Therefore, a minimum of 7 chairs is needed.

Solution:

  class Solution {
    public int minimumChairs(String s) {
        int current=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                current++;
                if(current>max){
                    max=current;
                }
            }
            else current--;
        }
        return max;
    }
}
