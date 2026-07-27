class Solution {
    public int uniquePath(int[][] nums,int[][] dp,int i,int j,int m,int n){
        if(i>m || j>n) return 0;
        if(nums[i][j]==1) return 0;
        if(i==m && j==n) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        int r = uniquePath(nums,dp,i,j+1,m,n);
        int d = uniquePath(nums,dp,i+1,j,m,n);
        return dp[i][j]=r+d;
    }
    public int uniquePathsWithObstacles(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int[][] dp = new int[m][n];
        return uniquePath(nums,dp,0,0,m-1,n-1);
    }
}