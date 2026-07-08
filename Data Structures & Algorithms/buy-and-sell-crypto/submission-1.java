class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int minp=Integer.MAX_VALUE;
        int maxp=0;
        
        for(int i=0;i<n;i++)
        {
          if (prices[i] < minp) {
              minp = prices[i];
          }
          int profit = prices[i] - minp;
          if (profit > maxp) {
              maxp = profit;
          }
        }

        return maxp;
    }
}