class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length();
        int i=0, j=0;
        long c=0;
        while(j<n){
            if(j>=2 && s.charAt(j-2)=='a' && s.charAt(j-1)=='b' && s.charAt(j)=='c'){
                i = j-1;
            }
            c += j-i+1;
            j++;
        }
        return c;
    }
}