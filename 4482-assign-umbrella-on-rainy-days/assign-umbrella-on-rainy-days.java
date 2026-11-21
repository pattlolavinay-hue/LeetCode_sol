class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;
        int a = 0, b = 0;
        String[] st = new String[n];
        for(int i=0; i<n-1; i++){
            if(rain[i]==1 && rain[i+1]==1){
                if(a<=b){
                    st[i] = "Alice";
                    a++;
                }else{
                    st[i] = "Bob";
                    b++;
                }
            }else if(rain[i]==1){
                st[i] = "Bob";
                b++;
            }else{
                st[i] = "None";
            }
        }
        if(rain[n-1]==1){
            st[n-1] = "Bob";
        }else{
            st[n-1] = "None";
        }
        return st;
    }
}