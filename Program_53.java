53.Minimum Average of Smallest and Largest Elements
You have an array of floating point numbers averages which is initially empty. You are given an array nums of n integers where n is even.
You repeat the following procedure n / 2 times:
Remove the smallest element, minElement, and the largest element maxElement, from nums.
Add (minElement + maxElement) / 2 to averages.
Return the minimum element in averages.

Example 1:

Input: nums = [7,8,3,4,15,13,4,1]
Output: 5.5

Solution:

import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        double[] averages = new double[n / 2];
        for (int i = 0; i < n / 2; i++) {
            double minElement = nums[i];
            double maxElement = nums[n - 1 - i];
            averages[i] = (minElement + maxElement) / 2.0;
        }

        double minAverage = Double.MAX_VALUE;
        for (double average : averages) {
            if (average < minAverage) {
                minAverage = average;
            }
        }

        return minAverage;
    }

}
