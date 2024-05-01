35. Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Solution

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String result=strs[0];
        for(int i=0;i<result.length();i++){
            char current=result.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length()|| strs[j].charAt(i) !=current){
                    return result.substring(0,i);
                }
            }
        }
        return result;
    }
}
  
