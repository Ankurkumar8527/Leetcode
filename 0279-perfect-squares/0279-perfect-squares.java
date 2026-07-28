class Solution {
    public boolean perfectSq(int n){
        int sq = (int) Math.sqrt(n);
        return (sq*sq==n);
    }
    public int minNum(int n,int[] dp){
        if(perfectSq(n)) return 1;
        int count = n;
        if(dp[n]!=-1) return dp[n];
        for(int i=1;i*i<=n;i++){
            int val = minNum(i*i,dp)+minNum(n-i*i,dp);
            count = Math.min(count,val);
        }
        return dp[n]=count;
    }
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return minNum(n,dp);
    }
}