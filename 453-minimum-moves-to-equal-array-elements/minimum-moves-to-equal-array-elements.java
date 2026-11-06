class Solution {
    public int minMoves(int[] nums) {
        int c = 0;
        long min = Long.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            min = Math.min(min,nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            c += (int)(nums[i]-min);
        }
        return c;
    }
}