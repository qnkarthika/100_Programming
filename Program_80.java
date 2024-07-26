Arrange given numbers to form the biggest number

Given an array of strings arr[] of length n, where every string representing a non-negative integers, the task is to arrange them in a manner such that after concatenating them in order, 
it results in the largest possible number. Since the result may be very large, return it as a string.

Example:

Input: n = 5, arr[] = {“3”, “30”, “34”, “5”, “9”}
Output: “9534330”
Explanation: Given numbers are {“3”, “30”, “34”, “5”, “9”}, the arrangement “9534330” gives the largest value.

Solution:

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        
        String[] strNums = new String[n];
        for (int i = 0; i < n; i++) {
            strNums[i] = Integer.toString(nums[i]);
        }
        
       
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String ab = strNums[i] + strNums[j];
                String ba = strNums[j] + strNums[i];
                if (ba.compareTo(ab) > 0) {
                 
                    String temp = strNums[i];
                    strNums[i] = strNums[j];
                    strNums[j] = temp;
                }
            }
        } 
       
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }
        
       
        if (result.charAt(0) == '0') {
            return "0";
        }
        return result.toString();
    }
}
