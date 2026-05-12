class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, target, 0, new ArrayList<>(), 0);
        return res;
        
    }
    private void dfs (int[] nums, int target, int i, List<Integer> curr, int total){
        if(total == target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if (total > target || i == nums.length){
            return;
        }
 
        curr.add(nums[i]);
        dfs(nums, target, i+1, curr, total + nums[i]);
        curr.remove(curr.size()-1);

        while (i + 1 < nums.length  && nums[i] == nums[i + 1] ){
            i++;
        }
        dfs(nums, target, i+1, curr, total);
    }
}
