class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n  = nums.length;
        long a[] = new long[n];
        for(int i=0; i<n; i++){
            long max = Long.MIN_VALUE, min = Long.MAX_VALUE;
            for(int j=0; j<=i; j++){
                max = Math.max(max,nums[j]);
            }
            for(int j=i; j<n; j++){
                min = Math.min(min,nums[j]);
            }
            a[i] = max-min;
        }
        for(int i=0; i<n; i++){
            if(a[i]<=k){
                return i;
            }
        }
        return -1;
    }
}