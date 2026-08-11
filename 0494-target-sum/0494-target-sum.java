class Solution {
    public int Count(int i,int[] nums,int res,int target,int sum,int[][] dp) {
        if(i==nums.length){
            if(target==res) return 1;
            return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int add = Count(i+1,nums,res-nums[i],target,sum,dp);
        int sub = Count(i+1,nums,res+nums[i],target,sum,dp);
        return dp[i][res+sum]=add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++) sum+=nums[i];
        int[][] dp = new int[n][2*sum+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=2*sum;j++) dp[i][j]=-1;
        }
        return Count(0,nums,0,target,sum,dp);
    }
}