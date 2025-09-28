// User function Template for Java
import java.util.*;

class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}

public class StockBuySellMultiple {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] prices3 = {7, 6, 4, 3, 1};

        System.out.println("Prices: " + Arrays.toString(prices1));
        System.out.println("Maximum Profit: " + sol.maximumProfit(prices1));

        System.out.println("\nPrices: " + Arrays.toString(prices2));
        System.out.println("Maximum Profit: " + sol.maximumProfit(prices2));

        System.out.println("\nPrices: " + Arrays.toString(prices3));
        System.out.println("Maximum Profit: " + sol.maximumProfit(prices3));
    }
}
