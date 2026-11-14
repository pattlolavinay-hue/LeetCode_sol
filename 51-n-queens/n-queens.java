class Solution {
    public static boolean safePosition(int i, int j, char[][] a, int n){
        for(int r=i-1; r>=0; r--){
            if(a[r][j]=='Q') return false;
        }
        for(int r=i-1, c=j-1; r>=0 && c>=0; r--, c--){
            if(a[r][c]=='Q') return false;
        }
        for(int r=i-1, c=j+1; r>=0 && c<n; r--, c++){
            if(a[r][c]=='Q') return false;
        }
        return true;
    }
    public static void Queen(char[][] a, int i, List<List<String>> ans, int n){
        if(i==n){
            List<String> lst = new ArrayList<>();
            for(int j=0; j<n; j++){
                lst.add(new String(a[j]));
            }
            ans.add(lst);
            return;
        }
        for(int j=0; j<n; j++){
            if(safePosition(i,j,a,n)){
                a[i][j] = 'Q';
                Queen(a,i+1,ans,n);
                a[i][j] = '.';
            }
        }
        return;
    }
    public List<List<String>> solveNQueens(int n) {
        char a[][] = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(a[i],'.');
        }
        List<List<String>> ans = new ArrayList<>();
        Queen(a,0,ans,n);
        return ans;
    }
}