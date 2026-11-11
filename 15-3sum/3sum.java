class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            List<Integer> arr = new ArrayList<>();
            int j=i+1, k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    arr.add(nums[i]);                    
                    arr.add(nums[j]);
                    arr.add(nums[k]);

                    j++;
                    k--;

                    lst.add(arr);
                    arr = new ArrayList<>();

                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(k>j && nums[k]==nums[k+1]) k--;

                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return lst;
    }
}