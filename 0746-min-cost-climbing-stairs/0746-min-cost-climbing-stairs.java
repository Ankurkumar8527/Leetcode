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
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(n-1,cost,dp),minCost(n-2,cost,dp));
    }
}