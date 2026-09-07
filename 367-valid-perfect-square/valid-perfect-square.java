class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int i=0;
        int val = num/2;
        while(i<=val){
            if(i*i==num){
                return true;
            }
            i++;
        }
        return false;
    }
}