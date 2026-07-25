class Solution {

     public int amount(int[] nums,int i, int[] dp,int end){
        if(i>=end) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = nums[i]+amount(nums,i+2,dp,end);
        int skip = amount(nums,i+1,dp,end);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(
            amount(nums,0,dp1,n-1),
            amount(nums,1,dp2,n));
    }
}