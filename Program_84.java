Longest Increasing Subsequence

Given an integer array nums, return the length of the longest strictly increasing subsequence.


Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
  
Example 2:
Input: nums = [0,1,0,3,2,3]
Output: 4
  
Example 3:
Input: nums = [7,7,7,7,7,7,7]
Output: 1

Solution:

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> li=new ArrayList<>(); 
        for(int num:nums){
            int left=0,right=li.size();
            while(left<right){
                int mid=(left+right)/2;
                if(li.get(mid)<num){
                    left=mid+1;
                }
                else {
                    right=mid;
                }
            }
            if(left==li.size()){
                li.add(num);
            }
            else{
                li.set(left,num);
            }
        }
        return li.size();
    }
}
