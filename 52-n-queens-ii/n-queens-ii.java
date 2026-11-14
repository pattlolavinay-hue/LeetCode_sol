class Solution {
    static int count = 0;
    public static boolean SafePosition(int i, int j, char[][] a, int n){
        // check upper column
        for(int r=i; r>=0; r--){
            if(a[r][j]=='Q') return false;
        }
        // check upper-left diagonal
        for(int r=i-1, c=j-1; r>=0 && c>=0; r--,c--){
            if(a[r][c] == 'Q') return false;
        }
        // check upper-right diagonal
        for(int r=i-1, c=j+1; r>=0 && c<n; r--,c++){
            if(a[r][c] == 'Q') return false;
        }
        return true;
    }
    public static void Queen(int i, char[][] a, int n){
        if(i==n){
            count++;
            return;
        }
        for(int j=0; j<n; j++){
            if(SafePosition(i,j,a,n)){
                a[i][j] = 'Q';
                Queen(i+1,a,n);
                a[i][j] = '.';
            }
        }
    }
    public int totalNQueens(int n) {
        char[][] a = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(a[i],'.');
        }
        count = 0;
        Queen(0,a,n);
        return count;
    }
}