// User function Template for Java
import java.util.*;

class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        if (n == 0) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}

public class StockBuySellOne {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        // int[] prices2 = {7, 6, 4, 3, 1};
        // int[] prices3 = {2, 4, 1};

        System.out.println("Prices: " + Arrays.toString(prices1));
        System.out.println("Max Profit (One Transaction): " + sol.maximumProfit(prices1));

        // System.out.println("\nPrices: " + Arrays.toString(prices2));
        // System.out.println("Max Profit (One Transaction): " + sol.maximumProfit(prices2));

        // System.out.println("\nPrices: " + Arrays.toString(prices3));
        // System.out.println("Max Profit (One Transaction): " + sol.maximumProfit(prices3));
    }
}
