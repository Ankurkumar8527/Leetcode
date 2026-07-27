class Solution {
    public int MinPath(int[][] grid,int[][] dp,int i,int j, int m, int n ){
        if(i==m-1 && j==n-1) return grid[m-1][n-1];
        if(i>=m || j>=n ) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int r = MinPath(grid,dp,i+1,j,m,n);
        int d = MinPath(grid,dp,i,j+1,m,n);
        return dp[i][j]=grid[i][j]+Math.min(r,d);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return MinPath(grid,dp,0,0,m,n);
    }
}