class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = 0;
        int l = 0;
        int r = 1;

        while (r < prices.length){
            profit = prices[r] - prices[l];
            max = Math.max(max, profit);
            if (prices[l] < prices[r]){
                max = Math.max(max, profit);
            }
            else {
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