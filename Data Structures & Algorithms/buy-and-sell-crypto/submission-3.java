class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = l + 1;
        int max = 0;
        while (r<prices.length){
            int profit = prices[r] - prices[l];
            if (prices[l] < prices[r]){
                max = Math.max(max, profit);  
            }
            else{
                l = r;
            }
           r++;  
        }
        return max; 
    }
}

/**
[10,1,5,6,7,1]
    l
    r

**/