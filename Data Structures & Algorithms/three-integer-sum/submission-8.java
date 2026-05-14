class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            if (nums[i] > 0){
                break;
            }
            int l = i + 1;
            int r = nums.length-1;
            while(l < r){
                int sum = nums[l]+ nums[r] + nums[i];
                if (sum == 0){
                    res.add(Arrays.asList(nums[r], nums[l], nums[i]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
                if (sum > 0){
                    r--;
                }
                else if (sum < 0){
                    l++;
                }
            }

        }
        return res;
        
    }
}
