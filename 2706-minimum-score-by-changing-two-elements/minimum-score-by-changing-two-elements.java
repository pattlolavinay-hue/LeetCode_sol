class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = nums[n-1]-nums[2]; // change 1 & 2 or n-3 & n-2 positions
        int b = nums[n-2]-nums[1]; // change 1 & 3 or n-1 & n-3 positions
        int c = nums[n-3]-nums[0]; // change 2 & 3 or n-2 & n-1 positions
        return Math.min(a,Math.min(b,c));
    }
}