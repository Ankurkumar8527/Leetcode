class Solution {
    public int noofpaths(int m, int n,int[][] dp ){
        if(n==1 || m==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        int r = noofpaths(m-1,n,dp)%2000000000;
        int d =  noofpaths(m,n-1,dp)%2000000000;
        return dp[m][n]=(r+d)%2000000000;
    }
    public int uniquePaths(int m, int n) {
        // Memoization
        int[][] dp = new int[m+1][n+1];
        return noofpaths(m,n,dp);
    }
}