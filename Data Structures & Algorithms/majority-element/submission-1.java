class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > maxCount){
                res = nums[i];
                maxCount = map.get(nums[i]);

            }


        }
        return res;
    }
}

