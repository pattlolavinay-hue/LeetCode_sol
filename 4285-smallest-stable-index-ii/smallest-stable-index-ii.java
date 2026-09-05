class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        long[] min = new long[n];
        long m1 = nums[0];
        long m2 = nums[n-1];
        for(int i=n-1; i>=0; i--){
            long m = nums[i];
            if(m<m2){
                m2 = m;
            }
            min[i] = m2;
        }
        for(int i=0; i<n; i++){
            long m = nums[i];
            if(m>m1){
                m1 = m;
            }
            if(m1-min[i] <= k){
                return i;
            }
        }
        return -1;
    }
}