class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(0, new ArrayList<>(), nums);
        return res;
    }
    private void dfs(int i, List<Integer> sub, int[] nums){
        if (i == nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[i]);
        dfs(i + 1, sub, nums);
        sub.remove(sub.size()- 1);
        while (i + 1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
        dfs(i + 1, sub, nums);
    }
}
