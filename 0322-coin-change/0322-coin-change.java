class Solution {
    public long CountCoins(int i,int amount,int[] coins,long[][] dp){
        if(i==coins.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        long skip = CountCoins(i+1,amount,coins,dp);
        if(amount-coins[i]<0) return dp[i][amount]=skip;
        long pick = 1+CountCoins(i,amount-coins[i],coins,dp);
        return dp[i][amount] = Math.min(pick,skip);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        long[][] dp = new long[n][amount+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=amount;j++) dp[i][j]=-1;
        }
        int ans =  (int)CountCoins(0,amount,coins,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}