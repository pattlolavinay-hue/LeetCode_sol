class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int c = 0, i = 0;
        while(i<n){
            if(s.charAt(i)=='b') break;
            i++;
        }
        while(i<n){
            if(s.charAt(i)=='a') return false;
            i++;
        }
        return true;
    }
}