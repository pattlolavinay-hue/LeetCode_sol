class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        int n = s1.length();
        List<List<String>> lst = new ArrayList<>();
        int i=0;
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        while(i<n){
            if(s1.charAt(i)!=s2.charAt(i)){
                sb1.append(s1.charAt(i));
                sb2.append(s2.charAt(i));
            }else{
                if(sb1.length()!=0){
                    List<String> st = new ArrayList<>();
                    if(i==n-1 && lst.isEmpty()){
                        st.add(sb1.toString());
                        st.add(sb2.toString());
                        lst.add(st);
                    }else{
                        st.add(sb1.toString());
                        st.add(sb2.toString());
                        lst.add(st);
                    }
                }
                sb1.setLength(0);
                sb2.setLength(0);
            }
            i++;
        }
        if(sb1.length()!=0){
            List<String> st = new ArrayList<>();
            st.add(sb1.toString());
            st.add(sb2.toString());
            lst.add(st);
        }
        return lst;
    }
}