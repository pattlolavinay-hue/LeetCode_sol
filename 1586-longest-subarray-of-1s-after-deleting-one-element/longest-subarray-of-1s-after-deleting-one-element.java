class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, n = nums.length;
        int i=0, z=0;
        for(int j=0; j<n; j++){
            if(nums[j]==0){
                z++;
            }
            while(z>1){
                if(nums[i]==0){
                    z--;
                }
                i++;
            }
            max = Math.max(max,j-i);
        }
        return max;
    }
}