31. Jump Game
  
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

Input: nums = [2,3,1,1,4]
Output: true

  class Solution {
    public boolean canJump(int[] nums) {
        int pos=nums.length-1,prev=nums.length-2;
        while(prev>=0){
            if(nums[prev]>=(pos-prev)){
               pos=prev;
            }
            prev--;
           
        }
        return pos==0;
    }
}
