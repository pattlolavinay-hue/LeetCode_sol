class Solution {
    public int minimumDeletions(int[] nums) {
        int x=0, y=0, m1 = nums[0], m2 = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){
            if(nums[i]>m1){
                x=i;
                m1 = nums[i];
            }
            if(nums[i]<m2){
                y = i;
                m2 = nums[i];
            }
        }
        int c1 = 0, c2 = 0, f = 0;
        for(int i=0; i<n; i++){
            if(f==2){
                break;
            }
            if(nums[i]==m1){
                f++;
            }if(nums[i] == m2){
                f++;
            }
            c1++;
        }
        f=0;
        for(int i=n-1; i>=0; i--){
            if(f==2){
                break;
            }
            if(nums[i]==m1){
                f++;
            }if(nums[i] == m2){
                f++;
            }
            c2++;
        }
        int k = n/2, c=0;
        if(x<=k && y<=k){
            c = Math.max(x,y)+1;
        }else if(x>k && y>k){
            c = n-Math.min(x,y);
        }else{
            if(x<k && y>=k){
                c = x+1+n-y;
            }else{
                c = y+1+n-x;
            }
        }
        return Math.min(c,Math.min(c1,c2));
    }
}