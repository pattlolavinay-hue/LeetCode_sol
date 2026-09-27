class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        HashMap<String,Integer> hm = new HashMap<>();
        int b=0, mx=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                b++;
            }else{
                int k = Math.min(nums[i],nums[i-1]);
                int j = Math.max(nums[i],nums[i-1]);
                String ky = k +","+ j;
                hm.put(ky,hm.getOrDefault(ky,0)+1);
                mx = Math.max(mx,hm.getOrDefault(ky,0));
            }
        }
        return b+mx;
        
    }
}