class Solution {
    public long maxDifference(int[] nums) {
        int n = nums.length;
        long[] dp = new long[n+1];
        for(int i=n-1; i>=0; i--){
            long v = nums[i];
            long o = (v%3==0) ? v-dp[i+1] : v+dp[i+1];
            long o1 = Long.MIN_VALUE;
            if(i+1<n){
                long v1 = (long)nums[i] + nums[i+1];
                o1 = (v1 % 3 == 0)? v1-dp[i+2] : v1 + dp[i+2];
            }
            dp[i] = Math.max(o,o1);
        }
        return dp[0];
    }
}