28. Remove duplicates from sorted array

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int i=0;
        for(int j=2;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+2]=nums[j];
                i++;
            }
        }
        return i+2;
    }
}
