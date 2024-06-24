44. In a toy shop there are a number of toys presented with several various – priced toys in a specific order. You have a limited budget and would like to select the greatest number of
consecutive toys that fit within the budget. Given prices of the toys and your budget, what is the maximum number of toys that can be purchased for your child?

Example:

prices=[1,4,5,3,2,1,6]

money=6

All sub arrays that sum to less than or equal to 6 .

Solution:

public class ToyShop {

    public static void main(String[] args) {
        int[] prices = {1, 4, 5, 3, 2, 1, 6};
        int money = 6;
        int maxToys = maxConsecutiveToys(prices, money);
        System.out.println("The maximum number of consecutive toys that can be purchased is: " + maxToys);
    }

    public static int maxConsecutiveToys(int[] prices, int money) {
        int maxToys = 0;
        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < prices.length; end++) {
            currentSum += prices[end];

           
            while (currentSum > money) {
                currentSum -= prices[start];
                start++;
            }

   
            int currentToys = end - start + 1;
   
            if (currentToys > maxToys) {
                maxToys = currentToys;
            }
        }

        return maxToys;
    }
}
