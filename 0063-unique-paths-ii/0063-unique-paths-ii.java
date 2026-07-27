class Solution {
    public int uniquePathsWithObstacles(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = nums[0][0] == 1 ?0:1;
        
        for(int i=1;i<m;i++){
            if(nums[i][0]==0) dp[i][0]=dp[i-1][0];
        }  
         for(int i=1;i<n;i++){
            if(nums[0][i]==0) dp[0][i]=dp[0][i-1];
        }  
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(nums[i][j]==0) dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}