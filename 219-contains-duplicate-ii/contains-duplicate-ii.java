class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Long,ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey((long)nums[i])){
                hm.get((long)nums[i]).add(i);
            }else{
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(i);
                hm.put((long)nums[i],lst);
            }
        }
        for(int i=0; i<n; i++){
            ArrayList<Integer> lst = hm.get((long)nums[i]);
            if(lst.size()>1){
                for(int j=0; j<lst.size()-1; j++){
                    if(Math.abs(lst.get(j)-lst.get(j+1))<=k) return true;
                }
            }
        }
        return false;
    }
}