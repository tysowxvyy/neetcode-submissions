class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length){
            int buy = prices[l];
            int sell = prices[r];
            if (buy < sell){
                int profit = sell - buy;
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
