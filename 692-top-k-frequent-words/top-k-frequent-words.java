class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(words[i])){
                hm.put(words[i],hm.get(words[i])+1);
            }else{
                hm.put(words[i],1);
            }
        }
        System.out.println(hm);
        List<String> lst = new ArrayList<>();
        while(k>0){
            String s = "";
            int max = 0;
            for(String key : hm.keySet()){
                if(hm.get(key)>max || (hm.get(key)==max && s.compareTo(key)>0)){
                    s = key;
                    max = hm.get(key);
                }
            }
            lst.add(s);
            hm.remove(s);
            k--;
        }
        return lst;
    }
}