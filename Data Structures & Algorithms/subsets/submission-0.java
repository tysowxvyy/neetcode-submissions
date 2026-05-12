class Solution {
    List<List<Integer>> list = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        List<Integer> current = new ArrayList<>();
        backTrack(0, current);
        return list;


        
    }
    private void backTrack(int index, List<Integer> current){
        if (index == nums.length){
            list.add(new ArrayList<>(current));
            return;

        }
        current.add(nums[index]);
        backTrack(index+1, current);
        current.remove(current.size() - 1);
        backTrack(index+1, current);

    }
}
