class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int pointer1;
        int pointer2;
        for (int i = 0; i < nums.length; i++) {
            pointer1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                pointer2 = nums[j];
                 if (pointer1 + pointer2 == target)
                    return new int[] {i, j};
                
            }  
        }
        return new int[] {-1, -1};
    }
}
