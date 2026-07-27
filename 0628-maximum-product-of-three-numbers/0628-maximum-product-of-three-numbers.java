class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n-3;i++){
            int val = nums[i]*nums[i+1]*nums[i+2];
            int res = nums[0]*nums[1]*nums[n-1];
            max = Math.max(res,val);
        } 
        return max;
    }
}