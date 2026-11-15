class Solution {
    public int countConsistent(int[] nums) {
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            int k = nums[i], min = Integer.MAX_VALUE;
            min = Math.min(min,nums[i]);
            if(k==min) cnt++;
            for(int j=i+1; j<nums.length; j++){
                k = k & nums[j];
                min = Math.min(min,nums[j]);
                if(k==min) cnt++;
            }
        }
        return cnt;
    }
}