class Solution {
    public int maxProfit(int[] prices) {
        int l = 0 , r = 1;
        int minprice = prices[l];
        int profit = 0;
        while (r<prices.length){
            if(prices[l]>prices[r]){
                l=r;
                minprice = prices[l];
            }
            profit = Math.max(profit,prices[r]-minprice);
            r++;
        }
        return profit;
        
        
    }
}
