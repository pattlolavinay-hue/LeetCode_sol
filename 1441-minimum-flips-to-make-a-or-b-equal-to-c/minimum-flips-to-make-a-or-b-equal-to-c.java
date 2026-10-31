class Solution {
    public static boolean isSetBit(int x){
        if((x & 1)==1) return true;
        else return false;
    }
    public int minFlips(int a, int b, int c) {
        if((a | b) == c){
            return 0;
        }
        int cnt = 0;
        while(c!=0){
            if(isSetBit(c)){
                if(!(isSetBit(a)||isSetBit(b))){
                    cnt++;
                }
            }else{
                if(isSetBit(a)) cnt++;
                if(isSetBit(b)) cnt++;
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        while(a!=0){
            if(isSetBit(a))
                cnt++;
            a >>= 1;
        }
        while(b!=0){
            if(isSetBit(b))
                cnt++;
            b >>= 1;
        }
        return cnt;
    }
}