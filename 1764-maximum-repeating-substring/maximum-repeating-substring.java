class Solution {
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        int c=0, i=0, f=0;
        while(i<n){
            f=0;
            int k=i;
            while(k+m<=n && sequence.substring(k,k+m).equals(word)){
                f++;
                k = k+m;
            }
            i++;
            c = Math.max(c,f);
        }
        return c;
    }
}