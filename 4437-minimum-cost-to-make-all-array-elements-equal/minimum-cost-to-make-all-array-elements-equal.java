class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;
        long ans = Long.MAX_VALUE;
        int i=0;
        while(i<n){
            int j=i;
            while(j<n && nums[j] == nums[i]) j++;
            int l = i, r = j-1;
            if(r > 0 && l < n-1){
                int lt = r-l+1;
                long c = (long)(n-lt)*nums[i];
                if(c < ans) ans = c;
            }
            i = j;
        }
        return ans;
    }
}