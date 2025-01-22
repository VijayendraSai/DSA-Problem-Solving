class Solution {
    public int maxProfit(int[] prices) {
        int net_profit = 0;
        int buy = prices[0];
        for(int i=1; i<prices.length; i++) {
            int profit = prices[i] - buy;
            if(profit < 0) {
                buy = prices[i];
            }
            if(profit > net_profit) {
                net_profit = profit;
            }
        }
        return net_profit;
    }
}