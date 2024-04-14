24. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int current=0;
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            current+=nums[i];
            maxValue=Math.max(current,maxValue);
            if(current<0) current=0;
        }
        return maxValue;
    }
}
