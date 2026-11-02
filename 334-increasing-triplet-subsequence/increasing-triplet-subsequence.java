class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE;
        if(n<=2) return false;
        for(int i : nums){
            if(i <= f){
                f = i;
            }else if(i <= s){
                s = i;
            }else{
                return true;
            }
        }
        return false;
    }
}