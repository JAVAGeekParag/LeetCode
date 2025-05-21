class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int result = 0;
        for(int i = 0;i<n;i++)
        {
            
            result = Math.max(result,prices[i] - mini);
            mini = Math.min(mini,prices[i]);
        }
        return result;
    }
}