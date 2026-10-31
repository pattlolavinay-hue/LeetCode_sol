class Solution {
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        int c = 0, i = 0, j = 0;
        while(j<=n){
            if(i!=0){
                if((i & 1) == 1){
                    c++;
                }
                i = i>>1;
            }
            if(i==0){
                a[j] = c;
                c = 0;
                j++;
                i = j;
            }
        }
        return a;
    }
}