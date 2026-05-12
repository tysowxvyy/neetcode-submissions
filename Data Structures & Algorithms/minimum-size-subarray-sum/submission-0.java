class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int min = Integer.MAX_VALUE;
        int window = 0;
        int sum = 0;
        while (r < nums.length){
            sum += nums[r];
            if (sum >= target){
                while (sum >= target){
                    window = r - l + 1;
                    sum -= nums[l];
                    l++;
                }
                min = Math.min(min, window);
            }
            r++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
