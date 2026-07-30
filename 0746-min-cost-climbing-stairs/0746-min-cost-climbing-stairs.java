class Solution {
    public int MinCost(int n,int[] cost, int[] dp){
        if(n==0 || n==1) return cost[n];
        if(dp[n]!=-1) return dp[n];
        int take = MinCost(n-1,cost,dp);
        int skip =  MinCost(n-2,cost,dp);
        return dp[n]=cost[n]+Math.min(take,skip);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(MinCost(n-1,cost,dp),MinCost(n-2,cost,dp));
    }
}