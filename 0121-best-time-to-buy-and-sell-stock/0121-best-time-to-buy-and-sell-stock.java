class Solution {
    public int maxProfit(int[] prices) {
        int k=0;
        int profit=0;
        for(int i=1; i< prices.length; i++)
        {
            if(prices[i] < prices[k])
            {
                k = i;
            }
            else 
            {
                int cp = prices[i] - prices[k];
                profit = Math.max(cp, profit);
            }
        }
        return profit;
    }
}