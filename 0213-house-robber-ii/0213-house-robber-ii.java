class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] dp = new int[n];

        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<=n-2;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        int x = dp[n-2];

        Arrays.fill(dp,0);

        dp[1]=nums[1];
        dp[2]=Math.max(nums[2],nums[1]);
        for(int i=3;i<=n-1;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        int y = dp[n-1];
        return Math.max(x,y);
    }
}