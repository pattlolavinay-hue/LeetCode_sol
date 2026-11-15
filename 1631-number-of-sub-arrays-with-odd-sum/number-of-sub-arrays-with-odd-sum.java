class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int en = 1, od = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum % 2 == 0){
                ans += od;
                en++;
            }else{
                ans += en;
                od++;
            }
            ans = ans % 1000000007;
        }
        return ans;
    }
}