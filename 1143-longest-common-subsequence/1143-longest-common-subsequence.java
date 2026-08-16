class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        //  Creating DP bcoz m-1 to 0 and n-1 to 0
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(a.charAt(i)==b.charAt(j)) dp[i][j] = 1+((i>0 && j>0) ? dp[i-1][j-1] : 0);
                else  dp[i][j] = Math.max(((i>0) ? dp[i-1][j] : 0),((j>0) ? dp[i][j-1] : 0));
            }
        }
        return dp[m-1][n-1];
    }
}