class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int n = queens.length;
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        List<String> st = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringBuffer sb = new StringBuffer();
            for(int j=0; j<2; j++){
                sb.append(Integer.toString(queens[i][j])); 
            }
            st.add(sb.toString());
        }
        int x = king[0], y = king[1];
        for(int i=x-1; i>=0; i--){
            String s = Integer.toString(i)+Integer.toString(y);
            if(st.contains(s)){
                ans.add(i);
                ans.add(y);
                break;
            }
        }
        if(!ans.isEmpty()){
            lst.add(ans);
        }
        ans = new ArrayList<>();

        for(int i=x-1, j=y+1; i>=0 && j<8; i--,j++){
            String s = Integer.toString(i)+Integer.toString(j);
            if(st.contains(s)){
                ans.add(i);
                ans.add(j);
                break;
            }
        }
        if(!ans.isEmpty()){
            lst.add(ans);
        }
        ans = new ArrayList<>();

        for(int j=y+1; j<8; j++){
            String s = Integer.toString(x)+Integer.toString(j);
            if(st.contains(s)){
                ans.add(x);
                ans.add(j);
                break;
            }
        }
        if(!ans.isEmpty()){
            lst.add(ans);
        }
        ans = new ArrayList<>();

        for(int i=x+1, j=y+1; i<8 && j<8; i++,j++){
            String s = Integer.toString(i)+Integer.toString(j);
            if(st.contains(s)){
                ans.add(i);
                ans.add(j);
                break;
            }
        }
        if(!ans.isEmpty()){
            lst.add(ans);
        }
        ans = new ArrayList<>();

        for(int i=x+1; i<8; i++){
            String s = Integer.toString(i)+Integer.toString(y);
            if(st.contains(s)){
                ans.add(i);
                ans.add(y);
                break;
            }
        }
        if(!ans.isEmpty()){
            lst.add(ans);
        }
        ans = new ArrayList<>();

        for(int i=x+1, j=y-1; i<8 && j>=0; i++,j--){
            String s = Integer.toString(i)+Integer.toString(j);
            if(st.contains(s)){
                ans.add(i);
                ans.add(j);
                break;
            }
        }
        if(!ans.isEmpty()){
            lst.add(ans);
        }
        ans = new ArrayList<>();

        for(int j=y-1; j>=0; j--){
            String s = Integer.toString(x)+Integer.toString(j);
            if(st.contains(s)){
                ans.add(x);
                ans.add(j);
                break;
            }
        }
        if(!ans.isEmpty()){
            lst.add(ans);
        }
        ans = new ArrayList<>();

        for(int i=x-1, j=y-1; i>=0 && j>=0; i--,j--){
            String s = Integer.toString(i)+Integer.toString(j);
            if(st.contains(s)){
                ans.add(i);
                ans.add(j);
                break;
            }
        }
        if(!ans.isEmpty()){
            lst.add(ans);
        }
        return lst;
    }
}