37.Given an array nums of positive integers of size N. Find all distinct digits present in nums.
 
Example :

Input: nums = [131, 11, 48]
Output: 1 3 4 8
Explanation: 1, 3, 4, and 8 are only distinct digits that can be extracted from the numbers of the array.

Solution:

import java.util.ArrayList;
import java.util.List;

public class DistinctDigits {

    public static void main(String[] args) {
        int[] nums = {131, 11, 48};
        List<Integer> distinctDigits = findDistinctDigits(nums);
        
      
        for (int digit : distinctDigits) {
            System.out.print(digit + " ");
        }
    }
    
    public static List<Integer> findDistinctDigits(int[] nums) {
        boolean[] digitPresent = new boolean[10]; 
        
       
        for (int num : nums) {
            while (num > 0) {
                int digit = num % 10; // Extract the last digit
                digitPresent[digit] = true; // Mark the digit as present
                num /= 10; // Remove the last digit
            }
        }
        
      
        List<Integer> distinctDigits = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (digitPresent[i]) {
                distinctDigits.add(i);
            }
        }
        
        return distinctDigits;
    }
}
