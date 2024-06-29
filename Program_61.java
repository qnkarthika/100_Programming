61.Special Array I
An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.

Example 1:
Input: nums = [1]
Output: true

Solution;

class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==0 || nums.length==1) return true;
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]%2==0 && nums[i+1]%2==0) || (nums[i]%2!=0 && nums[i+1]%2!=0)){
                return false;
            }
        }
        return true;
    }
}
