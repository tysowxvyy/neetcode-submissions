class Solution {
    public boolean canJump(int[] nums) {
        int lastInd = nums.length-1;
        int n = lastInd;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] + i >= n){
                n = i;
            }
        }
        return n == 0;
    }
}


