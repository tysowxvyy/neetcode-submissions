class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for (int num : nums){
            set.add(num);
        }
        for (int num : set){
            if (!set.contains(num - 1)){
                int currNum = num;
                int currStreak = 1;

                while (set.contains(currNum + 1)){
                    currNum++;
                    currStreak++;
                }
                longest = Math.max(longest, currStreak);
            }
        }
        return longest;
        
    }
}
