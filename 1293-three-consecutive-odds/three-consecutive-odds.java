class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int c = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                c++;
            }else{
                c = 0;
            }
            if(c==3) return true;
        }
        return false;
    }
}