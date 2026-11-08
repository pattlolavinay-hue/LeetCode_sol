class Solution {
    public static int CheckConnection(int i, int j, int[][] grid){
        int i1=i+1, j1=j+1;
        while(i1<grid.length){
            if(grid[i1][j]==1){
                return 1;
            }
            i1++;
        }
        i1 = i-1;
        while(i1>=0){
            if(grid[i1][j]==1){
                return 1;
            }
            i1--;
        }
        while(j1<grid[0].length){
            if(grid[i][j1]==1){
                return 1;
            }
            j1++;
        }
        j1 = j-1;
        while(j1>=0){
            if(grid[i][j1]==1){
                return 1;
            }
            j1--;
        }
        return 0;
    }
    public int countServers(int[][] grid) {
        int c = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1){
                    c += CheckConnection(i,j,grid);
                }
            }
        }
        return c;
    }
}