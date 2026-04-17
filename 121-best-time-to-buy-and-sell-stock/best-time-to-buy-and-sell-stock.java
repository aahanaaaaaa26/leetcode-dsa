class Solution {
    public int maxProfit(int[] prices) {

        int profit=0;
        int n = prices.length;
        int min_price = prices[0];
        for(int i=0; i<n; i++){
            min_price = Math.min(min_price,prices[i]);  //cheapest buy
            profit = Math.max(profit,prices[i]-min_price);   //best sell
        }
        return profit;
    }
    }