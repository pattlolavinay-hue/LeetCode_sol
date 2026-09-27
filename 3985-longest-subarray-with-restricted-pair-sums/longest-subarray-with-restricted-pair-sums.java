class Solution {
    public static boolean hasPairs(int[] frq){
        for(int j=1; j<=500; j++){
            if(frq[j]==0) continue;
            for(int i=1; i<=j/2; i++){
                int k = j-i;
                if(frq[i]==0 || frq[k]==0) continue;
                if(i==k && frq[i]<2) continue;
                return false;
            }
        }
        return true;
    }
    public int maxSubarray(int[] nums) {
        int frq[] = new int[501];
        int l = 0, res = 0;
        for(int i=0; i<nums.length; i++){
            frq[nums[i]]++;
            while(!hasPairs(frq)){
                frq[nums[l]]--;
                l++;
            }
            res = Math.max(res,i-l+1);
        }
        return res;
    }
}