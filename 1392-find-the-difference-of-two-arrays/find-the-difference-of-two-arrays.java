class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> lst1 = new ArrayList<>();
        List<List<Integer>> fnl = new ArrayList<>();
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            if(hs.containsKey(nums2[i])){
                hs.put(nums2[i],hs.get(nums2[i])+1);
            }else{
                hs.put(nums2[i],1);
            }
        }
        
        HashMap<Integer,Integer> hs1 = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            if(hs1.containsKey(nums1[i])){
                hs1.put(nums1[i],hs1.get(nums1[i])+1);
            }else{
                hs1.put(nums1[i],1);
            }
        }

        for(int key : hs1.keySet()){
            if(!hs.containsKey(key)){
                lst1.add(key);
            }
        }
        fnl.add(lst1);
        lst1 = new ArrayList<>();

        for(int key : hs.keySet()){
            if(!hs1.containsKey(key)){
                lst1.add(key);
            }
        }
        fnl.add(lst1);

        return fnl;
    }
}