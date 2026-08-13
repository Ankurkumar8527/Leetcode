class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        long[][] dp = new long[2][amount+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<=amount;j++){
                long skip = (i>0) ? dp[0][j] : ( j==0 ? 0 : Integer.MAX_VALUE);
                if(j-coins[i]<0) dp[1][j]=skip;
                else{
                     long pick = 1 + dp[1][j-coins[i]];
                     dp[1][j] = Math.min(pick,skip);
                }  
            }
             for(int j=0;j<=amount;j++){
                    dp[0][j]=dp[1][j];
                }
        }
        int ans = (int)dp[1][amount];
        return (ans==Integer.MAX_VALUE) ? -1 : ans;
    }
}