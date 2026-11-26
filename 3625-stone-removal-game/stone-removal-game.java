class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int a = 0;
        for(int i=10; i>0; i--){
            if(a==0){
                if(n>=i){
                    n -= i;
                }else{
                    return false;
                }
                a = 1;
            }
            else{
                if(n>=i){
                    n -= i;
                }else{
                    return true;
                }
                a = 0;
            }
        }
        return a == 1 ? true : false;
    }
}