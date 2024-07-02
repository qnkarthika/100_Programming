62.Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Solution:

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int mul=1;
        int mul1=1;
        boolean flag=false;
        int count=0;
        for(int i=0;i<n;i++){
            mul=mul*nums[i];
            if(nums[i]!=0) {mul1=mul1*nums[i];flag=true;}
            if(nums[i]==0) count++;
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0) {
                if(count>1) nums[i]=mul;
                else if(mul1==1 && flag==false) nums[i]=0;
                else nums[i]=mul1;
            }
            else nums[i]=mul/nums[i];
        }
        return nums;
    }
}
