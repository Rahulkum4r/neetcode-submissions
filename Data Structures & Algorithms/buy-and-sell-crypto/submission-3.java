class Solution{
    public int maxProfit(int[]prices){

//      optimal approach
        int n = prices.length;
        int maxProfit = 0;
        int mini = prices[0];

        for(int i = 1 ; i<n ; i++){

            mini = Math.min(mini , prices[i]);

            int currProfit = prices[i]-mini;
            maxProfit = Math.max(maxProfit , currProfit);
        }

        return maxProfit;
    }
}