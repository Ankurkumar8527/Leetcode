class Solution {
    public int MaxRob(int i, int n, int [] nums, int[] dp){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = nums[i]+MaxRob(i+2,n,nums,dp);
        int skip = MaxRob(i+1,n,nums,dp);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int x = MaxRob(1,n,nums,dp);
        Arrays.fill(dp,-1);
        int y = MaxRob(0,n-1,nums,dp);
        return Math.max(x,y);
    }
}