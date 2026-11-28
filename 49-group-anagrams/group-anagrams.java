class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        int n = strs.length;
        for(int i=0; i<n; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)).add(strs[i]);
            }else{
                List<String> lst = new ArrayList<>();
                lst.add(strs[i]);
                hm.put(s,lst);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String key : hm.keySet()){
            res.add(hm.get(key));
        }
        return res;
    }
}