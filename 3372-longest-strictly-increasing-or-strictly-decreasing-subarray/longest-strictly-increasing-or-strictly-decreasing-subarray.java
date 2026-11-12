class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int l = 1, n = nums.length;
        int i=0;
        while(i<n){
            for(int j=i+1; j<n; j++){
                if(nums[j-1]>nums[j] && j==n-1){
                    l = Math.max(l,j-i+1);
                }
                if(nums[j-1]>nums[j]) continue;
                else{
                    l = Math.max(l,j-i);
                    break;
                }
            }
            i++;
        }
        i=0;
        while(i<n){
            for(int j=i+1; j<n; j++){
                if(nums[j-1]<nums[j] && j==n-1){
                    l = Math.max(l,j-i+1);
                }
                if(nums[j-1]<nums[j]) continue;
                else{
                    l = Math.max(l,j-i);
                    break;
                }
            }
            i++;
        }
        return l;
    }
}