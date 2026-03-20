package arrays;

import java.util.Arrays;

// ---------------------------------------------------------
// Problem: LC 121 - Best Time to Buy and Sell Stock
// Approach: Track Minimum Price
//
// Time Complexity: O(n)
//    - Single pass through prices array
//
// Space Complexity: O(1)
//    - No extra space used
// ---------------------------------------------------------

public class LC_121_Best_Time_to_Buy_and_Sell_Stock {

    static class Solution {
        public int maxProfit(int[] prices) {

            int min = Integer.MAX_VALUE;
            int profit = 0;

            for (int price : prices) {

                if (price < min) {
                    min = price;
                }
                else {
                    profit = Math.max(profit, price - min);
                }
            }

            return profit;
        }
    }

    public static void main(String[] args) {

        // 🔹 Static Test Case
        int[] prices = {7, 1, 5, 3, 6, 4};

        Solution obj = new Solution();
        int result = obj.maxProfit(prices);

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Maximum Profit: " + result);
    }
}