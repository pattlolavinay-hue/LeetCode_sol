class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int mn = Integer.MAX_VALUE, c=0;
        for(int i=0; i<n; i++){
            int sum = nums.get(i);
            c++;
            if(c>=l && c<=r && sum>0){
                mn = Math.min(mn,sum);
            }
            for(int j=i+1; j<n; j++){
                c++;
                sum += nums.get(j);
                if(c>=l && c<=r && sum>0){
                    mn = Math.min(mn,sum);
                }
            }
            c=0;
        }
        if(mn == Integer.MAX_VALUE) return -1;
        return mn;
    }
}