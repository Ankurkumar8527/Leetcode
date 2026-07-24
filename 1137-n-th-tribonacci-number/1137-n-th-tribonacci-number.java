class Solution {
    public int tribo(int n,int[] dp) {
        //  Memoization Method
        if(n==0 || n==1) return n;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=tribo(n-1,dp)+tribo(n-2,dp)+tribo(n-3,dp);
    }
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return tribo(n,dp);
    }
}