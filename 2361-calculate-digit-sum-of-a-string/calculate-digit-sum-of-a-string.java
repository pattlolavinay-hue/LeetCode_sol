class Solution {
    public String digitSum(String s, int k) {
        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb1 = new StringBuffer();
        int l=k;
        while(sb.length() > k){
            int i=0;
            while(i<sb.length()){
                StringBuffer dp = new StringBuffer();
                int cnt = 0;
                while(i<sb.length() && cnt < k){
                    dp.append(sb.charAt(i));
                    i++;
                    cnt++;
                }
                int j=0, n=0;
                while(j<dp.length()){
                    n += dp.charAt(j)-'0';
                    j++;
                }
                sb1.append(Integer.toString(n));
            }
            sb = new StringBuffer(sb1);
            sb1.setLength(0);
        }
        return sb.toString();
    }
}