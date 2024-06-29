60.Find the XOR of Numbers Which Appear Twice
You are given an array nums, where each number in the array appears either once or twice.
Return the bitwise XOR of all the numbers that appear twice in the array, or 0 if no number appears twice.

Example 1:
Input: nums = [1,2,1,3]
Output: 1

Solution:

import java.util.HashSet;

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> seenOnce = new HashSet<>();
        HashSet<Integer> seenTwice = new HashSet<>();
        
        for (int num : nums) {
            if (seenOnce.contains(num)) {
                seenTwice.add(num);
            } else {
                seenOnce.add(num);
            }
        }
        
        int result = 0;
        for (int num : seenTwice) {
            result ^= num;
        }
        
        return result;
    }

}
