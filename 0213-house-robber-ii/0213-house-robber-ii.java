class Solution {

    public int amount1(int[] nums,int i, int[] dp1){
        if(i>=nums.length-1) return 0;
        if(dp1[i]!=-1) return dp1[i];
        int take = nums[i]+amount1(nums,i+2,dp1);
        int skip = amount1(nums,i+1,dp1);
        return dp1[i]=Math.max(take,skip);
    }
     public int amount(int[] nums,int i, int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = nums[i]+amount(nums,i+2,dp);
        int skip = amount(nums,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
         int n = nums.length;
         if(n==1) return nums[0];
        int[] dp1 = new int[n-1];
        Arrays.fill(dp1,-1);
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.max(amount1(nums,0,dp1),amount(nums,1,dp));
    }
}