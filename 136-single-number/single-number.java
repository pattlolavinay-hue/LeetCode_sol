class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int temp = 0;
        if(n==1){
            return nums[0];
        }
        else{
        for(int i=0; i<n; i++){
            int c = 0;
            for(int j=0; j<n; j++){
                if(i!=j && nums[i] == nums[j]){
                    c++;
                    break;
                }
            }
            if(c != 1){
                temp = nums[i];
                break;
            }
        }
        return temp;
        }
    }
}