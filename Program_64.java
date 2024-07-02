64. Harshad Number
An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.

Example 1:

Input: x = 18
Output: 9

Solution:

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int copy=x;
        while(copy>0){
            int rem=copy%10;
            sum+=rem;
            copy/=10;
        }
        if(x%sum==0) return sum;
        else return -1;
    }
}
