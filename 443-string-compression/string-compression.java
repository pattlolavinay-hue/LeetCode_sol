class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuffer sb = new StringBuffer();
        if(n==1){
            return n;
        }
        char ch = chars[0];
        int cnt = 1;
        for(int i=1; i<n; i++){
            if(chars[i]!=ch){
                if(cnt > 1){
                    sb.append(ch);
                    sb.append(Integer.toString(cnt));
                }else{
                    sb.append(ch);
                }
                cnt = 1;
                ch = chars[i];
            }else{
                cnt++;
            }
        }
        sb.append(ch);
        if(cnt>1){
            sb.append(Integer.toString(cnt));
        }
        for(int i=0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}