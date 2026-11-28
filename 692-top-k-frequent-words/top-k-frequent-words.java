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
            for(int i=0; i<n; i++){
                if(hm.containsKey(words[i])){
                    if(hm.get(words[i])>max || (hm.get(words[i])==max && s.compareTo(words[i])>0)){
                        s = words[i];
                        max = hm.get(words[i]);
                    }
                }
            }
            lst.add(s);
            hm.remove(s);
            k--;
        }
        return lst;
    }
}