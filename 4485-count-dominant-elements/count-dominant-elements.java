class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        int d = 0;
        if(n==1){
            return 1;
        }
        if(n==2){
            if(nums[0]>=nums[1]) d++;
            if(nums[1]>=nums[0]) d++;
            return d;
        }
        for(int i=1; i<n-1; i++){
            int avg = nums[i-1]+nums[i+1];
            if(2L*nums[i]>=(long)avg) d++;
        }
        if(nums[0]>=nums[1]) d++;
        if(nums[n-1] >= nums[n-2]) d++;
        return d;
    }
}