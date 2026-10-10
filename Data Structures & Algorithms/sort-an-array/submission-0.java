class Solution {
    public int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        if(l >= r){
            return nums;
        }
        int m = l + (r - l)/2;
        return mergeSort(nums,l,m,r);
   
    }
    private int[] mergeSort(int[] nums, int l, int m,  int r){
        if(l >= r){
            return nums;
        }
        mergeSort(nums, l,l + (m-l)/2,m);
        mergeSort(nums,m+1,m+1 + (r - (m+1))/ 2, r);
        int[] temp = new int[r-l+1];
        int i = l;
        int j = m+1;
        int k = 0;
        while(i <= m && j <= r){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i <= m){
            temp[k] = nums[i];
            i++;
            k++;
        }
        while(j <= r){
            temp[k] = nums[j];
            j++;
            k++;
        }
        for(int a = 0; a < temp.length; a++){
            nums[l + a] = temp[a];
        }
        return nums;
    }
}

