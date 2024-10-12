package eric.leetcode.arraystring;


public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            min = Math.min(min, price);
            maxProfit = Math.max(maxProfit, price - min);
        }
        return maxProfit;
    }
}
