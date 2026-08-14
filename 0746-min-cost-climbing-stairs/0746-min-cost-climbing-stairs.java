class Solution {
    public int minCost(int i,int n,int[] cost,int[] dp){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = minCost(i+1,n,cost,dp);
        int skip = minCost(i+2,n,cost,dp);
        return dp[i]=cost[i]+Math.min(pick,skip);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(1,n,cost,dp),minCost(0,n,cost,dp));
    }
}