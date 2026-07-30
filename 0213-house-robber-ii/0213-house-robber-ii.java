class Solution {
    public int rob(int[] nums) {
        // Space Optimization
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int a = nums[0];
        int b = Math.max(nums[0],nums[1]);
        for(int i=2;i<=n-2;i++){
            int c = Math.max(nums[i]+a,b);
            a=b;
            b=c;
        }
        int x = b;

        a=nums[1];
        b=Math.max(nums[2],nums[1]);
        for(int i=3;i<=n-1;i++){
            int c = Math.max(nums[i]+a,b);
            a=b;
            b=c;
        }
        int y = b;
        return Math.max(x,y);
    }
}