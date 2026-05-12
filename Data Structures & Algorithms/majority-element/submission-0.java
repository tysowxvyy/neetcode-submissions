class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int maxCount = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums){
            count.put(num, count.getOrDefault(num, 0)+1);
            if (count.get(num) > maxCount){
                res = num;
                maxCount = count.get(num);
            }
        }  
        return res;
    }
}