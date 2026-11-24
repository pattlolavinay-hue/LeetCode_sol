class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0; i<nums.length; i++){
            ts.add(nums[i]);
        }
        int max = 1,c = 0, k = 0;
        for(int i : ts){
            if(c==0){
                k = i;
                c++;
            }else{
                if(i==k+1){
                    c++;
                    max = Math.max(c,max);
                }else{
                    c = 1;
                }
                k = i;
            }
        }
        return max;
    }
}