class Solution {
    public boolean isSubset(int i,int arr[], int sum,int[][] dp){
        if(i==arr.length){
            if(sum==0) return true;
            else return false;
        }
        if(dp[i][sum]!=-1) return (dp[i][sum]==1);
        boolean ans = false;
        boolean skip = isSubset(i+1,arr,sum,dp);
        if(sum-arr[i]<0) ans = skip;
        else{
            boolean take = isSubset(i+1,arr,sum-arr[i],dp);
            ans = take || skip;;
        } 
        if(ans) dp[i][sum]=1;
        else dp[i][sum]=0;
        return ans;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int[][] dp = new int[n][sum+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=sum;j++) dp[i][j]=-1;
        }
        return isSubset(0,nums,sum/2,dp);
    }
}