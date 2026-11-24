class Solution {
    public static int gcd(int a, int b){
        if(b==0) return a;
        else{
            return gcd(b,a%b);
        }
    }
    public static int lcm(int a, int b){
        if(a==0 || b==0) return 0;
        else{
            return a/gcd(a,b)*b;
        }
    }
    public int maxLength(int[] nums) {
        int n = nums.length, max = 0;
        for(int j=0; j<n; j++){
            int pro = nums[j], a1 = nums[j], a2 = nums[j];
            for(int i=j+1; i<n; i++){
                pro *= nums[i];
                a1 = gcd(nums[i],a1);
                a2 = lcm(a2,nums[i]);
                if(pro == a1*a2){
                    max = Math.max(max,i-j+1);
                }
            }
        }
        return max;
    }
}