class Solution {
    public int uniquePaths(int m, int n) {
        if(n==1 || m==1) return 1;
        int[][] dp = new int[2][n];
        for(int i=0;i<n;i++){
            dp[0][i]=1;
            dp[1][i]=1;
        }

        for(int i=1;i<m;i++){
            if(i%2!=0){
                for(int j=1;j<n;j++){
                    dp[1][j]=dp[1][j-1]+dp[0][j];
                }
            }
            else {
                for(int j=1;j<n;j++){
                    dp[0][j]=dp[0][j-1]+dp[1][j];
                }
            }
        }
        return Math.max(dp[1][n-1],dp[0][n-1]);
    }
}