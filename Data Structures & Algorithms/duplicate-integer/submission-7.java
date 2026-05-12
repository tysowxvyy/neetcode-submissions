/**
Input: nums = [1, 2, 3, 3]

1: loop through array

2: store it in our set 

3: check if set contains element 
     return true

return fale

**/


class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}