class Solution {
    public int minCost(int i ,int[] cost,int[] dp){
        if(i<=1) return cost[i];
        if(dp[i]!=-1) return dp[i];
        return dp[i]=cost[i]+Math.min(minCost(i-1,cost,dp),minCost(i-2,cost,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n =  cost.length;
        // No of distict calls =  n 
        // Therefore, dp size is n-1 to 0 
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(n-1,cost,dp),minCost(n-2,cost,dp));
    }
}