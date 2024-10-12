package eric.leetcode.arraystring;


public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            totalProfit += Math.max(0, prices[i + 1] - prices[i]);
        }
        return totalProfit;
    }
}
