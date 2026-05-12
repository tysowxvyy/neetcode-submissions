class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = people.length-1;

        while (l <= r){
            int lVal = people[l];
            int rVal = people[r];
            int sum = lVal + rVal;
            if (sum <= limit){
                r--;
                l++;
                count++;
            }
            else if (sum > limit){
                r--;
                count++;
            }
        }
        return count;

    }
}



/**
1. we need to check if nums[l] ==  limit or nums[r]
    if so we increment count by 1.
2: if not we check if there sum is <= limit
    if so we increment count and increment / decrement both values 


**/