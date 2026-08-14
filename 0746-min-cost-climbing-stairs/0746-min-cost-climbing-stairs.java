class Solution {
    public int minCost(int i,int[] cost,int[] dp){
        if(i==0 || i==1) return cost[i];
        if(dp[i]!=-1) return dp[i];
        int pick = minCost(i-1,cost,dp);
        int skip = minCost(i-2,cost,dp);
        return dp[i]=cost[i]+Math.min(pick,skip);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n<=1) return Math.min(cost[0],cost[1]);
        int[] dp = new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}