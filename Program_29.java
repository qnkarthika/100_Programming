29. Best Time to Buy and Sell Stock

Input: prices = [7,1,5,3,6,4]
Output: 5

  class Solution {
    public int maxProfit(int[] prices) {
       int minimum=prices[0];
       int maxProfit=0;
       for(int i=1;i<prices.length;i++){
              minimum=Math.min(minimum,prices[i]);
              maxProfit=Math.max(maxProfit,prices[i]-minimum);
       }
       return maxProfit;
    }
  }
