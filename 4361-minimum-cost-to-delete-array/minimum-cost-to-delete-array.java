class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;
        long c = (long) nums[0]+nums[n-1];
        long ns = 0;
        int nc = 0;
        long mn = Long.MIN_VALUE, mp = Long.MAX_VALUE;
        for(int i=1; i<n-1; i++){
            if(nums[i]<0){
                ns += nums[i];
                nc++;
                if(nums[i]>mn) mn = nums[i];
            }else{
                if(nums[i] < mp) mp = nums[i];
            }
        }
        if(nc%2 != 0){
            if(mp != Long.MAX_VALUE && mn+mp < 0) ns += mp;
            else ns -= mn;
        }
        return c + ns;
    }
}